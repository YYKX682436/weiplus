package u20;

/* loaded from: classes9.dex */
public final class y extends u20.c {

    /* renamed from: d, reason: collision with root package name */
    public final u20.q f505486d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f505487e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f505488f;

    /* renamed from: g, reason: collision with root package name */
    public final n13.x f505489g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.da f505490h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(org.json.JSONObject jSONObject, org.json.JSONObject params, java.util.List list, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t callback) {
        super(list, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        u20.q qVar = new u20.q();
        org.json.JSONObject optJSONObject = params.optJSONObject("shareWAAppParams");
        if (optJSONObject == null) {
            qVar = null;
        } else {
            java.lang.String optString = jSONObject != null ? jSONObject.optString("sourceAppID") : null;
            qVar.f505452a = optString == null ? "" : optString;
            if (jSONObject != null) {
                jSONObject.optString("sourceAppName");
            }
            java.lang.String optString2 = jSONObject != null ? jSONObject.optString("sourceUsername") : null;
            qVar.f505453b = optString2 == null ? "" : optString2;
            qVar.f505454c = jSONObject != null ? jSONObject.optInt("sourceVersion") : 0;
            java.lang.String optString3 = jSONObject != null ? jSONObject.optString("sourceBrandIconUrl") : null;
            qVar.f505455d = optString3 == null ? "" : optString3;
            java.lang.String optString4 = jSONObject != null ? jSONObject.optString("sourceMD5") : null;
            qVar.f505456e = optString4 != null ? optString4 : "";
            qVar.f505457f = jSONObject != null ? jSONObject.optInt("sourcePkgType") : 0;
            qVar.f505458g = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            qVar.f505459h = optJSONObject.optString("desc");
            qVar.f505460i = optJSONObject.optString("imageUrl");
            qVar.f505461j = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            qVar.f505462k = optJSONObject.optInt("disableForward");
            qVar.f505463l = optJSONObject.optInt("bizType");
            qVar.f505464m = optJSONObject.optString("bizSourceName");
            qVar.f505465n = optJSONObject.optString("bizSourceIconUrl");
            int optInt = optJSONObject.optInt("cardType");
            if (optInt > 0) {
                w05.h hVar = new w05.h();
                hVar.H(optInt);
                hVar.I(optJSONObject.optInt("cardVersion", 0));
                java.lang.String optString5 = optJSONObject.optString("passBuffer");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
                hVar.R(optString5);
                hVar.L(optJSONObject.optInt("fetchAndPreloadFlags", 0));
                java.lang.String optString6 = optJSONObject.optString("reportData");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString6, "optString(...)");
                hVar.F(optString6);
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("cardInfo");
                if (optJSONObject2 != null) {
                    java.lang.String optString7 = optJSONObject2.optString("real_appid");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString7, "optString(...)");
                    hVar.S(optString7);
                    hVar.E(optJSONObject2.optLong(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, 0L));
                    hVar.G(optJSONObject2.optLong("bulk_id", 0L));
                    if (optInt == 9) {
                        java.lang.String optString8 = optJSONObject2.optString("friendReceiveTitle");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString8, "optString(...)");
                        hVar.Q(optString8);
                        java.lang.String optString9 = optJSONObject2.optString("friendReceiveDesc");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString9, "optString(...)");
                        hVar.N(optString9);
                        java.lang.String optString10 = optJSONObject2.optString("friendReceiveSourceName");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString10, "optString(...)");
                        hVar.P(optString10);
                        java.lang.String optString11 = optJSONObject2.optString("friendReceiveImageUrl");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString11, "optString(...)");
                        hVar.O(optString11);
                    }
                }
                qVar.f505466o = hVar;
            }
        }
        if (qVar == null) {
            ((t00.m2) callback).a("Failed to init model");
        }
        this.f505486d = qVar;
        this.f505487e = params.optString("bizReportData");
        this.f505488f = new java.util.ArrayList();
        this.f505489g = new u20.w(this);
        this.f505490h = new u20.s(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(u20.y r11, java.lang.String r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u20.y.e(u20.y, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // u20.c
    public void c(boolean z17) {
        w05.h hVar;
        java.lang.String str = this.f505487e;
        if (str == null) {
            str = "";
        }
        if (r26.i0.y(str, "\"", false) && r26.i0.n(str, "\"", false) && str.length() > 2) {
            str = str.substring(1, str.length() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        }
        u20.q qVar = this.f505486d;
        java.lang.String y17 = (qVar == null || (hVar = qVar.f505466o) == null) ? null : hVar.y();
        if (y17 == null) {
            y17 = "";
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("card_id", y17);
        lVarArr[1] = new jz5.l("biz_report_data", str);
        lVarArr[2] = new jz5.l("share_scene", z17 ? "2" : "1");
        lVarArr[3] = new jz5.l("report_data", "");
        ((cy1.a) rVar).Bj("ecs_share_wxec_action", "ecs_event_succ", kz5.c1.k(lVarArr), 12, false);
    }

    public final void f(android.content.Context context) {
        u20.q qVar = this.f505486d;
        if (qVar == null) {
            return;
        }
        w05.h hVar = qVar.f505466o;
        int r17 = hVar != null ? hVar.r() : 0;
        boolean z17 = ((r17 & 1) == 0 && (r17 & 2) == 0) ? false : true;
        if (hVar == null || !z17 || hVar.B()) {
            if (this.f505486d == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new u20.t(this, context));
            return;
        }
        c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
        java.lang.String str = qVar.f505461j;
        if (str == null) {
            str = "";
        }
        u20.x xVar = new u20.x(hVar, this, context);
        b00.r rVar = (b00.r) z2Var;
        rVar.getClass();
        e00.y yVar = new e00.y(str, hVar, 8);
        yVar.f327366d = new b00.p(yVar, rVar, xVar);
        rVar.Bi(yVar);
    }
}
