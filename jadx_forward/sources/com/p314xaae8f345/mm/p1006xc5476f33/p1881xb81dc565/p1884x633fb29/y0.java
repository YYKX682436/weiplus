package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a f231739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f231740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231741f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 f231742g;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var, com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a, android.content.Intent intent, java.lang.String str) {
        this.f231742g = v0Var;
        this.f231739d = c11142xe8e5c41a;
        this.f231740e = intent;
        this.f231741f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = this.f231742g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h hVar = v0Var.S;
        hVar.f231819x = this.f231739d;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = this.f231740e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String toUser = this.f231741f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        hVar.v(context, intent, 0L, 0, toUser, false);
        boolean z17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ld.f292089a;
        com.p314xaae8f345.mm.ui.p2740x696c9db.ld.f292089a = true;
        com.p314xaae8f345.mm.ui.p2740x696c9db.kd observer = v0Var.Z;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        java.util.ArrayList arrayList = (java.util.ArrayList) com.p314xaae8f345.mm.ui.p2740x696c9db.ld.f292090b;
        if (!arrayList.contains(observer)) {
            arrayList.add(observer);
        }
        v0Var.U(false);
    }
}
