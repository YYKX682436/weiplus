package ue4;

/* loaded from: classes9.dex */
public class z extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f508466b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f508467c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f508468d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f508469e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f508470f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f508471g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f508472h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f508473i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f508474j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f508475k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f508476l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f508477m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f508478n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f508479o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f508480p = new java.util.HashMap();

    @Override // ot0.h
    public ot0.h a() {
        ue4.z zVar = new ue4.z();
        zVar.f508466b = this.f508466b;
        zVar.f508467c = this.f508467c;
        zVar.f508468d = this.f508468d;
        java.util.Map map = this.f508480p;
        zVar.f508469e = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Open");
        zVar.f508470f = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Icon");
        zVar.f508476l = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Appid");
        zVar.f508477m = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Page");
        zVar.f508478n = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Query");
        zVar.f508479o = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Min_Version");
        zVar.f508472h = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_TitleColorInLightMode");
        zVar.f508473i = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_TitleColorInDarkMode");
        zVar.f508471g = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_MsgWording");
        zVar.f508474j = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_BackgroundColorInLightMode");
        zVar.f508475k = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_BackgroundColorInDarkMode");
        return zVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f508466b = (java.lang.String) map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.iconid");
        this.f508467c = (java.lang.String) map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.text");
        this.f508468d = (java.lang.String) map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.expiretime");
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.extinfolist.extinfo");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            sb6.append(".key");
            java.lang.String str = (java.lang.String) map.get(sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.extinfolist.extinfo");
            sb7.append(i17 != 0 ? java.lang.Integer.valueOf(i17) : "");
            sb7.append(".value");
            java.lang.String str2 = (java.lang.String) map.get(sb7.toString());
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            java.util.Map map2 = this.f508480p;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportsAppMsgContent", "should break now : %d", java.lang.Integer.valueOf(i17));
                this.f508469e = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Open");
                this.f508470f = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Icon");
                this.f508476l = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Appid");
                this.f508477m = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Page");
                this.f508478n = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Query");
                this.f508479o = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Min_Version");
                this.f508472h = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_TitleColorInLightMode");
                this.f508473i = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_TitleColorInDarkMode");
                this.f508471g = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_MsgWording");
                this.f508474j = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_BackgroundColorInLightMode");
                this.f508475k = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_BackgroundColorInDarkMode");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportsAppMsgContent", "parseContent: olympic data: %s , %s ,%s , %s ,%s %s", this.f508469e, this.f508470f, this.f508476l, this.f508477m, this.f508478n, this.f508479o);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SportsAppMsgContent", "parseContent: key:%s , value :%s", str, str2);
            ((java.util.HashMap) map2).put(str, str2);
            i17++;
        }
    }
}
