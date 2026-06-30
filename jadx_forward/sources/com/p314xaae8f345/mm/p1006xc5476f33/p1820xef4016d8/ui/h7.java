package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes2.dex */
public final class h7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7 f228515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7 j7Var) {
        super(1);
        this.f228515d = j7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.iz_);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (!(bool != null ? bool.booleanValue() : false)) {
            view.setImportantForAccessibility(2);
            return "";
        }
        view.setImportantForAccessibility(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7 j7Var = this.f228515d;
        java.lang.String m158362x2fec8307 = j7Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.jar);
        if (!(view.getAlpha() == 1.0f)) {
            return m158362x2fec8307;
        }
        return m158362x2fec8307 + j7Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gjv);
    }
}
