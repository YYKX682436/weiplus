package com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/mj_template/report/MaasPageFinderReporter;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onResume", "onPause", "", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "", "currentCommentScene", "eid", "Landroid/content/Intent;", "intent", "<init>", "(Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter */
/* loaded from: classes10.dex */
public final class C11017xf7264b1c implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f151338d;

    /* renamed from: e, reason: collision with root package name */
    public final int f151339e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f151340f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f151341g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f151342h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f151343i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f151344m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f151345n;

    /* renamed from: o, reason: collision with root package name */
    public final org.json.JSONObject f151346o;

    /* renamed from: p, reason: collision with root package name */
    public long f151347p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f151348q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f151349r;

    public C11017xf7264b1c(java.lang.String sessionId, int i17, java.lang.String eid, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f151338d = sessionId;
        this.f151339e = i17;
        this.f151340f = eid;
        this.f151341g = jz5.h.b(new fz0.b(intent));
        this.f151342h = jz5.h.b(new fz0.d(intent));
        this.f151343i = jz5.h.b(new fz0.a(intent));
        this.f151344m = jz5.h.b(new fz0.c(intent));
        this.f151345n = jz5.h.a(jz5.i.f384364f, new fz0.e(intent));
        this.f151346o = new org.json.JSONObject();
        this.f151348q = jz5.h.b(new fz0.f(intent));
        this.f151349r = "";
    }

    public final void a(java.lang.String key, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        org.json.JSONObject jSONObject = this.f151346o;
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(j17);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(java.math.BigInteger.ONE.shiftLeft(64));
        }
        java.lang.String bigInteger = valueOf.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bigInteger, "toString(...)");
        jSONObject.put(key, bigInteger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c.b(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r11, boolean r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c.c(java.lang.String, boolean, java.lang.String):void");
    }

    public final void d(java.lang.String templateId, java.lang.String eid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        c(templateId, true, eid);
        this.f151349r = templateId;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onPause */
    public final void m47479xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasPageFinderReporter", "onPause");
        b(false);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onResume */
    public final void m47480x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasPageFinderReporter", "onResume");
        b(true);
    }

    public /* synthetic */ C11017xf7264b1c(java.lang.String str, int i17, java.lang.String str2, android.content.Intent intent, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? "" : str, (i18 & 2) != 0 ? 0 : i17, str2, (i18 & 8) != 0 ? new android.content.Intent() : intent);
    }
}
