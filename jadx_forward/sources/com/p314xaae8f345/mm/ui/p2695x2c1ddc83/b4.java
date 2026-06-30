package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class b4 extends com.p314xaae8f345.mm.ui.z9 {
    public static long D = 2000;
    public static final /* synthetic */ int E = 0;
    public final int A;
    public boolean B;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 C;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f288998o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f288999p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f289000q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashMap f289001r;

    /* renamed from: s, reason: collision with root package name */
    public final db5.c6 f289002s;

    /* renamed from: t, reason: collision with root package name */
    public final float f289003t;

    /* renamed from: u, reason: collision with root package name */
    public final float f289004u;

    /* renamed from: v, reason: collision with root package name */
    public final float f289005v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f289006w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f289007x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f289008y;

    /* renamed from: z, reason: collision with root package name */
    public final int f289009z;

    public b4(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.l4());
        this.f289000q = new android.content.res.ColorStateList[5];
        this.f289002s = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.f289003t = -1.0f;
        this.f289004u = -1.0f;
        this.f289005v = -1.0f;
        this.f289006w = false;
        this.f289007x = false;
        this.f289008y = "";
        this.B = false;
        this.C = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x3(this), false);
        this.f294144h = y9Var;
        this.f288998o = str;
        try {
            this.f288999p = r01.q3.cj().d1(str);
        } catch (java.lang.Throwable unused) {
        }
        this.f289001r = new java.util.HashMap();
        this.f289000q[0] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk);
        this.f289000q[1] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560950yo);
        this.f289000q[3] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        this.f289000q[2] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        this.f289000q[2] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        this.f289000q[4] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560838vl);
        if (i65.a.E(context)) {
            this.A = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561150as);
            this.f289009z = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
        } else if (i65.a.D(context)) {
            this.A = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561149ar);
            this.f289009z = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
        } else {
            this.A = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561148aq);
            this.f289009z = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561152au);
        }
        this.f289003t = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        this.f289004u = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        this.f289005v = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        ((l75.a1) c01.d9.b().r()).a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj;
        if (l4Var == null) {
            l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        }
        l4Var.o1("");
        l4Var.p1("");
        l4Var.mo9015xbf5d97fd(cursor);
        return l4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
        } else {
            mo735xb0dfc7d8((java.lang.String) obj, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x049d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r35, android.view.View r36, android.view.ViewGroup r37) {
        /*
            Method dump skipped, instructions count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public android.database.Cursor j() {
        return super.j();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", java.lang.Boolean.valueOf(this.f289006w), java.lang.Boolean.valueOf(this.f289007x), str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (hashMap = this.f289001r) != null) {
            hashMap.remove(str);
        }
        if (!this.f289006w) {
            this.f289007x = true;
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.C;
        b4Var.e();
        this.B = true;
        if (b4Var.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y3(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        java.util.AbstractCollection arrayList;
        java.lang.String str = this.f288998o;
        c();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            try {
                r01.m y07 = r01.q3.bj().y0(str);
                r45.ik ikVar = new r45.ik();
                ikVar.mo11468x92b714fd(y07.f66039x3c18ecc6);
                arrayList = ikVar.f458636e;
            } catch (java.lang.Throwable unused) {
                arrayList = new java.util.ArrayList(0);
            }
            linkedList.addAll(arrayList);
        } catch (java.lang.Throwable unused2) {
        }
        java.lang.String str2 = this.f288999p;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            s(((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).s(1, linkedList, str, -1));
        } else {
            linkedList.add(str2);
            s(((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).s(1, linkedList, str, -1));
        }
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    public final java.lang.String t(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public java.lang.CharSequence u(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        return l4Var.a1() == 1 ? this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqx) : l4Var.w0() == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? "" : k35.m1.f(this.f294141e, l4Var.w0(), true, false);
    }

    public int v(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        java.lang.String U0 = l4Var.U0();
        if (U0 == null || U0.length() <= 0) {
            return 1;
        }
        try {
            return java.lang.Integer.valueOf(U0).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }
}
