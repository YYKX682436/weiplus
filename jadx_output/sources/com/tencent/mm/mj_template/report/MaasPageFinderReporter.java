package com.tencent.mm.mj_template.report;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/mj_template/report/MaasPageFinderReporter;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onResume", "onPause", "", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "", "currentCommentScene", "eid", "Landroid/content/Intent;", "intent", "<init>", "(Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MaasPageFinderReporter implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f69805d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69806e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f69807f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f69808g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f69809h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f69810i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f69811m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f69812n;

    /* renamed from: o, reason: collision with root package name */
    public final org.json.JSONObject f69813o;

    /* renamed from: p, reason: collision with root package name */
    public long f69814p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f69815q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f69816r;

    public MaasPageFinderReporter(java.lang.String sessionId, int i17, java.lang.String eid, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f69805d = sessionId;
        this.f69806e = i17;
        this.f69807f = eid;
        this.f69808g = jz5.h.b(new fz0.b(intent));
        this.f69809h = jz5.h.b(new fz0.d(intent));
        this.f69810i = jz5.h.b(new fz0.a(intent));
        this.f69811m = jz5.h.b(new fz0.c(intent));
        this.f69812n = jz5.h.a(jz5.i.f302831f, new fz0.e(intent));
        this.f69813o = new org.json.JSONObject();
        this.f69815q = jz5.h.b(new fz0.f(intent));
        this.f69816r = "";
    }

    public final void a(java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(key, "key");
        org.json.JSONObject jSONObject = this.f69813o;
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(j17);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(java.math.BigInteger.ONE.shiftLeft(64));
        }
        java.lang.String bigInteger = valueOf.toString();
        kotlin.jvm.internal.o.f(bigInteger, "toString(...)");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.report.MaasPageFinderReporter.b(boolean):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.report.MaasPageFinderReporter.c(java.lang.String, boolean, java.lang.String):void");
    }

    public final void d(java.lang.String templateId, java.lang.String eid) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(eid, "eid");
        c(templateId, true, eid);
        this.f69816r = templateId;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public final void onPause() {
        com.tencent.mars.xlog.Log.i("MaasPageFinderReporter", "onPause");
        b(false);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void onResume() {
        com.tencent.mars.xlog.Log.i("MaasPageFinderReporter", "onResume");
        b(true);
    }

    public /* synthetic */ MaasPageFinderReporter(java.lang.String str, int i17, java.lang.String str2, android.content.Intent intent, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? "" : str, (i18 & 2) != 0 ? 0 : i17, str2, (i18 & 8) != 0 ? new android.content.Intent() : intent);
    }
}
