package tt2;

/* loaded from: classes3.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f503558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f503559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f503560g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(tt2.e1 e1Var, so2.j5 j5Var, bw5.x7 x7Var, byte[] bArr) {
        super(2);
        this.f503557d = e1Var;
        this.f503558e = j5Var;
        this.f503559f = x7Var;
        this.f503560g = bArr;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.ce0 ce0Var;
        ((java.lang.Boolean) obj).booleanValue();
        zl2.r4 r4Var = zl2.r4.f555483a;
        tt2.e1 e1Var = this.f503557d;
        r4Var.h3(e1Var.f503413h, false);
        cc2.d dVar = cc2.d.f122011a;
        cm2.m0 data = (cm2.m0) this.f503558e;
        java.lang.String clickId = this.f503560g.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        bw5.x7 ecsJumpInfo = this.f503559f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecsJumpInfo, "ecsJumpInfo");
        android.content.Context context = e1Var.f503413h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        gk2.e liveData = e1Var.f503415m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        pq.a aVar = new pq.a(context);
        java.lang.String a17 = dVar.a(liveData, "live_list_buy", clickId);
        aVar.f439085b.e(new bw5.g8());
        aVar.f439085b.d().c(a17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performEcsJumpToBuyProduct] appId:");
        r45.ce0 ce0Var2 = data.F;
        sb6.append(ce0Var2 != null ? ce0Var2.m75945x2fec8307(0) : null);
        sb6.append(",purchase appId:");
        r45.ce0 ce0Var3 = data.E;
        sb6.append(ce0Var3 != null ? ce0Var3.m75945x2fec8307(0) : null);
        sb6.append(", clickId:");
        sb6.append(clickId);
        sb6.append(" sceneNote:");
        sb6.append(a17);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShoppingJumpHelper", sb6.toString());
        r45.bd5 bd5Var = (r45.bd5) data.f124901v.m75936x14adae67(70);
        if (bd5Var == null || (ce0Var = (r45.ce0) bd5Var.m75936x14adae67(2)) == null) {
            ce0Var = data.E;
        }
        r45.ce0 ce0Var4 = ce0Var;
        if (ce0Var4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsShoppingJumpHelper", "performEcsJumpToBuyProduct: page is null");
        } else {
            java.lang.String m75945x2fec8307 = ce0Var4.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                java.util.HashMap hashMap = ((mm2.f6) liveData.a(mm2.f6.class)).Q;
                java.lang.String m75945x2fec83072 = ce0Var4.m75945x2fec8307(2);
                hashMap.put(m75945x2fec8307, m75945x2fec83072 == null ? "" : m75945x2fec83072);
                java.util.HashMap hashMap2 = ((mm2.f6) liveData.a(mm2.f6.class)).R;
                java.lang.String m75945x2fec83073 = ce0Var4.m75945x2fec8307(3);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                hashMap2.put(m75945x2fec8307, m75945x2fec83073);
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<set-?>");
            y4Var.f409839n = a17;
            boolean z17 = ce0Var4.m75939xb282bd08(7) == 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("openMode", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63);
            java.lang.String str = data.f124900J;
            if (str == null) {
                str = "";
            }
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, str);
            jSONObject.put("productId", data.f124902w);
            jSONObject.put("clickScene", 2);
            jSONObject.put("clickId", clickId);
            jSONObject.put("hasClientDragBar", ce0Var4.m75939xb282bd08(6) == 1);
            jSONObject.put("enableGesture", z17);
            jSONObject.put("liveScene", "list");
            jSONObject.put("finderLiveToken", st2.c2.f493782a.b(liveData, data.f124901v, ce0Var4).f158924e);
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            jSONObject.put("entranceGMsgID", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.v9.class))).f198439d);
            aVar.f439087d.f439089a = new cc2.a(new java.lang.ref.WeakReference(context), data, ce0Var4, liveData, clickId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShoppingJumpHelper", "[getPayloadForProductItemClick] appId:" + ce0Var4.m75945x2fec8307(0) + ", path:" + ce0Var4.m75945x2fec8307(1) + ",  clickId:" + clickId + '!');
            bw5.g8 d17 = aVar.f439085b.d();
            d17.f109244d = jSONObject.toString();
            d17.f109255r[1] = true;
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, ecsJumpInfo, null, 4, null);
        }
        yz5.l lVar = e1Var.f503428z;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(data.f124902w));
        }
        return jz5.f0.f384359a;
    }
}
