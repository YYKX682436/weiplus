package r45;

/* loaded from: classes2.dex */
public class pk extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f464655d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464656e;

    /* renamed from: f, reason: collision with root package name */
    public int f464657f;

    /* renamed from: g, reason: collision with root package name */
    public int f464658g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pk)) {
            return false;
        }
        r45.pk pkVar = (r45.pk) fVar;
        return n51.f.a(this.f76494x2de60e5e, pkVar.f76494x2de60e5e) && n51.f.a(this.f464655d, pkVar.f464655d) && n51.f.a(this.f464656e, pkVar.f464656e) && n51.f.a(java.lang.Integer.valueOf(this.f464657f), java.lang.Integer.valueOf(pkVar.f464657f)) && n51.f.a(java.lang.Integer.valueOf(this.f464658g), java.lang.Integer.valueOf(pkVar.f464658g));
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
            fVar.g(2, 1, this.f464655d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f464656e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f464657f);
            fVar.e(5, this.f464658g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, this.f464655d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f464656e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f464657f) + b36.f.e(5, this.f464658g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f464655d.clear();
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
        r45.pk pkVar = (r45.pk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                pkVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            pkVar.f464655d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            pkVar.f464656e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            pkVar.f464657f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        pkVar.f464658g = aVar2.g(intValue);
        return 0;
    }
}
