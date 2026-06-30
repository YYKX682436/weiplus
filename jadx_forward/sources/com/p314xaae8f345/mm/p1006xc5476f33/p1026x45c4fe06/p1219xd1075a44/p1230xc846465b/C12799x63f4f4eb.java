package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView */
/* loaded from: classes7.dex */
public class C12799x63f4f4eb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12793xdbae90e1 {

    /* renamed from: o, reason: collision with root package name */
    public static final l01.r f173409o = new l01.n0();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f173410g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12798x822d6bca f173411h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.e0 f173412i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12803xc1f7abcf f173413m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.b0 f173414n;

    public C12799x63f4f4eb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173410g = new java.util.ArrayList();
        a();
    }

    public void a() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569635dz2, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f173411h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12798x822d6bca) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564739se4);
        this.f173413m = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12803xc1f7abcf) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564738se3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "isAppBrandTaskViewExpt6:%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y0.b()));
        this.f173411h.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z(this, getContext(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y0.b() ? 2 : 3, 1, false));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.e0(this);
        this.f173412i = e0Var;
        this.f173411h.mo7960x6cab2c8d(e0Var);
        this.f173411h.g1(getContext(), i65.a.B(getContext()));
        this.f173411h.m53635xbbc97b80(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        this.f173414n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.b0(this);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_recent_use_new, 0) == 5) {
            this.f173411h.setVisibility(8);
            this.f173413m.setVisibility(0);
            this.f173413m.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.a0(this, getContext(), 4, 1, false));
            this.f173413m.mo7960x6cab2c8d(this.f173414n);
            this.f173413m.g1(getContext(), i65.a.B(getContext()));
            this.f173413m.m53635xbbc97b80(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        }
    }

    /* renamed from: getCount */
    public int m53617x7444f759() {
        return this.f173410g.size();
    }

    /* renamed from: setData */
    public void m53618x76491f2c(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0> list) {
        java.util.ArrayList arrayList = this.f173410g;
        arrayList.clear();
        if (list == null || list.isEmpty()) {
            setVisibility(8);
        } else {
            arrayList.addAll(list);
            setVisibility(0);
        }
        this.f173412i.m8146xced61ae5();
        this.f173414n.m8146xced61ae5();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandRecentTaskView", "setData size:%d", objArr);
    }

    public C12799x63f4f4eb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173410g = new java.util.ArrayList();
        a();
    }
}
