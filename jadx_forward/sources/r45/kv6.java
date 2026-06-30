package r45;

/* loaded from: classes2.dex */
public class kv6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f460518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460519e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460520f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460521g;

    /* renamed from: h, reason: collision with root package name */
    public long f460522h;

    /* renamed from: i, reason: collision with root package name */
    public r45.tg4 f460523i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kv6)) {
            return false;
        }
        r45.kv6 kv6Var = (r45.kv6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f460518d), java.lang.Long.valueOf(kv6Var.f460518d)) && n51.f.a(this.f460519e, kv6Var.f460519e) && n51.f.a(this.f460520f, kv6Var.f460520f) && n51.f.a(this.f460521g, kv6Var.f460521g) && n51.f.a(java.lang.Long.valueOf(this.f460522h), java.lang.Long.valueOf(kv6Var.f460522h)) && n51.f.a(this.f460523i, kv6Var.f460523i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f460518d);
            java.lang.String str = this.f460519e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460520f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f460521g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f460522h);
            r45.tg4 tg4Var = this.f460523i;
            if (tg4Var != null) {
                fVar.i(6, tg4Var.mo75928xcd1e8d8());
                this.f460523i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f460518d) + 0;
            java.lang.String str4 = this.f460519e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f460520f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f460521g;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            int h18 = h17 + b36.f.h(5, this.f460522h);
            r45.tg4 tg4Var2 = this.f460523i;
            return tg4Var2 != null ? h18 + b36.f.i(6, tg4Var2.mo75928xcd1e8d8()) : h18;
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
        r45.kv6 kv6Var = (r45.kv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kv6Var.f460518d = aVar2.i(intValue);
                return 0;
            case 2:
                kv6Var.f460519e = aVar2.k(intValue);
                return 0;
            case 3:
                kv6Var.f460520f = aVar2.k(intValue);
                return 0;
            case 4:
                kv6Var.f460521g = aVar2.k(intValue);
                return 0;
            case 5:
                kv6Var.f460522h = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.tg4 tg4Var3 = new r45.tg4();
                    if (bArr != null && bArr.length > 0) {
                        tg4Var3.mo11468x92b714fd(bArr);
                    }
                    kv6Var.f460523i = tg4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
