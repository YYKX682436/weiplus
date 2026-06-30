package ku1;

/* loaded from: classes5.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ee0 f393667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f393668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.LayoutInflater f393669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ku1.q f393670g;

    public p(ku1.q qVar, r45.ee0 ee0Var, java.util.LinkedList linkedList, android.view.LayoutInflater layoutInflater) {
        this.f393670g = qVar;
        this.f393667d = ee0Var;
        this.f393668e = linkedList;
        this.f393669f = layoutInflater;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku1.q qVar = this.f393670g;
        qVar.f393673d = true;
        android.view.View findViewById = qVar.f393671b.findViewById(com.p314xaae8f345.mm.R.id.cwd);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = this.f393667d.f454888f;
        while (true) {
            java.util.LinkedList linkedList = this.f393668e;
            if (i17 >= linkedList.size()) {
                qVar.f393672c.invalidate();
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                android.widget.TextView textView = (android.widget.TextView) this.f393669f.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569900re, (android.view.ViewGroup) null, false);
                textView.setText(((r45.w50) linkedList.get(i17)).f470411d);
                qVar.f393672c.addView(textView);
                i17++;
            }
        }
    }
}
