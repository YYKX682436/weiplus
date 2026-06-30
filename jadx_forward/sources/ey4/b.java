package ey4;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c f339140d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c) {
        this.f339140d = c19493xb618544c;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c = this.f339140d;
        c19493xb618544c.f268824u = false;
        c19493xb618544c.f268814h.setVisibility(8);
        c19493xb618544c.f268814h.getClass();
        c19493xb618544c.f268819p.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
        c19493xb618544c.f268813g = 0;
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
