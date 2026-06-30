package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes14.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f222574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2 f222575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(x0.i0 i0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2 i2Var) {
        super(1);
        this.f222574d = i0Var;
        this.f222575e = i2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2 i2Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        x0.i0 i0Var = this.f222574d;
        java.util.Iterator it = i0Var.iterator();
        int i17 = 0;
        while (true) {
            x0.s0 s0Var = (x0.s0) it;
            boolean hasNext = s0Var.hasNext();
            i2Var = this.f222575e;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2) s0Var.next()).f222949a, i2Var.f222949a)) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2 i2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2) i0Var.get(i17);
            java.lang.String id6 = i2Var2.f222949a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            java.lang.String title = i2Var2.f222950b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
            i0Var.set(i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2(id6, title, i2Var2.f222951c, booleanValue));
            java.lang.String str = i2Var.f222949a;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.a() && str != null && (R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("GameCenter.DebugTool")) != null) {
                R.G(str, valueOf.booleanValue());
            }
        }
        return jz5.f0.f384359a;
    }
}
