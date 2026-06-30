package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f258313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f258314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f258315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f258316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f258317h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258318i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 f258319m;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var, long j17, android.content.Context context, android.content.Intent intent, int i17, boolean z17, java.lang.String str) {
        this.f258319m = h2Var;
        this.f258313d = j17;
        this.f258314e = context;
        this.f258315f = intent;
        this.f258316g = i17;
        this.f258317h = z17;
        this.f258318i = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        mg0.a wi6 = ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).wi(java.lang.String.valueOf(this.f258313d));
        if (wi6 != null) {
            wi6.a();
        }
        jq4.c1 c1Var = this.f258319m.f258114x;
        long j17 = this.f258313d;
        int i17 = this.f258316g;
        boolean z17 = this.f258317h;
        c1Var.getClass();
        android.content.Context context = this.f258314e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = this.f258315f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String toUser = this.f258318i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        jq4.y.y(c1Var, context, intent, j17, i17, z17, toUser, false, 0, 192, null);
    }
}
