package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class r8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166639d;

    /* renamed from: e, reason: collision with root package name */
    public final int f166640e;

    /* renamed from: f, reason: collision with root package name */
    public final int f166641f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f166642g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f166643h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 f166644i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f166645m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.y50 f166646n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f166647o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f166648p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f166649q;

    public r8(java.lang.String appId, int i17, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 versionInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 reportQualitySession, r45.y50 cgiCommRequestSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionInfo, "versionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportQualitySession, "reportQualitySession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f166639d = appId;
        this.f166640e = i17;
        this.f166641f = i18;
        this.f166642g = str;
        this.f166643h = str2;
        this.f166644i = versionInfo;
        this.f166645m = reportQualitySession;
        this.f166646n = cgiCommRequestSource;
        this.f166647o = true;
    }

    public final void a() {
        int i17 = this.f166640e;
        b(i17 == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.b(com.p314xaae8f345.mm.R.C30867xcad56011.f571722ne, new java.lang.Object[0]) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.b(com.p314xaae8f345.mm.R.C30867xcad56011.f571784pb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(i17)));
    }

    public void b(java.lang.String str) {
        if (this.f166647o) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ib.b(str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "silent toast:error=" + str + ", stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.LinkedList] */
    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        ?? d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 a17;
        int i17 = this.f166640e;
        boolean a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(i17);
        java.lang.String str = this.f166639d;
        if (a18 && this.f166644i.f158977d != 0) {
            java.lang.String y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class)).y0(str, i17);
            if (y07 == null || (a17 = k91.x5.a(y07)) == null) {
                a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "call() parse extInfoJson failed with appId[" + str + "] versionType[" + i17 + ']');
                return null;
            }
            this.f166644i = a17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = this.f166644i;
        c11667xc7e59dd6.f33456x1c82a56c = c11829x68027553.f158977d;
        c11667xc7e59dd6.f156932d = i17;
        c11667xc7e59dd6.f156905md5 = c11829x68027553.f158980g;
        c11667xc7e59dd6.f156937i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g8 g8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g8.f166161a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x680275532 = this.f166644i;
        java.util.Map b17 = g8Var.b(c11829x680275532, str, g8Var.a(str, i17, c11829x680275532.f158977d));
        for (java.util.Map.Entry entry : ((android.util.ArrayMap) b17).entrySet()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "<this>");
            java.lang.String moduleName = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5) entry.getValue();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, moduleName)) {
                java.util.LinkedList linkedList = c11667xc7e59dd6.f156935g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e();
                java.util.List moduleList = this.f166644i.f158985o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moduleList, "moduleList");
                java.util.Iterator it = moduleList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(moduleName, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) obj).f158997d)) {
                        break;
                    }
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) obj;
                c11656xaf63146e.f33454x337a8b = moduleName;
                c11656xaf63146e.f156905md5 = c11831x52cc1bc5.f159008e;
                c11656xaf63146e.f33453xc73e777a = c11830xcf46aa1f2.f158999f;
                c11656xaf63146e.f33452xc97d4efe = c11830xcf46aa1f2.f159001h;
                c11656xaf63146e.f33456x1c82a56c = this.f166644i.f158977d;
                linkedList.add(c11656xaf63146e);
            }
            java.util.List list = c11831x52cc1bc5.f159010g;
            if (!(list == null || list.isEmpty())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7 = c11667xc7e59dd6.f156937i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11670x2ef26cc7);
                java.util.List b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r4.b(c11831x52cc1bc5.f159010g);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
                if (b18 != null && !b18.isEmpty()) {
                    c11670x2ef26cc7.f156939d.put(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.kb(moduleName), b18);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc72 = c11667xc7e59dd6.f156937i;
        if (c11670x2ef26cc72 != null) {
            c11670x2ef26cc72.e();
        }
        boolean a19 = k91.l3.a(this.f166641f);
        java.lang.String str2 = this.f166642g;
        if (a19) {
            if (str2 != null && str2.startsWith("__wx__")) {
                return c11667xc7e59dd6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x680275533 = this.f166644i;
        if (!c11829x680275533.f158986p || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c11829x680275533.f158985o)) {
            d17 = kz5.c0.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8);
        } else {
            d17 = new java.util.LinkedList();
            java.lang.String a27 = nf.z.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(str2));
            if (a27 == null || a27.length() == 0) {
                java.lang.String str3 = this.f166643h;
                if (str3 == null || str3.length() == 0) {
                    str3 = this.f166644i.f158987q;
                }
                java.lang.String str4 = str3;
                if (str4 == null || str4.length() == 0) {
                    c11830xcf46aa1f = null;
                } else {
                    java.util.List moduleList2 = this.f166644i.f158985o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moduleList2, "moduleList");
                    c11830xcf46aa1f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) ph1.i0.b(moduleList2, str4, "LaunchCheckPkgHandlerSeparatedPluginsCompatible for module appId:" + str + " versionType:" + i17, false, 4, null);
                }
            } else {
                java.util.List moduleList3 = this.f166644i.f158985o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moduleList3, "moduleList");
                c11830xcf46aa1f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) ph1.i0.b(moduleList3, a27, "LaunchCheckPkgHandlerSeparatedPluginsCompatible for path appId:" + str + " versionType:" + i17, false, 4, null);
            }
            if (c11830xcf46aa1f != null) {
                d17.add(c11830xcf46aa1f.f158997d);
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11830xcf46aa1f != null ? c11830xcf46aa1f.f158997d : null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8)) {
                if (!(c11830xcf46aa1f != null && c11830xcf46aa1f.f158999f)) {
                    d17.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8);
                }
            }
        }
        java.util.List list2 = d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "call() appId:" + str + ", versionType:" + i17 + ", will request (" + u46.l.h(list2, ",") + ") for path:" + str2);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible[");
        sb6.append(str);
        sb6.append('|');
        sb6.append(i17);
        sb6.append(']');
        pm0.v.M(sb6.toString(), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l8(this, list2, b17, c11667xc7e59dd6, atomicReference, countDownLatch), 2, null);
        try {
            countDownLatch.await();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "await semaphore failed with appId(" + str + ") versionType(" + i17 + ')');
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) atomicReference.get();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7
    public boolean d() {
        return this.f166647o;
    }
}
