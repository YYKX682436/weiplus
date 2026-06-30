package oe2;

/* loaded from: classes8.dex */
public final class v implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.s4 f426317a;

    public v(dm.s4 s4Var) {
        this.f426317a = s4Var;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        rl2.v b17;
        oe2.x xVar = oe2.x.f426319a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "checkAndInsert callback, " + pm0.v.u(j17) + ", status:" + i17 + ", sourceType:" + this.f426317a.f68260x76e81a5a);
        if (i17 != 1 || (b17 = oe2.x.b(oe2.x.f426319a)) == null) {
            return;
        }
        dm.s4 item = this.f426317a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo880xb970c2b9 = b17.mo880xb970c2b9(item);
        if (mo880xb970c2b9) {
            java.util.Vector vector = rl2.v.f478747g;
            synchronized (vector) {
                pm0.v.c0(vector, new rl2.s(item));
                vector.add(item);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "insertLiveTipsBar " + item.f68257x7560f783 + ", " + pm0.v.u(item.f68258x41d5e0c) + " result:" + mo880xb970c2b9);
        fs.g.b(ps5.f.class, new rl2.t(item));
        java.lang.String field_hostRoomId = item.f68257x7560f783;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_hostRoomId, "field_hostRoomId");
        b17.J0(field_hostRoomId);
    }
}
