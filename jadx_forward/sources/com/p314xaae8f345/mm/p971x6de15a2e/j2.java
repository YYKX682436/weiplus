package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes7.dex */
public class j2 implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback, com.p314xaae8f345.mm.p971x6de15a2e.i2 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f153570c;

    /* renamed from: g, reason: collision with root package name */
    public final int f153574g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f153575h;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f153577j;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f153579l;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback f153581n;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f153584q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f153568a = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f153569b = "";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f153571d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f153572e = 5000;

    /* renamed from: f, reason: collision with root package name */
    public int f153573f = 5000;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f153576i = "GET";

    /* renamed from: k, reason: collision with root package name */
    public boolean f153578k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f153580m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f153582o = 8;

    /* renamed from: p, reason: collision with root package name */
    public int f153583p = -1;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f153585r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public int f153586s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f153587t = false;

    public j2(java.lang.String str, int i17) {
        this.f153570c = str;
        this.f153574g = i17;
    }

    public void a() {
        if ("".equals(this.f153569b) && this.f153582o == 2) {
            b();
        }
    }

    public final synchronized void b() {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.url = this.f153570c;
        cronetRequestParams.f18166x25da56ad = false;
        cronetRequestParams.f18159x6574fc6c = this.f153577j;
        cronetRequestParams.f18174xbfc5d0e1 = this.f153576i;
        cronetRequestParams.f18184x1eb6f2fa = this.f153578k;
        cronetRequestParams.f18183xeddcaf63 = this.f153580m;
        cronetRequestParams.f18185xf72c4065 = false;
        cronetRequestParams.m37968xeb7416ae(this.f153571d);
        cronetRequestParams.f18181xe78dee5f = this.f153582o;
        if (this.f153586s != 0) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.DefaultHttpTaskParams defaultHttpTaskParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.DefaultHttpTaskParams();
            cronetRequestParams.f18160x5f211ab4 = defaultHttpTaskParams;
            defaultHttpTaskParams.f18215xe68be16f = this.f153586s;
        }
        int i17 = this.f153582o;
        if (i17 == 1) {
            m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, this);
        } else if (i17 != 2) {
            cronetRequestParams.f18161x6c20cc03 = this.f153587t ? 2 : 0;
            m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37960x884bdecf(cronetRequestParams, this);
        } else {
            cronetRequestParams.f18179x84749342 = this.f153579l;
            cronetRequestParams.f18177xa943cc02 = true;
            m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37961xaa3ad68c(cronetRequestParams, this);
        }
        this.f153569b = m37962x5ffa1e0c.f18158xcb7ef180;
        try {
            wait(this.f153572e + this.f153573f);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CronetConnect", "createAndStartCronetRequest " + e17.getLocalizedMessage());
        }
        if (!this.f153568a) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f153569b);
        }
        p();
    }

    public int c() {
        long j17;
        java.lang.String i17 = i("content-length");
        if (i17 == null) {
            return -1;
        }
        try {
            j17 = java.lang.Long.parseLong(i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CronetConnect", "getContentLength content-length " + e17.getLocalizedMessage());
            j17 = -1;
        }
        if (j17 > 2147483647L) {
            return -1;
        }
        return (int) j17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void d(java.lang.String str) {
        ((java.util.HashMap) this.f153571d).put("Referer", str);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    /* renamed from: disconnect */
    public void mo48348x1f9d589c() {
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public java.lang.String e() {
        return i("content-type");
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public int f() {
        int i17;
        if (this.f153568a && (i17 = this.f153583p) != -1) {
            return i17;
        }
        if ("".equals(this.f153569b)) {
            b();
        }
        return this.f153583p;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void g(int i17) {
        this.f153572e = i17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    /* renamed from: getInputStream */
    public java.io.InputStream mo48349xc7995ab4() {
        return new java.io.ByteArrayInputStream(this.f153584q);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void h(java.lang.String str, java.lang.String str2) {
        ((java.util.HashMap) this.f153571d).put(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public java.lang.String i(java.lang.String str) {
        if (str.isEmpty()) {
            return "";
        }
        java.util.List list = (java.util.List) this.f153585r.get(str.toLowerCase());
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetConnect", "getHeaderField %s is null", str);
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetConnect", "getHeaderField field %s, value %s ", str, list.get(0));
        return (java.lang.String) list.get(0);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void j(boolean z17) {
        this.f153578k = z17;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.i2
    public void k(int i17) {
        this.f153573f = i17;
    }

    public java.lang.String l() {
        return this.f153575h;
    }

    public int m() {
        return this.f153574g;
    }

    public int n(java.lang.String str, int i17) {
        try {
            return java.lang.Integer.parseInt(i(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CronetConnect", "getHeaderFieldInt field " + str + " " + e17.getLocalizedMessage());
            return i17;
        }
    }

    public java.util.Map o() {
        return this.f153585r;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        if (this.f153581n == null) {
            return 0;
        }
        this.f153585r = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37942x641bb0c1(responseHeader);
        return this.f153581n.mo37970x82943234(responseHeader, i17, str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetConnect", "receive callback, status %d, error %d, msg %s, quic %b http2 %b newdns %d", java.lang.Integer.valueOf(cronetTaskResult.f18207xec0a8ff), java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015), cronetTaskResult.f18201x5336c059, java.lang.Boolean.valueOf(cronetTaskResult.f18213xf72c4065), java.lang.Boolean.valueOf(cronetTaskResult.f18212xeddcaf63), java.lang.Integer.valueOf(cronetTaskResult.f18199x6c20cc03));
        synchronized (this) {
            this.f153568a = true;
            this.f153583p = cronetTaskResult.f18207xec0a8ff;
            this.f153584q = cronetTaskResult.f18198x2eefaa;
            this.f153585r = cronetTaskResult.m37976xd962a517();
            notify();
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback cronetTaskCallback = this.f153581n;
        if (cronetTaskCallback != null) {
            cronetTaskCallback.mo37972x5b5f2d2a(str, cronetTaskResult, str2);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback cronetTaskCallback = this.f153581n;
        if (cronetTaskCallback != null) {
            cronetTaskCallback.mo37973x617c4940(str, cronetDownloadProgress);
        }
    }

    public final void p() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(this.f153585r);
        this.f153585r.clear();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (entry != null && entry.getKey() != null) {
                this.f153585r.put(((java.lang.String) entry.getKey()).toLowerCase(), (java.util.List) entry.getValue());
            }
        }
    }

    public void q(int i17) {
        this.f153586s = i17;
    }

    public void r(java.lang.String str) {
        this.f153576i = str;
    }

    public void s(boolean z17) {
        this.f153587t = z17;
    }
}
