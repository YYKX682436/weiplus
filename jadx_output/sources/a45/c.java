package a45;

/* loaded from: classes9.dex */
public final class c extends a45.j {
    @Override // a45.j
    public void n(android.widget.FrameLayout containerView, oi3.e eVar, int i17, int i18) {
        com.tencent.mm.mvvm.MvvmView mvvmView;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        if (eVar == null || (mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uz9)) == null) {
            return;
        }
        j15.a aVar = new j15.a();
        aVar.fromXml(eVar.getString(eVar.f345617d + 13));
        z01.q qVar = new z01.q();
        java.lang.String ij6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).ij(eVar, bm5.f0.f22565m, eVar.j(), "", "", true, false);
        if (!com.tencent.mm.vfs.w6.j(ij6)) {
            ij6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).ij(eVar, bm5.f0.f22564i, eVar.j(), "", "", true, false);
        }
        int i19 = qVar.f469144i;
        qVar.set(i19 + 0, ij6);
        qVar.set(i19 + 2, java.lang.Integer.valueOf(aVar.q()));
        qVar.set(i19 + 1, java.lang.Integer.valueOf(aVar.n()));
        qVar.f469139d = com.tencent.mm.ui.zk.a(containerView.getContext(), 4);
        mvvmView.setViewModel(qVar);
    }

    @Override // a45.j
    public void o(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView t17 = ((bf5.a) Ai).t(context);
        t17.setId(com.tencent.mm.R.id.uz9);
        containerView.addView(t17, -2, -2);
    }
}
