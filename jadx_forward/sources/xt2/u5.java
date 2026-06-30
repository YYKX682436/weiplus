package xt2;

/* loaded from: classes3.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s66 f538585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 f538586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f538587f;

    public u5(r45.s66 s66Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021, int i17) {
        this.f538585d = s66Var;
        this.f538586e = c14982x50d7e021;
        this.f538587f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.l onSkuItemClick;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList$getAndBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ce0 ce0Var = (r45.ce0) this.f538585d.m75936x14adae67(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021 = this.f538586e;
        if (ce0Var != null && (onSkuItemClick = c14982x50d7e021.getOnSkuItemClick()) != null) {
            onSkuItemClick.mo146xb9724478(ce0Var);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021.f207866p;
        c14982x50d7e021.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.I;
        cm2.m0 m0Var = c14982x50d7e021.f207872i;
        if (m0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("item");
            throw null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(m0Var.f124902w);
        st2.g3 g3Var = st2.g3.f493859a;
        cm2.m0 m0Var2 = c14982x50d7e021.f207872i;
        if (m0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("item");
            throw null;
        }
        org.json.JSONObject k17 = g3Var.k(m0Var2.f124901v);
        k17.put(ya.b.f77479x42930b2, this.f538587f);
        ml2.r0.Dj(r0Var, f4Var, null, valueOf, null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingSkuList$getAndBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
