package dr0;

/* loaded from: classes12.dex */
public final class a2 extends dr0.j2 {
    public a2() {
        super(5);
    }

    @Override // dr0.j2
    public boolean a() {
        if (!dr0.j2.f323973b.a() || !mm.k.j(mm.k.N, null, 1, null)) {
            return false;
        }
        dr0.p1 a17 = dr0.p1.f324022d.a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a17.i(context)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "abort: not-appStandby");
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingAppStandby");
        if (a()) {
            return dr0.a3.b(dr0.a3.f323936d.a(), this.f323982a);
        }
        return null;
    }
}
