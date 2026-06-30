package ff1;

/* loaded from: classes15.dex */
public class j implements ye1.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343152a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47) {
        this.f343152a = abstractC12277x3bbbdb47;
    }

    @Override // ye1.q
    public void a(ye1.e eVar, int i17, int i18) {
        ye1.e eVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343152a;
        try {
            eVar2 = abstractC12277x3bbbdb47.f165192g;
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
            abstractC12277x3bbbdb47.f(e17, "on video size changed error[%d, %d]", objArr);
        }
        if (eVar != eVar2) {
            abstractC12277x3bbbdb47.g("another player on video size changed, return now.[%s, %s]", eVar, eVar2);
            return;
        }
        abstractC12277x3bbbdb47.f165194i = eVar.mo1855x8d5c7601();
        abstractC12277x3bbbdb47.f165195m = eVar.mo1854x463504c();
        abstractC12277x3bbbdb47.e("on size change size:( " + abstractC12277x3bbbdb47.f165194i + " , " + abstractC12277x3bbbdb47.f165195m + " )", new java.lang.Object[0]);
        ff1.z zVar = abstractC12277x3bbbdb47.f165197o;
        if (zVar != null) {
            int i27 = abstractC12277x3bbbdb47.f165194i;
            int i28 = abstractC12277x3bbbdb47.f165195m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) zVar;
            abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "on get video size [%d, %d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
            oe1.h1 h1Var = abstractC12278xb84f839e.f165219q;
            if (h1Var != null) {
                h1Var.I(abstractC12278xb84f839e.m51468x23a7af9b(), abstractC12278xb84f839e.m51467x75e04be9(), i27, i28);
            }
        }
        int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) abstractC12277x3bbbdb47.getLayoutParams();
        layoutParams.addRule(13);
        abstractC12277x3bbbdb47.setLayoutParams(layoutParams);
    }
}
