package jz0;

/* loaded from: classes5.dex */
public final class e implements com.p314xaae8f345.mm.ui.p2740x696c9db.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jz0.k f384103a;

    public e(jz0.k kVar) {
        this.f384103a = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationEnd */
    public void mo54453xbb3aa236() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "ani end");
        jz0.k kVar = this.f384103a;
        kVar.f384127r = true;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = kVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        if (((com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b) zVar.a(activity).a(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.class)).f151360p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "ani end but video is finish first frame");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = kVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b) zVar.a(activity2).a(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.class);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c11022x6fd7187b.f151351d, "resume play");
            p3325xe03a0797.p3326xc267989b.l.d(c11022x6fd7187b.f151353f, null, null, new jz0.y(c11022x6fd7187b, null), 3, null);
            java.lang.Object mo141623x754a37bb = ((jz5.n) kVar.f384119g).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.widget.ImageView) mo141623x754a37bb).setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationStart */
    public void mo54454xd7e2f2fd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "ani start");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f384103a.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.Q6((com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b) a17, null, null, false, null, 15, null);
    }
}
