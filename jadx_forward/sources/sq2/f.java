package sq2;

/* loaded from: classes2.dex */
public final class f implements at.e {
    @Override // at.e
    public void a(java.lang.String reddotId, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reddotId, "reddotId");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        e0Var.f391648d = f17;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "finderLiveHomeEntranceExposePredict: start preload, op=" + f0Var.f391649d + ", reddotId=" + reddotId + ", predictScore=" + e0Var.f391648d + ", isMock=false");
        pm0.v.X(new sq2.e(f0Var, e0Var, i17));
    }

    @Override // at.e
    /* renamed from: start */
    public void mo8975x68ac462(java.lang.String reddotId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reddotId, "reddotId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "finderLiveHomeEntranceExposePredict: start kara predict");
    }
}
