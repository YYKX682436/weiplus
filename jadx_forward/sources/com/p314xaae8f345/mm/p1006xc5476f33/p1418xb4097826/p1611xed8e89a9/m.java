package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w f204929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f204930e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f204929d = wVar;
        this.f204930e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handleProfilePoi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar = this.f204929d;
        android.app.Activity activity = wVar.f205977a;
        r45.l95 l95Var = ((r45.v96) this.f204930e.f391656d).f469542d;
        wVar.j(activity, l95Var != null ? l95Var.f460774d : null);
        java.lang.CharSequence text = wVar.g().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        wVar.k(1, str, wVar.f205986j);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handleProfilePoi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
