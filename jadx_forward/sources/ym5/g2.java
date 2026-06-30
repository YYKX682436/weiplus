package ym5;

/* loaded from: classes13.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f544872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f544873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, boolean z17) {
        super(0);
        this.f544872d = c22789xd23e9a9b;
        this.f544873e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544872d;
        org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b = c22789xd23e9a9b.f294861e;
        boolean z17 = this.f544873e;
        textureViewSurfaceTextureListenerC29708xfaeeb83b.setVisibility(z17 ? 8 : 0);
        c22789xd23e9a9b.f294862f.setVisibility(z17 ? 0 : 8);
        return jz5.f0.f384359a;
    }
}
