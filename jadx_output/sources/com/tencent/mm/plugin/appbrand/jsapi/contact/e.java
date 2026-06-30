package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes15.dex */
public class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f80544d;

    public e(com.tencent.mm.plugin.appbrand.jsapi.contact.j jVar, java.lang.String[] strArr) {
        this.f80544d = strArr;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String[] strArr = this.f80544d;
        g4Var.f(0, strArr[0]);
        g4Var.f(1, strArr[1]);
    }
}
