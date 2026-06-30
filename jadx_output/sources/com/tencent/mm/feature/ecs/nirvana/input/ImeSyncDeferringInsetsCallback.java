package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes14.dex */
class ImeSyncDeferringInsetsCallback {
    private android.view.WindowInsets lastWindowInsets;
    private android.view.View view;
    private final int deferredInsetTypes = android.view.WindowInsets.Type.ime();
    private boolean animating = false;
    private boolean needsSave = false;
    private com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.AnimationCallback animationCallback = new com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.AnimationCallback();
    private com.tencent.mm.feature.ecs.nirvana.input.c insetsListener = new com.tencent.mm.feature.ecs.nirvana.input.c(this, null);

    /* loaded from: classes14.dex */
    public class AnimationCallback extends android.view.WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            if (!com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.animating || (windowInsetsAnimation.getTypeMask() & com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) == 0) {
                return;
            }
            com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.animating = false;
            if (com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.lastWindowInsets == null || com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.view == null) {
                return;
            }
            com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((windowInsetsAnimation.getTypeMask() & com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
            if (com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.animating && !com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.needsSave) {
                java.util.Iterator<android.view.WindowInsetsAnimation> it = list.iterator();
                boolean z17 = false;
                while (it.hasNext()) {
                    if ((it.next().getTypeMask() & com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                int i17 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom : 0;
                android.view.WindowInsets.Builder builder = new android.view.WindowInsets.Builder(com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                builder.setInsets(com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, android.graphics.Insets.of(0, 0, 0, java.lang.Math.max(windowInsets.getInsets(com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - i17, 0)));
                com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(builder.build());
            }
            return windowInsets;
        }
    }

    public ImeSyncDeferringInsetsCallback(android.view.View view) {
        this.view = view;
    }

    public android.view.WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public android.view.View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
