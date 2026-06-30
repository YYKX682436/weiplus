package ym5;

/* loaded from: classes13.dex */
public final class d2 implements org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewFrameUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f544781a;

    public d2(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f544781a = c22789xd23e9a9b;
    }

    @Override // org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewFrameUpdateListener
    /* renamed from: onAnimationUpdateWithFrameInfo */
    public final void mo154992xbd4d3aa7(boolean z17, double d17) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544781a;
        if (c22789xd23e9a9b.getUseRfx() || !c22789xd23e9a9b.f294870q) {
            return;
        }
        c22789xd23e9a9b.f294871r++;
        c22789xd23e9a9b.f294872s += (int) d17;
    }
}
