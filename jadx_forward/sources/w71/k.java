package w71;

/* loaded from: classes11.dex */
public final class k extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final long f524946m;

    public k(bw5.z request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        if (request.f117284o > 0) {
            lVar.f152197a = new w71.o1(request.m13447x744cac3f().g(), request.b().f116415d, request.f117284o);
        } else {
            lVar.f152197a = new w71.c1(request.m13447x744cac3f().g(), request.b().f116415d);
        }
        lVar.f152198b = new w71.p1();
        lVar.f152200d = request.b().f116415d;
        bw5.x b17 = request.b();
        lVar.f152199c = b17.f116417f[2] ? b17.f116416e : "";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152206j = request.f117277e;
        lVar.f152207k = request.f117278f;
        int i17 = request.f117282m;
        if (i17 > 0) {
            lVar.f152205i = i17;
        }
        p(lVar.a());
        this.f524946m = request.f117283n;
    }
}
