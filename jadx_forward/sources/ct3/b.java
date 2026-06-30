package ct3;

/* loaded from: classes9.dex */
public final class b implements ct3.c {

    /* renamed from: a, reason: collision with root package name */
    public final v05.b f303835a;

    public b(v05.b commonAppMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonAppMsg, "commonAppMsg");
        this.f303835a = commonAppMsg;
    }

    @Override // ct3.c
    public java.lang.String a() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.r();
        }
        return null;
    }

    @Override // ct3.c
    public int b() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.F();
        }
        return 0;
    }

    @Override // ct3.c
    public java.lang.String c() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.m75945x2fec8307(e17.f449897d + 2);
        }
        return null;
    }

    @Override // ct3.c
    public long d() {
        v05.a e17 = e();
        if (e17 != null) {
            return e17.m75942xfb822ef2(e17.f449897d + 0);
        }
        return 0L;
    }

    public final v05.a e() {
        v05.b bVar = this.f303835a;
        return (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
    }

    @Override // ct3.c
    /* renamed from: getTitle */
    public java.lang.String mo122711x7531c8a2() {
        v05.b bVar = this.f303835a;
        return bVar.m75945x2fec8307(bVar.f449898d + 2);
    }
}
