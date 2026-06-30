package ee5;

/* loaded from: classes9.dex */
public final class q implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f333533d;

    public q(ee5.z zVar) {
        this.f333533d = zVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        aq.c cVar = (aq.c) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initIdentifyObserver >> change type ");
        sb6.append(cVar);
        sb6.append(", ");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", ");
        ee5.z zVar = this.f333533d;
        sb6.append(zVar.f333640q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", sb6.toString());
        aq.c cVar2 = aq.c.f94378g;
        if (cVar == cVar2 && zVar.f333640q == aq.c.f94376e) {
            de5.a aVar = de5.a.f310929a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setImageLoadingFinish before >> " + de5.a.f310939k + ", " + de5.a.f310940l);
            de5.a.f310939k = java.lang.System.currentTimeMillis();
            de5.a.f310941m = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setImageLoadingFinish after >> " + de5.a.f310939k + ", " + de5.a.f310936h + ", " + de5.a.f310931c);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = zVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar2 = pf5.z.f435481a;
            ((ee5.h0) zVar2.a(activity).a(ee5.h0.class)).U6(cVar2);
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
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        zVar.f333640q = cVar;
    }
}
