package bw5;

/* loaded from: classes2.dex */
public class pg extends r45.mr5 {
    public bw5.kg A;
    public bw5.lg C;
    public bw5.pl D;
    public bw5.il E;
    public int F;
    public int G;
    public int H;
    public bw5.eo0 I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.f40 f113137J;
    public bw5.rd K;
    public int L;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g M;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g N;
    public java.lang.String P;
    public bw5.ng Q;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g R;
    public long S;
    public bw5.wv T;
    public bw5.mg U;
    public bw5.vg0 V;

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f113138d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113139e;

    /* renamed from: f, reason: collision with root package name */
    public long f113140f;

    /* renamed from: g, reason: collision with root package name */
    public float f113141g;

    /* renamed from: h, reason: collision with root package name */
    public float f113142h;

    /* renamed from: i, reason: collision with root package name */
    public int f113143i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113144m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113145n;

    /* renamed from: o, reason: collision with root package name */
    public int f113146o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f113147p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.nv f113148q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.zc f113149r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113150s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.hd f113151t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f113152u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f113153v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.jg f113154w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f113155x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113156y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.og f113157z;
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final boolean[] W = new boolean[59];

    static {
        new bw5.pg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pg mo11468x92b714fd(byte[] bArr) {
        return (bw5.pg) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pg)) {
            return false;
        }
        bw5.pg pgVar = (bw5.pg) fVar;
        return n51.f.a(this.f76494x2de60e5e, pgVar.f76494x2de60e5e) && n51.f.a(this.f113138d, pgVar.f113138d) && n51.f.a(this.f113139e, pgVar.f113139e) && n51.f.a(java.lang.Long.valueOf(this.f113140f), java.lang.Long.valueOf(pgVar.f113140f)) && n51.f.a(java.lang.Float.valueOf(this.f113141g), java.lang.Float.valueOf(pgVar.f113141g)) && n51.f.a(java.lang.Float.valueOf(this.f113142h), java.lang.Float.valueOf(pgVar.f113142h)) && n51.f.a(java.lang.Integer.valueOf(this.f113143i), java.lang.Integer.valueOf(pgVar.f113143i)) && n51.f.a(this.f113144m, pgVar.f113144m) && n51.f.a(this.f113145n, pgVar.f113145n) && n51.f.a(java.lang.Integer.valueOf(this.f113146o), java.lang.Integer.valueOf(pgVar.f113146o)) && n51.f.a(this.f113147p, pgVar.f113147p) && n51.f.a(this.f113148q, pgVar.f113148q) && n51.f.a(this.f113149r, pgVar.f113149r) && n51.f.a(this.f113150s, pgVar.f113150s) && n51.f.a(this.f113151t, pgVar.f113151t) && n51.f.a(this.f113152u, pgVar.f113152u) && n51.f.a(this.f113153v, pgVar.f113153v) && n51.f.a(this.f113154w, pgVar.f113154w) && n51.f.a(this.f113155x, pgVar.f113155x) && n51.f.a(this.f113156y, pgVar.f113156y) && n51.f.a(this.f113157z, pgVar.f113157z) && n51.f.a(this.A, pgVar.A) && n51.f.a(this.B, pgVar.B) && n51.f.a(this.C, pgVar.C) && n51.f.a(this.D, pgVar.D) && n51.f.a(this.E, pgVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(pgVar.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(pgVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(pgVar.H)) && n51.f.a(this.I, pgVar.I) && n51.f.a(this.f113137J, pgVar.f113137J) && n51.f.a(this.K, pgVar.K) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(pgVar.L)) && n51.f.a(this.M, pgVar.M) && n51.f.a(this.N, pgVar.N) && n51.f.a(this.P, pgVar.P) && n51.f.a(this.Q, pgVar.Q) && n51.f.a(this.R, pgVar.R) && n51.f.a(java.lang.Long.valueOf(this.S), java.lang.Long.valueOf(pgVar.S)) && n51.f.a(this.T, pgVar.T) && n51.f.a(this.U, pgVar.U) && n51.f.a(this.V, pgVar.V);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.W[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.W;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            bw5.sc scVar = this.f113138d;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.mo75928xcd1e8d8());
                this.f113138d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113139e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f113140f);
            }
            if (zArr[6]) {
                fVar.d(6, this.f113141g);
            }
            if (zArr[7]) {
                fVar.d(7, this.f113142h);
            }
            if (zArr[5]) {
                fVar.f(5, this.f113143i);
            }
            java.lang.String str = this.f113144m;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f113145n;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.f(10, this.f113146o);
            }
            java.lang.String str3 = this.f113147p;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            bw5.nv nvVar = this.f113148q;
            if (nvVar != null && zArr[12]) {
                fVar.i(12, nvVar.mo75928xcd1e8d8());
                this.f113148q.mo75956x3d5d1f78(fVar);
            }
            bw5.zc zcVar = this.f113149r;
            if (zcVar != null && zArr[13]) {
                fVar.i(13, zcVar.mo75928xcd1e8d8());
                this.f113149r.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113150s;
            if (gVar2 != null && zArr[14]) {
                fVar.b(14, gVar2);
            }
            bw5.hd hdVar = this.f113151t;
            if (hdVar != null && zArr[15]) {
                fVar.i(15, hdVar.mo75928xcd1e8d8());
                this.f113151t.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f113152u;
            if (str4 != null && zArr[16]) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f113153v;
            if (str5 != null && zArr[17]) {
                fVar.j(17, str5);
            }
            bw5.jg jgVar = this.f113154w;
            if (jgVar != null && zArr[18]) {
                fVar.i(18, jgVar.mo75928xcd1e8d8());
                this.f113154w.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f113155x;
            if (str6 != null && zArr[19]) {
                fVar.j(19, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f113156y;
            if (gVar3 != null && zArr[20]) {
                fVar.b(20, gVar3);
            }
            bw5.og ogVar = this.f113157z;
            if (ogVar != null && zArr[21]) {
                fVar.i(21, ogVar.mo75928xcd1e8d8());
                this.f113157z.mo75956x3d5d1f78(fVar);
            }
            bw5.kg kgVar = this.A;
            if (kgVar != null && zArr[22]) {
                fVar.i(22, kgVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.g(23, 8, this.B);
            bw5.lg lgVar = this.C;
            if (lgVar != null && zArr[24]) {
                fVar.i(24, lgVar.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            bw5.pl plVar = this.D;
            if (plVar != null && zArr[25]) {
                fVar.i(25, plVar.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.il ilVar = this.E;
            if (ilVar != null && zArr[26]) {
                fVar.i(26, ilVar.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            if (zArr[27]) {
                fVar.f(27, this.F);
            }
            if (zArr[28]) {
                fVar.f(28, this.G);
            }
            if (zArr[29]) {
                fVar.f(29, this.H);
            }
            bw5.eo0 eo0Var = this.I;
            if (eo0Var != null && zArr[30]) {
                fVar.i(30, eo0Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            bw5.f40 f40Var = this.f113137J;
            if (f40Var != null && zArr[31]) {
                fVar.i(31, f40Var.mo75928xcd1e8d8());
                this.f113137J.mo75956x3d5d1f78(fVar);
            }
            bw5.rd rdVar = this.K;
            if (rdVar != null && zArr[46]) {
                fVar.i(46, rdVar.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            if (zArr[47]) {
                fVar.f(47, this.L);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.M;
            if (gVar4 != null && zArr[48]) {
                fVar.b(48, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.N;
            if (gVar5 != null && zArr[49]) {
                fVar.b(49, gVar5);
            }
            java.lang.String str7 = this.P;
            if (str7 != null && zArr[50]) {
                fVar.j(50, str7);
            }
            bw5.ng ngVar = this.Q;
            if (ngVar != null && zArr[51]) {
                fVar.i(51, ngVar.mo75928xcd1e8d8());
                this.Q.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.R;
            if (gVar6 != null && zArr[52]) {
                fVar.b(52, gVar6);
            }
            if (zArr[55]) {
                fVar.h(55, this.S);
            }
            bw5.wv wvVar = this.T;
            if (wvVar != null && zArr[56]) {
                fVar.i(56, wvVar.mo75928xcd1e8d8());
                this.T.mo75956x3d5d1f78(fVar);
            }
            bw5.mg mgVar = this.U;
            if (mgVar != null && zArr[57]) {
                fVar.i(57, mgVar.mo75928xcd1e8d8());
                this.U.mo75956x3d5d1f78(fVar);
            }
            bw5.vg0 vg0Var = this.V;
            if (vg0Var != null && zArr[58]) {
                fVar.i(58, vg0Var.mo75928xcd1e8d8());
                this.V.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0;
            }
            bw5.sc scVar2 = this.f113138d;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f113139e;
            if (gVar7 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar7);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f113140f);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f113141g);
            }
            if (zArr[7]) {
                i18 += b36.f.d(7, this.f113142h);
            }
            if (zArr[5]) {
                i18 += b36.f.f(5, this.f113143i);
            }
            java.lang.String str8 = this.f113144m;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f113145n;
            if (str9 != null && zArr[9]) {
                i18 += b36.f.j(9, str9);
            }
            if (zArr[10]) {
                i18 += b36.f.f(10, this.f113146o);
            }
            java.lang.String str10 = this.f113147p;
            if (str10 != null && zArr[11]) {
                i18 += b36.f.j(11, str10);
            }
            bw5.nv nvVar2 = this.f113148q;
            if (nvVar2 != null && zArr[12]) {
                i18 += b36.f.i(12, nvVar2.mo75928xcd1e8d8());
            }
            bw5.zc zcVar2 = this.f113149r;
            if (zcVar2 != null && zArr[13]) {
                i18 += b36.f.i(13, zcVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f113150s;
            if (gVar8 != null && zArr[14]) {
                i18 += b36.f.b(14, gVar8);
            }
            bw5.hd hdVar2 = this.f113151t;
            if (hdVar2 != null && zArr[15]) {
                i18 += b36.f.i(15, hdVar2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f113152u;
            if (str11 != null && zArr[16]) {
                i18 += b36.f.j(16, str11);
            }
            java.lang.String str12 = this.f113153v;
            if (str12 != null && zArr[17]) {
                i18 += b36.f.j(17, str12);
            }
            bw5.jg jgVar2 = this.f113154w;
            if (jgVar2 != null && zArr[18]) {
                i18 += b36.f.i(18, jgVar2.mo75928xcd1e8d8());
            }
            java.lang.String str13 = this.f113155x;
            if (str13 != null && zArr[19]) {
                i18 += b36.f.j(19, str13);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar9 = this.f113156y;
            if (gVar9 != null && zArr[20]) {
                i18 += b36.f.b(20, gVar9);
            }
            bw5.og ogVar2 = this.f113157z;
            if (ogVar2 != null && zArr[21]) {
                i18 += b36.f.i(21, ogVar2.mo75928xcd1e8d8());
            }
            bw5.kg kgVar2 = this.A;
            if (kgVar2 != null && zArr[22]) {
                i18 += b36.f.i(22, kgVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(23, 8, this.B);
            bw5.lg lgVar2 = this.C;
            if (lgVar2 != null && zArr[24]) {
                g17 += b36.f.i(24, lgVar2.mo75928xcd1e8d8());
            }
            bw5.pl plVar2 = this.D;
            if (plVar2 != null && zArr[25]) {
                g17 += b36.f.i(25, plVar2.mo75928xcd1e8d8());
            }
            bw5.il ilVar2 = this.E;
            if (ilVar2 != null && zArr[26]) {
                g17 += b36.f.i(26, ilVar2.mo75928xcd1e8d8());
            }
            if (zArr[27]) {
                g17 += b36.f.f(27, this.F);
            }
            if (zArr[28]) {
                g17 += b36.f.f(28, this.G);
            }
            if (zArr[29]) {
                g17 += b36.f.f(29, this.H);
            }
            bw5.eo0 eo0Var2 = this.I;
            if (eo0Var2 != null && zArr[30]) {
                g17 += b36.f.i(30, eo0Var2.mo75928xcd1e8d8());
            }
            bw5.f40 f40Var2 = this.f113137J;
            if (f40Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, f40Var2.mo75928xcd1e8d8());
            }
            bw5.rd rdVar2 = this.K;
            if (rdVar2 != null && zArr[46]) {
                g17 += b36.f.i(46, rdVar2.mo75928xcd1e8d8());
            }
            if (zArr[47]) {
                g17 += b36.f.f(47, this.L);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar10 = this.M;
            if (gVar10 != null && zArr[48]) {
                g17 += b36.f.b(48, gVar10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar11 = this.N;
            if (gVar11 != null && zArr[49]) {
                g17 += b36.f.b(49, gVar11);
            }
            java.lang.String str14 = this.P;
            if (str14 != null && zArr[50]) {
                g17 += b36.f.j(50, str14);
            }
            bw5.ng ngVar2 = this.Q;
            if (ngVar2 != null && zArr[51]) {
                g17 += b36.f.i(51, ngVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar12 = this.R;
            if (gVar12 != null && zArr[52]) {
                g17 += b36.f.b(52, gVar12);
            }
            if (zArr[55]) {
                g17 += b36.f.h(55, this.S);
            }
            bw5.wv wvVar2 = this.T;
            if (wvVar2 != null && zArr[56]) {
                g17 += b36.f.i(56, wvVar2.mo75928xcd1e8d8());
            }
            bw5.mg mgVar2 = this.U;
            if (mgVar2 != null && zArr[57]) {
                g17 += b36.f.i(57, mgVar2.mo75928xcd1e8d8());
            }
            bw5.vg0 vg0Var2 = this.V;
            return (vg0Var2 == null || !zArr[58]) ? g17 : g17 + b36.f.i(58, vg0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.B.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76494x2de60e5e = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f113138d = scVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f113139e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113140f = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113143i = aVar2.h(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113141g = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113142h = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113144m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113145n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113146o = aVar2.h(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113147p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.nv nvVar3 = new bw5.nv();
                    if (bArr3 != null && bArr3.length > 0) {
                        nvVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f113148q = nvVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.zc zcVar3 = new bw5.zc();
                    if (bArr4 != null && bArr4.length > 0) {
                        zcVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f113149r = zcVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f113150s = aVar2.d(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.hd hdVar3 = new bw5.hd();
                    if (bArr5 != null && bArr5.length > 0) {
                        hdVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f113151t = hdVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f113152u = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f113153v = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.jg jgVar3 = new bw5.jg();
                    if (bArr6 != null && bArr6.length > 0) {
                        jgVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f113154w = jgVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f113155x = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f113156y = aVar2.d(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.og ogVar3 = new bw5.og();
                    if (bArr7 != null && bArr7.length > 0) {
                        ogVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f113157z = ogVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.kg kgVar3 = new bw5.kg();
                    if (bArr8 != null && bArr8.length > 0) {
                        kgVar3.mo11468x92b714fd(bArr8);
                    }
                    this.A = kgVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.jl0 jl0Var = new bw5.jl0();
                    if (bArr9 != null && bArr9.length > 0) {
                        jl0Var.mo11468x92b714fd(bArr9);
                    }
                    this.B.add(jl0Var);
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.lg lgVar3 = new bw5.lg();
                    if (bArr10 != null && bArr10.length > 0) {
                        lgVar3.mo11468x92b714fd(bArr10);
                    }
                    this.C = lgVar3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.pl plVar3 = new bw5.pl();
                    if (bArr11 != null && bArr11.length > 0) {
                        plVar3.mo11468x92b714fd(bArr11);
                    }
                    this.D = plVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.il ilVar3 = new bw5.il();
                    if (bArr12 != null && bArr12.length > 0) {
                        ilVar3.mo11468x92b714fd(bArr12);
                    }
                    this.E = ilVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
                this.F = aVar2.h(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.G = aVar2.h(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.H = aVar2.h(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.eo0 eo0Var3 = new bw5.eo0();
                    if (bArr13 != null && bArr13.length > 0) {
                        eo0Var3.mo11468x92b714fd(bArr13);
                    }
                    this.I = eo0Var3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.f40 f40Var3 = new bw5.f40();
                    if (bArr14 != null && bArr14.length > 0) {
                        f40Var3.mo11468x92b714fd(bArr14);
                    }
                    this.f113137J = f40Var3;
                }
                zArr[31] = true;
                return 0;
            default:
                switch (intValue) {
                    case 46:
                        java.util.LinkedList j59 = aVar2.j(intValue);
                        int size15 = j59.size();
                        for (int i67 = 0; i67 < size15; i67++) {
                            byte[] bArr15 = (byte[]) j59.get(i67);
                            bw5.rd rdVar3 = new bw5.rd();
                            if (bArr15 != null && bArr15.length > 0) {
                                rdVar3.mo11468x92b714fd(bArr15);
                            }
                            this.K = rdVar3;
                        }
                        zArr[46] = true;
                        return 0;
                    case 47:
                        this.L = aVar2.h(intValue);
                        zArr[47] = true;
                        return 0;
                    case 48:
                        this.M = aVar2.d(intValue);
                        zArr[48] = true;
                        return 0;
                    case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                        this.N = aVar2.d(intValue);
                        zArr[49] = true;
                        return 0;
                    case 50:
                        this.P = aVar2.k(intValue);
                        zArr[50] = true;
                        return 0;
                    case 51:
                        java.util.LinkedList j66 = aVar2.j(intValue);
                        int size16 = j66.size();
                        for (int i68 = 0; i68 < size16; i68++) {
                            byte[] bArr16 = (byte[]) j66.get(i68);
                            bw5.ng ngVar3 = new bw5.ng();
                            if (bArr16 != null && bArr16.length > 0) {
                                ngVar3.mo11468x92b714fd(bArr16);
                            }
                            this.Q = ngVar3;
                        }
                        zArr[51] = true;
                        return 0;
                    case 52:
                        this.R = aVar2.d(intValue);
                        zArr[52] = true;
                        return 0;
                    default:
                        switch (intValue) {
                            case 55:
                                this.S = aVar2.i(intValue);
                                zArr[55] = true;
                                return 0;
                            case 56:
                                java.util.LinkedList j67 = aVar2.j(intValue);
                                int size17 = j67.size();
                                for (int i69 = 0; i69 < size17; i69++) {
                                    byte[] bArr17 = (byte[]) j67.get(i69);
                                    bw5.wv wvVar3 = new bw5.wv();
                                    if (bArr17 != null && bArr17.length > 0) {
                                        wvVar3.mo11468x92b714fd(bArr17);
                                    }
                                    this.T = wvVar3;
                                }
                                zArr[56] = true;
                                return 0;
                            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                                java.util.LinkedList j68 = aVar2.j(intValue);
                                int size18 = j68.size();
                                for (int i76 = 0; i76 < size18; i76++) {
                                    byte[] bArr18 = (byte[]) j68.get(i76);
                                    bw5.mg mgVar3 = new bw5.mg();
                                    if (bArr18 != null && bArr18.length > 0) {
                                        mgVar3.mo11468x92b714fd(bArr18);
                                    }
                                    this.U = mgVar3;
                                }
                                zArr[57] = true;
                                return 0;
                            case 58:
                                java.util.LinkedList j69 = aVar2.j(intValue);
                                int size19 = j69.size();
                                for (int i77 = 0; i77 < size19; i77++) {
                                    byte[] bArr19 = (byte[]) j69.get(i77);
                                    bw5.vg0 vg0Var3 = new bw5.vg0();
                                    if (bArr19 != null && bArr19.length > 0) {
                                        vg0Var3.mo11468x92b714fd(bArr19);
                                    }
                                    this.V = vg0Var3;
                                }
                                zArr[58] = true;
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.W[1] = true;
        return this;
    }
}
