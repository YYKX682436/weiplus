package qn2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f446593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qn2.n nVar) {
        super(1);
        this.f446593d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 it = (r45.cz1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.ht1 ht1Var = ((on2.z2) this.f446593d.P0(on2.z2.class)).f428627o;
        java.lang.Long valueOf = ht1Var != null ? java.lang.Long.valueOf(ht1Var.m75942xfb822ef2(5)) : null;
        r45.ht1 ht1Var2 = ((on2.z2) this.f446593d.P0(on2.z2.class)).f428627o;
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = (ht1Var2 == null || (cz1Var3 = (r45.cz1) ht1Var2.m75936x14adae67(1)) == null) ? null : cz1Var3.m75945x2fec8307(0);
        km2.z zVar = ((on2.z2) this.f446593d.P0(on2.z2.class)).f428625m;
        java.lang.String m75945x2fec83072 = (zVar == null || (cz1Var2 = zVar.f390765d) == null) ? null : cz1Var2.m75945x2fec8307(0);
        java.lang.String m75945x2fec83073 = it.m75945x2fec8307(0);
        java.lang.String str = this.f446593d.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doneAnimCallback record:");
        java.lang.Object obj2 = ((on2.z2) this.f446593d.P0(on2.z2.class)).f428627o;
        if (obj2 == null) {
            obj2 = "";
        }
        sb6.append(pm0.b0.g(obj2));
        sb6.append(" lotteryInfo:");
        sb6.append(pm0.b0.g(it));
        sb6.append(" curRecordLiveId");
        sb6.append(valueOf);
        sb6.append(",curRecordLotteryId:");
        sb6.append(m75945x2fec8307);
        sb6.append(",callbakcId:");
        sb6.append(m75945x2fec83073);
        sb6.append(",localId:");
        sb6.append(m75945x2fec83072);
        sb6.append(",lottering:");
        sb6.append(this.f446593d.f446756s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.nw1 nw1Var = ((mm2.e1) this.f446593d.P0(mm2.e1.class)).f410521r;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null)) {
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, m75945x2fec83072)) {
                qn2.n.y1(this.f446593d, it);
                return jz5.f0.f384359a;
            }
        }
        qn2.n nVar = this.f446593d;
        km2.z zVar2 = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
        if (zVar2 == null || (cz1Var = zVar2.f390765d) == null) {
            cz1Var = it;
        }
        qn2.n.z1(nVar, cz1Var);
        qn2.n nVar2 = this.f446593d;
        nVar2.u1(new qn2.e(nVar2, it));
        return jz5.f0.f384359a;
    }
}
