package ic2;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f371912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f371913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371916h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f371917i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ic2.z f371918m;

    public y(java.util.Map map, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, ic2.z zVar) {
        this.f371912d = map;
        this.f371913e = i17;
        this.f371914f = str;
        this.f371915g = str2;
        this.f371916h = str3;
        this.f371917i = h0Var;
        this.f371918m = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ic2.z, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = this.f371912d;
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.force_push_info");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.sessionbuffer");
        java.lang.String str4 = str3 == null ? "" : str3;
        if ((str.length() > 0 ? str : null) == null) {
            return;
        }
        java.lang.String str5 = this.f371914f;
        java.lang.String str6 = this.f371915g;
        java.lang.String str7 = this.f371916h;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f371917i;
        int i17 = this.f371913e;
        ?? r112 = this.f371918m;
        try {
            if (i17 != 1) {
                r112.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyMsgInterceptor", "dont show force notify,case live has end.");
                return;
            }
            try {
                cl0.g gVar = new cl0.g(str);
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("description");
                long optLong = gVar.optLong("expiredTime");
                cl0.g gVar2 = new cl0.g(gVar.mo15082x48bce8a4("extinfo"));
                java.lang.String mo15082x48bce8a42 = gVar2.mo15082x48bce8a4("auth_icon_url");
                java.lang.String str8 = mo15082x48bce8a42 == null ? "" : mo15082x48bce8a42;
                java.lang.String mo15082x48bce8a43 = gVar2.mo15082x48bce8a4("nickname");
                java.lang.String str9 = mo15082x48bce8a43 == null ? "" : mo15082x48bce8a43;
                java.lang.String mo15082x48bce8a44 = gVar2.mo15082x48bce8a4("notify_wording");
                java.lang.String str10 = mo15082x48bce8a44 == null ? "" : mo15082x48bce8a44;
                gVar2.mo15082x48bce8a4("start_time");
                java.lang.String mo15082x48bce8a45 = gVar.mo15082x48bce8a4("subject");
                java.lang.String str11 = mo15082x48bce8a45 == null ? "" : mo15082x48bce8a45;
                java.lang.String mo15082x48bce8a46 = gVar.mo15082x48bce8a4("forcePushId");
                java.lang.String mo15082x48bce8a47 = gVar.mo15082x48bce8a4("userIcon");
                java.lang.String mo15082x48bce8a48 = gVar.mo15082x48bce8a4("userName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a48);
                if (mo15082x48bce8a48.length() == 0) {
                    java.lang.String str12 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
                    mo15082x48bce8a48 = str12 == null ? "" : str12;
                }
                i50.o oVar = (i50.o) i95.n0.c(i50.o.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a46);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a47);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
                i50.p Ai = ((h50.i) oVar).Ai(mo15082x48bce8a46, mo15082x48bce8a47, str9, mo15082x48bce8a4, str5, str6, str7, str10, str8, str11, mo15082x48bce8a48, (java.lang.String) h0Var.f391656d, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0), str4);
                if (optLong <= 0 || optLong >= c01.id.e()) {
                    ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).getClass();
                    ((h13.l0) i95.n0.c(h13.l0.class)).aj((i13.o) Ai);
                } else {
                    r112.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyMsgInterceptor", "has expired, not force push, expiredTime = " + optLong);
                }
            } catch (java.lang.Exception e17) {
                e = e17;
                map = r112;
                str = "FinderLiveNotifyMsgInterceptor";
                map.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "force notify exception:" + e.getMessage());
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }
}
