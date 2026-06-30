package v2;

/* loaded from: classes15.dex */
public class j extends v2.t {

    /* renamed from: l0, reason: collision with root package name */
    public v2.s f514218l0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f514216j0 = false;

    /* renamed from: k0, reason: collision with root package name */
    public final u2.f f514217k0 = new u2.f();

    /* renamed from: m0, reason: collision with root package name */
    public int f514219m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public int f514220n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    public v2.d[] f514221o0 = new v2.d[4];

    /* renamed from: p0, reason: collision with root package name */
    public v2.d[] f514222p0 = new v2.d[4];

    /* renamed from: q0, reason: collision with root package name */
    public final java.util.List f514223q0 = new java.util.ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f514224r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f514225s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f514226t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public int f514227u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public int f514228v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public int f514229w0 = 7;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f514230x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f514231y0 = false;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f514232z0 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e0  */
    /* JADX WARN: Type inference failed for: r0v11, types: [v2.i] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [v2.i] */
    /* JADX WARN: Type inference failed for: r3v21 */
    @Override // v2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.j.A():void");
    }

    public void B(v2.i iVar, int i17) {
        if (i17 == 0) {
            int i18 = this.f514219m0 + 1;
            v2.d[] dVarArr = this.f514222p0;
            if (i18 >= dVarArr.length) {
                this.f514222p0 = (v2.d[]) java.util.Arrays.copyOf(dVarArr, dVarArr.length * 2);
            }
            v2.d[] dVarArr2 = this.f514222p0;
            int i19 = this.f514219m0;
            dVarArr2[i19] = new v2.d(iVar, 0, this.f514216j0);
            this.f514219m0 = i19 + 1;
            return;
        }
        if (i17 == 1) {
            int i27 = this.f514220n0 + 1;
            v2.d[] dVarArr3 = this.f514221o0;
            if (i27 >= dVarArr3.length) {
                this.f514221o0 = (v2.d[]) java.util.Arrays.copyOf(dVarArr3, dVarArr3.length * 2);
            }
            v2.d[] dVarArr4 = this.f514221o0;
            int i28 = this.f514220n0;
            dVarArr4[i28] = new v2.d(iVar, 1, this.f514216j0);
            this.f514220n0 = i28 + 1;
        }
    }

    public boolean C(u2.f fVar) {
        a(fVar);
        int size = this.f514273i0.size();
        for (int i17 = 0; i17 < size; i17++) {
            v2.i iVar = (v2.i) this.f514273i0.get(i17);
            boolean z17 = iVar instanceof v2.j;
            v2.h hVar = v2.h.WRAP_CONTENT;
            if (z17) {
                v2.h[] hVarArr = iVar.C;
                v2.h hVar2 = hVarArr[0];
                v2.h hVar3 = hVarArr[1];
                v2.h hVar4 = v2.h.FIXED;
                if (hVar2 == hVar) {
                    iVar.u(hVar4);
                }
                if (hVar3 == hVar) {
                    iVar.w(hVar4);
                }
                iVar.a(fVar);
                if (hVar2 == hVar) {
                    iVar.u(hVar2);
                }
                if (hVar3 == hVar) {
                    iVar.w(hVar3);
                }
            } else {
                v2.h[] hVarArr2 = this.C;
                v2.h hVar5 = hVarArr2[0];
                v2.h hVar6 = v2.h.MATCH_PARENT;
                if (hVar5 != hVar && iVar.C[0] == hVar6) {
                    v2.g gVar = iVar.f514208s;
                    int i18 = gVar.f514171e;
                    int l17 = l();
                    v2.g gVar2 = iVar.f514210u;
                    int i19 = l17 - gVar2.f514171e;
                    gVar.f514175i = fVar.j(gVar);
                    gVar2.f514175i = fVar.j(gVar2);
                    fVar.e(gVar.f514175i, i18);
                    fVar.e(gVar2.f514175i, i19);
                    iVar.f514182a = 2;
                    iVar.I = i18;
                    int i27 = i19 - i18;
                    iVar.E = i27;
                    int i28 = iVar.R;
                    if (i27 < i28) {
                        iVar.E = i28;
                    }
                }
                if (hVarArr2[1] != hVar && iVar.C[1] == hVar6) {
                    v2.g gVar3 = iVar.f514209t;
                    int i29 = gVar3.f514171e;
                    int h17 = h();
                    v2.g gVar4 = iVar.f514211v;
                    int i37 = h17 - gVar4.f514171e;
                    gVar3.f514175i = fVar.j(gVar3);
                    gVar4.f514175i = fVar.j(gVar4);
                    fVar.e(gVar3.f514175i, i29);
                    fVar.e(gVar4.f514175i, i37);
                    if (iVar.Q > 0 || iVar.Y == 8) {
                        v2.g gVar5 = iVar.f514212w;
                        u2.j j17 = fVar.j(gVar5);
                        gVar5.f514175i = j17;
                        fVar.e(j17, iVar.Q + i29);
                    }
                    iVar.f514184b = 2;
                    iVar.f514181J = i29;
                    int i38 = i37 - i29;
                    iVar.F = i38;
                    int i39 = iVar.S;
                    if (i38 < i39) {
                        iVar.F = i39;
                    }
                }
                iVar.a(fVar);
            }
        }
        if (this.f514219m0 > 0) {
            v2.c.a(this, fVar, 0);
        }
        if (this.f514220n0 > 0) {
            v2.c.a(this, fVar, 1);
        }
        return true;
    }

    public boolean D(int i17) {
        return (this.f514229w0 & i17) == i17;
    }

    public void E() {
        v2.o oVar = f(v2.f.LEFT).f514167a;
        v2.o oVar2 = f(v2.f.TOP).f514167a;
        oVar.k(null, 0.0f);
        oVar2.k(null, 0.0f);
    }

    @Override // v2.i
    public void c(int i17) {
        super.c(i17);
        int size = this.f514273i0.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((v2.i) this.f514273i0.get(i18)).c(i17);
        }
    }

    @Override // v2.t, v2.i
    public void p() {
        this.f514217k0.q();
        ((java.util.ArrayList) this.f514223q0).clear();
        this.f514230x0 = false;
        super.p();
    }
}
