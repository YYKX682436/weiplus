package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class lq implements com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312 {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f131877b = "NetImpl";

    /* renamed from: a, reason: collision with root package name */
    protected android.os.Bundle f131878a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f131880d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> f131881e;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f131885i;

    /* renamed from: c, reason: collision with root package name */
    private boolean f131879c = true;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.lang.String> f131882f = new java.util.HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final java.util.HashSet<java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.md>> f131883g = new java.util.HashSet<>();

    /* renamed from: h, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> f131884h = new java.util.HashMap<>();

    private void a(boolean z17) {
        this.f131879c = z17;
    }

    private void b(boolean z17) {
        this.f131880d = z17;
    }

    public abstract com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde a(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252);

    public abstract void a();

    public abstract com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde b(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252);

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: doGet */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde mo35894x5b4bacb(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        return a(c4329xa3f02252);
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: doPost */
    public com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde mo35895xb0e6dbcb(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        return b(c4329xa3f02252);
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: getNetFlowProcessor */
    public java.util.HashSet<java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.md>> mo35897x2ada13dd() {
        return this.f131883g;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: getNetFlowRuleList */
    public java.util.HashMap<java.lang.String, java.lang.String> mo35898xa497810f() {
        return this.f131882f;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: getProxyRuleList */
    public java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> mo35899xdb157a92() {
        return this.f131881e;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: getRegionHostList */
    public java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> mo35900x5a802a70() {
        return this.f131884h;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: getSecretKey */
    public java.lang.String mo35901xd3588ad9() {
        return this.f131885i;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: initNet */
    public void mo35902x7420f26d(android.content.Context context, com.p314xaae8f345.map.p511x696c9db.net.C4326x99a7cf1f c4326x99a7cf1f) {
        try {
            this.f131879c = c4326x99a7cf1f.m35914x882fa58a();
            this.f131880d = c4326x99a7cf1f.m35915xa25a73dd();
            this.f131881e = c4326x99a7cf1f.m35911xdb157a92();
            this.f131882f.putAll(c4326x99a7cf1f.m35909xa497810f());
            this.f131885i = c4326x99a7cf1f.m35913xd3588ad9();
            this.f131883g.add(c4326x99a7cf1f.m35910xbe2cbddc());
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> m35912x5a802a70 = c4326x99a7cf1f.m35912x5a802a70();
            if (m35912x5a802a70 != null) {
                this.f131884h.putAll(m35912x5a802a70);
            }
            this.f131878a = c4326x99a7cf1f.m35908x8619eaa0();
            a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(f131877b, "initNet error:" + e17.toString());
        }
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: isForceHttps */
    public boolean mo35903x882fa58a() {
        return this.f131879c;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4325x1e0dd312
    /* renamed from: isLogEnable */
    public boolean mo35904xa25a73dd() {
        return this.f131880d;
    }

    private void a(java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4345x442d4ec2> list) {
        this.f131881e = list;
    }

    private void b(java.lang.String str) {
        this.f131885i = str;
    }

    private void a(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.f131882f.putAll(hashMap);
    }

    private void b(java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap) {
        if (hashMap != null) {
            this.f131884h.putAll(hashMap);
        }
    }

    private void a(java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.md> cls) {
        this.f131883g.add(cls);
    }

    public static java.lang.String a(java.lang.String str) {
        if (str != null) {
            java.lang.String[] split = str.split(";");
            int length = split.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.String str2 = split[i17];
                if (str2.contains("charset")) {
                    java.lang.String[] split2 = str2.split("=");
                    if (split2.length > 1) {
                        return split2[1].trim();
                    }
                } else {
                    i17++;
                }
            }
        }
        return "GBK";
    }
}
