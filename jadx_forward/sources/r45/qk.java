package r45;

/* loaded from: classes8.dex */
public class qk extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f465596d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465597e;

    /* renamed from: f, reason: collision with root package name */
    public int f465598f;

    /* renamed from: g, reason: collision with root package name */
    public int f465599g;

    /* renamed from: h, reason: collision with root package name */
    public int f465600h;

    /* renamed from: i, reason: collision with root package name */
    public int f465601i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qk)) {
            return false;
        }
        r45.qk qkVar = (r45.qk) fVar;
        return n51.f.a(this.f76492x92037252, qkVar.f76492x92037252) && n51.f.a(this.f465596d, qkVar.f465596d) && n51.f.a(this.f465597e, qkVar.f465597e) && n51.f.a(java.lang.Integer.valueOf(this.f465598f), java.lang.Integer.valueOf(qkVar.f465598f)) && n51.f.a(java.lang.Integer.valueOf(this.f465599g), java.lang.Integer.valueOf(qkVar.f465599g)) && n51.f.a(java.lang.Integer.valueOf(this.f465600h), java.lang.Integer.valueOf(qkVar.f465600h)) && n51.f.a(java.lang.Integer.valueOf(this.f465601i), java.lang.Integer.valueOf(qkVar.f465601i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465596d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465597e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f465598f);
            fVar.e(5, this.f465599g);
            fVar.e(7, this.f465600h);
            fVar.e(8, this.f465601i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465597e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f465598f) + b36.f.e(5, this.f465599g) + b36.f.e(7, this.f465600h) + b36.f.e(8, this.f465601i);
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
        r45.qk qkVar = (r45.qk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    qkVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.lk lkVar = new r45.lk();
                    if (bArr3 != null && bArr3.length > 0) {
                        lkVar.mo11468x92b714fd(bArr3);
                    }
                    qkVar.f465596d.add(lkVar);
                }
                return 0;
            case 3:
                qkVar.f465597e = aVar2.d(intValue);
                return 0;
            case 4:
                qkVar.f465598f = aVar2.g(intValue);
                return 0;
            case 5:
                qkVar.f465599g = aVar2.g(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                qkVar.f465600h = aVar2.g(intValue);
                return 0;
            case 8:
                qkVar.f465601i = aVar2.g(intValue);
                return 0;
        }
    }
}
