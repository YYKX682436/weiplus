package in4;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ir0 f374486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f374487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f374488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in4.h f374489g;

    public d(in4.h hVar, r45.ir0 ir0Var, android.widget.TextView textView, android.content.Context context) {
        this.f374489g = hVar;
        this.f374486d = ir0Var;
        this.f374487e = textView;
        this.f374488f = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in4.h hVar = this.f374489g;
        java.util.HashSet hashSet = (java.util.HashSet) hVar.f374498e;
        r45.ir0 ir0Var = this.f374486d;
        boolean contains = hashSet.contains(ir0Var);
        android.content.Context context = this.f374488f;
        android.widget.TextView textView = this.f374487e;
        if (contains) {
            ((java.util.HashSet) hVar.f374498e).remove(ir0Var);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a98));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b7q);
        } else {
            ((java.util.HashSet) hVar.f374498e).add(ir0Var);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a97));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b7p);
        }
        if (((java.util.HashSet) hVar.f374498e).isEmpty()) {
            hVar.f374501h.setText(hVar.f374504n.f458811e);
        } else {
            hVar.f374501h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574922k03));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
