package qt1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final r45.mr5 f448043a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.js5 f448044b;

    public c(r45.mr5 request, r45.js5 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f448043a = request;
        this.f448044b = response;
    }

    public abstract int a();

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public final void d(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b() + "[CarLicensePlateCgiBase][" + hashCode() + ']', msg);
    }

    public java.lang.Object e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = c();
        lVar.f152200d = a();
        lVar.f152197a = this.f448043a;
        lVar.f152198b = this.f448044b;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        im5.c cVar = new im5.c();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).Ai(a17, new qt1.a(this, rVar, cVar), cVar);
        rVar.m(new qt1.b(cVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
