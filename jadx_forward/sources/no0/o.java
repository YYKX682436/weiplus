package no0;

/* loaded from: classes9.dex */
public final class o extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f420264b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f420265c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f420266d = "";

    @Override // ot0.h
    public ot0.h a() {
        return new no0.o();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        boolean z17 = false;
        if (qVar != null && qVar.f430199i == 60) {
            z17 = true;
        }
        if (!z17 || sb6 == null) {
            return;
        }
        sb6.append("<mmlive>");
        sb6.append("<live_id>");
        sb6.append(ot0.q.g(this.f420264b));
        sb6.append("</live_id>");
        sb6.append("</mmlive>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        boolean z17 = false;
        if (qVar != null && qVar.f430199i == 60) {
            z17 = true;
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.mmlive.live_id");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            this.f420264b = str;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.title");
            if (str2 == null) {
                str2 = "";
            }
            this.f420265c = str2;
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.thumburl");
            this.f420266d = str3 != null ? str3 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareLiveAppMsgPiece", m149828x9616526c());
        }
    }

    /* renamed from: toString */
    public java.lang.String m149828x9616526c() {
        return "ShareLiveAppMsgPiece(liveId='" + this.f420264b + "', liveName='" + this.f420265c + "', thumbUrl='" + this.f420266d + "')";
    }
}
