package c01;

/* loaded from: classes12.dex */
public abstract class gb {
    public static final void a(oi3.f fVar, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.String z07 = msgInfo.z0();
        if (z07 == null) {
            z07 = "";
        }
        fVar.p(z07);
        j15.a b17 = g45.c.b(msgInfo);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b17.y())) {
            fVar.s(b17.I());
            fVar.r(b17.F());
        } else {
            fVar.s(b17.q());
            fVar.r(b17.n());
        }
        fVar.q(msgInfo.h2());
        fVar.o(msgInfo.f236165J);
        java.lang.String str = msgInfo.G;
        if (str == null) {
            str = "";
        }
        int i17 = fVar.f345617d;
        fVar.set(i17 + 12, str);
        fVar.set(i17 + 9, java.lang.Integer.valueOf(msgInfo.A0()));
        fVar.set(i17 + 2, java.lang.Long.valueOf(msgInfo.getCreateTime()));
        fVar.set(i17 + 0, java.lang.Long.valueOf(msgInfo.getMsgId()));
        fVar.set(i17 + 1, java.lang.Long.valueOf(msgInfo.I0()));
        java.lang.String Q0 = msgInfo.Q0();
        if (Q0 == null) {
            Q0 = "";
        }
        fVar.set(i17 + 3, Q0);
        fVar.set(i17 + 4, java.lang.Integer.valueOf(msgInfo.getType()));
        fVar.set(i17 + 7, java.lang.Integer.valueOf(msgInfo.P0()));
        java.lang.String j17 = msgInfo.j();
        if (j17 == null) {
            j17 = "";
        }
        fVar.set(i17 + 13, j17);
        fVar.set(i17 + 10, java.lang.Integer.valueOf(msgInfo.w0()));
        java.lang.String V1 = msgInfo.V1();
        if (V1 == null) {
            V1 = msgInfo.y0();
        }
        fVar.set(i17 + 11, V1 != null ? V1 : "");
    }

    public static final j15.a b(oi3.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        if (fVar.n() > 0 && fVar.l() > 0) {
            j15.a aVar = new j15.a();
            aVar.Y(fVar.n());
            aVar.U(fVar.l());
            return aVar;
        }
        j15.d dVar = new j15.d();
        java.lang.String string = fVar.getString(fVar.f345617d + 13);
        if (string == null) {
            string = "";
        }
        dVar.fromXml(string);
        return dVar.o();
    }
}
