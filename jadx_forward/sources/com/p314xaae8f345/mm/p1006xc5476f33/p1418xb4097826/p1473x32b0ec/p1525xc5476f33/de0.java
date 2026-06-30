package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class de0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public final jz5.g A;
    public final jz5.g B;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f193808p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f193809q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f193810r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f193811s;

    /* renamed from: t, reason: collision with root package name */
    public final int f193812t;

    /* renamed from: u, reason: collision with root package name */
    public final int f193813u;

    /* renamed from: v, reason: collision with root package name */
    public final int f193814v;

    /* renamed from: w, reason: collision with root package name */
    public final int f193815w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f193816x;

    /* renamed from: y, reason: collision with root package name */
    public final long f193817y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f193818z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193808p = "FinderLiveTopCommentPlugin";
        this.f193809q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ae0(root));
        this.f193810r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.od0(root));
        this.f193811s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pd0(root));
        this.f193812t = 1;
        this.f193813u = 2;
        this.f193814v = 3;
        this.f193815w = 4;
        long b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderLiveTopCommentDisplayTimeSec", 10) * 1000;
        this.f193817y = b17;
        if (!x0()) {
            int dimensionPixelSize = root.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp);
            root.setPadding(dimensionPixelSize, root.getPaddingTop(), dimensionPixelSize, root.getPaddingBottom());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTopCommentPlugin", "STAY_DURATION:" + b17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185) root.findViewById(com.p314xaae8f345.mm.R.id.fnp)).m57359x1c0e2c9f(true);
        v1().getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        v1().getPaint().setStrokeWidth(1.0f);
        this.f193818z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ud0(this));
        this.A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wd0(root, this));
        this.B = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ce0(root, this));
    }

    public static final android.widget.TextView t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var) {
        return (android.widget.TextView) ((jz5.n) de0Var.f193809q).mo141623x754a37bb();
    }

    public static final java.lang.String u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var, java.lang.String str, android.text.style.ImageSpan imageSpan, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("createTopCommentMsg:");
        if (str.length() > 0) {
            sb6.append(str);
            sb7.append("anchorTag:" + str + ',');
        }
        if (imageSpan != null) {
            sb6.append(" ");
            sb7.append("globalBadgeSpan:true,");
        }
        sb6.append(str2 == null ? "" : str2);
        sb7.append("content:" + str2 + '!');
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.String str3 = de0Var.f193808p;
        java.lang.String sb8 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        r4Var.M2(str3, sb8);
        java.lang.String sb9 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }

    public static final java.lang.String y1(boolean z17, boolean z18, boolean z19, boolean z27) {
        if (z17) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573002d60);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (z18) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dtf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        if (z19) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ouc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
            return string3;
        }
        if (z27) {
            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.npz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
            return string4;
        }
        java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string5);
        return string5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        w1().mo50303x856b99f0(this.f193812t);
        w1().mo50303x856b99f0(this.f193813u);
        w1().mo50303x856b99f0(this.f193814v);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void c1(boolean z17) {
        if (z17) {
            this.f446856d.setVisibility(8);
        } else {
            K0(this.f194860i);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final android.widget.TextView v1() {
        return (android.widget.TextView) this.f193810r.mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 w1() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f193818z).mo141623x754a37bb();
    }

    public final void x1(android.view.View view) {
        int[] iArr = new int[2];
        qg2.d.f444326a.e(view, iArr);
        int dimensionPixelOffset = iArr[1] + (x0() ? view.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh) : view.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
        android.view.ViewGroup viewGroup = this.f446856d;
        if (viewGroup.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, dimensionPixelOffset, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            if (x0()) {
                layoutParams2.width = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
            }
            viewGroup.setLayoutParams(layoutParams2);
        }
    }

    public final void z1(java.util.List msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        android.os.Message mo50288x733c63a2 = w1().mo50288x733c63a2();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(msgList);
        mo50288x733c63a2.obj = arrayList;
        mo50288x733c63a2.what = this.f193815w;
        w1().mo50308x2936bf5f(mo50288x733c63a2);
    }
}
