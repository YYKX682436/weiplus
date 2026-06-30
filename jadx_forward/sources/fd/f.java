package fd;

/* loaded from: classes12.dex */
public final class f extends com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a {

    /* renamed from: a, reason: collision with root package name */
    public final int f342778a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f342779b;

    /* renamed from: c, reason: collision with root package name */
    public final int f342780c;

    /* renamed from: d, reason: collision with root package name */
    public final int f342781d;

    /* renamed from: e, reason: collision with root package name */
    public final int f342782e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342783f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f342784g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f342785h;

    /* renamed from: i, reason: collision with root package name */
    public fd.b f342786i;

    public f(org.json.JSONObject config, java.nio.ByteBuffer data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f342779b = "";
        this.f342780c = 2;
        this.f342782e = 2;
        this.f342783f = true;
        int optInt = config.optInt("cgiId", 0);
        java.lang.String optString = config.optString("cgiUrl", "");
        java.lang.String optString2 = config.optString("routeInfo", "");
        int optInt2 = config.optInt("channelType", 2);
        int optInt3 = config.optInt("timeout", 0);
        int optInt4 = config.optInt("retryCount", 2);
        boolean optBoolean = config.optBoolean("needNotify", true);
        if (!(optInt > 0)) {
            throw new java.lang.IllegalArgumentException("参数非法: cgiId".toString());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() > 0)) {
            throw new java.lang.IllegalArgumentException("参数非法: cgiUrl".toString());
        }
        if (!(data.capacity() != 0)) {
            throw new java.lang.IllegalArgumentException("参数非法: requestData".toString());
        }
        this.f342778a = optInt;
        this.f342779b = optString;
        this.f342784g = optString2;
        this.f342780c = optInt2;
        this.f342781d = optInt3;
        this.f342782e = optInt4;
        this.f342783f = optBoolean;
        this.f342785h = data.array();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getCgiId */
    public int mo27904x744122ca() {
        return this.f342778a;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getCgiUrl */
    public java.lang.String mo27905x13e365a0() {
        return this.f342779b;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getChannelType */
    public int mo27906xea2d8da7() {
        return this.f342780c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getNeedNotify */
    public boolean mo27907x96017b75() {
        return this.f342783f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getNewDNSBusinessType */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30 mo27908x1de73f19() {
        return this.f342778a != 665 ? com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30.PAY : com.p314xaae8f345.p347x615374d.gen.EnumC3565x34304f30.BASE;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getRequestData */
    public byte[] mo27909x1e5bbda3() {
        return this.f342785h;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getRetryCount */
    public int mo27910xa8e25f3d() {
        return this.f342782e;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getRouteInfo */
    public java.lang.String mo27911x966afe1() {
        return this.f342784g;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: getTimeout */
    public int mo27912xef7c892b() {
        return this.f342781d;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3437x23203a
    /* renamed from: onResp */
    public void mo27913xc39ed64f(int i17, byte[] bArr, java.util.HashMap hashMap) {
        fd.b bVar = this.f342786i;
        if (bVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            fd.d dVar = (fd.d) bVar;
            java.lang.Object[] objArr = new java.lang.Object[4];
            fd.f fVar = dVar.f342774a;
            objArr[0] = java.lang.Integer.valueOf(fVar.f342778a);
            objArr[1] = fVar.f342779b;
            objArr[2] = java.lang.Integer.valueOf(i17);
            objArr[3] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppNetworkService", "cgi resp - cgiId: %d cgiUrl: %s errType: %d dataSize: %d", objArr);
            dVar.f342775b.getClass();
            com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb c3690x37f511eb = new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb(i17, "", bArr != null ? java.nio.ByteBuffer.wrap(bArr) : null);
            c3690x37f511eb.m28780x4ca3169c(hashMap);
            dVar.f342776c.mo25663xc39ed64f(c3690x37f511eb);
        }
    }
}
