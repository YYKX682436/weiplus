package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn f186027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186028e;

    public rn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar, in5.s0 s0Var) {
        this.f186027d = ynVar;
        this.f186028e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.B(this.f186027d, this.f186028e, 5, false, 0, 8, null);
        in5.s0 s0Var = this.f186028e;
        if (s0Var.m8183xf806b362() == 0) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(zu2.a0.class)).f557227f;
            if (qVar != null) {
                qVar.a();
                qVar.d("headimage");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
