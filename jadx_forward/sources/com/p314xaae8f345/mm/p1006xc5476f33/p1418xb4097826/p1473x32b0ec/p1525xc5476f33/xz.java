package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class xz extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz f196669b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar, java.lang.Class cls) {
        super(cls);
        this.f196669b = zzVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.a22 result = (r45.a22) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPollingSuccess multistream sequence: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = this.f196669b;
        sb6.append(zzVar.f196927s);
        sb6.append(" op: ");
        sb6.append(result.m75939xb282bd08(1));
        sb6.append(" resSeq: ");
        sb6.append(result.m75942xfb822ef2(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", sb6.toString());
        dk2.tb tbVar = dk2.ef.f314925k;
        r45.e22 e22Var = new r45.e22();
        e22Var.set(0, java.lang.Long.valueOf(zzVar.f196927s));
        tbVar.h(13, e22Var);
        if (result.m75939xb282bd08(1) == 0) {
            zzVar.f196927s = result.m75942xfb822ef2(0);
            r45.ma4 ma4Var = (r45.ma4) result.m75936x14adae67(2);
            if (ma4Var == null || (gVar = ma4Var.f461833m) == null) {
                return;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.na4().mo11468x92b714fd(gVar.f273689a);
            r45.na4 na4Var = mo11468x92b714fd instanceof r45.na4 ? (r45.na4) mo11468x92b714fd : null;
            if (na4Var != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update multistream list: ");
                java.util.LinkedList channel_params_desc = na4Var.f462731g;
                sb7.append(channel_params_desc);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", sb7.toString());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channel_params_desc, "channel_params_desc");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz.t1(zzVar, channel_params_desc);
            }
        }
    }
}
