package ln1;

/* loaded from: classes12.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.s f401263a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401264b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401265c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401266d;

    /* renamed from: e, reason: collision with root package name */
    public final int f401267e;

    /* renamed from: f, reason: collision with root package name */
    public long f401268f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f401269g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f401270h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.util.Vector f401271i = new java.util.Vector();

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 f401272j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b3(true);

    /* renamed from: k, reason: collision with root package name */
    public final long f401273k = j62.e.g().i("clicfg_backup_send_cache_size", 31457280, false, true);

    /* renamed from: l, reason: collision with root package name */
    public final sn1.e0 f401274l = new ln1.d0(this);

    public c0(ln1.s sVar, kn1.h hVar) {
        java.lang.String e17;
        this.f401264b = "";
        this.f401263a = sVar;
        java.lang.String str = hVar.f391154a;
        this.f401265c = str;
        int i17 = hVar.f391157d;
        this.f401267e = i17;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.e(str);
        }
        this.f401266d = e17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = e17 == null ? "" : e17;
            objArr[1] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("", "TagProcessor nickName is NullOrNil! nickName:%s, talker:%s", objArr);
            this.f401266d = str;
        }
        java.lang.String str2 = "MicroMsg.BackupPackAndSend.tag." + i17 + "." + this.f401266d;
        this.f401264b = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "initTagNow [%d,%s,%s] [%s]", java.lang.Integer.valueOf(i17), this.f401266d, str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
    }

    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MSG_");
        sb6.append(this.f401271i.size());
        sb6.append("_");
        sb6.append(this.f401265c);
        sb6.append("_");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f401270h = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f401264b, "chatMsgList:%d", java.lang.Integer.valueOf(this.f401271i.size()));
        sn1.e0 e0Var = this.f401274l;
        ln1.e0 e0Var2 = new ln1.e0(this);
        java.lang.String str = this.f401270h;
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f401271i);
        byte[] bArr = this.f401263a.f401336d.f391141f;
        int i17 = sn1.a0.A;
        ln1.s.f401330r.a(new sn1.c0(e0Var2, linkedList, e0Var, str, bArr), linkedList.size() * 10240);
        this.f401271i = new java.util.Vector();
    }

    public void b(ln1.b0 b0Var) {
        if (this.f401271i.size() > 0) {
            a();
        }
        java.lang.String str = this.f401270h;
        java.lang.String str2 = this.f401264b;
        final ln1.a0 a0Var = new ln1.a0(str2, this.f401263a, this.f401265c, this.f401267e, this.f401268f, this.f401269g, str, this.f401266d, b0Var);
        this.f401269g = 0L;
        this.f401268f = 0L;
        ln1.r rVar = ln1.s.f401330r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setTagEnd tagTextClientId:%s, index:%d", str, java.lang.Long.valueOf(rVar.f401320b.get()));
        rVar.a(new ln1.q(new java.lang.Runnable() { // from class: ln1.c0$$a
            @Override // java.lang.Runnable
            public final void run() {
                ln1.a0.this.run();
            }
        }), 0L);
    }

    /* renamed from: toString */
    public java.lang.String m146096x9616526c() {
        return this.f401264b;
    }
}
