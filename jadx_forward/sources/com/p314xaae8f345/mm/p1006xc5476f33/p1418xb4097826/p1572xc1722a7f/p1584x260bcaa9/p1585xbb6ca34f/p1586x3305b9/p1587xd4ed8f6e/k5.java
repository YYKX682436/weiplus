package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(in5.s0 s0Var) {
        super(2);
        this.f203294d = s0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        android.content.Context context = this.f203294d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sp2.x3 x3Var = (sp2.x3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sp2.x3.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", "startRequestCgi");
        x3Var.V6(intValue, intValue2);
        x3Var.W6(intValue, intValue2);
        return jz5.f0.f384359a;
    }
}
