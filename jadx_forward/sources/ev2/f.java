package ev2;

/* loaded from: classes10.dex */
public final class f implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev2.h f338441a;

    public f(ev2.h hVar) {
        this.f338441a = hVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        ev2.i task = (ev2.i) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        ev2.h hVar = ev2.h.f338443c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.ActionManager", "task callback " + status);
        if (status != fp0.u.f346823f) {
            ev2.h hVar2 = this.f338441a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(hVar2.f338445b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(hVar2.f338445b, nv2.a.f421964a);
        }
    }
}
