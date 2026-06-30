package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback */
/* loaded from: classes14.dex */
public class C28695x56760921 {

    /* renamed from: lastWindowInsets */
    private android.view.WindowInsets f71651x75a18cbc;

    /* renamed from: view */
    private android.view.View f71653x373aa5;

    /* renamed from: deferredInsetTypes */
    private final int f71649x9f590a9b = android.view.WindowInsets.Type.ime();

    /* renamed from: animating */
    private boolean f71647x42ab1b5e = false;

    /* renamed from: needsSave */
    private boolean f71652x413429ba = false;

    /* renamed from: animationCallback */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.AnimationCallback f71648xc3fdbe9 = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.AnimationCallback();

    /* renamed from: insetsListener */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.InsetsListener f71650xf36895ca = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.InsetsListener();

    /* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback$AnimationCallback */
    /* loaded from: classes14.dex */
    public class AnimationCallback extends android.view.WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            if (!io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71647x42ab1b5e || (windowInsetsAnimation.getTypeMask() & io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71649x9f590a9b) == 0) {
                return;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71647x42ab1b5e = false;
            if (io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71651x75a18cbc == null || io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71653x373aa5 == null) {
                return;
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71653x373aa5.dispatchApplyWindowInsets(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71651x75a18cbc);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71652x413429ba = true;
            if ((windowInsetsAnimation.getTypeMask() & io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71649x9f590a9b) != 0) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71647x42ab1b5e = true;
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
            if (io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71647x42ab1b5e && !io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71652x413429ba) {
                java.util.Iterator<android.view.WindowInsetsAnimation> it = list.iterator();
                boolean z17 = false;
                while (it.hasNext()) {
                    if ((it.next().getTypeMask() & io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71649x9f590a9b) != 0) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71653x373aa5.getWindowSystemUiVisibility();
                int i17 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom : 0;
                android.view.WindowInsets.Builder builder = new android.view.WindowInsets.Builder(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71651x75a18cbc);
                builder.setInsets(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71649x9f590a9b, android.graphics.Insets.of(0, 0, 0, java.lang.Math.max(windowInsets.getInsets(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71649x9f590a9b).bottom - i17, 0)));
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71653x373aa5.onApplyWindowInsets(builder.build());
            }
            return windowInsets;
        }
    }

    /* renamed from: io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback$InsetsListener */
    /* loaded from: classes14.dex */
    public class InsetsListener implements android.view.View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
            io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71653x373aa5 = view;
            if (io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71652x413429ba) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71651x75a18cbc = windowInsets;
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71652x413429ba = false;
            }
            return io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921.this.f71647x42ab1b5e ? android.view.WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
        }
    }

    public C28695x56760921(android.view.View view) {
        this.f71653x373aa5 = view;
    }

    /* renamed from: getAnimationCallback */
    public android.view.WindowInsetsAnimation.Callback m138480x5f746333() {
        return this.f71648xc3fdbe9;
    }

    /* renamed from: getInsetsListener */
    public android.view.View.OnApplyWindowInsetsListener m138481xe20062c0() {
        return this.f71650xf36895ca;
    }

    /* renamed from: install */
    public void m138482x74ae259b() {
        this.f71653x373aa5.setWindowInsetsAnimationCallback(this.f71648xc3fdbe9);
        this.f71653x373aa5.setOnApplyWindowInsetsListener(this.f71650xf36895ca);
    }

    /* renamed from: remove */
    public void m138483xc84af884() {
        this.f71653x373aa5.setWindowInsetsAnimationCallback(null);
        this.f71653x373aa5.setOnApplyWindowInsetsListener(null);
    }
}
