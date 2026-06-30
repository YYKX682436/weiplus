package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 f96103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f96104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2 f96107h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f96108i;

    public u2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x2 x2Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 w2Var, int i17, int i18, java.lang.String str, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2 t2Var, boolean z17) {
        this.f96103d = w2Var;
        this.f96104e = i17;
        this.f96105f = i18;
        this.f96106g = str;
        this.f96107h = t2Var;
        this.f96108i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96103d.a(this.f96104e, this.f96105f, this.f96106g, this.f96107h, this.f96108i);
    }
}
