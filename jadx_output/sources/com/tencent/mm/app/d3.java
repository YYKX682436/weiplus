package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.g3 f53382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53383e;

    public d3(com.tencent.mm.app.g3 g3Var, java.lang.String str) {
        this.f53382d = g3Var;
        this.f53383e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f53382d.a(this.f53383e);
    }
}
