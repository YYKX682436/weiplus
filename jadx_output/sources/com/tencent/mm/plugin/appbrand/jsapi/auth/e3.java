package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class e3 implements fl1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79448b;

    public e3(com.tencent.mm.plugin.appbrand.jsapi.auth.f3 f3Var, ui1.z zVar, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var) {
        this.f79447a = zVar;
        this.f79448b = m0Var;
    }

    @Override // fl1.j1
    public void a(android.view.View view, fl1.h1 h1Var, int i17) {
        android.view.MotionEvent lastPointerDownTouchEvent = this.f79447a.getLastPointerDownTouchEvent();
        this.f79448b.b(view, i17, lastPointerDownTouchEvent == null ? 0 : java.lang.Math.round(lastPointerDownTouchEvent.getRawX()), lastPointerDownTouchEvent != null ? java.lang.Math.round(lastPointerDownTouchEvent.getRawY()) : 0);
    }
}
