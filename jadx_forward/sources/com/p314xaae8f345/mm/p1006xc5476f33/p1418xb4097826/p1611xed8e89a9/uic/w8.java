package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class w8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f205853e;

    public w8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, ya2.b2 b2Var) {
        this.f205852d = obVar;
        this.f205853e = b2Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205852d;
        android.text.SpannableString spannableString = new android.text.SpannableString(obVar.f7().getText());
        spannableString.setSpan(new android.text.style.BackgroundColorSpan(obVar.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835)), 0, obVar.f7().getText().length(), 33);
        obVar.f7().setText(spannableString);
        rl5.r rVar = new rl5.r(obVar.m80379x76847179(), view);
        rVar.f478884u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.t8(obVar);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.u8(obVar);
        rVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.v8(obVar, this.f205853e);
        int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        boolean n17 = rVar.n(com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        yj0.a.i(n17, this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleNickname$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return n17;
    }
}
