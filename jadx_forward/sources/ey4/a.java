package ey4;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c f339138d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c) {
        this.f339138d = c19493xb618544c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c = this.f339138d;
        if (c19493xb618544c.f268813g == 0) {
            c19493xb618544c.f268821r.mo48674x36654fab();
            if (!c19493xb618544c.f268822s) {
                c19493xb618544c.f268818o.requestFocus();
            }
            c19493xb618544c.c();
            c19493xb618544c.f268819p.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
            c19493xb618544c.f268813g = 1;
            c19493xb618544c.f268824u = false;
        } else {
            c19493xb618544c.f268824u = false;
            c19493xb618544c.f268818o.requestFocus();
            c19493xb618544c.f268821r.mo26063x7b383410();
            c19493xb618544c.b();
            c19493xb618544c.f268813g = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
