package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class kn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f214050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, android.content.Context context, java.lang.String str) {
        super(1);
        this.f214050d = e3Var;
        this.f214051e = context;
        this.f214052f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f214050d.h();
            android.content.Intent intent = new android.content.Intent();
            xy2.c.c(this.f214051e, intent);
            intent.addFlags(67108864);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub.c7((c61.ub) c17, this.f214051e, this.f214052f, 2, intent, null, null, null, null, 240, null);
        }
        return jz5.f0.f384359a;
    }
}
