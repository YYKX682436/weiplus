package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class f7 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f210655d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f210656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 f210657f;

    public f7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727) {
        this.f210657f = activityC15037x1b952727;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f210655d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f210655d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        wo0.c a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727 = this.f210657f;
        if (view == null) {
            view = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(activityC15037x1b952727, 0, 0);
            view.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        }
        boolean z17 = this.f210656e;
        java.util.ArrayList arrayList = this.f210655d;
        if (z17) {
            vo0.a aVar = vo0.e.f520001b;
            java.lang.String str = (java.lang.String) arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            wo0.c i18 = aVar.i(str);
            i18.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.c7(activityC15037x1b952727);
            ((wo0.b) i18).c((android.widget.ImageView) view);
        } else {
            boolean z18 = activityC15037x1b952727.f210124z;
            pf5.u uVar = pf5.u.f435469a;
            if (z18) {
                mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).N).mo141623x754a37bb());
                java.lang.String str2 = (java.lang.String) arrayList.get(i17);
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                a17 = d1Var.a(new mn2.n(str2 != null ? str2 : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.V));
            } else {
                mn2.d1 d1Var2 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
                java.lang.String str3 = (java.lang.String) arrayList.get(i17);
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                a17 = d1Var2.a(new mn2.q3(str3 != null ? str3 : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
            }
            if (a17 instanceof wo0.b) {
                ((wo0.b) a17).i((android.widget.ImageView) view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e7(activityC15037x1b952727));
            }
        }
        return view;
    }
}
