package p000;

/* loaded from: classes5.dex */
public final class t implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.j {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f495787d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashSet f495784a = new java.util.LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f495785b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f495786c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f495788e = jz5.h.b(new p000.r(this));

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.j
    public void a(java.lang.String taskKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskKey, "taskKey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasTemplateCdnManager", "should not reach here onCancelUpload");
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.j
    public void b(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4004xd61acd77 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        synchronized (this.f495786c) {
            java.util.LinkedHashSet linkedHashSet = this.f495784a;
            boolean z17 = false;
            if (!(linkedHashSet instanceof java.util.Collection) || !linkedHashSet.isEmpty()) {
                java.util.Iterator it = linkedHashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4004xd61acd77) it.next()).f129398a, request.f129398a)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasTemplateCdnManager", "already add to waiting tasks");
                return;
            }
            if (this.f495785b.containsKey(request.f129398a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasTemplateCdnManager", "already add to running tasks");
                return;
            }
            if (this.f495785b.size() >= 6) {
                this.f495784a.add(request);
            } else {
                java.lang.String str = request.f129400c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getCDNURL(...)");
                java.lang.String str2 = request.f129401d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getResultFilePath(...)");
                dn.m e17 = e(str, str2);
                java.util.HashMap hashMap = this.f495785b;
                java.lang.String field_mediaId = e17.f69601xaca5bdda;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                java.lang.String str3 = request.f129398a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getTaskKey(...)");
                hashMap.put(field_mediaId, str3);
                java.lang.String str4 = request.f129398a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getTaskKey(...)");
                g(e17, str4);
            }
        }
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.j
    public void c(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4005xdbfc01de request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasTemplateCdnManager", "should not reach here onBeginUpload");
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.j
    public void d(java.lang.String taskKey) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskKey, "taskKey");
        if (this.f495787d == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasTemplateCdnManager", "on cancel ".concat(taskKey));
        synchronized (this.f495786c) {
            if (!pm0.v.c0(this.f495784a, new p000.q(taskKey))) {
                java.util.Set entrySet = this.f495785b.entrySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.Map.Entry) obj).getValue(), taskKey)) {
                            break;
                        }
                    }
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (entry != null) {
                    java.lang.Object key = entry.getKey();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                    java.lang.String str = (java.lang.String) key;
                    ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).wi(str, new java.lang.ref.WeakReference((p000.p) ((jz5.n) this.f495788e).mo141623x754a37bb()));
                    this.f495785b.remove(str);
                    f();
                }
            }
        }
    }

    public final dn.m e(java.lang.String str, java.lang.String str2) {
        dn.j jVar = new dn.j();
        jVar.f323318d = "task_FinderCdnDownloader";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder-template-down-");
        byte[] bytes = ("" + str).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        jVar.f69601xaca5bdda = sb6.toString();
        jVar.G1 = str2;
        jVar.f69595x6d25b0d9 = str2;
        jVar.E1 = new java.net.URL(str).getHost();
        jVar.D1 = str;
        jVar.f69592xf1ebe47b = 5;
        jVar.f69618x114ef53e = "";
        jVar.f69609xd84b8349 = 2;
        jVar.f69606xccdbf540 = true;
        jVar.f69597x853bb235 = false;
        jVar.f69580x454032b6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2.f34622x366c91de;
        jVar.f69584x89a4c0cf = 2;
        return jVar;
    }

    public final void f() {
        synchronized (this.f495786c) {
            while (this.f495785b.size() < 6) {
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4004xd61acd77 c4004xd61acd77 = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4004xd61acd77) pm0.v.a0(this.f495784a, new p000.s(this));
                if (c4004xd61acd77 == null) {
                    return;
                }
                java.lang.String str = c4004xd61acd77.f129400c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getCDNURL(...)");
                java.lang.String str2 = c4004xd61acd77.f129401d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getResultFilePath(...)");
                dn.m e17 = e(str, str2);
                java.util.HashMap hashMap = this.f495785b;
                java.lang.String field_mediaId = e17.f69601xaca5bdda;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                java.lang.String str3 = c4004xd61acd77.f129398a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getTaskKey(...)");
                hashMap.put(field_mediaId, str3);
                java.lang.String str4 = c4004xd61acd77.f129398a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getTaskKey(...)");
                g(e17, str4);
            }
        }
    }

    public final void g(dn.m mVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasTemplateCdnManager", "add key " + str + " success");
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference((p000.p) ((jz5.n) this.f495788e).mo141623x754a37bb()));
    }
}
