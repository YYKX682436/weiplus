package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f76770d;

    public b7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f76770d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.q qVar;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f76770d;
        if (this == o6Var.f86169f3.d() && (qVar = o6Var.f74810s) != null && qVar.getHeight() > 0 && o6Var.x0() != null) {
            o6Var.K("MoveOffScreenFunc getPageContainer().setTranslationY(%d)", java.lang.Integer.valueOf(o6Var.f74810s.getHeight()));
            o6Var.x0().setTranslationY(o6Var.f74810s.getHeight());
        }
    }
}
