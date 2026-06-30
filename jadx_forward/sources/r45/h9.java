package r45;

/* loaded from: classes4.dex */
public class h9 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f457478d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f457479e;

    /* renamed from: f, reason: collision with root package name */
    public int f457480f;

    /* renamed from: g, reason: collision with root package name */
    public int f457481g;

    /* renamed from: h, reason: collision with root package name */
    public int f457482h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h9)) {
            return false;
        }
        r45.h9 h9Var = (r45.h9) fVar;
        return n51.f.a(this.f76492x92037252, h9Var.f76492x92037252) && n51.f.a(this.f457478d, h9Var.f457478d) && n51.f.a(java.lang.Boolean.valueOf(this.f457479e), java.lang.Boolean.valueOf(h9Var.f457479e)) && n51.f.a(java.lang.Integer.valueOf(this.f457480f), java.lang.Integer.valueOf(h9Var.f457480f)) && n51.f.a(java.lang.Integer.valueOf(this.f457481g), java.lang.Integer.valueOf(h9Var.f457481g)) && n51.f.a(java.lang.Integer.valueOf(this.f457482h), java.lang.Integer.valueOf(h9Var.f457482h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457478d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f457479e);
            fVar.e(4, this.f457480f);
            fVar.e(5, this.f457481g);
            fVar.e(6, this.f457482h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f457479e) + b36.f.e(4, this.f457480f) + b36.f.e(5, this.f457481g) + b36.f.e(6, this.f457482h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.h9 h9Var = (r45.h9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    h9Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ck ckVar = new r45.ck();
                    if (bArr3 != null && bArr3.length > 0) {
                        ckVar.mo11468x92b714fd(bArr3);
                    }
                    h9Var.f457478d.add(ckVar);
                }
                return 0;
            case 3:
                h9Var.f457479e = aVar2.c(intValue);
                return 0;
            case 4:
                h9Var.f457480f = aVar2.g(intValue);
                return 0;
            case 5:
                h9Var.f457481g = aVar2.g(intValue);
                return 0;
            case 6:
                h9Var.f457482h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
