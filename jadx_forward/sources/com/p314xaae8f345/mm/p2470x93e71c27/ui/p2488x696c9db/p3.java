package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class p3 extends jk3.v {
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p3 C = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p3();
    public int A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f273364x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f273365y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f273366z;

    public p3() {
        super(null);
        this.f273364x = "";
        this.f273365y = "";
        this.f273366z = "";
        this.A = 0;
        this.B = false;
    }

    public static java.lang.String c0(java.lang.String str) {
        try {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            if (lastIndexOf < 0 || lastIndexOf == str.length()) {
                lastIndexOf = 0;
            }
            return str.substring(lastIndexOf, str.length());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "get file name error " + e17.getMessage());
            return " ";
        }
    }

    @Override // jk3.v, jk3.b
    public void C(boolean z17, int i17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "onMenuFloatBallSelected, enter float ball");
            l(null, true);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575202l73);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
            intent.setPackage("com.tencent.mtt");
            intent.putExtra("key_reader_sdk_window_close", true);
            try {
                context.sendBroadcast(intent);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "closeQb() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        return super.U(i17, this.B);
    }

    public void d0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, r45.w60 w60Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "onCreate, filePath:%s fileExt:%s fileName:%s sence:%s", str, str2, str3, java.lang.Integer.valueOf(i17));
        y(4, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.c(str));
        this.f273364x = str;
        this.f273365y = str2;
        this.f273366z = str3;
        if (android.text.TextUtils.isEmpty(str3)) {
            this.f273366z = c0(str);
        }
        this.B = false;
        this.A = i17;
        b0(w60Var);
        r45.qs0 qs0Var = new r45.qs0();
        qs0Var.set(0, java.lang.Boolean.FALSE);
        qs0Var.set(1, str);
        qs0Var.set(2, str2);
        qs0Var.set(7, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str)));
        qs0Var.set(5, java.lang.Integer.valueOf(java.lang.Integer.valueOf(i17).intValue()));
        try {
            this.f381610a.f66790x225a93cf = qs0Var.mo14344x5f01b1f6();
            J();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", e17, "", new java.lang.Object[0]);
        }
        this.f381610a.v0().set(4, this.f273365y);
        this.f381610a.v0().set(1, this.f273366z);
        J();
    }

    @Override // jk3.b
    public long n() {
        return 1500L;
    }

    @Override // jk3.b
    public boolean x() {
        return false;
    }
}
