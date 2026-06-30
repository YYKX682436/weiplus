package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f68378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.q f68380f;

    public o(com.tencent.mm.ipcinvoker.q qVar, java.lang.Class cls, java.lang.String str) {
        this.f68380f = qVar;
        this.f68378d = cls;
        this.f68379e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ipcinvoker.d0.l(this.f68378d);
        this.f68380f.a(this.f68379e, false);
        com.tencent.mm.ipcinvoker.d0.l(null);
    }
}
