package rv4;

/* loaded from: classes12.dex */
public final class h implements mv4.e {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f482005a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f482006b;

    /* renamed from: c, reason: collision with root package name */
    public final rv4.i f482007c;

    /* renamed from: d, reason: collision with root package name */
    public int f482008d;

    /* renamed from: e, reason: collision with root package name */
    public int f482009e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482010f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f482011g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f482012h;

    /* renamed from: i, reason: collision with root package name */
    public final int f482013i;

    /* renamed from: j, reason: collision with root package name */
    public final int f482014j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f482015k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f482016l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f482017m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f482018n;

    /* renamed from: o, reason: collision with root package name */
    public int f482019o;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONObject f482020p;

    /* renamed from: q, reason: collision with root package name */
    public org.json.JSONArray f482021q;

    /* JADX WARN: Removed duplicated region for block: B:126:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(rv4.w r27, android.content.Context r28, rv4.i r29) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.h.<init>(rv4.w, android.content.Context, rv4.i):void");
    }

    @Override // mv4.d
    public int a() {
        return this.f482008d;
    }

    @Override // mv4.d
    public void b(int i17) {
    }

    @Override // mv4.c
    public void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f482011g).iterator();
        while (it.hasNext()) {
            rv4.k kVar = (rv4.k) it.next();
            nv4.k kVar2 = kVar.f482036a.f413208b;
            ov4.c a17 = kVar.a(ov4.d.f430739e);
            kVar2.getClass();
            a17.m157218x9616526c();
            kVar2.b(a17);
        }
    }

    @Override // mv4.c
    public void e(int i17) {
        this.f482019o = i17;
        int i18 = 0;
        for (java.lang.Object obj : this.f482011g) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((rv4.k) obj).f482052q = i19;
            i18 = i19;
        }
    }

    @Override // mv4.d
    public void f(int i17) {
        this.f482009e = i17;
    }

    public void g(boolean z17) {
        rv4.w wVar = this.f482005a;
        if (z17) {
            java.util.List list = this.f482011g;
            ((java.util.ArrayList) list).clear();
            this.f482021q = new org.json.JSONArray();
            this.f482020p = new org.json.JSONObject();
            this.f482015k = ((java.util.ArrayList) list).isEmpty();
            k();
            l(false);
            java.lang.String str = wVar.f413207a;
            java.lang.String str2 = this.f482018n;
            ov4.f fVar = ov4.f.f430764f;
            ov4.g[] gVarArr = ov4.g.f430768d;
            wVar.f413208b.c(new ov4.e(str, null, str2, 0, 101, fVar, 0L, "6", i().a(), "", 0, null, 0, 7242, null));
        }
        wVar.f413208b.c(h(z17 ? ov4.d.f430746o : ov4.d.f430747p, "清空"));
    }

    @Override // mv4.d
    /* renamed from: getMarginTop */
    public int mo148470xc1272e11() {
        return this.f482009e;
    }

    @Override // mv4.d
    /* renamed from: getTitle */
    public java.lang.String mo148471x7531c8a2() {
        return this.f482010f;
    }

    public final ov4.c h(ov4.d dVar, java.lang.String str) {
        org.json.JSONObject jSONObject;
        rv4.w wVar = this.f482005a;
        jv4.i iVar = wVar.f482090c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String b17 = fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        java.lang.String str2 = wVar.f413207a;
        java.lang.String str3 = this.f482018n;
        java.lang.String a17 = i().a();
        java.lang.String str4 = "0|0|" + b17 + '|' + b17 + "|1||||title|0";
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str2, null, str3, 0L, dVar, a17, str4, 0, 0, null, 0, 3, 0, 0, jSONObject2, 6026, null);
    }

    public ov4.h i() {
        return new ov4.h(this.f482019o, this.f482010f, 1);
    }

    public boolean j() {
        return this.f482012h && ((this.f482011g.isEmpty() ^ true) || this.f482015k);
    }

    public final void k() {
        org.json.JSONArray jSONArray = this.f482021q;
        if (jSONArray != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "saveHistoryList: " + jSONArray);
            ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("websearch:history0", jSONArray.toString());
        }
        org.json.JSONObject jSONObject = this.f482020p;
        if (jSONObject == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "saveLocalAccountMap: " + jSONObject);
        ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().D("FTSBizClickFlow", jSONObject.toString());
    }

    public void l(boolean z17) {
        boolean z18 = this.f482017m;
        this.f482017m = z17;
        if (z18 != z17) {
            qv4.p0 p0Var = (qv4.p0) this.f482007c;
            if (z17) {
                p0Var.getClass();
            } else {
                p0Var.f448536a.f482095c = false;
            }
        }
    }

    @Override // nv4.g
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f482010f);
        sb6.append('-');
        sb6.append(this.f482016l);
        sb6.append('-');
        sb6.append(((java.util.ArrayList) this.f482011g).size() > this.f482013i);
        sb6.append('-');
        sb6.append(this.f482017m);
        sb6.append('-');
        sb6.append(this.f482015k);
        sb6.append('-');
        sb6.append(this.f482018n);
        return sb6.toString();
    }

    @Override // nv4.g
    public void w() {
        java.lang.String str;
        if (this.f482015k) {
            return;
        }
        java.util.List list = this.f482011g;
        if (((java.util.ArrayList) list).isEmpty()) {
            return;
        }
        boolean z17 = ((java.util.ArrayList) list).size() > this.f482013i;
        rv4.w wVar = this.f482005a;
        if (z17 && !this.f482016l) {
            java.lang.String str2 = wVar.f413207a;
            java.lang.String str3 = this.f482018n;
            ov4.f fVar = ov4.f.f430763e;
            if (this.f482017m) {
                ov4.g[] gVarArr = ov4.g.f430768d;
                str = "8";
            } else {
                ov4.g[] gVarArr2 = ov4.g.f430768d;
                str = "7";
            }
            wVar.f413208b.d("his-title-unfold-btn-" + this.f482017m, new ov4.e(str2, null, str3, 0, 101, fVar, 0L, str, i().a(), "", 0, null, 0, 7242, null));
        }
        if (this.f482016l) {
            java.lang.String str4 = wVar.f413207a;
            java.lang.String str5 = this.f482018n;
            ov4.f fVar2 = ov4.f.f430763e;
            ov4.g[] gVarArr3 = ov4.g.f430768d;
            ov4.e eVar = new ov4.e(str4, null, str5, 0, 101, fVar2, 0L, "6#5", i().a(), "", 0, null, 0, 7242, null);
            nv4.k kVar = wVar.f413208b;
            kVar.d("his-title-clear-btn", eVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("his-title-clear-btn-");
            java.lang.String str6 = this.f482018n;
            sb6.append(str6);
            java.lang.String sb7 = sb6.toString();
            ov4.d dVar = ov4.d.f430740f;
            kVar.d(sb7, h(dVar, "清空"));
            kVar.d("his-title-hide-btn-" + str6, h(dVar, "不再展示"));
        }
    }
}
