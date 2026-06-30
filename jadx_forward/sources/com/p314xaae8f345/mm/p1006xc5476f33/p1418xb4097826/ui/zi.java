package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class zi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f211640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(fc2.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        super(0);
        this.f211640d = aVar;
        this.f211641e = activityC15076x7a6c76b6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean bool;
        ec2.f fVar = (ec2.f) this.f211640d;
        int i17 = fVar.f332492d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211641e;
        if (i17 == 17) {
            activityC15076x7a6c76b6.N1.put(java.lang.Long.valueOf(fVar.f332498j), java.lang.Boolean.TRUE);
        } else if (i17 == 4) {
            activityC15076x7a6c76b6.N1.put(java.lang.Long.valueOf(fVar.f332498j), java.lang.Boolean.FALSE);
        } else if (i17 == 6 && (bool = (java.lang.Boolean) activityC15076x7a6c76b6.N1.remove(java.lang.Long.valueOf(fVar.f332498j))) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w8 w8Var = activityC15076x7a6c76b6.E;
            if (w8Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            w8Var.m56068x4905e9fa();
            activityC15076x7a6c76b6.N7(fVar.f332498j, bool.booleanValue());
        }
        return jz5.f0.f384359a;
    }
}
