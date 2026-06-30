package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class f6 implements com.p314xaae8f345.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294458a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f294459b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f294460c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f294461d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f294462e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f294463f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f294464g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f294465h;

    /* renamed from: i, reason: collision with root package name */
    public int f294466i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f294467j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f294468k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f294469l;

    /* renamed from: m, reason: collision with root package name */
    public int f294470m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f294471n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.vfs.u f294472o;

    public f6(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f294458a = name;
        this.f294459b = name;
        this.f294468k = new java.util.HashMap();
        this.f294469l = kz5.p0.f395529d;
        this.f294471n = new java.util.HashSet();
    }

    public static /* synthetic */ void f(com.p314xaae8f345.mm.vfs.f6 f6Var, long j17, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            lVar = com.p314xaae8f345.mm.vfs.d6.f294433d;
        }
        f6Var.e(j17, lVar);
    }

    public static void g(com.p314xaae8f345.mm.vfs.f6 f6Var, long j17, long j18, yz5.l setup, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            setup = com.p314xaae8f345.mm.vfs.e6.f294443d;
        }
        f6Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setup, "setup");
        com.p314xaae8f345.mm.vfs.i3 i3Var = new com.p314xaae8f345.mm.vfs.i3(j17, true);
        i3Var.f294528d = j18;
        setup.mo146xb9724478(i3Var);
        f6Var.i(i3Var.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.vfs.c6 b() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.f6.b():com.tencent.mm.vfs.c6");
    }

    public final void c(long j17) {
        i(new com.p314xaae8f345.mm.vfs.m1(j17));
    }

    public final void d(int... flagList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flagList, "flagList");
        int i17 = 0;
        for (int i18 : flagList) {
            i17 |= i18;
        }
        this.f294460c = a(i17, 8);
        this.f294461d = a(i17, 1);
        this.f294465h = a(i17, 4);
        this.f294466i = i17;
    }

    public final void e(long j17, yz5.l setup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setup, "setup");
        com.p314xaae8f345.mm.vfs.i3 i3Var = new com.p314xaae8f345.mm.vfs.i3(j17, false);
        setup.mo146xb9724478(i3Var);
        i(i3Var.b());
    }

    public final void h() {
        i(new com.p314xaae8f345.mm.vfs.m4());
    }

    public final void i(com.p314xaae8f345.mm.vfs.u uVar) {
        if (this.f294472o == null) {
            this.f294472o = uVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("Clean policy can be set only once for \"" + this.f294458a + '\"');
    }

    public final void j(java.lang.String v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f294469l = kz5.b0.c(v17);
    }
}
