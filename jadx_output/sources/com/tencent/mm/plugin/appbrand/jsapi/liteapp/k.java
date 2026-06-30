package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f81540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81541e;

    public k(com.tencent.mm.plugin.appbrand.jsapi.liteapp.u uVar, java.lang.Object[] objArr, android.content.Context context) {
        this.f81540d = objArr;
        this.f81541e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f81540d;
        if (objArr[1].equals(java.lang.Boolean.TRUE)) {
            return;
        }
        android.content.Context context = this.f81541e;
        objArr[0] = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f81541e.getString(com.tencent.mm.R.string.f490604zq), true, false, new com.tencent.mm.plugin.appbrand.jsapi.liteapp.j(this));
    }
}
