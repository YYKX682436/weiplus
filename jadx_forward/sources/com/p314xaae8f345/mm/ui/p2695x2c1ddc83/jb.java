package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class jb extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int f289317d;

    /* renamed from: e, reason: collision with root package name */
    public final int f289318e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f289319f;

    /* renamed from: g, reason: collision with root package name */
    public final float f289320g;

    /* renamed from: h, reason: collision with root package name */
    public final float f289321h;

    /* renamed from: i, reason: collision with root package name */
    public final float f289322i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f289323m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff f289324n;

    public jb(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff) {
        this.f289324n = activityC22384x2b6f00ff;
        android.content.res.ColorStateList[] colorStateListArr = new android.content.res.ColorStateList[5];
        this.f289319f = colorStateListArr;
        this.f289320g = -1.0f;
        this.f289321h = -1.0f;
        this.f289322i = -1.0f;
        colorStateListArr[0] = i65.a.e(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk);
        colorStateListArr[1] = i65.a.e(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30859x5a72f63.f560950yo);
        colorStateListArr[3] = i65.a.e(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        colorStateListArr[2] = i65.a.e(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        colorStateListArr[2] = i65.a.e(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        colorStateListArr[4] = i65.a.e(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30859x5a72f63.f560838vl);
        if (i65.a.D(activityC22384x2b6f00ff)) {
            this.f289318e = activityC22384x2b6f00ff.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561149ar);
            this.f289317d = activityC22384x2b6f00ff.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
        } else {
            this.f289318e = activityC22384x2b6f00ff.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561148aq);
            this.f289317d = activityC22384x2b6f00ff.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561152au);
        }
        this.f289320g = i65.a.h(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        this.f289321h = i65.a.h(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        this.f289322i = i65.a.h(activityC22384x2b6f00ff, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        this.f289323m = new java.util.HashMap();
    }

    public final java.lang.String a(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public final java.lang.CharSequence c(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        int a17 = l4Var.a1();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff = this.f289324n;
        return a17 == 1 ? activityC22384x2b6f00ff.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqx) : l4Var.w0() == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? "" : k35.m1.f(activityC22384x2b6f00ff, l4Var.w0(), true, false);
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 getItem(int i17) {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p((java.lang.String) this.f289324n.f288957e.get(i17));
    }

    public final int f(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return 1;
        }
        try {
            return java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f289324n.f288957e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04fb  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.jb.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
