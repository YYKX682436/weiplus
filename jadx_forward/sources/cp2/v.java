package cp2;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 f302459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x9975155) {
        super(0);
        this.f302459d = c14501x9975155;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        cp2.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.f183932a;
        boolean a17 = n3Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14501x9975155 c14501x9975155 = this.f302459d;
        if (a17) {
            if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308697o)) {
                cVar = c14501x9975155.presenter;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter");
                ((cp2.v0) cVar).m122379x905893fc();
                return jz5.f0.f384359a;
            }
        }
        abstractActivityC21394xb3d2c0cf = c14501x9975155.baseContext;
        n3Var.c(abstractActivityC21394xb3d2c0cf, true);
        return jz5.f0.f384359a;
    }
}
