package ky2;

/* loaded from: classes.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f395090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f395091g;

    public k(ky2.w wVar, int i17, android.widget.EditText editText, android.view.View view) {
        this.f395088d = wVar;
        this.f395089e = i17;
        this.f395090f = editText;
        this.f395091g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteEditViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ky2.w wVar = this.f395088d;
        java.util.List list = wVar.f395118e;
        int i17 = this.f395089e;
        if (((ky2.r) list.get(i17)).f395110c == 2) {
            java.util.Map map = wVar.f395129s;
            android.view.View view2 = this.f395091g;
            android.text.TextWatcher textWatcher = (android.text.TextWatcher) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view2.hashCode()));
            android.widget.EditText editText = this.f395090f;
            editText.removeTextChangedListener(textWatcher);
            ((java.util.HashMap) wVar.f395129s).remove(java.lang.Integer.valueOf(view2.hashCode()));
            editText.setText("");
            wVar.m8155x27702c4(i17);
            wVar.f395118e.remove(i17);
            wVar.m8151xc67946d3(i17, wVar.f395118e.size() - i17);
            wVar.x();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteEditViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
