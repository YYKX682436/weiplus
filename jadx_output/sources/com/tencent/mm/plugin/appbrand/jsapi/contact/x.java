package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qo3 f80619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.y f80620e;

    public x(com.tencent.mm.plugin.appbrand.jsapi.contact.y yVar, r45.qo3 qo3Var) {
        this.f80620e = yVar;
        this.f80619d = qo3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.contact.y yVar = this.f80620e;
        yVar.f80624d.C(yVar.f80622b, yVar.f80623c, this.f80619d.f384147d, yVar.f80621a);
    }
}
