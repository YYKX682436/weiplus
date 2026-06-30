package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4 f198005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4 n4Var) {
        super(1);
        this.f198005d = n4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4 n4Var = this.f198005d;
        n4Var.f198044x = intValue;
        android.widget.TextView textView = n4Var.f198037q;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedLevelDesc");
            throw null;
        }
        textView.setText(intValue + "级及以上");
        return jz5.f0.f384359a;
    }
}
