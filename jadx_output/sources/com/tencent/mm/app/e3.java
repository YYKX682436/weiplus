package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.g3 f53401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f53402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53403f;

    public e3(com.tencent.mm.app.g3 g3Var, int i17, java.lang.String str) {
        this.f53401d = g3Var;
        this.f53402e = i17;
        this.f53403f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f53401d.b(this.f53402e, this.f53403f);
    }
}
