package sc5;

/* loaded from: classes9.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f488098d;

    public d(java.util.List list) {
        this.f488098d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f488098d;
        java.lang.String Q0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.X(list)).Q0();
        sc5.f fVar = sc5.f.f488100a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
        java.util.Set b17 = sc5.f.b(fVar, Q0, sc5.f.f488103d);
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            if (m124847x74d37ac6 > 0 && b17.add(java.lang.Long.valueOf(m124847x74d37ac6))) {
                arrayList.add(f9Var);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 : arrayList) {
            if (c01.id.c() - f9Var2.mo78012x3fdd41df() <= sc5.f.f488101b * 1 * 1000 && !g95.e0.i(f9Var2)) {
                long m124847x74d37ac62 = f9Var2.m124847x74d37ac6();
                sc5.f fVar2 = sc5.f.f488100a;
                sc5.f.c(fVar2, "chat_message_event", sc5.f.a(fVar2, f9Var2, 2));
                sc5.f.b(fVar2, Q0, sc5.f.f488103d).add(java.lang.Long.valueOf(m124847x74d37ac62));
            }
        }
    }
}
