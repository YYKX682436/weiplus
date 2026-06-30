package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 f205870d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var) {
        this.f205870d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0 o0Var = this.f205870d;
        if (o0Var.m158359x1e885992().getBooleanExtra("key_is_from_slide", false)) {
            android.app.Activity context = o0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).f205647q = 1;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = o0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.vas.VASActivity");
            android.app.Activity m81193x1252e2cf = ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m158354x19263085).m81193x1252e2cf();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 abstractActivityC15139x91efb0f1 = m81193x1252e2cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1) m81193x1252e2cf : null;
            if (abstractActivityC15139x91efb0f1 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62 c15140xe7b62f62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.C15140xe7b62f62) abstractActivityC15139x91efb0f1.findViewById(com.p314xaae8f345.mm.R.id.u2u);
                if (abstractActivityC15139x91efb0f1.f211359v == 1 && c15140xe7b62f62 != null) {
                    c15140xe7b62f62.e();
                }
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = o0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d6.class)).getClass();
            o0Var.m158354x19263085().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
