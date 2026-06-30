package we2;

/* loaded from: classes3.dex */
public final class d0 extends we2.x {
    public d0(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        jz5.f0 f0Var;
        r45.i82 i82Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        boolean z17 = false;
        r45.r71 r71Var = respWrapper.f526747a;
        if (r71Var == null) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WishBannerInterceptor", "checkLiveClose return by curLiveData == null");
        } else {
            r45.nw1 nw1Var = (r45.nw1) r71Var.m75936x14adae67(3);
            if (nw1Var == null || (i82Var = (r45.i82) nw1Var.m75936x14adae67(48)) == null) {
                f0Var = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishBannerInterceptor", "checkWishBanner enable_flag: " + i82Var.m75933x41a8a7f2(0) + ", cur: " + i82Var.m75942xfb822ef2(2) + " target: " + i82Var.m75942xfb822ef2(1) + " size " + i82Var.m75941xfb821914(5).size() + "} wishId: " + i82Var.m75945x2fec8307(6));
                ((mm2.f7) eVar.a(mm2.f7.class)).f410591f.mo7808x76db6cb1(i82Var);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                ((mm2.f7) eVar.a(mm2.f7.class)).f410591f.mo7808x76db6cb1(new r45.i82());
            }
            z17 = true;
        }
        return !z17;
    }
}
