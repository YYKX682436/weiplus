package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class sg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f195784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f195786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f195787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f195789i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f195790m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, java.lang.String str, boolean z17, boolean z18, android.view.View view, dk2.zf zfVar, in5.r0 r0Var) {
        super(2);
        this.f195784d = mgVar;
        this.f195785e = str;
        this.f195786f = z17;
        this.f195787g = z18;
        this.f195788h = view;
        this.f195789i = zfVar;
        this.f195790m = r0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f195784d;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ((mm2.c1) mgVar.P0(mm2.c1.class)).f410313b2;
            java.lang.String str = this.f195785e;
            if ((!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(concurrentHashMap.get(str), java.lang.Boolean.valueOf(this.f195786f)) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.valueOf(this.f195787g), ((mm2.c1) mgVar.P0(mm2.c1.class)).f410318c2.get(str))) && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.b()) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                android.view.View view = this.f195788h;
                view.setTag(com.p314xaae8f345.mm.R.id.f566134ev3, bool);
                yz5.q qVar = mgVar.D.f103714n;
                if (qVar != null) {
                    qVar.mo147xb9724478(this.f195789i, view, this.f195790m);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
