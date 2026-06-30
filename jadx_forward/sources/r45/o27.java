package r45;

/* loaded from: classes9.dex */
public class o27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463385d;

    /* renamed from: e, reason: collision with root package name */
    public long f463386e;

    /* renamed from: f, reason: collision with root package name */
    public int f463387f;

    /* renamed from: g, reason: collision with root package name */
    public int f463388g;

    /* renamed from: h, reason: collision with root package name */
    public int f463389h;

    /* renamed from: i, reason: collision with root package name */
    public int f463390i;

    /* renamed from: m, reason: collision with root package name */
    public int f463391m;

    /* renamed from: n, reason: collision with root package name */
    public int f463392n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f463393o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o27)) {
            return false;
        }
        r45.o27 o27Var = (r45.o27) fVar;
        return n51.f.a(this.f76494x2de60e5e, o27Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f463385d), java.lang.Integer.valueOf(o27Var.f463385d)) && n51.f.a(java.lang.Long.valueOf(this.f463386e), java.lang.Long.valueOf(o27Var.f463386e)) && n51.f.a(java.lang.Integer.valueOf(this.f463387f), java.lang.Integer.valueOf(o27Var.f463387f)) && n51.f.a(java.lang.Integer.valueOf(this.f463388g), java.lang.Integer.valueOf(o27Var.f463388g)) && n51.f.a(java.lang.Integer.valueOf(this.f463389h), java.lang.Integer.valueOf(o27Var.f463389h)) && n51.f.a(java.lang.Integer.valueOf(this.f463390i), java.lang.Integer.valueOf(o27Var.f463390i)) && n51.f.a(java.lang.Integer.valueOf(this.f463391m), java.lang.Integer.valueOf(o27Var.f463391m)) && n51.f.a(java.lang.Integer.valueOf(this.f463392n), java.lang.Integer.valueOf(o27Var.f463392n)) && n51.f.a(this.f463393o, o27Var.f463393o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463385d);
            fVar.h(3, this.f463386e);
            fVar.e(4, this.f463387f);
            fVar.e(5, this.f463388g);
            fVar.e(6, this.f463389h);
            fVar.e(7, this.f463390i);
            fVar.e(8, this.f463391m);
            fVar.e(9, this.f463392n);
            r45.cu5 cu5Var = this.f463393o;
            if (cu5Var != null) {
                fVar.i(10, cu5Var.mo75928xcd1e8d8());
                this.f463393o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463385d) + b36.f.h(3, this.f463386e) + b36.f.e(4, this.f463387f) + b36.f.e(5, this.f463388g) + b36.f.e(6, this.f463389h) + b36.f.e(7, this.f463390i) + b36.f.e(8, this.f463391m) + b36.f.e(9, this.f463392n);
            r45.cu5 cu5Var2 = this.f463393o;
            return cu5Var2 != null ? i18 + b36.f.i(10, cu5Var2.mo75928xcd1e8d8()) : i18;
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
        r45.o27 o27Var = (r45.o27) objArr[1];
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
                    o27Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                o27Var.f463385d = aVar2.g(intValue);
                return 0;
            case 3:
                o27Var.f463386e = aVar2.i(intValue);
                return 0;
            case 4:
                o27Var.f463387f = aVar2.g(intValue);
                return 0;
            case 5:
                o27Var.f463388g = aVar2.g(intValue);
                return 0;
            case 6:
                o27Var.f463389h = aVar2.g(intValue);
                return 0;
            case 7:
                o27Var.f463390i = aVar2.g(intValue);
                return 0;
            case 8:
                o27Var.f463391m = aVar2.g(intValue);
                return 0;
            case 9:
                o27Var.f463392n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    o27Var.f463393o = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
