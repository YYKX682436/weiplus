package q33;

/* loaded from: classes2.dex */
public class b extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f441467d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f441468e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f441469f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f441470g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof q33.b)) {
            return false;
        }
        q33.b bVar = (q33.b) fVar;
        return n51.f.a(this.f76492x92037252, bVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f441467d), java.lang.Integer.valueOf(bVar.f441467d)) && n51.f.a(this.f441468e, bVar.f441468e) && n51.f.a(this.f441469f, bVar.f441469f) && n51.f.a(this.f441470g, bVar.f441470g);
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
            fVar.e(2, this.f441467d);
            java.lang.String str = this.f441468e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f441469f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f441470g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f441467d);
            java.lang.String str4 = this.f441468e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f441469f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f441470g;
            return str6 != null ? i18 + b36.f.j(5, str6) : i18;
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
        q33.b bVar = (q33.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
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
        }
        if (intValue == 2) {
            bVar.f441467d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f441468e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            bVar.f441469f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bVar.f441470g = aVar2.k(intValue);
        return 0;
    }
}
