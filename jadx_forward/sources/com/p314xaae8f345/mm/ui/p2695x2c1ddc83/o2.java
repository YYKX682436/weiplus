package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public abstract class o2 extends com.p314xaae8f345.mm.ui.z9 {
    public static long H = 2000;
    public static final /* synthetic */ int I = 0;
    public java.lang.String A;
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m2 B;
    public final int C;
    public final int D;
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k2 E;
    public boolean F;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 G;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f289443o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f289444p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f289445q;

    /* renamed from: r, reason: collision with root package name */
    public final db5.c6 f289446r;

    /* renamed from: s, reason: collision with root package name */
    public final float f289447s;

    /* renamed from: t, reason: collision with root package name */
    public final float f289448t;

    /* renamed from: u, reason: collision with root package name */
    public final float f289449u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f289450v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f289451w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f289452x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f289453y;

    /* renamed from: z, reason: collision with root package name */
    public final db5.v8 f289454z;

    public o2(android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.l4());
        android.content.res.ColorStateList[] colorStateListArr = new android.content.res.ColorStateList[5];
        this.f289443o = colorStateListArr;
        this.f289445q = true;
        this.f289446r = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.f289447s = -1.0f;
        this.f289448t = -1.0f;
        this.f289449u = -1.0f;
        this.f289451w = false;
        this.f289452x = false;
        this.f289453y = false;
        this.f289454z = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g2(this);
        this.A = "";
        this.B = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m2(this);
        this.F = false;
        this.G = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h2(this), false);
        this.f294144h = y9Var;
        colorStateListArr[0] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk);
        colorStateListArr[1] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
        colorStateListArr[3] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        colorStateListArr[2] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        colorStateListArr[2] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        colorStateListArr[4] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560838vl);
        this.f289444p = new java.util.HashMap();
        if (i65.a.E(context)) {
            this.D = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561150as);
            this.C = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
        } else if (i65.a.D(context)) {
            this.D = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561149ar);
            this.C = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
        } else {
            this.D = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561148aq);
            this.C = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561152au);
        }
        this.f289447s = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        this.f289448t = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        this.f289449u = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        this.f289450v = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80020xba5d8e3b, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560227eb));
    }

    public final java.lang.String A(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var.Q0() != 0 || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(l4Var.h1())) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String z07 = l4Var.z0();
            ((sg3.a) v0Var).getClass();
            return c01.a2.e(z07);
        }
        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String z08 = l4Var.z0();
        java.lang.String h17 = l4Var.h1();
        ((sg3.a) v0Var2).getClass();
        return c01.a2.f(z08, h17);
    }

    public java.lang.String B() {
        return "";
    }

    public int C(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return 1;
        }
        try {
            return java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0411  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence D(com.p314xaae8f345.mm.p2621x8fb0427b.l4 r20, int r21, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m2 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 2727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2.D(com.tencent.mm.storage.l4, int, com.tencent.mm.ui.conversation.m2, boolean):java.lang.CharSequence");
    }

    public void E() {
        this.G.d();
        java.util.HashMap hashMap = this.f289444p;
        if (hashMap != null) {
            hashMap.clear();
            this.f289444p = null;
        }
        c();
        this.f294144h = null;
        w();
    }

    public void F() {
        db5.c6 c6Var = this.f289446r;
        if (c6Var != null) {
            c6Var.c();
        }
        this.f289451w = false;
    }

    public void G() {
        java.util.HashMap hashMap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "dkpno onResume mIsFront:%b  mNeedReCreate:%b mChangedBackground:%b mContactBackground:%b", java.lang.Boolean.valueOf(this.f289451w), java.lang.Boolean.valueOf(this.f289453y), java.lang.Boolean.valueOf(this.f289452x), java.lang.Boolean.FALSE);
        this.f289451w = true;
        android.text.format.Time time = new android.text.format.Time();
        time.setToNow();
        java.lang.String charSequence = k35.s.a("MM/dd", time).toString();
        boolean equals = true ^ this.A.equals(charSequence);
        this.A = charSequence;
        if (equals && (hashMap = this.f289444p) != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l2) ((java.util.Map.Entry) it.next()).getValue()).f289361c = null;
            }
        }
        if (this.f289452x) {
            f();
            this.f289452x = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
        } else {
            mo735xb0dfc7d8((java.lang.String) obj, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a3  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            Method dump skipped, instructions count: 2723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", java.lang.Boolean.valueOf(this.f289451w), java.lang.Boolean.valueOf(this.f289452x), str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (hashMap = this.f289444p) != null) {
            hashMap.remove(str);
        }
        if (!this.f289451w) {
            this.f289452x = true;
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.G;
        b4Var.e();
        this.F = true;
        if (b4Var.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 d(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, android.database.Cursor cursor) {
        if (l4Var == null) {
            l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        }
        l4Var.o1("");
        l4Var.p1("");
        l4Var.mo9015xbf5d97fd(cursor);
        return l4Var;
    }

    public final java.lang.String u(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public void v(java.lang.String str, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var) {
    }

    public void w() {
    }

    public void x(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, int i17, boolean z18, android.view.View view) {
    }

    public void y(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l2 l2Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var, android.view.View view) {
        if (!l2Var.f289368j || l4Var.w0() == -1) {
            view.findViewById(com.p314xaae8f345.mm.R.id.f565476cj0).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        } else {
            view.findViewById(com.p314xaae8f345.mm.R.id.f565476cj0).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562838q1);
        }
    }

    public java.lang.CharSequence z(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var.a1() == 1) {
            return this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqx);
        }
        if (l4Var.w0() == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            return "";
        }
        android.content.Context context = this.f294141e;
        long w07 = l4Var.w0();
        yf5.r rVar = yf5.r.f543477a;
        return k35.m1.f(context, w07, true, ((java.lang.Boolean) ((jz5.n) yf5.r.f543479c).mo141623x754a37bb()).booleanValue());
    }
}
