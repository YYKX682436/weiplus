package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class n9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 f214232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f214235g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f214236h;

    public n9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15281x1c66dc31 c15281x1c66dc31, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2) {
        this.f214232d = c15281x1c66dc31;
        this.f214233e = str;
        this.f214234f = str2;
        this.f214235g = num;
        this.f214236h = num2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$updateVerifiedTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.r rVar = this.f214232d.f212581f;
        if (rVar != null) {
            java.lang.String str = this.f214233e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String str2 = this.f214234f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            java.lang.Integer num = this.f214235g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            java.lang.Integer num2 = this.f214236h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            rVar.C(str, str2, num, num2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$updateVerifiedTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
