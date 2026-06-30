package bw5;

/* loaded from: classes2.dex */
public class cb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bb0 f107550d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.o50 f107551e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.xa0 f107552f;

    /* renamed from: g, reason: collision with root package name */
    public int f107553g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107554h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.q90 f107555i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.t40 f107556m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.s50 f107557n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f107558o = new boolean[10];

    static {
        new bw5.cb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.cb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cb0)) {
            return false;
        }
        bw5.cb0 cb0Var = (bw5.cb0) fVar;
        return n51.f.a(this.f107550d, cb0Var.f107550d) && n51.f.a(this.f107551e, cb0Var.f107551e) && n51.f.a(this.f107552f, cb0Var.f107552f) && n51.f.a(java.lang.Integer.valueOf(this.f107553g), java.lang.Integer.valueOf(cb0Var.f107553g)) && n51.f.a(this.f107554h, cb0Var.f107554h) && n51.f.a(this.f107555i, cb0Var.f107555i) && n51.f.a(this.f107556m, cb0Var.f107556m) && n51.f.a(this.f107557n, cb0Var.f107557n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107558o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bb0 bb0Var = this.f107550d;
            if (bb0Var != null && zArr[1]) {
                fVar.e(1, bb0Var.f107128d);
            }
            bw5.o50 o50Var = this.f107551e;
            if (o50Var != null && zArr[2]) {
                fVar.i(2, o50Var.mo75928xcd1e8d8());
                this.f107551e.mo75956x3d5d1f78(fVar);
            }
            bw5.xa0 xa0Var = this.f107552f;
            if (xa0Var != null && zArr[3]) {
                fVar.i(3, xa0Var.mo75928xcd1e8d8());
                this.f107552f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107553g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107554h;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            bw5.q90 q90Var = this.f107555i;
            if (q90Var != null && zArr[7]) {
                fVar.i(7, q90Var.mo75928xcd1e8d8());
                this.f107555i.mo75956x3d5d1f78(fVar);
            }
            bw5.t40 t40Var = this.f107556m;
            if (t40Var != null && zArr[8]) {
                fVar.i(8, t40Var.mo75928xcd1e8d8());
                this.f107556m.mo75956x3d5d1f78(fVar);
            }
            bw5.s50 s50Var = this.f107557n;
            if (s50Var != null && zArr[9]) {
                fVar.i(9, s50Var.mo75928xcd1e8d8());
                this.f107557n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.bb0 bb0Var2 = this.f107550d;
            if (bb0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bb0Var2.f107128d);
            }
            bw5.o50 o50Var2 = this.f107551e;
            if (o50Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, o50Var2.mo75928xcd1e8d8());
            }
            bw5.xa0 xa0Var2 = this.f107552f;
            if (xa0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, xa0Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f107553g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107554h;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            bw5.q90 q90Var2 = this.f107555i;
            if (q90Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, q90Var2.mo75928xcd1e8d8());
            }
            bw5.t40 t40Var2 = this.f107556m;
            if (t40Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, t40Var2.mo75928xcd1e8d8());
            }
            bw5.s50 s50Var2 = this.f107557n;
            return (s50Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, s50Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
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
                int g17 = aVar2.g(intValue);
                this.f107550d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.bb0.kCircleX : bw5.bb0.kAudioDiscover : bw5.bb0.kMusicDiscover : bw5.bb0.kCategory : bw5.bb0.kDefault;
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107551e = o50Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107552f = xa0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                this.f107553g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107554h = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.q90 q90Var3 = new bw5.q90();
                    if (bArr3 != null && bArr3.length > 0) {
                        q90Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f107555i = q90Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.t40 t40Var3 = new bw5.t40();
                    if (bArr4 != null && bArr4.length > 0) {
                        t40Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f107556m = t40Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.s50 s50Var3 = new bw5.s50();
                    if (bArr5 != null && bArr5.length > 0) {
                        s50Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f107557n = s50Var3;
                }
                zArr[9] = true;
                return 0;
        }
    }
}
