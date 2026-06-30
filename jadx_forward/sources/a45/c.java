package a45;

/* loaded from: classes9.dex */
public final class c extends a45.j {
    @Override // a45.j
    public void n(android.widget.FrameLayout containerView, oi3.e eVar, int i17, int i18) {
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        if (eVar == null || (abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uz9)) == null) {
            return;
        }
        j15.a aVar = new j15.a();
        aVar.m126728xdc93280d(eVar.m75945x2fec8307(eVar.f427150d + 13));
        z01.q qVar = new z01.q();
        java.lang.String ij6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).ij(eVar, bm5.f0.f104098m, eVar.j(), "", "", true, false);
        if (!com.p314xaae8f345.mm.vfs.w6.j(ij6)) {
            ij6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).ij(eVar, bm5.f0.f104097i, eVar.j(), "", "", true, false);
        }
        int i19 = qVar.f550677i;
        qVar.set(i19 + 0, ij6);
        qVar.set(i19 + 2, java.lang.Integer.valueOf(aVar.q()));
        qVar.set(i19 + 1, java.lang.Integer.valueOf(aVar.n()));
        qVar.f550672d = com.p314xaae8f345.mm.ui.zk.a(containerView.getContext(), 4);
        abstractC11172x705e5905.m48330xfcfee142(qVar);
    }

    @Override // a45.j
    public void o(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 t17 = ((bf5.a) Ai).t(context);
        t17.setId(com.p314xaae8f345.mm.R.id.uz9);
        containerView.addView(t17, -2, -2);
    }
}
