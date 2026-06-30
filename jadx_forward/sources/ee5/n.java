package ee5;

/* loaded from: classes9.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f333508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ee5.z zVar) {
        super(0);
        this.f333508d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        de5.a aVar = de5.a.f310929a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setImageIsAllIdentified: " + de5.a.f310940l);
        de5.a.f310940l = true;
        ee5.z zVar = this.f333508d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = zVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar2 = pf5.z.f435481a;
        ((ee5.h0) zVar2.a(activity).a(ee5.h0.class)).U6(aq.c.f94378g);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = zVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ee5.q3 q3Var = (ee5.q3) zVar2.a(activity2).a(ee5.q3.class);
        q3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone");
        if (!q3Var.f333556x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone >> when done is no query");
            android.widget.ProgressBar progressBar = q3Var.f333545m;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
