package bw5;

/* loaded from: classes2.dex */
public class oo0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f112707d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f112708e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112709f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112710g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112711h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.en0 f112712i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f112713m = new boolean[8];

    static {
        new bw5.oo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oo0)) {
            return false;
        }
        bw5.oo0 oo0Var = (bw5.oo0) fVar;
        return n51.f.a(this.f76494x2de60e5e, oo0Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f112707d), java.lang.Integer.valueOf(oo0Var.f112707d)) && n51.f.a(this.f112708e, oo0Var.f112708e) && n51.f.a(this.f112709f, oo0Var.f112709f) && n51.f.a(this.f112710g, oo0Var.f112710g) && n51.f.a(this.f112711h, oo0Var.f112711h) && n51.f.a(this.f112712i, oo0Var.f112712i);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f112713m[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.oo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112713m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112707d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f112708e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f112709f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f112710g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f112711h;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            bw5.en0 en0Var = this.f112712i;
            if (en0Var != null && zArr[7]) {
                fVar.i(7, en0Var.mo75928xcd1e8d8());
                this.f112712i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f112707d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f112708e;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f112709f;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f112710g;
            if (str5 != null && zArr[5]) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f112711h;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            bw5.en0 en0Var2 = this.f112712i;
            return (en0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, en0Var2.mo75928xcd1e8d8());
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
                this.f112707d = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112708e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112709f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112710g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112711h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.en0 en0Var3 = new bw5.en0();
                    if (bArr2 != null && bArr2.length > 0) {
                        en0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f112712i = en0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.oo0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f112713m[1] = true;
        return this;
    }
}
