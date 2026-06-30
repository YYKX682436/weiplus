package r02;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 f449830d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0 c13241xdbd8cf0) {
        this.f449830d = c13241xdbd8cf0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13241xdbd8cf0.f178895o;
        this.f449830d.getClass();
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178866b.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = ((r02.v0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q) it.next())).f449872a;
            db5.e1.A(c13250xfa9a7928.getContext(), c13250xfa9a7928.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bos), "", c13250xfa9a7928.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jq8), c13250xfa9a7928.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jq7), new r02.b1(c13250xfa9a7928), new r02.s0(c13250xfa9a7928));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/DeleteTaskFooterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
