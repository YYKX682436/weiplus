package sc5;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f488099d;

    public e(java.util.List list) {
        this.f488099d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<jz5.l> list = this.f488099d;
        java.lang.String Q0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((jz5.l) kz5.n0.X(list)).f384366d).Q0();
        sc5.f fVar = sc5.f.f488100a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
        java.util.Set b17 = sc5.f.b(fVar, Q0, sc5.f.f488104e);
        java.util.ArrayList<jz5.l> arrayList = new java.util.ArrayList();
        for (jz5.l lVar : list) {
            long m124847x74d37ac6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) lVar.f384366d).m124847x74d37ac6();
            if (m124847x74d37ac6 > 0 && b17.add(java.lang.Long.valueOf(m124847x74d37ac6))) {
                arrayList.add(lVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (jz5.l lVar2 : arrayList) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) lVar2.f384366d;
            long longValue = ((java.lang.Number) lVar2.f384367e).longValue();
            if (c01.id.c() - f9Var.mo78012x3fdd41df() <= sc5.f.f488101b * 1 * 1000 && !g95.e0.i(f9Var)) {
                long m124847x74d37ac62 = f9Var.m124847x74d37ac6();
                sc5.f fVar2 = sc5.f.f488100a;
                java.util.Map a17 = sc5.f.a(fVar2, f9Var, 4);
                a17.put("unexp_time", java.lang.Long.valueOf(longValue));
                sc5.f.c(fVar2, "chat_message_event", a17);
                sc5.f.b(fVar2, Q0, sc5.f.f488104e).add(java.lang.Long.valueOf(m124847x74d37ac62));
            }
        }
    }
}
