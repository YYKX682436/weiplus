package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f195707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f195708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f195709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(java.util.LinkedList linkedList, ek2.i2 i2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar) {
        super(0);
        this.f195707d = linkedList;
        this.f195708e = i2Var;
        this.f195709f = dqVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek2.i2 i2Var;
        java.lang.Object obj;
        java.util.Iterator it = this.f195707d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i2Var = this.f195708e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.ad5 ad5Var = (r45.ad5) obj;
            boolean z17 = false;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ad5Var.m75945x2fec8307(3), i2Var.f335003y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ad5Var.m75945x2fec8307(0), i2Var.f335004z)) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.ad5 ad5Var2 = (r45.ad5) obj;
        if (ad5Var2 != null) {
            if (ad5Var2.m75942xfb822ef2(6) < c01.id.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "gift is already expire_time, it.expire_time = " + ad5Var2.m75942xfb822ef2(6));
                ad5Var2.set(1, 0L);
                java.lang.String str = i2Var.f334999u;
                if (str != null) {
                    dk2.u7.f315714a.j(str);
                }
            } else {
                ad5Var2.set(1, java.lang.Long.valueOf(ad5Var2.m75942xfb822ef2(1) + i2Var.f335000v));
            }
            this.f195709f.w1("resumePkgGiftPatchInfoOnFail");
        }
        return jz5.f0.f384359a;
    }
}
