package ks3;

/* loaded from: classes4.dex */
public class o1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f393261d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f393262e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f393263f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f393264g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f393265h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.o1)) {
            return false;
        }
        ks3.o1 o1Var = (ks3.o1) fVar;
        return n51.f.a(this.f76492x92037252, o1Var.f76492x92037252) && n51.f.a(this.f393261d, o1Var.f393261d) && n51.f.a(this.f393262e, o1Var.f393262e) && n51.f.a(this.f393263f, o1Var.f393263f) && n51.f.a(java.lang.Long.valueOf(this.f393264g), java.lang.Long.valueOf(o1Var.f393264g)) && n51.f.a(java.lang.Boolean.valueOf(this.f393265h), java.lang.Boolean.valueOf(o1Var.f393265h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f393263f;
        java.util.LinkedList linkedList2 = this.f393262e;
        java.util.LinkedList linkedList3 = this.f393261d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList3);
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            fVar.h(5, this.f393264g);
            fVar.a(6, this.f393265h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList3) + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList) + b36.f.h(5, this.f393264g) + b36.f.a(6, this.f393265h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        ks3.o1 o1Var = (ks3.o1) objArr[1];
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
                    o1Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    ks3.x0 x0Var = new ks3.x0();
                    if (bArr3 != null && bArr3.length > 0) {
                        x0Var.mo11468x92b714fd(bArr3);
                    }
                    o1Var.f393261d.add(x0Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    ks3.x0 x0Var2 = new ks3.x0();
                    if (bArr4 != null && bArr4.length > 0) {
                        x0Var2.mo11468x92b714fd(bArr4);
                    }
                    o1Var.f393262e.add(x0Var2);
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    ks3.x0 x0Var3 = new ks3.x0();
                    if (bArr5 != null && bArr5.length > 0) {
                        x0Var3.mo11468x92b714fd(bArr5);
                    }
                    o1Var.f393263f.add(x0Var3);
                }
                return 0;
            case 5:
                o1Var.f393264g = aVar2.i(intValue);
                return 0;
            case 6:
                o1Var.f393265h = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
