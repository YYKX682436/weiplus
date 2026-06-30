package zy2;

/* loaded from: classes4.dex */
public final class b extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.g92 f558883b = new r45.g92();

    @Override // ot0.h
    public ot0.h a() {
        zy2.b bVar = new zy2.b();
        bVar.f558883b = this.f558883b;
        return bVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        r45.g92 g92Var = this.f558883b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (g92Var != null) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g92Var.m75945x2fec8307(0))) {
                    sb7.append("<finderLiveInvite>");
                    sb7.append("<finderLiveID>");
                    sb7.append(g92Var.m75945x2fec8307(0));
                    sb7.append("</finderLiveID>");
                    sb7.append("<finderUsername>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g92Var.m75945x2fec8307(1)));
                    sb7.append("</finderUsername>");
                    sb7.append("<finderObjectID>");
                    sb7.append(g92Var.m75945x2fec8307(2));
                    sb7.append("</finderObjectID>");
                    sb7.append("<nickname>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(3)));
                    sb7.append("</nickname>");
                    sb7.append("<desc>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(4)));
                    sb7.append("</desc>");
                    sb7.append("<finderNonceID>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g92Var.m75945x2fec8307(12)));
                    sb7.append("</finderNonceID>");
                    sb7.append("<headUrl>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(11)));
                    sb7.append("</headUrl>");
                    sb7.append("<coverUrl>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(11)));
                    sb7.append("</coverUrl>");
                    sb7.append("<liveMicId>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g92Var.m75945x2fec8307(9)));
                    sb7.append("</liveMicId>");
                    sb7.append("<liveMicSdkUserId>");
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g92Var.m75945x2fec8307(10)));
                    sb7.append("</liveMicSdkUserId>");
                    sb7.append("</finderLiveInvite>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        sb6.append(sb7.toString());
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        r45.g92 g92Var = new r45.g92();
        try {
            if (!values.isEmpty() && values.containsKey(".msg.appmsg.finderLiveInvite.finderLiveID")) {
                java.lang.String str = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.finderLiveID");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                g92Var.set(0, str);
                java.lang.String str3 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.finderUsername");
                if (str3 == null) {
                    str3 = "";
                }
                g92Var.set(1, str3);
                java.lang.String str4 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.finderObjectID");
                if (str4 == null) {
                    str4 = "";
                }
                g92Var.set(2, str4);
                java.lang.String str5 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.nickname");
                if (str5 == null) {
                    str5 = "";
                }
                g92Var.set(3, str5);
                java.lang.String str6 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.desc");
                if (str6 == null) {
                    str6 = "";
                }
                g92Var.set(4, str6);
                java.lang.String str7 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.coverUrl");
                if (str7 == null) {
                    str7 = "";
                }
                g92Var.set(5, str7.replace("&amp;", "&"));
                java.lang.String str8 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.headUrl");
                if (str8 == null) {
                    str8 = "";
                }
                g92Var.set(11, str8);
                java.lang.String str9 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.finderNonceID");
                if (str9 == null) {
                    str9 = "";
                }
                g92Var.set(12, str9);
                java.lang.String str10 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.liveMicId");
                if (str10 == null) {
                    str10 = "";
                }
                g92Var.set(9, str10);
                java.lang.String str11 = (java.lang.String) values.get(".msg.appmsg.finderLiveInvite.liveMicSdkUserId");
                if (str11 != null) {
                    str2 = str11;
                }
                g92Var.set(10, str2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e17.getMessage());
        }
        this.f558883b = g92Var;
    }
}
