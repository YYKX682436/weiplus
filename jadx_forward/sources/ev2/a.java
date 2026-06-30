package ev2;

/* loaded from: classes10.dex */
public final class a implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev2.c f338431a;

    public a(ev2.c cVar) {
        this.f338431a = cVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        ev2.d task = (ev2.d) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        ev2.c cVar = ev2.c.f338433c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionManager", "task callback " + status);
        if (status != fp0.u.f346823f) {
            ev2.c cVar2 = this.f338431a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(cVar2.f338435b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(cVar2.f338435b, u04.d.f505010c);
        }
    }
}
