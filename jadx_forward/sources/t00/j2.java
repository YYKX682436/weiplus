package t00;

/* loaded from: classes9.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f495829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qe0 f495830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t00.l2 f495831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f495832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f495833h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495834i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f495835m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, bw5.qe0 qe0Var, t00.l2 l2Var, org.json.JSONObject jSONObject, android.content.Context context, c00.n3 n3Var, org.json.JSONObject jSONObject2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495829d = u3Var;
        this.f495830e = qe0Var;
        this.f495831f = l2Var;
        this.f495832g = jSONObject;
        this.f495833h = context;
        this.f495834i = n3Var;
        this.f495835m = jSONObject2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new t00.j2(this.f495829d, this.f495830e, this.f495831f, this.f495832g, this.f495833h, this.f495834i, this.f495835m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        t00.j2 j2Var = (t00.j2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String encodeToString;
        bw5.q5 c17;
        bw5.x7 b17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f495829d.dismiss();
        bw5.qe0 qe0Var = this.f495830e;
        byte[] m75962x8b6d8abc = (qe0Var == null || (c17 = qe0Var.c()) == null || (b17 = c17.b()) == null) ? null : b17.m75962x8b6d8abc();
        org.json.JSONObject jSONObject = this.f495832g;
        if (m75962x8b6d8abc != null) {
            encodeToString = android.util.Base64.encodeToString(m75962x8b6d8abc, 2);
        } else {
            this.f495831f.getClass();
            bw5.x7 x7Var = new bw5.x7();
            bw5.u7 u7Var = new bw5.u7();
            u7Var.e(jSONObject.optString("jumpAppId"));
            u7Var.f(jSONObject.optString("jumpPath"));
            u7Var.g(1358);
            u7Var.f115293m = false;
            u7Var.f115301u[7] = true;
            x7Var.k(u7Var);
            x7Var.f116510h.add("wxa");
            encodeToString = android.util.Base64.encodeToString(x7Var.mo14344x5f01b1f6(), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        }
        java.lang.String optString = jSONObject.optString("entranceGMsgID");
        int optInt = jSONObject.optInt("type", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline from env shareType:" + optInt + " entranceGMsgID:" + optString);
        r45.lh0 lh0Var = new r45.lh0();
        lh0Var.f461007e = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        lh0Var.f461008f = jSONObject.optString("productId");
        lh0Var.f461006d = jSONObject.optInt("type", -1);
        lh0Var.f461010h = optString;
        lh0Var.f461009g = encodeToString;
        lh0Var.f461011i = jSONObject.optString("reportData");
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject jSONObject2 = this.f495835m;
        if (optInt == 2) {
            java.lang.String optString2 = jSONObject2 != null ? jSONObject2.optString("videoLocalPath") : null;
            java.lang.String optString3 = jSONObject2 != null ? jSONObject2.optString("videoThumbLocalPath") : null;
            intent.putExtra("Ksnsupload_type", 14);
            intent.putExtra("KSightPath", optString2);
            intent.putExtra("KSightThumbPath", optString3);
            intent.putExtra("KBlockAdd", true);
        } else {
            org.json.JSONArray optJSONArray = jSONObject2 != null ? jSONObject2.optJSONArray("imgLocalPathList") : null;
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                intent.putExtra("sns_kemdia_path", jSONObject2 != null ? jSONObject2.optString("imgLocalPath") : null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    arrayList.add(optJSONArray.optString(i17));
                }
                intent.putExtra("sns_kemdia_path_list", arrayList);
            }
        }
        intent.putExtra("need_result", true);
        intent.putExtra("sns_ecs_share_info", lh0Var.mo14344x5f01b1f6());
        intent.putExtra("sns_upload_is_show_dialog", true);
        c00.n3 callback = this.f495834i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.content.Context context = this.f495833h;
        if (context instanceof android.app.Activity) {
            nf.g.a(context).f(new b30.q(8229, callback));
            j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 8229);
        } else {
            j45.l.u(context, ".plugin.sns.ui.SnsUploadUI", intent, null);
            callback.b(null);
        }
        return jz5.f0.f384359a;
    }
}
