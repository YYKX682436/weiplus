package df2;

/* loaded from: classes3.dex */
public final class n4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f312365d;

    public n4(df2.r4 r4Var) {
        this.f312365d = r4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            df2.r4 r4Var = this.f312365d;
            r4Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubscribeNextLiveGuideController", "showBubble: show msgType=" + tm1Var.m75939xb282bd08(0) + ", guideTitle=" + tm1Var.m75945x2fec8307(3) + ", guideBtnText=" + tm1Var.m75945x2fec8307(4));
            java.lang.String m75945x2fec8307 = tm1Var.m75945x2fec8307(4);
            java.lang.String string = (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) != false ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkj) : tm1Var.m75945x2fec8307(4);
            if (r4Var.N6() != null) {
                r4Var.k7(r4Var);
                r4Var.o7(1);
                r4Var.h7(new df2.o4(r4Var));
                r4Var.l7(new df2.d9(tm1Var.m75945x2fec8307(3), null, string, null, 0, 0, 48, null));
                p3325xe03a0797.p3326xc267989b.r2 r2Var = r4Var.f312754q;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(tm1Var.m75939xb282bd08(1));
                java.lang.Long l17 = valueOf.longValue() > 0 ? valueOf : null;
                if (l17 != null) {
                    r4Var.n7(l17.longValue(), "init default");
                }
                r4Var.g7(new df2.q4(r4Var, new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), tm1Var, string));
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSubscribeNextLiveGuideController", "observe: post null");
        }
    }
}
