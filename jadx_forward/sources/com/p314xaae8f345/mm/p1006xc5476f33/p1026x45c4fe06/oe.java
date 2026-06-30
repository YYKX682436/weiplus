package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class oe implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167778a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 f167779b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f167780c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f167781d;

    public oe(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 prepareTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareTask, "prepareTask");
        this.f167778a = rt6;
        this.f167779b = prepareTask;
        this.f167780c = "MicroMsg.AppBrand.RuntimeLaunchTimeoutFallbackReloadTask[" + rt6.f156336n + '|' + rt6.hashCode() + ']';
        this.f167781d = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        boolean z17 = this.f167781d.get();
        java.lang.String str = this.f167780c;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "onResult but canceled");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onResult with config:" + c11809xbc286be4);
        this.f167779b.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167778a;
        if (c11809xbc286be4 == null) {
            o6Var.l0();
        } else {
            o6Var.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ne(c11809xbc286be4, c12559xbdae8559, this));
        }
    }
}
