package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f68360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.q f68362f;

    public k(com.tencent.mm.ipcinvoker.q qVar, java.lang.Class cls, java.lang.String str) {
        this.f68362f = qVar;
        this.f68360d = cls;
        this.f68361e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ipcinvoker.d0.l(this.f68360d);
        this.f68362f.a(this.f68361e, false);
        com.tencent.mm.ipcinvoker.d0.l(null);
    }
}
