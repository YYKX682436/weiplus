package xw;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f539031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f539032e;

    public a(xw.b bVar, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, java.util.Map map) {
        this.f539031d = p0Var;
        this.f539032e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.j4 j4Var;
        r45.fm6 a17;
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = this.f539031d;
        if (p0Var == null || (j4Var = p0Var.f152259a) == null || j4Var.f459094h == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) this.f539032e.get(".sysmsg.bizlivenotify.op_flag"), 1) != 1 || (a17 = bs1.a.a()) == null) {
            return;
        }
        java.util.LinkedList linkedList = a17.f455987d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.s(linkedList);
    }
}
