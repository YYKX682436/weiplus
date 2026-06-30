package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12794xce6c1b7c f173506d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12794xce6c1b7c c12794xce6c1b7c) {
        this.f173506d = c12794xce6c1b7c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCloseTaskView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12794xce6c1b7c c12794xce6c1b7c = this.f173506d;
        if (c12794xce6c1b7c.m53610x59d4c014() != null) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t7 t7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t7) c12794xce6c1b7c.m53610x59d4c014();
            t7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewWC", "onClickHome");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = t7Var.f168649c;
            n7Var.U1 = 4;
            n7Var.S1.a();
            n7Var.R1.a();
            n7Var.T1 = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.t7$$b
                @Override // java.lang.Runnable
                public final void run() {
                    mi1.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t7.this.f168649c.mo32091x9a3f0ba2().f156354z.f408237c;
                    if (iVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12761x677a1998 m147348x52294648 = iVar.m147348x52294648();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m147348x52294648, "getCapsuleHomeButton(...)");
                    m147348x52294648.performClick();
                }
            }, 200L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCloseTaskView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
