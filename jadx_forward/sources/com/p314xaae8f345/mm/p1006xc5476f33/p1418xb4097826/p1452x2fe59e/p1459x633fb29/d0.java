package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 f189312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f189313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f189314f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var, long j17, java.util.LinkedList linkedList) {
        this.f189312d = l0Var;
        this.f189313e = j17;
        this.f189314f = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f189312d.f189658g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc xcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc.class);
        if (xcVar != null) {
            xcVar.f7(this.f189313e).mo7808x76db6cb1(new jz5.l(this.f189314f, 0L));
        }
    }
}
