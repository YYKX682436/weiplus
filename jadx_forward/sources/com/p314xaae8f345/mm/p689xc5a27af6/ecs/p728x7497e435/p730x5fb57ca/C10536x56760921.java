package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* renamed from: com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback */
/* loaded from: classes14.dex */
class C10536x56760921 {

    /* renamed from: lastWindowInsets */
    private android.view.WindowInsets f28828x75a18cbc;

    /* renamed from: view */
    private android.view.View f28830x373aa5;

    /* renamed from: deferredInsetTypes */
    private final int f28826x9f590a9b = android.view.WindowInsets.Type.ime();

    /* renamed from: animating */
    private boolean f28824x42ab1b5e = false;

    /* renamed from: needsSave */
    private boolean f28829x413429ba = false;

    /* renamed from: animationCallback */
    private com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.AnimationCallback f28825xc3fdbe9 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.AnimationCallback();

    /* renamed from: insetsListener */
    private com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c f28827xf36895ca = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.c(this, null);

    /* renamed from: com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback$AnimationCallback */
    /* loaded from: classes14.dex */
    public class AnimationCallback extends android.view.WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            if (!com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28824x42ab1b5e || (windowInsetsAnimation.getTypeMask() & com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28826x9f590a9b) == 0) {
                return;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28824x42ab1b5e = false;
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28828x75a18cbc == null || com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28830x373aa5 == null) {
                return;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28830x373aa5.dispatchApplyWindowInsets(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28828x75a18cbc);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28829x413429ba = true;
            if ((windowInsetsAnimation.getTypeMask() & com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28826x9f590a9b) != 0) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28824x42ab1b5e = true;
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
            if (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28824x42ab1b5e && !com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28829x413429ba) {
                java.util.Iterator<android.view.WindowInsetsAnimation> it = list.iterator();
                boolean z17 = false;
                while (it.hasNext()) {
                    if ((it.next().getTypeMask() & com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28826x9f590a9b) != 0) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28830x373aa5.getWindowSystemUiVisibility();
                int i17 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom : 0;
                android.view.WindowInsets.Builder builder = new android.view.WindowInsets.Builder(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28828x75a18cbc);
                builder.setInsets(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28826x9f590a9b, android.graphics.Insets.of(0, 0, 0, java.lang.Math.max(windowInsets.getInsets(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28826x9f590a9b).bottom - i17, 0)));
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.C10536x56760921.this.f28830x373aa5.onApplyWindowInsets(builder.build());
            }
            return windowInsets;
        }
    }

    public C10536x56760921(android.view.View view) {
        this.f28830x373aa5 = view;
    }

    /* renamed from: getAnimationCallback */
    public android.view.WindowInsetsAnimation.Callback m44258x5f746333() {
        return this.f28825xc3fdbe9;
    }

    /* renamed from: getInsetsListener */
    public android.view.View.OnApplyWindowInsetsListener m44259xe20062c0() {
        return this.f28827xf36895ca;
    }

    /* renamed from: install */
    public void m44260x74ae259b() {
        this.f28830x373aa5.setWindowInsetsAnimationCallback(this.f28825xc3fdbe9);
        this.f28830x373aa5.setOnApplyWindowInsetsListener(this.f28827xf36895ca);
    }

    /* renamed from: remove */
    public void m44261xc84af884() {
        this.f28830x373aa5.setWindowInsetsAnimationCallback(null);
        this.f28830x373aa5.setOnApplyWindowInsetsListener(null);
    }
}
