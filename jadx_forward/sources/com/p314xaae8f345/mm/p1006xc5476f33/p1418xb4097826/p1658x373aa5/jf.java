package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class jf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f213971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f f213972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f) {
        super(1);
        this.f213971d = i17;
        this.f213972e = c15326x96ed1d6f;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int floatValue = (int) (255 * ((java.lang.Number) obj).floatValue());
        int i17 = this.f213971d;
        this.f213972e.getMileStoneRoot().setBackgroundColor(android.graphics.Color.argb(floatValue, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)));
        return jz5.f0.f384359a;
    }
}
