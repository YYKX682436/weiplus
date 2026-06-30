package jz0;

/* loaded from: classes5.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b f384165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f384166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(1);
        this.f384165d = c11022x6fd7187b;
        this.f384166e = activityC0065xcd7aa112;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b = this.f384165d;
        if (!booleanValue) {
            c11022x6fd7187b.t("start play error");
        } else if (!c11022x6fd7187b.f151360p) {
            c11022x6fd7187b.f151360p = true;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f384166e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            boolean z17 = ((jz0.k) zVar.a(activity).a(jz0.k.class)).f384127r;
            java.lang.String str = c11022x6fd7187b.f151351d;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "first frame >> ani is end");
                jz0.k kVar = (jz0.k) zVar.a(activity).a(jz0.k.class);
                kVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "setThumbViewVisible >> 8, " + kVar.f384127r);
                if (kVar.f384127r) {
                    java.lang.Object mo141623x754a37bb = ((jz5.n) kVar.f384119g).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                    ((android.widget.ImageView) mo141623x754a37bb).setVisibility(8);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "first frame >> but ani is no end");
                c11022x6fd7187b.R6();
            }
        }
        g65.a aVar = (g65.a) i95.n0.c(g65.a.class);
        int i17 = c11022x6fd7187b.f151354g ? 2 : 1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        g65.a.hg(aVar, 34, i17, "", 0, 0, 0, 0L, 0L, 0L, 0L, 0, null, java.lang.Boolean.valueOf(booleanValue), null, null, 28664, null);
        return jz5.f0.f384359a;
    }
}
