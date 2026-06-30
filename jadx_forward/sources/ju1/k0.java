package ju1;

/* loaded from: classes9.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.n0 f383287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ju1.n0 n0Var) {
        super(1);
        this.f383287d = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String ret_msg;
        r45.qd3 qd3Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListViewModel", "Force refresh card, errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
            int i17 = fVar.f152148a;
            ju1.n0 n0Var = this.f383287d;
            if (i17 == 0 && fVar.f152149b == 0 && (qd3Var = (r45.qd3) fVar.f152151d) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListViewModel", "Force refresh card, retcode: " + qd3Var.f465383d + ", retmsg: " + qd3Var.f465384e);
                if (qd3Var.f465383d == 0) {
                    n0Var.f383303n = 0;
                    boolean z17 = qd3Var.f465385f;
                    p012xc85e97e9.p093xedfae76a.j0 j0Var = n0Var.f383285g;
                    if (z17) {
                        j0Var.mo7808x76db6cb1(ju1.o0.f383312i);
                    } else {
                        j0Var.mo7808x76db6cb1(ju1.o0.f383311h);
                    }
                    n0Var.f383304o = qd3Var;
                    n0Var.f383282d.mo7808x76db6cb1(qd3Var.f465388i);
                    p012xc85e97e9.p093xedfae76a.j0 j0Var2 = n0Var.f383284f;
                    r45.k90 items_list = qd3Var.f465389m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items_list, "items_list");
                    j0Var2.mo7808x76db6cb1(n0Var.S6(items_list, true));
                } else {
                    ret_msg = qd3Var.f465384e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ret_msg, "ret_msg");
                }
            } else {
                ret_msg = "";
            }
            ju1.o0 o0Var = ju1.o0.f383313m;
            o0Var.f383315d = ret_msg;
            n0Var.f383285g.mo7808x76db6cb1(o0Var);
        }
        return jz5.f0.f384359a;
    }
}
