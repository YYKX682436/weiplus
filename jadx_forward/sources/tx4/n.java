package tx4;

/* loaded from: classes8.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6 f504237d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6 c19414xef0feed6) {
        this.f504237d = c19414xef0feed6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6 c19414xef0feed6 = this.f504237d;
        if (c19414xef0feed6.f266306m != null) {
            c19414xef0feed6.f266306m.a((db5.h4) view.getTag());
        }
        tx4.d dVar = c19414xef0feed6.f266307n;
        if (dVar != null) {
            ((tx4.k) dVar).f504224a.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
