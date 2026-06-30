package bb2;

/* loaded from: classes10.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 f100333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.f2 f100335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f100336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27, int i17, bb2.f2 f2Var, int i18) {
        super(0);
        this.f100333d = c13683xee96bb27;
        this.f100334e = i17;
        this.f100335f = f2Var;
        this.f100336g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 m55604xe9000c39;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27 = this.f100333d;
        if (c13683xee96bb27.isAttachedToWindow()) {
            long j17 = this.f100334e * 1000;
            if (!this.f100335f.f100394d && c13683xee96bb27.m55605xfb7f4e14().h2(c13683xee96bb27.getBulletManager().f100579k)) {
                c13683xee96bb27.getBulletManager().s(j17, this.f100336g * 1000);
            }
            if (c13683xee96bb27.h()) {
                java.util.List<r45.f43> list = c13683xee96bb27.getBulletManager().f100584p;
                boolean z18 = false;
                if (list != null && c13683xee96bb27.getContext().getResources().getConfiguration().orientation != 2) {
                    for (r45.f43 f43Var : list) {
                        long m75942xfb822ef2 = f43Var.m75942xfb822ef2(3);
                        long m75942xfb822ef22 = f43Var.m75942xfb822ef2(2);
                        if (m75942xfb822ef2 >= 0 && m75942xfb822ef2 <= j17 && j17 < m75942xfb822ef22 + 1000) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    c13683xee96bb27.g();
                    c13683xee96bb27.getBulletManager().getClass();
                    xp.d.f().f537395s = true;
                }
                m55604xe9000c39 = c13683xee96bb27.m55604xe9000c39();
                if (m55604xe9000c39.getVisibility() == 8) {
                    java.util.List<r45.f43> list2 = c13683xee96bb27.getBulletManager().f100584p;
                    if (list2 != null) {
                        c13683xee96bb27.getBulletManager().getClass();
                        if (xp.d.f().f537395s) {
                            android.content.Context context = c13683xee96bb27.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            pf5.z zVar = pf5.z.f435481a;
                            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class);
                            if (c15477xbd78f833 != null && c15477xbd78f833.f215183u) {
                                z18 = true;
                            }
                            if (!z18 && c13683xee96bb27.getContext().getResources().getConfiguration().orientation != 2) {
                                for (r45.f43 f43Var2 : list2) {
                                    long m75942xfb822ef23 = f43Var2.m75942xfb822ef2(2);
                                    if (m75942xfb822ef23 >= 0 && m75942xfb822ef23 <= j17 && m75942xfb822ef23 + 1000 >= j17) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    f43Var2 = null;
                    if (f43Var2 != null) {
                        c13683xee96bb27.l(f43Var2);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
