package d83;

/* loaded from: classes12.dex */
public final class p implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 c2950xf0971ac1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        java.lang.String g17 = x51.j1.g(addMsgInfo.f152259a.f459094h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "skstringToString(...)");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "parseXml(...)");
        java.lang.Object obj = d17.get(".sysmsg.mmilinkcloudnewxml.base64msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        java.lang.String str = (java.lang.String) obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkCloudSysMsgListener", "mmilinkcloudnewxml.base64msg is null");
            return;
        }
        d83.e0 e0Var = d83.e0.f308491a;
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        synchronized (d83.e0.f308493c) {
            if (d83.e0.f308492b && (c2950xf0971ac1 = d83.e0.f308496f) != null) {
                c2950xf0971ac1.m22072xa82fbefb(bytes);
            }
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
