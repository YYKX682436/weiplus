package th5;

/* loaded from: classes12.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.l0 f500918d;

    public h0(th5.l0 l0Var) {
        this.f500918d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        th5.l0 l0Var = this.f500918d;
        l0Var.a0();
        l0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - l0Var.A >= 500) {
            l0Var.A = currentTimeMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c16492xe3ef89b2 = l0Var.f500934v;
            if (c16492xe3ef89b2 != null) {
                c16492xe3ef89b2.c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c16492xe3ef89b22 = l0Var.f500934v;
            if (c16492xe3ef89b22 != null) {
                c16492xe3ef89b22.d();
            }
            l0Var.i0();
        }
        mf3.s sVar = l0Var.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar != null) {
            th5.v0.f501003a.a(qVar.f500877c, qVar.f500875a, qVar.f500876b, th5.a.f500867f, th5.e.f500900f);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
