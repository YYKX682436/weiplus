package bb5;

/* loaded from: classes14.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f100670d;

    public h(com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db) {
        this.f100670d = c21463x46cf9db;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/applet/SecurityImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db.f278723p;
        com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db = this.f100670d;
        c21463x46cf9db.a(false);
        bb5.k kVar = c21463x46cf9db.f278732o;
        if (kVar != null) {
            kVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/applet/SecurityImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
