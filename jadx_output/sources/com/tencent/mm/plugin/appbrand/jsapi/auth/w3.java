package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class w3 implements fl1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p f79770b;

    public w3(ui1.z zVar, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p pVar) {
        this.f79769a = zVar;
        this.f79770b = pVar;
    }

    @Override // fl1.j1
    public void a(android.view.View v17, fl1.h1 item, int i17) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.MotionEvent lastPointerDownTouchEvent = this.f79769a.getLastPointerDownTouchEvent();
        int b17 = lastPointerDownTouchEvent != null ? a06.d.b(lastPointerDownTouchEvent.getRawX()) : 0;
        int b18 = lastPointerDownTouchEvent != null ? a06.d.b(lastPointerDownTouchEvent.getRawY()) : 0;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p pVar = this.f79770b;
        if (pVar != null) {
            pVar.b(v17, i17, b17, b18);
        }
    }
}
