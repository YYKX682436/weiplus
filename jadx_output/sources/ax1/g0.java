package ax1;

/* loaded from: classes11.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ax1.g0 f14998d = new ax1.g0();

    public g0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a e17 = (yz5.a) obj;
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.String str = (java.lang.String) e17.invoke();
        com.tencent.mars.xlog.Log.e("MicroMsg.SerializeTelemetryHelper.XML", str);
        if (kk.m.b(gm0.j1.b().h(), 1000) <= 10) {
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 2662L;
            errorMsgInfoStruct.p("XML.22");
            errorMsgInfoStruct.f56115g = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
            errorMsgInfoStruct.r(str);
            errorMsgInfoStruct.k();
        }
        return jz5.f0.f302826a;
    }
}
