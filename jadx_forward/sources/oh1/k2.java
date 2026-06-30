package oh1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes4.dex */
public class k2 extends i95.w implements k01.x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f426779d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f426780e = new java.util.HashMap();

    public tt0.e Ai(java.lang.String str) {
        tt0.f fVar = (tt0.f) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(tt0.f.class);
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaUpdateableMsgService", "shareKey is null, return");
            return null;
        }
        int hashCode = str.hashCode();
        tt0.e eVar = new tt0.e();
        eVar.f66304xc29dba53 = hashCode;
        if (!fVar.get(eVar, "shareKeyHash")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaUpdateableMsgStorage", "WxaUpdateableMsg is null");
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, wxaUpdateableMsg is null", str, java.lang.Integer.valueOf(str.hashCode()));
        return null;
    }

    public boolean Bi(java.lang.String str, int i17, int i18) {
        tt0.f fVar = (tt0.f) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(tt0.f.class);
        boolean z17 = false;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null, err");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaUpdateableMsgStorage", "shareKey is null, err");
        } else {
            tt0.e eVar = new tt0.e();
            eVar.f66304xc29dba53 = str.hashCode();
            boolean z18 = fVar.get(eVar, new java.lang.String[0]);
            eVar.f66299x9ac5f93a = i17;
            eVar.f66303xc4aab016 = i18;
            z17 = z18 ? fVar.mo9952xce0038c9(eVar, new java.lang.String[0]) : fVar.mo880xb970c2b9(eVar);
        }
        str.getClass();
        if (z17) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.HashMap) f426779d).get(str));
        }
        return z17;
    }

    public synchronized void wi(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, k01.w0 w0Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            java.util.Map map = f426780e;
            java.util.List list = (java.util.List) ((java.util.HashMap) map).get(str);
            if (list == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatableMsgInfoChange token:%s", str);
                list = new java.util.ArrayList();
                ((java.util.HashMap) map).put(str, list);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatableMsgInfoChange shareKeyHash:%d msgType:%d", java.lang.Integer.valueOf(str3.hashCode()), java.lang.Integer.valueOf(i18));
            oh1.e2 e2Var = new oh1.e2(null);
            e2Var.f426737a = str2;
            e2Var.f426738b = str3;
            e2Var.f426739c = i17;
            e2Var.f426743g = w0Var;
            e2Var.f426741e = i18;
            e2Var.f426742f = str4;
            e2Var.a();
            list.add(e2Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaUpdateableMsgService", "token appId or shareKey is null, return");
    }
}
