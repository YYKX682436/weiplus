package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes5.dex */
public class x implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 f237109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f237110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt3.f3 f237111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ et3.b f237112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f237113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.y f237114i;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var, boolean z17, bt3.f3 f3Var, et3.b bVar, int i17) {
        this.f237114i = yVar;
        this.f237109d = l2Var;
        this.f237110e = z17;
        this.f237111f = f3Var;
        this.f237112g = bVar;
        this.f237113h = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.y yVar = this.f237114i;
        spannableString.setSpan(new android.text.style.BackgroundColorSpan(yVar.f237115a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835)), 0, textView.getText().length(), 33);
        textView.setText(spannableString);
        android.content.res.Resources resources = textView.getResources();
        yVar.f237119e = new rl5.r(yVar.f237115a, textView);
        rl5.r rVar = yVar.f237119e;
        rVar.C = true;
        rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.u(this, resources);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.v(this, textView);
        rVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.w(this, textView);
        if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
            int[] iArr = (int[]) view.getTag(com.p314xaae8f345.mm.R.id.ohu);
            yVar.f237119e.n(iArr[0], iArr[1]);
        } else {
            yVar.f237119e.n(yVar.f237116b, yVar.f237117c);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
