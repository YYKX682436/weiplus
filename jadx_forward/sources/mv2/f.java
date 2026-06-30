package mv2;

/* loaded from: classes10.dex */
public final class f implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mv2.l f413093a;

    public f(mv2.l lVar) {
        this.f413093a = lVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        mv2.b task = (mv2.b) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        mv2.l lVar = mv2.l.f413130d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionManager", "task callback " + status);
        fp0.u uVar = fp0.u.f346823f;
        mv2.l lVar2 = this.f413093a;
        if (status == uVar) {
            lVar2.e();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(lVar2.f413133c);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(lVar2.f413133c, nv2.a.f421964a);
        }
    }
}
