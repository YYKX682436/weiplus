package rq4;

/* loaded from: classes14.dex */
public final class j {
    public long A;
    public int B;
    public int C;
    public int D;
    public long E;
    public long F;
    public long G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f480520J;
    public long K;
    public long L;
    public long M;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f480524d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f480525e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f480526f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f480527g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f480528h;

    /* renamed from: o, reason: collision with root package name */
    public int f480535o;

    /* renamed from: p, reason: collision with root package name */
    public int f480536p;

    /* renamed from: q, reason: collision with root package name */
    public int f480537q;

    /* renamed from: r, reason: collision with root package name */
    public long f480538r;

    /* renamed from: s, reason: collision with root package name */
    public long f480539s;

    /* renamed from: t, reason: collision with root package name */
    public long f480540t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f480541u;

    /* renamed from: v, reason: collision with root package name */
    public long f480542v;

    /* renamed from: w, reason: collision with root package name */
    public long f480543w;

    /* renamed from: x, reason: collision with root package name */
    public int f480544x;

    /* renamed from: y, reason: collision with root package name */
    public int f480545y;

    /* renamed from: z, reason: collision with root package name */
    public int f480546z;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f480521a = vq4.b0.f520803a.a();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f480522b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f480523c = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f480529i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f480530j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashSet f480531k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashSet f480532l = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f480533m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f480534n = new java.util.HashSet();

    public final void a() {
        char c17;
        long j17;
        java.lang.String str;
        java.util.Iterator it;
        sq4.b bVar;
        sq4.b bVar2;
        sq4.b bVar3;
        sq4.b bVar4;
        sq4.b bVar5;
        long j18 = gq4.v.wi().f447517r;
        long j19 = gq4.v.wi().f447516q;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7021xf3e88cbf c7021xf3e88cbf = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7021xf3e88cbf();
        cl0.g gVar = new cl0.g();
        java.lang.String str2 = this.f480528h;
        java.util.HashMap hashMap = this.f480522b;
        if (str2 != null && (bVar5 = (sq4.b) hashMap.get(str2)) != null) {
            bVar5.a();
        }
        java.lang.String str3 = this.f480524d;
        if (str3 != null && (bVar4 = (sq4.b) hashMap.get(str3)) != null) {
            bVar4.a();
        }
        java.lang.String str4 = this.f480526f;
        if (str4 != null && (bVar3 = (sq4.b) hashMap.get(str4)) != null) {
            bVar3.a();
        }
        java.lang.String str5 = this.f480525e;
        if (str5 != null && (bVar2 = (sq4.b) hashMap.get(str5)) != null) {
            bVar2.a();
        }
        java.lang.String str6 = this.f480527g;
        if (str6 != null && (bVar = (sq4.b) hashMap.get(str6)) != null) {
            bVar.a();
        }
        java.util.Iterator it6 = this.f480530j.iterator();
        while (true) {
            c17 = '*';
            if (!it6.hasNext()) {
                break;
            }
            android.util.Size size = (android.util.Size) it6.next();
            sq4.b bVar6 = (sq4.b) hashMap.get("LocalDrawSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (bVar6 != null) {
                sq4.c c18 = bVar6.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(size.getWidth());
                sb6.append('*');
                sb6.append(size.getHeight());
                gVar.h(sb6.toString(), q(size, c18.f492918b, c18.f492917a));
            }
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        java.lang.String str7 = ";";
        c7021xf3e88cbf.f143368k = c7021xf3e88cbf.b("LocalDrawSize", r26.i0.t(gVar2, ",", ";", false), true);
        cl0.g gVar3 = new cl0.g();
        java.util.Iterator it7 = this.f480532l.iterator();
        while (it7.hasNext()) {
            android.util.Size size2 = (android.util.Size) it7.next();
            sq4.b bVar7 = (sq4.b) hashMap.get("RemoteDrawSizeChange_" + size2.getWidth() + c17 + size2.getHeight());
            if (bVar7 != null) {
                sq4.c c19 = bVar7.c();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                it = it7;
                sb7.append(size2.getWidth());
                sb7.append(c17);
                sb7.append(size2.getHeight());
                str = str7;
                gVar3.h(sb7.toString(), q(size2, c19.f492918b, c19.f492917a));
            } else {
                str = str7;
                it = it7;
            }
            it7 = it;
            str7 = str;
            c17 = '*';
        }
        java.lang.String gVar4 = gVar3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        c7021xf3e88cbf.f143370m = c7021xf3e88cbf.b("RemoteDrawSize", r26.i0.t(gVar4, ",", str7, false), true);
        cl0.g gVar5 = new cl0.g();
        java.util.Iterator it8 = this.f480529i.iterator();
        while (it8.hasNext()) {
            android.util.Size size3 = (android.util.Size) it8.next();
            sq4.b bVar8 = (sq4.b) hashMap.get("LocalTextureSizeChange_" + size3.getWidth() + '*' + size3.getHeight());
            if (bVar8 != null) {
                sq4.c c27 = bVar8.c();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(size3.getWidth());
                sb8.append('*');
                sb8.append(size3.getHeight());
                j17 = j18;
                gVar5.h(sb8.toString(), q(size3, c27.f492918b, c27.f492917a));
            } else {
                j17 = j18;
            }
            j18 = j17;
        }
        long j27 = j18;
        java.lang.String gVar6 = gVar5.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        c7021xf3e88cbf.f143369l = c7021xf3e88cbf.b("LocalTextureSize", r26.i0.t(gVar6, ",", str7, false), true);
        cl0.g gVar7 = new cl0.g();
        java.util.Iterator it9 = this.f480531k.iterator();
        while (it9.hasNext()) {
            android.util.Size size4 = (android.util.Size) it9.next();
            sq4.b bVar9 = (sq4.b) hashMap.get("RemoteTextureSizeChange_" + size4.getWidth() + '*' + size4.getHeight());
            if (bVar9 != null) {
                sq4.c c28 = bVar9.c();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(size4.getWidth());
                sb9.append('*');
                sb9.append(size4.getHeight());
                gVar7.h(sb9.toString(), q(size4, c28.f492918b, c28.f492917a));
            }
        }
        java.lang.String gVar8 = gVar7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar8, "toString(...)");
        c7021xf3e88cbf.f143371n = c7021xf3e88cbf.b("RemoteTextureSize", r26.i0.t(gVar8, ",", str7, false), true);
        cl0.g gVar9 = new cl0.g();
        java.util.Iterator it10 = this.f480533m.iterator();
        while (it10.hasNext()) {
            int intValue = ((java.lang.Number) it10.next()).intValue();
            sq4.b bVar10 = (sq4.b) hashMap.get("DrawLocalRotateChange" + intValue);
            if (bVar10 != null) {
                sq4.c c29 = bVar10.c();
                gVar9.h(java.lang.String.valueOf(intValue), r(intValue, c29.f492918b, c29.f492917a));
            }
        }
        java.lang.String gVar10 = gVar9.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar10, "toString(...)");
        c7021xf3e88cbf.f143372o = c7021xf3e88cbf.b("LocalRotate", r26.i0.t(gVar10, ",", str7, false), true);
        cl0.g gVar11 = new cl0.g();
        java.util.Iterator it11 = this.f480534n.iterator();
        while (it11.hasNext()) {
            int intValue2 = ((java.lang.Number) it11.next()).intValue();
            sq4.b bVar11 = (sq4.b) hashMap.get("DrawRemoteRotateChange" + intValue2);
            if (bVar11 != null) {
                sq4.c c37 = bVar11.c();
                gVar11.h(java.lang.String.valueOf(intValue2), r(intValue2, c37.f492918b, c37.f492917a));
            }
        }
        java.lang.String gVar12 = gVar11.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar12, "toString(...)");
        c7021xf3e88cbf.f143373p = c7021xf3e88cbf.b("RemoteRotate", r26.i0.t(gVar12, ",", str7, false), true);
        sq4.b bVar12 = (sq4.b) hashMap.get("DecodeChangeSoft");
        if (bVar12 != null) {
            bVar12.a();
        }
        sq4.b bVar13 = (sq4.b) hashMap.get("DecodeChangeSoft");
        if (bVar13 != null) {
            sq4.c c38 = bVar13.c();
            c7021xf3e88cbf.f143366i = c38.f492917a;
            c7021xf3e88cbf.f143367j = (int) c38.f492918b;
        }
        sq4.b bVar14 = (sq4.b) hashMap.get("DecodeChangeHard");
        if (bVar14 != null) {
            bVar14.a();
        }
        sq4.b bVar15 = (sq4.b) hashMap.get("DecodeChangeHard");
        if (bVar15 != null) {
            sq4.c c39 = bVar15.c();
            c7021xf3e88cbf.f143363f = c39.f492917a;
            c7021xf3e88cbf.f143365h = (int) c39.f492918b;
        }
        java.util.HashMap hashMap2 = this.f480523c;
        sq4.b bVar16 = (sq4.b) hashMap2.get("LocalSourceTimeoutNoFrame");
        if (bVar16 != null) {
            sq4.c c47 = bVar16.c();
            c7021xf3e88cbf.f143374q = c47.f492917a;
            c7021xf3e88cbf.f143375r = (int) c47.f492918b;
        }
        sq4.b bVar17 = (sq4.b) hashMap2.get("RemoteSourceTimeoutNoFrame");
        if (bVar17 != null) {
            sq4.c c48 = bVar17.c();
            c7021xf3e88cbf.f143378u = c48.f492917a;
            c7021xf3e88cbf.f143379v = (int) c48.f492918b;
        }
        sq4.b bVar18 = (sq4.b) hashMap2.get("LocalOnScreenTimeoutNoFrame");
        if (bVar18 != null) {
            sq4.c c49 = bVar18.c();
            c7021xf3e88cbf.f143376s = c49.f492917a;
            c7021xf3e88cbf.f143377t = (int) c49.f492918b;
        }
        sq4.b bVar19 = (sq4.b) hashMap2.get("RemoteOnScreenTimeoutNoFrame");
        if (bVar19 != null) {
            sq4.c c57 = bVar19.c();
            c7021xf3e88cbf.f143380w = c57.f492917a;
            c7021xf3e88cbf.f143381x = (int) c57.f492918b;
        }
        sq4.b bVar20 = (sq4.b) hashMap2.get("LocalTextureError");
        if (bVar20 != null) {
            bVar20.a();
        }
        sq4.b bVar21 = (sq4.b) hashMap2.get("LocalTextureError");
        if (bVar21 != null) {
            sq4.c c58 = bVar21.c();
            c7021xf3e88cbf.f143382y = c58.f492917a;
            c7021xf3e88cbf.f143383z = (int) c58.f492918b;
        }
        sq4.b bVar22 = (sq4.b) hashMap2.get("LocalDrawError");
        if (bVar22 != null) {
            bVar22.a();
        }
        sq4.b bVar23 = (sq4.b) hashMap2.get("LocalDrawError");
        if (bVar23 != null) {
            sq4.c c59 = bVar23.c();
            c7021xf3e88cbf.A = c59.f492917a;
            c7021xf3e88cbf.B = (int) c59.f492918b;
        }
        sq4.b bVar24 = (sq4.b) hashMap2.get("RemoteTextureError");
        if (bVar24 != null) {
            bVar24.a();
        }
        sq4.b bVar25 = (sq4.b) hashMap2.get("RemoteTextureError");
        if (bVar25 != null) {
            sq4.c c67 = bVar25.c();
            c7021xf3e88cbf.C = c67.f492917a;
            c7021xf3e88cbf.D = (int) c67.f492918b;
        }
        sq4.b bVar26 = (sq4.b) hashMap2.get("RemoteDrawError");
        if (bVar26 != null) {
            bVar26.a();
        }
        sq4.b bVar27 = (sq4.b) hashMap2.get("RemoteDrawError");
        if (bVar27 != null) {
            sq4.c c68 = bVar27.c();
            c7021xf3e88cbf.E = c68.f492917a;
            c7021xf3e88cbf.F = (int) c68.f492918b;
        }
        long currentTimeMillis = j19 == 0 ? 0L : java.lang.System.currentTimeMillis() - j19;
        long currentTimeMillis2 = j27 == 0 ? 0L : java.lang.System.currentTimeMillis() - j27;
        cl0.g gVar13 = new cl0.g();
        gVar13.o("total", this.f480546z);
        gVar13.o("less", this.f480544x);
        gVar13.o("serious", this.f480545y);
        long j28 = currentTimeMillis2;
        gVar13.p("lessTotal", this.f480542v);
        gVar13.p("lessSerious", this.f480543w);
        gVar13.p("totalTime", currentTimeMillis);
        java.lang.String gVar14 = gVar13.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar14, "toString(...)");
        c7021xf3e88cbf.G = c7021xf3e88cbf.b("LocalFrameInfo", r26.i0.t(gVar14, ",", str7, false), true);
        cl0.g gVar15 = new cl0.g();
        gVar15.o("count", this.f480537q);
        gVar15.o("less", this.f480535o);
        gVar15.o("serious", this.f480536p);
        long j29 = currentTimeMillis;
        gVar15.p("lessTotal", this.f480538r);
        gVar15.p("lessSerious", this.f480539s);
        gVar15.p("totalTime", j28);
        java.lang.String gVar16 = gVar15.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar16, "toString(...)");
        c7021xf3e88cbf.H = c7021xf3e88cbf.b("RemoteFrameInfo", r26.i0.t(gVar16, ",", str7, false), true);
        cl0.g gVar17 = new cl0.g();
        gVar17.o("total", this.D);
        gVar17.o("less", this.B);
        gVar17.o("serious", this.C);
        gVar17.p("lessTotal", this.E);
        gVar17.p("lessSerious", this.F);
        gVar17.p("totalTime", j28);
        java.lang.String gVar18 = gVar17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar18, "toString(...)");
        c7021xf3e88cbf.I = c7021xf3e88cbf.b("DecodeFrameInfo", r26.i0.t(gVar18, ",", str7, false), true);
        cl0.g gVar19 = new cl0.g();
        gVar19.o("total", this.f480520J);
        gVar19.o("less", this.H);
        gVar19.o("serious", this.I);
        gVar19.p("lessTotal", this.K);
        gVar19.p("lessSerious", this.L);
        gVar19.p("totalTime", j28);
        java.lang.String gVar20 = gVar19.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar20, "toString(...)");
        c7021xf3e88cbf.f143360J = c7021xf3e88cbf.b("EncodeFrameInfo", r26.i0.t(gVar20, ",", str7, false), true);
        c7021xf3e88cbf.f143364g = this.f480521a ? 0L : 1L;
        c7021xf3e88cbf.f143361d = j29;
        c7021xf3e88cbf.f143362e = java.lang.Math.max(100 - (hashMap2.size() * 20), 0);
        c7021xf3e88cbf.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258515a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "reportRender");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("localSourceNoFrameTimes", c7021xf3e88cbf.f143374q);
        jSONObject.put("localSourceNoFrameTotalTime", c7021xf3e88cbf.f143375r);
        jSONObject.put("localOnScreenNoFrameTimes", c7021xf3e88cbf.f143376s);
        jSONObject.put("localOnScreenNoFrameTotalTime", c7021xf3e88cbf.f143377t);
        jSONObject.put("remoteOnScreenNoFrameTimes", c7021xf3e88cbf.f143380w);
        jSONObject.put("remoteOnScreenNoFrameTotalTime", c7021xf3e88cbf.f143381x);
        jSONObject.put("remoteSourceNoFrameTimes", c7021xf3e88cbf.f143378u);
        jSONObject.put("remoteSourceNoFrameTotalTime", c7021xf3e88cbf.f143379v);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.s0.f258517c = jSONObject;
        s0Var.a();
    }

    public final java.lang.String b() {
        cl0.g gVar = new cl0.g();
        sq4.b bVar = (sq4.b) this.f480523c.get("EncoderSourceTimeoutNotFrame");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f492917a);
            gVar.p("total", c17.f492918b);
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String c() {
        java.util.HashMap hashMap;
        cl0.g gVar = new cl0.g();
        java.util.Iterator it = this.f480529i.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f480522b;
            if (!hasNext) {
                break;
            }
            android.util.Size size = (android.util.Size) it.next();
            sq4.b bVar = (sq4.b) hashMap.get("LocalTextureSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (bVar != null) {
                sq4.c c17 = bVar.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(size.getWidth());
                sb6.append('*');
                sb6.append(size.getHeight());
                gVar.h(sb6.toString(), q(size, c17.f492918b, c17.f492917a));
            }
        }
        cl0.g gVar2 = new cl0.g();
        for (android.util.Size size2 : this.f480530j) {
            sq4.b bVar2 = (sq4.b) hashMap.get("LocalDrawSizeChange_" + size2.getWidth() + '*' + size2.getHeight());
            if (bVar2 != null) {
                sq4.c c18 = bVar2.c();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(size2.getWidth());
                sb7.append('*');
                sb7.append(size2.getHeight());
                gVar2.h(sb7.toString(), q(size2, c18.f492918b, c18.f492917a));
            }
        }
        cl0.g gVar3 = new cl0.g();
        java.util.Iterator it6 = this.f480533m.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            sq4.b bVar3 = (sq4.b) hashMap.get("DrawLocalRotateChange" + intValue);
            if (bVar3 != null) {
                sq4.c c19 = bVar3.c();
                gVar3.h(java.lang.String.valueOf(intValue), r(intValue, c19.f492918b, c19.f492917a));
            }
        }
        cl0.g gVar4 = new cl0.g();
        java.lang.String gVar5 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
        gVar4.h("textureSize", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        gVar4.h("drawSize", r26.i0.t(gVar6, ",", ";", false));
        java.lang.String gVar7 = gVar3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar7, "toString(...)");
        gVar4.h(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, r26.i0.t(gVar7, ",", ";", false));
        java.lang.String gVar8 = gVar4.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar8, "toString(...)");
        return r26.i0.t(gVar8, ",", ";", false);
    }

    public final java.lang.String d() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get("LocalSourceTimeoutNoFrame");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f492917a);
            gVar.p("total", c17.f492918b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("LocalOnScreenTimeoutNoFrame");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f492917a);
            gVar2.p("total", c18.f492918b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        gVar3.h(ya.b.f77502x92235c1b, r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
        gVar3.h("screen", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String e() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get("LocalTextureError");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f492917a);
            gVar.p("total", c17.f492918b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("LocalDrawError");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f492917a);
            gVar2.p("total", c18.f492918b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        gVar3.h("texture", r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
        gVar3.h("draw", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String f() {
        java.util.HashMap hashMap;
        cl0.g gVar = new cl0.g();
        java.util.Iterator it = this.f480531k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f480522b;
            if (!hasNext) {
                break;
            }
            android.util.Size size = (android.util.Size) it.next();
            sq4.b bVar = (sq4.b) hashMap.get("RemoteTextureSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (bVar != null) {
                sq4.c c17 = bVar.c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(size.getWidth());
                sb6.append('*');
                sb6.append(size.getHeight());
                gVar.h(sb6.toString(), q(size, c17.f492918b, c17.f492917a));
            }
        }
        cl0.g gVar2 = new cl0.g();
        for (android.util.Size size2 : this.f480532l) {
            sq4.b bVar2 = (sq4.b) hashMap.get("RemoteDrawSizeChange_" + size2.getWidth() + '*' + size2.getHeight());
            if (bVar2 != null) {
                sq4.c c18 = bVar2.c();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(size2.getWidth());
                sb7.append('*');
                sb7.append(size2.getHeight());
                gVar2.h(sb7.toString(), q(size2, c18.f492918b, c18.f492917a));
            }
        }
        cl0.g gVar3 = new cl0.g();
        java.util.Iterator it6 = this.f480534n.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            sq4.b bVar3 = (sq4.b) hashMap.get("DrawRemoteRotateChange" + intValue);
            if (bVar3 != null) {
                sq4.c c19 = bVar3.c();
                gVar3.h(java.lang.String.valueOf(intValue), r(intValue, c19.f492918b, c19.f492917a));
            }
        }
        cl0.g gVar4 = new cl0.g();
        java.lang.String gVar5 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
        gVar4.h("textureSize", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        gVar4.h("drawSize", r26.i0.t(gVar6, ",", ";", false));
        java.lang.String gVar7 = gVar3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar7, "toString(...)");
        gVar4.h(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, r26.i0.t(gVar7, ",", ";", false));
        java.lang.String gVar8 = gVar4.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar8, "toString(...)");
        return r26.i0.t(gVar8, ",", ";", false);
    }

    public final java.lang.String g() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get("RemoteSourceTimeoutNoFrame");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f492917a);
            gVar.p("total", c17.f492918b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("RemoteOnScreenTimeoutNoFrame");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f492917a);
            gVar2.p("total", c18.f492918b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        gVar3.h(ya.b.f77502x92235c1b, r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
        gVar3.h("screen", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String h() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get("RemoteTextureError");
        if (bVar != null) {
            sq4.c c17 = bVar.c();
            gVar.o("times", c17.f492917a);
            gVar.p("total", c17.f492918b);
        }
        cl0.g gVar2 = new cl0.g();
        sq4.b bVar2 = (sq4.b) hashMap.get("RemoteDrawError");
        if (bVar2 != null) {
            sq4.c c18 = bVar2.c();
            gVar2.o("times", c18.f492917a);
            gVar2.p("total", c18.f492918b);
        }
        cl0.g gVar3 = new cl0.g();
        java.lang.String gVar4 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
        gVar3.h("texture", r26.i0.t(gVar4, ",", ";", false));
        java.lang.String gVar5 = gVar2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
        gVar3.h("draw", r26.i0.t(gVar5, ",", ";", false));
        java.lang.String gVar6 = gVar3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
        return r26.i0.t(gVar6, ",", ";", false);
    }

    public final java.lang.String i() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f480522b;
        sq4.b bVar = (sq4.b) hashMap.get("DecodeChangeHard");
        gVar.h("decodeHard", bVar != null ? java.lang.Long.valueOf(bVar.c().f492918b) : null);
        sq4.b bVar2 = (sq4.b) hashMap.get("DecodeChangeSoft");
        gVar.h("decodeSoft", bVar2 != null ? java.lang.Long.valueOf(bVar2.c().f492918b) : null);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final void j(boolean z17) {
        boolean z18 = false;
        if (z17) {
            if (this.A == 0) {
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.A = java.lang.System.currentTimeMillis();
            }
            long j17 = this.A;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            if (201 <= currentTimeMillis && currentTimeMillis < 500) {
                z18 = true;
            }
            if (z18) {
                this.f480544x++;
                this.f480542v += currentTimeMillis;
            } else if (currentTimeMillis > 500) {
                this.f480545y++;
                this.f480543w += currentTimeMillis;
            }
            this.f480546z++;
            this.A = java.lang.System.currentTimeMillis();
            return;
        }
        if (this.f480541u) {
            return;
        }
        if (this.f480540t == 0) {
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f480540t = java.lang.System.currentTimeMillis();
        }
        long j18 = this.f480540t;
        boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j18;
        if (201 <= currentTimeMillis2 && currentTimeMillis2 < 500) {
            z18 = true;
        }
        if (z18) {
            this.f480535o++;
            this.f480538r += currentTimeMillis2;
        } else if (currentTimeMillis2 > 500) {
            this.f480536p++;
            this.f480539s += currentTimeMillis2;
        }
        this.f480537q++;
        this.f480540t = java.lang.System.currentTimeMillis();
    }

    public final void k(android.util.Size size, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onRenderSizeChanged " + size.getWidth() + '*' + size.getHeight());
        if (size.getWidth() * size.getHeight() <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onDrawSizeError");
            long j17 = gq4.v.wi().f447516q;
            java.lang.String str2 = z17 ? "LocalDrawError" : "RemoteDrawError";
            java.util.HashMap hashMap = this.f480523c;
            sq4.b bVar = (sq4.b) hashMap.get(str2);
            if (bVar == null) {
                bVar = new sq4.b();
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bVar.d(java.lang.System.currentTimeMillis() - j17);
            bVar.f492906a = str2;
            hashMap.put(str2, bVar);
        }
        if (z17) {
            this.f480530j.add(size);
        } else {
            this.f480532l.add(size);
        }
        long j18 = gq4.v.wi().f447516q;
        if (z17) {
            str = "LocalDrawSizeChange_" + size.getWidth() + '*' + size.getHeight();
        } else {
            str = "RemoteDrawSizeChange_" + size.getWidth() + '*' + size.getHeight();
        }
        java.lang.String str3 = z17 ? this.f480526f : this.f480527g;
        java.util.HashMap hashMap2 = this.f480522b;
        sq4.b bVar2 = (sq4.b) hashMap2.get(str);
        if (bVar2 == null) {
            bVar2 = new sq4.b();
        }
        sq4.b bVar3 = (sq4.b) hashMap2.get(str3);
        if (bVar3 != null) {
            bVar3.b();
            hashMap2.put(str, bVar3);
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar2.d(java.lang.System.currentTimeMillis() - j18);
        bVar2.f(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(size.getWidth());
        sb6.append('*');
        sb6.append(size.getHeight());
        bVar2.g(sb6.toString());
        hashMap2.put(str, bVar2);
        if (z17) {
            this.f480526f = str;
        } else {
            this.f480527g = str;
        }
    }

    public final void l(android.util.Size size, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onTextureSizeChanged " + size.getWidth() + '*' + size.getHeight());
        if (size.getWidth() * size.getHeight() <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "onTextureSizeError");
            long j17 = gq4.v.wi().f447516q;
            java.lang.String str2 = z17 ? "LocalTextureError" : "RemoteTextureError";
            java.util.HashMap hashMap = this.f480523c;
            sq4.b bVar = (sq4.b) hashMap.get(str2);
            if (bVar == null) {
                bVar = new sq4.b();
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bVar.d(java.lang.System.currentTimeMillis() - j17);
            bVar.f492906a = str2;
            hashMap.put(str2, bVar);
        }
        if (z17) {
            this.f480529i.add(size);
        } else {
            this.f480531k.add(size);
        }
        long j18 = gq4.v.wi().f447516q;
        if (z17) {
            str = "LocalTextureSizeChange_" + size.getWidth() + '*' + size.getHeight();
        } else {
            str = "RemoteTextureSizeChange_" + size.getWidth() + '*' + size.getHeight();
        }
        java.lang.String str3 = z17 ? this.f480524d : this.f480525e;
        java.util.HashMap hashMap2 = this.f480522b;
        sq4.b bVar2 = (sq4.b) hashMap2.get(str);
        if (bVar2 == null) {
            bVar2 = new sq4.b();
        }
        sq4.b bVar3 = (sq4.b) hashMap2.get(str3);
        if (bVar3 != null) {
            bVar3.b();
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar2.d(java.lang.System.currentTimeMillis() - j18);
        bVar2.f(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(size.getWidth());
        sb6.append('*');
        sb6.append(size.getHeight());
        bVar2.g(sb6.toString());
        hashMap2.put(str, bVar2);
        if (z17) {
            this.f480524d = str;
        } else {
            this.f480525e = str;
        }
    }

    public final void m(boolean z17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeOutOnScreenNoFrameResume");
        java.lang.String str = z17 ? "LocalOnScreenTimeoutNoFrame" : "RemoteOnScreenTimeoutNoFrame";
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            return;
        }
        bVar.e(j17);
        bVar.f492909d += j17;
        bVar.f492907b++;
        hashMap.put(str, bVar);
    }

    public final void n(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeoutOffScreenNoFrame");
        long j17 = gq4.v.wi().f447516q;
        java.lang.String str = z17 ? "LocalSourceTimeoutNoFrame" : "RemoteSourceTimeoutNoFrame";
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            bVar = new sq4.b();
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar.d(java.lang.System.currentTimeMillis() - j17);
        bVar.f492906a = str;
        hashMap.put(str, bVar);
    }

    public final void o(boolean z17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeoutOffScreenNoFrameResume");
        java.lang.String str = z17 ? "LocalSourceTimeoutNoFrame" : "RemoteSourceTimeoutNoFrame";
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            return;
        }
        bVar.e(j17);
        bVar.f492909d += j17;
        bVar.f492907b++;
        hashMap.put(str, bVar);
    }

    public final void p(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderReport", "isLocal : " + z17 + "timeoutOnScreenNoFrame");
        long j17 = gq4.v.wi().f447516q;
        java.lang.String str = z17 ? "LocalOnScreenTimeoutNoFrame" : "RemoteOnScreenTimeoutNoFrame";
        java.util.HashMap hashMap = this.f480523c;
        sq4.b bVar = (sq4.b) hashMap.get(str);
        if (bVar == null) {
            bVar = new sq4.b();
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar.d(java.lang.System.currentTimeMillis() - j17);
        bVar.f492906a = str;
        hashMap.put(str, bVar);
    }

    public final java.lang.String q(android.util.Size size, long j17, int i17) {
        cl0.g gVar = new cl0.g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(size.getWidth());
        sb6.append('*');
        sb6.append(size.getHeight());
        gVar.h("size", sb6.toString());
        gVar.p("totalTime", j17);
        gVar.o("times", i17);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String r(int i17, long j17, int i18) {
        cl0.g gVar = new cl0.g();
        gVar.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, i17);
        gVar.p("totalTime", j17);
        gVar.o("times", i18);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }
}
