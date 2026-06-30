package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.g3 f53359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f53361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f53362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f53363h;

    public c3(com.tencent.mm.app.g3 g3Var, java.lang.String str, int i17, long j17, long j18) {
        this.f53359d = g3Var;
        this.f53360e = str;
        this.f53361f = i17;
        this.f53362g = j17;
        this.f53363h = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f53359d.c(this.f53360e, this.f53361f, this.f53362g, this.f53363h);
    }
}
