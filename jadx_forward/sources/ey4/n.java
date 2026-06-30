package ey4;

/* loaded from: classes8.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb f339158d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb) {
        this.f339158d = c19494x6eecdedb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb = this.f339158d;
        if (c19494x6eecdedb.f268828g == 0) {
            c19494x6eecdedb.f268828g = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "setGeneralViewComponent, hideVKB");
            c19494x6eecdedb.f268840v.mo48674x36654fab();
            if (!c19494x6eecdedb.f268841w) {
                c19494x6eecdedb.f268833o.requestFocus();
            }
            c19494x6eecdedb.j();
        } else {
            c19494x6eecdedb.f268828g = 0;
            c19494x6eecdedb.f268833o.requestFocus();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "setGeneralViewComponent, showVKB");
            c19494x6eecdedb.i();
            c19494x6eecdedb.c(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
