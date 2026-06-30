package cj4;

/* loaded from: classes4.dex */
public final class n0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f42001d;

    public n0(cj4.i1 i1Var) {
        this.f42001d = i1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$init$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        cj4.i1 i1Var = this.f42001d;
        mj4.h hVar = i1Var.R;
        if (hVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("[status_id ] ");
            mj4.k kVar = (mj4.k) hVar;
            sb6.append(kVar.l());
            sb6.append("\n[user_name ] ");
            sb6.append(kVar.o());
            sb6.append("\n[create_time] ");
            sb6.append(kVar.f327067b.field_CreateTime);
            sb6.append("\n");
            android.widget.TextView textView = new android.widget.TextView(i1Var.w());
            textView.setText(sb6);
            textView.setGravity(19);
            textView.setTextSize(1, 10.0f);
            textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            textView.setTextColor(i1Var.w().getResources().getColor(com.tencent.mm.R.color.FG_0));
            textView.setTypeface(android.graphics.Typeface.MONOSPACE);
            int dimensionPixelSize = i1Var.w().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            db5.e1.q(i1Var.w(), null, textView, new cj4.p0(i1Var, sb6));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$init$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
