package a45;

/* loaded from: classes9.dex */
public final class a extends a45.j {
    @Override // a45.j
    public void n(android.widget.FrameLayout containerView, oi3.e eVar, int i17, int i18) {
        com.tencent.mm.mvvm.MvvmView mvvmView;
        java.lang.String r17;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        if (eVar == null || (mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uz9)) == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(eVar.getString(eVar.f345617d + 13));
        z01.m mVar = new z01.m();
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(bVar);
        if (wi6 == null) {
            wi6 = "";
        }
        mVar.f469098i = wi6;
        int i19 = bVar.f432315e;
        v05.a aVar = (v05.a) bVar.getCustom(i19 + 8);
        java.lang.String f07 = com.tencent.mm.sdk.platformtools.t8.f0(aVar != null ? aVar.getLong(aVar.f368364d + 0) : 0L);
        if (f07 == null) {
            f07 = "";
        }
        mVar.f469099m = f07;
        mVar.f469100n = com.tencent.mm.R.drawable.d89;
        v05.a aVar2 = (v05.a) bVar.getCustom(i19 + 8);
        java.lang.String str = (aVar2 == null || (r17 = aVar2.r()) == null) ? "" : r17;
        i95.m c17 = i95.n0.c(pt.m0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mVar.f469103q = pt.m0.oa((pt.m0) c17, false, str, false, false, 12, null);
        mvvmView.setViewModel(mVar);
    }

    @Override // a45.j
    public void o(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView s17 = ((bf5.a) Ai).s(context);
        s17.setId(com.tencent.mm.R.id.uz9);
        containerView.addView(s17, -2, -2);
    }
}
