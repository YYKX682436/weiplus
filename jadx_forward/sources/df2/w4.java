package df2;

/* loaded from: classes3.dex */
public final class w4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.x4 f313189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f313190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(df2.x4 x4Var, r45.tm1 tm1Var) {
        super(0);
        this.f313189d = x4Var;
        this.f313190e = tm1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f.b(this.f313189d.O6(), this.f313189d.getStore().getLiveRoomData())) {
            df2.x4 x4Var = this.f313189d;
            x4Var.f313289p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx(x4Var.O6(), this.f313189d.getStore().getLiveRoomData());
            df2.x4 x4Var2 = this.f313189d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar = x4Var2.f313289p;
            if (yxVar != null) {
                java.util.List list = ((mm2.o4) x4Var2.m56788xbba4bfc0(mm2.o4.class)).f410860v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
                synchronized (list) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) x4Var2.m56788xbba4bfc0(mm2.c1.class)).m8())) {
                            break;
                        }
                    }
                }
                yxVar.f202015d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx.f202011f.c(obj != null);
            }
            df2.x4 x4Var3 = this.f313189d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yx yxVar2 = x4Var3.f313289p;
            if (yxVar2 != null) {
                yxVar2.b(x4Var3.U6(), 4);
            }
            this.f313189d.m7("manualDismiss", false);
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Hk(ml2.u4.f409645f);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f313189d.f313291r;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        long m75939xb282bd08 = this.f313190e.m75939xb282bd08(2);
        if (m75939xb282bd08 > 0) {
            df2.x4 x4Var4 = this.f313189d;
            x4Var4.f313291r = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(x4Var4, null, null, new df2.v4(m75939xb282bd08, x4Var4, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
