package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class p2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f6 {

    /* renamed from: r, reason: collision with root package name */
    public static final kk.l f205634r = new kk.l(100);

    /* renamed from: s, reason: collision with root package name */
    public static boolean f205635s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f205636t;

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f205637u;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f205638e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f205639f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f205640g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f205641h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f205642i;

    /* renamed from: m, reason: collision with root package name */
    public long f205643m;

    /* renamed from: n, reason: collision with root package name */
    public int f205644n;

    /* renamed from: o, reason: collision with root package name */
    public long f205645o;

    /* renamed from: p, reason: collision with root package name */
    public long f205646p;

    /* renamed from: q, reason: collision with root package name */
    public int f205647q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f205638e = new java.util.HashMap();
        this.f205639f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.m2(activity));
        this.f205640g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o2(activity));
        this.f205641h = "";
        this.f205642i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.n2(this));
    }

    public final void O6(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "cgi start, id: " + i17 + ", bizType: " + i18 + ", tabType: " + i19);
        this.f205638e.put(java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k2(i17, i18, i19, 0L, 0L, 0L, 0L, 0L, 0L, 0, null, null, 0, 0L, 0L, 32760, null));
    }

    public final boolean P6() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f205639f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-exportUsername>(...)");
        return str.length() > 0;
    }

    public final void Q6(int i17, int i18, az2.g gVar) {
        java.lang.Integer num;
        java.util.HashMap hashMap;
        r45.xw xwVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k2) this.f205638e.get(java.lang.Integer.valueOf(i17));
        if (k2Var != null) {
            long c17 = c01.id.c();
            k2Var.f205406d = c17 - k2Var.f205416n;
            k2Var.f205415m = i18;
            k2Var.f205412j = 1;
            k2Var.f205417o = c17;
            if (gVar != null && (xwVar = gVar.f97664c) != null) {
                k2Var.f205407e = xwVar.f472071e - xwVar.f472070d;
                k2Var.f205409g = xwVar.f472073g - xwVar.f472072f;
                k2Var.f205408f = xwVar.f472075i - xwVar.f472074h;
                k2Var.f205410h = xwVar.f472077n - xwVar.f472076m;
                k2Var.f205411i = xwVar.f472079p - xwVar.f472078o;
            }
            k2Var.f205413k = gVar != null ? gVar.f97662a : null;
            k2Var.f205414l = gVar != null ? gVar.f97663b : null;
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.class);
            if (c14900x9bf524dd == null || (hashMap = c14900x9bf524dd.C) == null || (num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(k2Var.f205405c))) == null) {
                num = -1;
            }
            if (num != null && num.intValue() == 0) {
                if (this.f205645o == 0) {
                    this.f205645o = c01.id.c() - this.f205643m;
                }
                this.f205646p = 1L;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "updateCgiInfoAfterCgi, id: " + i17 + ", totCost: " + k2Var.f205406d + ", ret: " + k2Var.f205415m);
        }
    }

    /* renamed from: getUsername */
    public final java.lang.String m58743x6c03c64c() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f205640g).mo141623x754a37bb();
        return str.length() == 0 ? this.f205641h : str;
    }

    /* renamed from: isSelf */
    public final boolean m58744xb9a8ab96() {
        return g92.b.f351302e.v(m58743x6c03c64c());
    }

    /* renamed from: isSelfFlag */
    public final boolean m58745x17be6422() {
        return ((java.lang.Boolean) ((jz5.n) this.f205642i).mo141623x754a37bb()).booleanValue();
    }
}
