package bo1;

/* loaded from: classes2.dex */
public class b extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f104511d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f104512e;

    /* renamed from: f, reason: collision with root package name */
    public int f104513f;

    /* renamed from: g, reason: collision with root package name */
    public int f104514g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f104515h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.b)) {
            return false;
        }
        bo1.b bVar = (bo1.b) fVar;
        return n51.f.a(this.f76492x92037252, bVar.f76492x92037252) && n51.f.a(this.f104511d, bVar.f104511d) && n51.f.a(this.f104512e, bVar.f104512e) && n51.f.a(java.lang.Integer.valueOf(this.f104513f), java.lang.Integer.valueOf(bVar.f104513f)) && n51.f.a(java.lang.Integer.valueOf(this.f104514g), java.lang.Integer.valueOf(bVar.f104514g)) && n51.f.a(this.f104515h, bVar.f104515h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f104511d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f104512e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f104513f);
            fVar.e(5, this.f104514g);
            java.lang.String str3 = this.f104515h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f104511d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f104512e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f104513f) + b36.f.e(5, this.f104514g);
            java.lang.String str6 = this.f104515h;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        bo1.b bVar = (bo1.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    bVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                bVar.f104511d = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f104512e = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f104513f = aVar2.g(intValue);
                return 0;
            case 5:
                bVar.f104514g = aVar2.g(intValue);
                return 0;
            case 6:
                bVar.f104515h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
