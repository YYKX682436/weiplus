package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f206084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.i2 f206085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f206086g;

    public g2(java.lang.String str, java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.i2 i2Var, ya2.b2 b2Var) {
        this.f206083d = str;
        this.f206084e = linkedList;
        this.f206085f = i2Var;
        this.f206086g = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderMiniProgramWidget$handleMIniProgramList$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        java.lang.String str = this.f206083d;
        java.lang.String str2 = str == null ? "" : str;
        java.util.LinkedList linkedList = this.f206084e;
        java.lang.String m75945x2fec8307 = ((r45.ch2) linkedList.get(0)).m75945x2fec8307(0);
        java.lang.String str3 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.i2 i2Var = this.f206085f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = i2Var.f206107a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        o3Var.Ak(6, str2, "", str3, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        java.lang.String m75945x2fec83072 = ((r45.ch2) linkedList.get(0)).m75945x2fec8307(0);
        java.lang.String m75945x2fec83073 = ((r45.ch2) linkedList.get(0)).m75945x2fec8307(1);
        if (m75945x2fec83072 != null && m75945x2fec83073 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = i2Var.f206107a;
            ya2.b2 b2Var = this.f206086g;
            i0Var.ll(activityC0065xcd7aa112, m75945x2fec83072, m75945x2fec83073, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.r.f34705x366c91de, b2Var != null ? b2Var.D0() : "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMiniProgramWidget$handleMIniProgramList$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
