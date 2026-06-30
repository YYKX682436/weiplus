package sf4;

/* loaded from: classes4.dex */
public final class g2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f489015d;

    public g2(sf4.j2 j2Var) {
        this.f489015d = j2Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: idkeyStat */
    public void mo69402x336bdfd8(long j17, long j18, long j19, boolean z17) {
        sf4.j2 j2Var = this.f489015d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = j2Var.f489032a;
        if ((c18499x2fc2446b == null || c18499x2fc2446b.Q1) ? false : true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j2Var.f489041j, j18, j19, z17);
            if (j18 < 141 || j18 > 145) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initCreateVideoView test key ");
            sb6.append(j18);
            sb6.append(" value ");
            sb6.append(j19);
            sb6.append(" currVideoItem:");
            sb6.append(j2Var.f489037f);
            sb6.append(' ');
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: kvStat */
    public void mo69404xbd3cda5f(int i17, java.lang.String str) {
    }
}
