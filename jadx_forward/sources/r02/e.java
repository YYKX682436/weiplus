package r02;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 f449828d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 c13241xdbd8cf0) {
        this.f449828d = c13241xdbd8cf0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 c13241xdbd8cf0 = this.f449828d;
        if (c13241xdbd8cf0.f178902m) {
            c13241xdbd8cf0.f178902m = false;
            l02.n.a(c13241xdbd8cf0.f178897e, "checkbox_cell_off");
        } else {
            c13241xdbd8cf0.f178902m = true;
            l02.n.a(c13241xdbd8cf0.f178897e, "checkbox_cell_on");
        }
        if (c13241xdbd8cf0.f178901i) {
            boolean z17 = c13241xdbd8cf0.f178902m;
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178865a.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = ((r02.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p) it.next())).f449871a;
                java.util.Iterator it6 = c13250xfa9a7928.f178951f2.f449857d.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) it6.next();
                    int i17 = r0Var.f178847c;
                    if (i17 == 2 || i17 == 4 || i17 == 6) {
                        r0Var.f178846b = z17;
                    }
                }
                c13250xfa9a7928.f178951f2.m8146xced61ae5();
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.b(z17);
            }
        }
        c13241xdbd8cf0.f178901i = true;
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
