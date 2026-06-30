package wu;

/* loaded from: classes9.dex */
public final class h1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f531116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.j1 f531117e;

    public h1(android.text.SpannableString spannableString, wu.j1 j1Var) {
        this.f531116d = spannableString;
        this.f531117e = j1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = view.getContext();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        spannableString.setSpan(new android.text.style.BackgroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835)), 0, textView.getText().length(), 33);
        textView.setText(spannableString);
        rl5.r rVar = new rl5.r(context, textView);
        rVar.C = true;
        android.text.SpannableString spannableString2 = this.f531116d;
        wu.j1 j1Var = this.f531117e;
        rVar.f478888y = new wu.e1(context, rVar, spannableString2, j1Var);
        rVar.f478887x = new wu.f1(textView, context, spannableString2, j1Var);
        rVar.L = new wu.g1(textView, spannableString2);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.ohu);
        int[] iArr = tag instanceof int[] ? (int[]) tag : null;
        if (iArr == null) {
            yj0.a.i(false, this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        rVar.n(iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailTextItemConvert$onBindContainerView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
