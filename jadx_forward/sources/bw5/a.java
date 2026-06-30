package bw5;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.b f106476d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f106477e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106478f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f106479g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f106480h;

    /* renamed from: i, reason: collision with root package name */
    public int f106481i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f106482m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.c f106483n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f106484o = new boolean[9];

    static {
        new bw5.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a)) {
            return false;
        }
        bw5.a aVar = (bw5.a) fVar;
        return n51.f.a(this.f106476d, aVar.f106476d) && n51.f.a(this.f106477e, aVar.f106477e) && n51.f.a(this.f106478f, aVar.f106478f) && n51.f.a(this.f106479g, aVar.f106479g) && n51.f.a(java.lang.Boolean.valueOf(this.f106480h), java.lang.Boolean.valueOf(aVar.f106480h)) && n51.f.a(java.lang.Integer.valueOf(this.f106481i), java.lang.Integer.valueOf(aVar.f106481i)) && n51.f.a(this.f106482m, aVar.f106482m) && n51.f.a(this.f106483n, aVar.f106483n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f106484o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.b bVar = this.f106476d;
            if (bVar != null && zArr[1]) {
                fVar.e(1, bVar.f107000d);
            }
            java.lang.String str = this.f106477e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f106478f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f106479g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.a(5, this.f106480h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f106481i);
            }
            java.lang.String str4 = this.f106482m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.c cVar = this.f106483n;
            if (cVar != null && zArr[8]) {
                fVar.i(8, cVar.mo75928xcd1e8d8());
                this.f106483n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.b bVar2 = this.f106476d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bVar2.f107000d);
            }
            java.lang.String str5 = this.f106477e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f106478f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f106479g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f106480h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f106481i);
            }
            java.lang.String str8 = this.f106482m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            bw5.c cVar2 = this.f106483n;
            return (cVar2 == null || !zArr[8]) ? i18 : i18 + b36.f.i(8, cVar2.mo75928xcd1e8d8());
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
                this.f106476d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.b.AI_CHAT_ASR_RESULT_TYPE_LLM_POLLING_KEY : bw5.b.AI_CHAT_ASR_RESULT_TYPE_TEXT : bw5.b.AI_CHAT_ASR_RESULT_TYPE_UNKNOWN;
                zArr[1] = true;
                return 0;
            case 2:
                this.f106477e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f106478f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106479g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106480h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f106481i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f106482m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.c cVar3 = new bw5.c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.mo11468x92b714fd(bArr);
                    }
                    this.f106483n = cVar3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.a) super.mo11468x92b714fd(bArr);
    }
}
