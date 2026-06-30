package ox;

/* loaded from: classes7.dex */
public final class n implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk.p f431029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f431030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ox.o f431031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f431032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f431033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f431034f;

    public n(tk.p pVar, org.json.JSONObject jSONObject, ox.o oVar, java.util.List list, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f431029a = pVar;
        this.f431030b = jSONObject;
        this.f431031c = oVar;
        this.f431032d = list;
        this.f431033e = context;
        this.f431034f = u3Var;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        boolean z18;
        boolean z19;
        org.json.JSONObject jSONObject2;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err_msg, "err_msg");
        pm0.v.X(new ox.k(this.f431034f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.BizPublishImageExternalService", "checkHasFinishRegisterAndLogin, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        tk.p pVar = this.f431029a;
        if (!z17) {
            pVar.a(false, err_msg, null);
            return;
        }
        tk.t tVar = tk.u.f501404e;
        org.json.JSONObject jSONObject3 = this.f431030b;
        int optInt = jSONObject3.optInt("mpPublishAction", 1);
        ox.o oVar = this.f431031c;
        oVar.getClass();
        org.json.JSONObject optJSONObject = jSONObject3.optJSONObject("weAppParam");
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = "wx0b2ec076ec39c786";
        if (optJSONObject != null) {
            b1Var.f398565k = optJSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            b1Var.f398567l = optJSONObject.optString("sceneNote");
            java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (optString.length() == 0) {
                tk.o oVar2 = (tk.o) i95.n0.c(tk.o.class);
                tk.t tVar2 = tk.u.f501404e;
                int optInt2 = jSONObject3.optInt("mpPublishAction", 1);
                tVar2.getClass();
                java.util.Iterator it = ((kz5.h) tk.u.f501409m).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((tk.u) obj).f501410d == optInt2) {
                            break;
                        }
                    }
                }
                tk.u uVar = (tk.u) obj;
                if (uVar == null) {
                    uVar = tk.u.f501405f;
                }
                ((ox.g) oVar2).getClass();
                java.lang.String str = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449686a;
                int ordinal = uVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    optString = "pages/image_editor/image_editor.html";
                } else if (ordinal == 2) {
                    optString = "pages/appmsg_editor/appmsg_editor.html?biz=" + android.net.Uri.encode(str);
                } else if (ordinal == 3) {
                    optString = "pages/register/register.html";
                } else {
                    if (ordinal != 4) {
                        throw new jz5.j();
                    }
                    optString = "";
                }
            }
            b1Var.f398555f = optString;
            java.lang.String optString2 = optJSONObject.optString("nativeExtraData");
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                jSONObject2 = optString2.length() > 0 ? new org.json.JSONObject(optString2) : new org.json.JSONObject();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MircoMsg.BizPublishImageExternalService", e17, "parse error", new java.lang.Object[0]);
                jSONObject2 = new org.json.JSONObject();
            }
            jSONObject2.put("useNavigateBackNative", true);
            r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
            int wi6 = oVar.wi(jSONObject3);
            tk.s[] sVarArr = tk.s.f501403d;
            org.json.JSONObject Ai = wi6 == 1 ? l1Var.Ai(wi6, l1Var.f449680i.f449686a) : wi6 == 2 ? l1Var.Ai(wi6, l1Var.f449681m.f449686a) : l1Var.Ai(wi6, "");
            java.util.Iterator<java.lang.String> keys = Ai.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject2.put(next, Ai.get(next));
            }
            java.util.List list = this.f431032d;
            if (list == null) {
                b1Var.f398561i = new ox.i(jSONObject2);
                z18 = false;
            } else {
                ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).getClass();
                z18 = false;
                b1Var.f398561i = ((r01.l1) i95.n0.c(r01.l1.class)).Vi(list, 0, jSONObject2);
            }
        } else {
            z18 = false;
        }
        b1Var.f398570o = new ox.m(pVar);
        ox.l lVar = new ox.l(pVar);
        tk.t tVar3 = tk.u.f501404e;
        android.content.Context context = this.f431033e;
        if (optInt != 1) {
            ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).sj(context, b1Var, lVar);
            return;
        }
        oVar.getClass();
        tk.a Bi = ((ox.z) ((tk.r) i95.n0.c(tk.r.class))).Bi(b1Var);
        if (jSONObject3.has("draftType") && jSONObject3.has("draftScene")) {
            int wi7 = oVar.wi(jSONObject3);
            rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
            int optInt3 = jSONObject3.optInt("draftType");
            java.lang.String optString3 = jSONObject3.optString("draftScene");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            z19 = ((ur1.s) b0Var).Bi(optInt3, optString3, wi7, Bi.f501391b);
        } else {
            z19 = z18;
        }
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).rj(z19, context, b1Var, lVar);
    }
}
