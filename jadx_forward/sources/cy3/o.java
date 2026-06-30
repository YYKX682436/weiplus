package cy3;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f306347d;

    /* renamed from: e, reason: collision with root package name */
    public int f306348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f306349f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f306350g;

    /* renamed from: h, reason: collision with root package name */
    public int f306351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306352i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f306353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vx3.i f306354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f306355o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f306356p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.p f306357q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f306358r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f306359s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 f306360t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306361u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f306362v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f306363w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, android.content.Context context, vx3.i iVar, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, yz5.p pVar, long j17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var, java.lang.String str2, boolean z18, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f306352i = str;
        this.f306353m = context;
        this.f306354n = iVar;
        this.f306355o = z17;
        this.f306356p = z2Var;
        this.f306357q = pVar;
        this.f306358r = j17;
        this.f306359s = i17;
        this.f306360t = y1Var;
        this.f306361u = str2;
        this.f306362v = z18;
        this.f306363w = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cy3.o(this.f306352i, this.f306353m, this.f306354n, this.f306355o, this.f306356p, this.f306357q, this.f306358r, this.f306359s, this.f306360t, this.f306361u, this.f306362v, this.f306363w, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cy3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        java.lang.Object e17;
        int i18;
        boolean z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i19 = this.f306351h;
        boolean z18 = this.f306355o;
        android.content.Context context = this.f306353m;
        if (i19 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String r17 = c01.z1.r();
            java.lang.String str = this.f306352i;
            int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, r17) ? 1 : 2;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c01.z1.r());
            i17 = mx3.i0.i(str) != null ? 1 : 0;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574518ik1), false, 3, null);
            f17.show();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17 == 0 ? 1 : 2);
            jSONObject.put("channel", this.f306359s);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f306358r);
            jSONObject.put("choose_scene", this.f306363w);
            jSONObject.put("rec_request_id", this.f306361u);
            jSONObject.put("is_video_stream", this.f306362v ? 2 : 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            mx3.s sVar = mx3.u.f414153f;
            vx3.i iVar = this.f306354n;
            java.lang.String str2 = this.f306352i;
            boolean z19 = i27 == 1 ? z18 : false;
            this.f306350g = f17;
            this.f306347d = i27;
            this.f306349f = b17;
            this.f306348e = i17;
            this.f306351h = 1;
            e17 = sVar.e(iVar, str2, z19, t17, this);
            if (e17 == aVar) {
                return aVar;
            }
            i18 = i27;
            z17 = b17;
            u3Var = f17;
        } else {
            if (i19 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i28 = this.f306348e;
            boolean z27 = this.f306349f;
            i18 = this.f306347d;
            u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f306350g;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i17 = i28;
            z17 = z27;
            e17 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) e17).booleanValue();
        yz5.p pVar = this.f306357q;
        if (booleanValue) {
            this.f306356p.B();
            if (u3Var != null) {
                u3Var.dismiss();
            }
            db5.t7.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, context.getResources().getString((i18 == 1 && z18) ? com.p314xaae8f345.mm.R.C30867xcad56011.i2l : com.p314xaae8f345.mm.R.C30867xcad56011.f574375i34));
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, new java.lang.Integer(i18));
            }
        } else {
            if (u3Var != null) {
                u3Var.dismiss();
            }
            db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.in9));
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Boolean.FALSE, new java.lang.Integer(i18));
            }
        }
        vx3.i iVar2 = this.f306354n;
        java.lang.String d17 = iVar2.d();
        long c17 = iVar2.c();
        long j17 = this.f306358r;
        int i29 = this.f306359s;
        java.lang.String str3 = this.f306352i;
        boolean z28 = this.f306355o;
        boolean z29 = i17 != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var = this.f306360t;
        wx3.a.d(d17, c17, j17, 2L, i29, str3, z17, z28, str3, z29, y1Var != null && y1Var.f240082b.f448919s, this.f306361u, this.f306362v);
        return jz5.f0.f384359a;
    }
}
