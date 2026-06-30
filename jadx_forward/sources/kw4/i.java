package kw4;

/* loaded from: classes8.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 f394711d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1) {
        this.f394711d = c19252xb5f78ab1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394711d;
        if (c19252xb5f78ab1.f263601e.mo61531xc00617a4()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c19252xb5f78ab1.f263603g.L;
            if (b4Var != null) {
                b4Var.d();
            }
            c19252xb5f78ab1.i();
        } else {
            c19252xb5f78ab1.f263603g.x();
            c19252xb5f78ab1.p(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
