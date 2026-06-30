package lx3;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final lx3.r f403646a = new lx3.r();

    public final void a(java.lang.Number businessId, java.lang.String reqJson, yz5.l onSuccess, yz5.q onFail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessId, "businessId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqJson, "reqJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFail, "onFail");
        r45.zj zjVar = new r45.zj();
        zjVar.f473659d = businessId.intValue();
        zjVar.f473660e = reqJson;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = zjVar;
        lVar.f152198b = new r45.ak();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/report/bizcommreport";
        lVar.f152200d = 4779;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new lx3.q(onFail, onSuccess), false);
    }
}
