package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask */
/* loaded from: classes9.dex */
public class C12236xd46e1713 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713> f34779x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u1();
    public java.lang.String A;
    public java.lang.String A1;
    public java.lang.String B1;
    public java.lang.String C1;
    public java.lang.String D;
    public java.lang.String D1;
    public java.lang.String E;
    public java.lang.String E1;
    public int F;
    public int F1;
    public java.lang.String G1;
    public java.lang.String H;
    public int H1;
    public java.lang.String I;
    public java.util.ArrayList I1;

    /* renamed from: J, reason: collision with root package name */
    public int f164594J;
    public java.lang.Runnable J1;
    public int K1;
    public java.lang.String L;
    public int L1;
    public java.lang.String M;
    public boolean M1;
    public java.lang.String N;
    public java.lang.String N1;
    public boolean O1;
    public java.lang.String P;
    public boolean Q;
    public int Q1;
    public boolean R;
    public int R1;
    public boolean S;
    public java.lang.String S1;
    public boolean T;
    public java.lang.String T1;
    public boolean U;
    public java.lang.String U1;
    public java.lang.String V;
    public int V1;
    public java.lang.String W;
    public int W1;
    public java.lang.String X;
    public java.util.ArrayList X1;
    public int Y;
    public int Z;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164595f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f164596g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164597h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f164598i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f164599l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f164600m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f164601n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f164602o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f164603p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f164604p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f164605p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f164606q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f164607r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f164608s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f164609t;

    /* renamed from: u, reason: collision with root package name */
    public int f164610u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f164611v;

    /* renamed from: w, reason: collision with root package name */
    public int f164612w;

    /* renamed from: x, reason: collision with root package name */
    public int f164613x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f164614x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f164615x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f164616y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f164617y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f164618y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f164619z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f164620z1;
    public int B = 1;
    public int C = 2;
    public int G = 0;
    public int K = 1000;
    public boolean P1 = false;

    public C12236xd46e1713() {
    }

    public static void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, ot0.q qVar, java.lang.String str, java.lang.String str2) {
        c12236xd46e1713.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageTask", "checkAddSignature thumbDataHash:%s, platformSignature:%s", str, str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        ot0.l lVar = new ot0.l();
        lVar.f430102d = str2;
        lVar.f430100b = str;
        qVar.f(lVar);
    }

    public final void C(ot0.q qVar, byte[] bArr, java.lang.String str, java.lang.StringBuilder sb6, int i17) {
        int i18;
        ot0.k1 a17 = ot0.j1.a();
        java.lang.String str2 = this.f164595f;
        java.lang.String str3 = this.f164597h;
        ((ez.w0) a17).getClass();
        android.util.Pair I = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, str2, str3, str, null, bArr);
        if (I.second != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
            long longValue = ((java.lang.Long) I.second).longValue();
            am.xz xzVar = c6194x6522023a.f136451g;
            xzVar.f89942a = longValue;
            xzVar.f89943b = 0;
            xzVar.f89944c = str;
            c6194x6522023a.e();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f164600m)) {
            ct.p2 p2Var = (ct.p2) i95.n0.c(ct.p2.class);
            java.lang.String str4 = this.f164600m;
            ((qg5.a) p2Var).getClass();
            java.util.HashMap a18 = com.p314xaae8f345.mm.ui.i1.a(str4);
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) || a18 == null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = str;
                mtVar.f88896b = this.f164600m;
                mtVar.f88897c = c01.e2.C(str);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
            } else if (w11.t1.a(str)) {
                w11.r1 a19 = w11.s1.a(str);
                a19.e(this.f164600m);
                a19.h(c01.e2.C(str));
                a19.f523664f = 1;
                a19.f523666h = a18;
                a19.b();
            } else {
                w11.r1 a27 = w11.s1.a(str);
                a27.g(str);
                a27.e(this.f164600m);
                a27.h(c01.e2.C(str));
                a27.f523664f = 1;
                a27.f523666h = a18;
                a27.f523667i = 5;
                a27.a().a();
            }
        }
        if (str.toLowerCase().endsWith("@chatroom")) {
            java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
            i18 = L0 != null ? ((java.util.LinkedList) L0).size() : 0;
        } else {
            i18 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.d(this.f164595f, i17, this.L, this.M, str, this.f164597h, this.f164609t, this.N, this.P, i18, sb6.toString(), this.X, this.Y, this.f164603p, this.Z, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? 2 : 1, this.f164619z);
    }

    public final void D(ot0.q qVar, byte[] bArr, java.lang.StringBuilder sb6, int i17, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, r45.wc7 wc7Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1118;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
        r45.gc7 gc7Var = new r45.gc7();
        gc7Var.f456632d = this.f164595f;
        java.util.LinkedList linkedList = new java.util.LinkedList(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f164601n.split(",")));
        gc7Var.f456633e = linkedList;
        gc7Var.f456635g = str;
        if (j91.c.a(this.S1)) {
            gc7Var.f456634f = false;
        } else {
            gc7Var.f456634f = z17;
        }
        gc7Var.f456636h = this.O1;
        gc7Var.f456637i = this.N1;
        gc7Var.f456638m = z18;
        gc7Var.f456639n = z18 ? 3 : 0;
        gc7Var.f456640o = wc7Var;
        boolean a17 = j91.c.a(this.S1);
        gc7Var.f456641p = a17;
        if (a17) {
            r45.bz bzVar = new r45.bz();
            if (k01.d.a(this.f164601n) <= 2) {
                bzVar.f452692d = 2;
            } else {
                bzVar.f452692d = 1;
            }
            bzVar.f452693e = this.V1;
            bzVar.f452694f = new java.util.LinkedList();
            bzVar.f452698m = this.W1;
            java.util.Iterator it = this.X1.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                java.util.LinkedList linkedList2 = bzVar.f452699n;
                r45.nt5 nt5Var = new r45.nt5();
                nt5Var.f463197d = str3;
                linkedList2.add(nt5Var);
            }
            try {
                cl0.e eVar = new cl0.e(this.U1);
                for (int i18 = 0; i18 < eVar.mo15056xbe0e3ae6(); i18++) {
                    java.lang.String mo15054x2fec8307 = eVar.mo15054x2fec8307(i18);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15054x2fec8307)) {
                        r45.hk4 hk4Var = new r45.hk4();
                        hk4Var.f457779e = mo15054x2fec8307;
                        bzVar.f452694f.add(hk4Var);
                    }
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendAppMessageTask", "parse participant json:%s fail", this.U1);
            }
            bzVar.f452695g = this.f164597h;
            bzVar.f452696h = this.f164596g;
            bzVar.f452697i = this.f164609t;
            gc7Var.f456642q = bzVar;
        }
        lVar.f152197a = gc7Var;
        lVar.f152198b = new r45.hc7();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t1(this, linkedList, qVar, i17, str2, bArr, sb6), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164595f = parcel.readString();
        this.f164596g = parcel.readString();
        this.f164597h = parcel.readString();
        this.f164598i = parcel.readString();
        this.f164600m = parcel.readString();
        this.f164601n = parcel.readString();
        this.f164602o = parcel.readString();
        this.f164609t = parcel.readString();
        this.f164613x = parcel.readInt();
        this.f164603p = parcel.readString();
        this.f164606q = parcel.readString();
        this.f164607r = parcel.readString();
        this.f164608s = parcel.readInt() == 1;
        this.f164610u = parcel.readInt();
        this.f164611v = parcel.readString();
        this.f164612w = parcel.readInt();
        this.f164616y = parcel.readString();
        this.f164594J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readByte() == 1;
        this.R = parcel.readInt() == 1;
        this.S = parcel.readInt() == 1;
        this.V = parcel.readString();
        this.T = parcel.readInt() == 1;
        this.W = parcel.readString();
        this.Y = parcel.readInt();
        this.X = parcel.readString();
        this.I1 = parcel.readArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713.class.getClassLoader());
        this.f164619z = parcel.readString();
        this.Z = parcel.readInt();
        this.C = parcel.readInt();
        this.A = parcel.readString();
        this.F = parcel.readInt();
        this.B = parcel.readInt();
        this.f164604p0 = parcel.readString();
        this.f164614x0 = parcel.readString();
        this.f164617y0 = parcel.readString();
        this.f164599l1 = parcel.readString();
        this.U = parcel.readInt() == 1;
        this.f164605p1 = parcel.readString();
        this.f164615x1 = parcel.readString();
        this.f164618y1 = parcel.readString();
        this.f164620z1 = parcel.readString();
        this.A1 = parcel.readString();
        this.B1 = parcel.readString();
        this.C1 = parcel.readString();
        this.D1 = parcel.readString();
        this.E1 = parcel.readString();
        this.F1 = parcel.readInt();
        this.G1 = parcel.readString();
        this.H1 = parcel.readInt();
        this.K1 = parcel.readInt();
        this.O1 = parcel.readInt() == 1;
        this.N1 = parcel.readString();
        this.P1 = parcel.readInt() == 1;
        this.G = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.Q1 = parcel.readInt();
        this.R1 = parcel.readInt();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.M1 = parcel.readInt() == 1;
        this.S1 = parcel.readString();
        this.U1 = parcel.readString();
        this.V1 = parcel.readInt();
        this.T1 = parcel.readString();
        this.X1 = parcel.readArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713.class.getClassLoader());
        this.L1 = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f164595f);
        parcel.writeString(this.f164596g);
        parcel.writeString(this.f164597h);
        parcel.writeString(this.f164598i);
        parcel.writeString(this.f164600m);
        parcel.writeString(this.f164601n);
        parcel.writeString(this.f164602o);
        parcel.writeString(this.f164609t);
        parcel.writeInt(this.f164613x);
        parcel.writeString(this.f164603p);
        parcel.writeString(this.f164606q);
        parcel.writeString(this.f164607r);
        parcel.writeInt(this.f164608s ? 1 : 0);
        parcel.writeInt(this.f164610u);
        parcel.writeString(this.f164611v);
        parcel.writeInt(this.f164612w);
        parcel.writeString(this.f164616y);
        parcel.writeInt(this.f164594J);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.P);
        parcel.writeByte(this.Q ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.S ? 1 : 0);
        parcel.writeString(this.V);
        parcel.writeInt(this.T ? 1 : 0);
        parcel.writeString(this.W);
        parcel.writeInt(this.Y);
        parcel.writeString(this.X);
        parcel.writeList(this.I1);
        parcel.writeString(this.f164619z);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.C);
        parcel.writeString(this.A);
        parcel.writeInt(this.F);
        parcel.writeInt(this.B);
        parcel.writeString(this.f164604p0);
        parcel.writeString(this.f164614x0);
        parcel.writeString(this.f164617y0);
        parcel.writeString(this.f164599l1);
        parcel.writeInt(this.U ? 1 : 0);
        parcel.writeString(this.f164605p1);
        parcel.writeString(this.f164615x1);
        parcel.writeString(this.f164618y1);
        parcel.writeString(this.f164620z1);
        parcel.writeString(this.A1);
        parcel.writeString(this.B1);
        parcel.writeString(this.C1);
        parcel.writeString(this.D1);
        parcel.writeString(this.E1);
        parcel.writeInt(this.F1);
        parcel.writeString(this.G1);
        parcel.writeInt(this.H1);
        parcel.writeInt(this.K1);
        parcel.writeInt(this.O1 ? 1 : 0);
        parcel.writeString(this.N1);
        parcel.writeInt(this.P1 ? 1 : 0);
        parcel.writeInt(this.G);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.Q1);
        parcel.writeInt(this.R1);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.M1 ? 1 : 0);
        parcel.writeString(this.S1);
        parcel.writeString(this.U1);
        parcel.writeInt(this.V1);
        parcel.writeString(this.T1);
        parcel.writeList(this.X1);
        parcel.writeInt(this.L1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.J1;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r) runnable).run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e6 A[LOOP:0: B:61:0x03e0->B:63:0x03e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020b  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713.z():void");
    }

    public C12236xd46e1713(android.os.Parcel parcel) {
        v(parcel);
    }
}
