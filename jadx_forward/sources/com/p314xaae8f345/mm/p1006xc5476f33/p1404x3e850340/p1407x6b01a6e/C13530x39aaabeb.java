package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceNumberView */
/* loaded from: classes4.dex */
public class C13530x39aaabeb extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181675d;

    /* renamed from: e, reason: collision with root package name */
    public int f181676e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f181677f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e[] f181678g;

    /* renamed from: h, reason: collision with root package name */
    public int f181679h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f181680i;

    public C13530x39aaabeb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a(java.lang.String str) {
        this.f181675d = str;
        int i17 = 0;
        if (str != null) {
            this.f181676e = str.length();
        } else {
            this.f181676e = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e[] c13529xca5dc69eArr = this.f181678g;
        if (c13529xca5dc69eArr == null || c13529xca5dc69eArr.length <= 0) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181675d)) {
            while (i17 < this.f181678g.length) {
                java.lang.String str2 = "";
                if (this.f181676e > i17) {
                    str2 = this.f181675d.charAt(i17) + "";
                    if (this.f181676e == i17 + 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e c13529xca5dc69e = this.f181678g[i17];
                        c13529xca5dc69e.f181668d.e();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new i72.u(c13529xca5dc69e.f181674m), true);
                        c13529xca5dc69e.f181668d = b4Var;
                        b4Var.c(0L, 29L);
                    } else {
                        this.f181678g[i17].f181668d.e();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e c13529xca5dc69e2 = this.f181678g[i17];
                        c13529xca5dc69e2.f181673i = 30;
                        c13529xca5dc69e2.invalidate();
                    }
                }
                b(this.f181678g[i17], str2);
                i17++;
            }
            return;
        }
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e[] c13529xca5dc69eArr2 = this.f181678g;
            if (i17 >= c13529xca5dc69eArr2.length) {
                return;
            }
            b(c13529xca5dc69eArr2[i17], "point");
            i17++;
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e c13529xca5dc69e, java.lang.String str) {
        if (c13529xca5dc69e == null) {
            return;
        }
        if (str.equals("0")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.c1y);
            return;
        }
        if (str.equals("1")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.c1z);
            return;
        }
        if (str.equals("2")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562968c20);
            return;
        }
        if (str.equals("3")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562969c21);
            return;
        }
        if (str.equals("4")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562970c22);
            return;
        }
        if (str.equals("5")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562971c23);
            return;
        }
        if (str.equals("6")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562972c24);
            return;
        }
        if (str.equals("7")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562973c25);
            return;
        }
        if (str.equals("8")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.f562974c26);
        } else if (str.equals("9")) {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.c27);
        } else {
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.c28);
        }
    }

    /* renamed from: setNumberLengthAndInflate */
    public void m55285x8f3eb021(int i17) {
        int dimensionPixelSize;
        int i18;
        if (i17 > 12) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed max length: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Facing.MMPwdInputView", "hy: number length exceed min length: %d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i17 == this.f181679h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.MMPwdInputView", "hy: already correct length. quit");
            a(null);
            return;
        }
        this.f181677f.removeAllViews();
        this.f181679h = i17;
        this.f181678g = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e c13529xca5dc69e = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aaf, null);
            c13529xca5dc69e.m55284x8d516947(com.p314xaae8f345.mm.R.C30861xcebc809e.c28);
            if (i19 == 0) {
                dimensionPixelSize = (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561937wz) + i65.a.b(getContext(), 48)) / 2;
                i18 = 3;
            } else if (i19 == i17 - 1) {
                dimensionPixelSize = (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561937wz) + i65.a.b(getContext(), 48)) / 2;
                i18 = 5;
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561937wz);
                i18 = 17;
            }
            c13529xca5dc69e.m55283xc1f6fb8c(i18);
            this.f181678g[i19] = c13529xca5dc69e;
            this.f181677f.addView(c13529xca5dc69e, new android.view.ViewGroup.LayoutParams(dimensionPixelSize, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561936wy)));
        }
    }

    public C13530x39aaabeb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f181675d = null;
        this.f181678g = null;
        this.f181679h = 0;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aae, null);
        this.f181677f = viewGroup;
        addView(viewGroup);
        this.f181680i = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1);
    }
}
