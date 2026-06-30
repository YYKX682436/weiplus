package ju1;

/* loaded from: classes9.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju1.j0 f383271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ju1.j0 j0Var) {
        super(1);
        this.f383271d = j0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String ret_msg;
        r45.sd3 sd3Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CouponAndGiftCardViewModel", "refresh coupon and gift list errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
            int i17 = fVar.f152148a;
            ju1.j0 j0Var = this.f383271d;
            if (i17 == 0 && fVar.f152149b == 0 && (sd3Var = (r45.sd3) fVar.f152151d) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CouponAndGiftCardViewModel", "refresh coupon and gift list retcode: " + sd3Var.f467168d + ", retmsg: " + sd3Var.f467169e);
                if (sd3Var.f467168d == 0) {
                    j0Var.f383277n = 0;
                    boolean z17 = sd3Var.f467170f;
                    p012xc85e97e9.p093xedfae76a.j0 j0Var2 = j0Var.f383285g;
                    if (z17) {
                        j0Var2.mo7808x76db6cb1(ju1.o0.f383312i);
                    } else {
                        j0Var2.mo7808x76db6cb1(ju1.o0.f383311h);
                    }
                    j0Var.f383278o = sd3Var;
                    j0Var.f383282d.mo7808x76db6cb1(sd3Var.f467173i);
                    j0Var.f383284f.mo7808x76db6cb1(j0Var.S6(sd3Var, true));
                } else {
                    ret_msg = sd3Var.f467169e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ret_msg, "ret_msg");
                }
            } else {
                ret_msg = "";
            }
            ju1.o0 o0Var = ju1.o0.f383313m;
            o0Var.f383315d = ret_msg;
            j0Var.f383285g.mo7808x76db6cb1(o0Var);
        }
        return jz5.f0.f384359a;
    }
}
