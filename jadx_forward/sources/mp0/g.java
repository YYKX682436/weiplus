package mp0;

/* loaded from: classes15.dex */
public final class g implements mp0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mp0.h f411972a;

    public g(mp0.h hVar) {
        this.f411972a = hVar;
    }

    public void a(hp0.e resultData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        fp0.u uVar = fp0.u.f346823f;
        mp0.h hVar = this.f411972a;
        hVar.getClass();
        hVar.f411978n = uVar;
        hVar.g(resultData);
        if ((resultData.a() ? resultData : null) != null) {
            java.lang.String str = hVar.f411977m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ImageLoader] onTaskDownFin. get bitmap successs. ");
            ip0.a aVar = hVar.f411973f;
            sb6.append(aVar);
            sb6.append(' ');
            sb6.append(resultData.f364443b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            cp0.l.f302288b.a().a(aVar, resultData, hVar.f411976i);
        }
        hVar.f(resultData);
        hVar.b(hVar.f411978n);
    }

    public void b() {
        fp0.u uVar = fp0.u.f346824g;
        mp0.h hVar = this.f411972a;
        hVar.getClass();
        hVar.f411978n = uVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f411977m, "onTaskFail " + hVar.f411973f);
        hVar.b(hVar.f411978n);
    }
}
