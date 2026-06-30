package zf4;

/* loaded from: classes9.dex */
public class o {

    /* renamed from: h, reason: collision with root package name */
    public static final kk.j f554214h = new jt0.j(100);

    /* renamed from: a, reason: collision with root package name */
    public int f554215a;

    /* renamed from: b, reason: collision with root package name */
    public int f554216b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f554217c;

    /* renamed from: d, reason: collision with root package name */
    public int f554218d;

    /* renamed from: e, reason: collision with root package name */
    public int f554219e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f554220f;

    /* renamed from: g, reason: collision with root package name */
    public int f554221g;

    public static zf4.o a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        int hashCode = str.hashCode();
        kk.j jVar = f554214h;
        zf4.o oVar = (zf4.o) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (oVar != null) {
            return oVar;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse msg failed");
            return null;
        }
        try {
            zf4.o oVar2 = new zf4.o();
            oVar2.f554221g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.appattach.totallen"), 0);
            oVar2.f554220f = (java.lang.String) d17.get(".msg.appmsg.appattach.attachid");
            oVar2.f554215a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindtime"), 0);
            oVar2.f554216b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindid"), 0);
            oVar2.f554217c = (java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindattachid");
            oVar2.f554218d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindattachtotallen"), 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$remindformat"), 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$originformat"), 0);
            oVar2.f554219e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.voicecmd.reminder.$msgsvrid"), 0);
            ((lt0.f) jVar).j(java.lang.Integer.valueOf(hashCode), oVar2);
            return oVar2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse amessage xml failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceRemindAppMsgExInfo", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
