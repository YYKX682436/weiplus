package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.h f80983d;

    public m(com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar) {
        this.f80983d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar = this.f80983d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = hVar.f80955h;
        if (u3Var != null) {
            u3Var.dismiss();
            hVar.f80955h = null;
        }
    }
}
