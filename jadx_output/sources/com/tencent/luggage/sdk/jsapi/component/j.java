package com.tencent.luggage.sdk.jsapi.component;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f47347d;

    public j(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f47347d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.jsapi.component.b bVar = this.f47347d;
        if (bVar.a2() == null || bVar.a2().getWebScrollY() == 0) {
            return;
        }
        bVar.E3();
        bVar.a2().setVerticalScrollBarEnabled(false);
        bVar.C(new com.tencent.luggage.sdk.jsapi.component.i(this));
    }
}
