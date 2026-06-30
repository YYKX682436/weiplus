package bw5;

/* loaded from: classes2.dex */
public class em0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f108487d;

    /* renamed from: e, reason: collision with root package name */
    public long f108488e;

    /* renamed from: f, reason: collision with root package name */
    public long f108489f;

    /* renamed from: g, reason: collision with root package name */
    public int f108490g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f108491h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f108492i = new boolean[7];

    static {
        new bw5.em0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.em0)) {
            return false;
        }
        bw5.em0 em0Var = (bw5.em0) fVar;
        return n51.f.a(this.f76494x2de60e5e, em0Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f108487d), java.lang.Long.valueOf(em0Var.f108487d)) && n51.f.a(java.lang.Long.valueOf(this.f108488e), java.lang.Long.valueOf(em0Var.f108488e)) && n51.f.a(java.lang.Long.valueOf(this.f108489f), java.lang.Long.valueOf(em0Var.f108489f)) && n51.f.a(java.lang.Integer.valueOf(this.f108490g), java.lang.Integer.valueOf(em0Var.f108490g)) && n51.f.a(this.f108491h, em0Var.f108491h);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f108492i[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.em0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108491h;
        int i18 = 0;
        boolean[] zArr = this.f108492i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f108487d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f108488e);
            }
            if (zArr[4]) {
                fVar.h(4, this.f108489f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108490g);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f108487d);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f108488e);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f108489f);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f108490g);
            }
            return i18 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f108487d = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108488e = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108489f = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108490g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.rm0 rm0Var = new bw5.rm0();
                    if (bArr2 != null && bArr2.length > 0) {
                        rm0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(rm0Var);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.em0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f108492i[1] = true;
        return this;
    }
}
