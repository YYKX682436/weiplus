package ey4;

/* loaded from: classes8.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb f339159d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb) {
        this.f339159d = c19494x6eecdedb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb = this.f339159d;
        ck5.f b17 = ck5.f.b(c19494x6eecdedb.f268833o);
        int i17 = c19494x6eecdedb.f268843y;
        if (i17 <= 0) {
            i17 = Integer.MAX_VALUE;
        }
        b17.f124094f = 0;
        b17.f124093e = i17;
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_3;
        b17.f124089a = true;
        b17.d(new ey4.j(c19494x6eecdedb));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
