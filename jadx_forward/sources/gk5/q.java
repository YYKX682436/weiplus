package gk5;

/* loaded from: classes9.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354231d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354233f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f354234g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f354235h;

    /* renamed from: i, reason: collision with root package name */
    public int f354236i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354237m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354238n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gk0.k f354239o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ gk0.h f354240p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f354241q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f354242r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gk5.r f354243s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354244t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, gk0.k kVar, gk0.h hVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, gk5.r rVar, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354238n = str;
        this.f354239o = kVar;
        this.f354240p = hVar;
        this.f354241q = h0Var;
        this.f354242r = h0Var2;
        this.f354243s = rVar;
        this.f354244t = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gk5.q qVar = new gk5.q(this.f354238n, this.f354239o, this.f354240p, this.f354241q, this.f354242r, this.f354243s, this.f354244t, interfaceC29045xdcb5ca57);
        qVar.f354237m = obj;
        return qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [jz5.f0, java.lang.Object] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2;
        gk5.r rVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354236i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f354237m;
            i95.m c17 = i95.n0.c(gk0.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c17, this.f354238n, this.f354239o, null, null, 8, null);
            x66.l("Common_HttpParams", this.f354240p);
            gk0.b Ni = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni();
            this.f354237m = y0Var;
            this.f354231d = x66;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = this.f354241q;
            this.f354232e = h0Var3;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4 = this.f354242r;
            this.f354233f = h0Var4;
            gk5.r rVar2 = this.f354243s;
            this.f354234g = rVar2;
            java.lang.String str2 = this.f354244t;
            this.f354235h = str2;
            this.f354236i = 1;
            java.lang.Object a17 = Ni.a(x66, this);
            if (a17 == aVar) {
                return aVar;
            }
            h0Var = h0Var3;
            obj = a17;
            h0Var2 = h0Var4;
            rVar = rVar2;
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f354235h;
            rVar = (gk5.r) this.f354234g;
            h0Var2 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f354233f;
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f354232e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        ?? r47 = jz5.f0.f384359a;
        byte[] bArr = null;
        if (bitmap != null) {
            h0Var.f391656d = bitmap;
            rVar.getClass();
            if (!bitmap.isRecycled()) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            h0Var2.f391656d = bArr;
            rVar.q7(str, bArr);
            bArr = r47;
        }
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardLiteAppUIC", "[processTransfer] load from network, bitmap is null");
            rVar.q7(str, (byte[]) h0Var2.f391656d);
        }
        return r47;
    }
}
