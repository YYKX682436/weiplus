package ut2;

/* loaded from: classes3.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f512512g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(cm2.m0 m0Var, ut2.s3 s3Var, gk2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        super(1);
        this.f512509d = m0Var;
        this.f512510e = s3Var;
        this.f512511f = eVar;
        this.f512512g = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ce0 page = (r45.ce0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        bw5.x7 x7Var = (bw5.x7) page.m75936x14adae67(10);
        st2.c2 c2Var = st2.c2.f493782a;
        ut2.s3 s3Var = this.f512510e;
        gk2.e liveData = this.f512511f;
        if (x7Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingViewHolder", "handle ecs jump to sku buy");
            android.content.Context context = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            cm2.m0 data = this.f512509d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
            byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
            pq.a aVar = new pq.a(context);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("openMode", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63);
            jSONObject.put("clickScene", -1);
            jSONObject.put("clickId", s07);
            jSONObject.put("forbidSlidingUpGesture", true);
            jSONObject.put("enableGesture", false);
            jSONObject.put("finderLiveToken", c2Var.b(liveData, data.f124901v, page).f158924e);
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            jSONObject.put("entranceGMsgID", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.v9.class))).f198439d);
            aVar.f439085b.e(new bw5.g8());
            bw5.g8 d17 = aVar.f439085b.d();
            d17.f109244d = jSONObject.toString();
            d17.f109255r[1] = true;
            aVar.f439087d.f439089a = new cc2.c(new java.lang.ref.WeakReference(context), page, liveData);
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
        } else {
            android.content.Context context2 = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            byte[] s08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s08, "getUuidRandom(...)");
            l81.b1 d18 = c2Var.d(context2, page, 1177, s08, "", this.f512511f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = d18.G.e();
            e17.f159059f = k91.s2.f387294e;
            d18.G = e17.a();
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context3 = s3Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f512512g;
            q4Var.n(context3, liveData, d18, lVar != null ? lVar.Y0() : null);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s3Var.L;
            tt2.e1 e1Var = f2Var instanceof tt2.e1 ? (tt2.e1) f2Var : null;
            if (e1Var != null) {
                tt2.e1.W(e1Var, ml2.f4.f408970m, this.f512509d, 2, d18, s3Var, null, 32, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
