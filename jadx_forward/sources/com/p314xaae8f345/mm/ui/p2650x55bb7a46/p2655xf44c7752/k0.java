package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc f282623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f282624d;

    public k0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f282623c = c21744x29417dbc;
        this.f282624d = f0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.t0
    public int c(int i17) {
        java.util.List list;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h0 h0Var = this.f282623c.f282082r;
        if (h0Var == null || (list = h0Var.f282507g) == null) {
            return 1;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (i17 < arrayList.size() && ((zb5.c) arrayList.get(i17)).f552843c != 0) {
            return this.f282624d.f391649d;
        }
        return 1;
    }
}
