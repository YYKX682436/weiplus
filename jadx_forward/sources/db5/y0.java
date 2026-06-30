package db5;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f310109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.z0 f310110e;

    public y0(android.widget.LinearLayout linearLayout, db5.z0 z0Var) {
        this.f310109d = linearLayout;
        this.f310110e = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMAlert$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f310109d;
            if (i17 >= linearLayout.getChildCount()) {
                ((android.widget.TextView) view).setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
                view.post(new db5.x0(this, ((java.lang.Integer) view.getTag()).intValue()));
                yj0.a.h(this, "com/tencent/mm/ui/base/MMAlert$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                android.widget.TextView textView = (android.widget.TextView) linearLayout.getChildAt(i17);
                if (textView.getId() != com.p314xaae8f345.mm.R.id.f568867ob5) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b, 0, 0, 0);
                }
                i17++;
            }
        }
    }
}
