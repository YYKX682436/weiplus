package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class fa {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f73848a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f73849b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f73850c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.ea f73851d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73852e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f73853f = false;

    public fa(com.tencent.mm.plugin.account.ui.ea eaVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f73848a = "";
        this.f73849b = "";
        this.f73850c = "";
        this.f73849b = str;
        this.f73848a = str3;
        this.f73850c = str2;
        this.f73851d = eaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r10 != (-3)) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.tencent.mm.ui.MMActivity r8, int r9, int r10, java.lang.String r11, com.tencent.mm.modelbase.m1 r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.fa.a(com.tencent.mm.ui.MMActivity, int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public void b(com.tencent.mm.ui.MMActivity mMActivity) {
        java.lang.String str = this.f73848a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = this.f73849b;
        }
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(str, this.f73850c, 0, "", "", "", 0, "", false, true);
        gm0.j1.d().g(v0Var);
        this.f73851d.a(db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.z9(this, v0Var)));
    }
}
