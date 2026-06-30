package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2 f284682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f284684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2 t2Var, java.util.List list, int i17) {
        super(2);
        this.f284682d = t2Var;
        this.f284683e = list;
        this.f284684f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.t2 t2Var = this.f284682d;
        jz5.l lVar = t2Var.f284629c;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        jz5.l lVar2 = t2Var.f284631e;
        float intValue3 = ((((java.lang.Number) lVar2.f384366d).intValue() - intValue) * floatValue) + intValue;
        float intValue4 = ((((java.lang.Number) lVar2.f384367e).intValue() - intValue2) * floatValue) + intValue2;
        float f17 = t2Var.f284634h;
        float f18 = t2Var.f284633g;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v2) this.f284683e.get(this.f284684f)).a(matrix, (int) intValue3, (int) intValue4, ((f17 - f18) * floatValue) + f18);
        return jz5.f0.f384359a;
    }
}
