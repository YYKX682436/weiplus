package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.util.ArrayList arrayList) {
        super(1);
        this.f267608d = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object item) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = item instanceof java.lang.String;
        if (z17) {
            intValue = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(z17 ? (java.lang.String) item : null, 0);
        } else {
            intValue = item instanceof java.lang.Integer ? ((java.lang.Number) item).intValue() : -1;
        }
        if (intValue != -1) {
            this.f267608d.add(java.lang.Integer.valueOf(intValue));
        }
        return jz5.f0.f384359a;
    }
}
