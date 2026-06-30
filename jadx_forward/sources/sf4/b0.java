package sf4;

/* loaded from: classes4.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f488950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        super(0);
        this.f488950d = c18497x85806502;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if4.h videoItem;
        boolean f17 = bf4.f.f101248b.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488950d;
        if (f17) {
            java.lang.String e17 = ef4.w.f334001t.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 c18495x53f31c35 = c18497x85806502.f253627n;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(e17, (c18495x53f31c35 == null || (videoItem = c18495x53f31c35.getVideoItem()) == null) ? null : videoItem.f372789d)) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryView", "toggleActiveState  skip");
                return java.lang.Boolean.TRUE;
            }
        }
        boolean z17 = !c18497x85806502.R;
        c18497x85806502.R = z17;
        c18497x85806502.z(z17);
        return java.lang.Boolean.TRUE;
    }
}
