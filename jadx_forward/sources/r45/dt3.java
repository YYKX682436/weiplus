package r45;

/* loaded from: classes7.dex */
public class dt3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.bc7 f454273d;

    /* renamed from: g, reason: collision with root package name */
    public int f454276g;

    /* renamed from: i, reason: collision with root package name */
    public r45.z50 f454278i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f454274e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f454275f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f454277h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dt3)) {
            return false;
        }
        r45.dt3 dt3Var = (r45.dt3) fVar;
        return n51.f.a(this.f76492x92037252, dt3Var.f76492x92037252) && n51.f.a(this.f454273d, dt3Var.f454273d) && n51.f.a(this.f454274e, dt3Var.f454274e) && n51.f.a(this.f454275f, dt3Var.f454275f) && n51.f.a(java.lang.Integer.valueOf(this.f454276g), java.lang.Integer.valueOf(dt3Var.f454276g)) && n51.f.a(this.f454277h, dt3Var.f454277h) && n51.f.a(this.f454278i, dt3Var.f454278i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454277h;
        java.util.LinkedList linkedList2 = this.f454275f;
        java.util.LinkedList linkedList3 = this.f454274e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.bc7 bc7Var = this.f454273d;
            if (bc7Var != null) {
                fVar.i(2, bc7Var.mo75928xcd1e8d8());
                this.f454273d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f454276g);
            fVar.g(6, 8, linkedList);
            r45.z50 z50Var = this.f454278i;
            if (z50Var != null) {
                fVar.i(7, z50Var.mo75928xcd1e8d8());
                this.f454278i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.bc7 bc7Var2 = this.f454273d;
            if (bc7Var2 != null) {
                i18 += b36.f.i(2, bc7Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f454276g) + b36.f.g(6, 8, linkedList);
            r45.z50 z50Var2 = this.f454278i;
            return z50Var2 != null ? g17 + b36.f.i(7, z50Var2.mo75928xcd1e8d8()) : g17;
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
        r45.dt3 dt3Var = (r45.dt3) objArr[1];
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
                    dt3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.bc7 bc7Var3 = new r45.bc7();
                    if (bArr3 != null && bArr3.length > 0) {
                        bc7Var3.mo11468x92b714fd(bArr3);
                    }
                    dt3Var.f454273d = bc7Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.pc7 pc7Var = new r45.pc7();
                    if (bArr4 != null && bArr4.length > 0) {
                        pc7Var.mo11468x92b714fd(bArr4);
                    }
                    dt3Var.f454274e.add(pc7Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.pc7 pc7Var2 = new r45.pc7();
                    if (bArr5 != null && bArr5.length > 0) {
                        pc7Var2.mo11468x92b714fd(bArr5);
                    }
                    dt3Var.f454275f.add(pc7Var2);
                }
                return 0;
            case 5:
                dt3Var.f454276g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.pc7 pc7Var3 = new r45.pc7();
                    if (bArr6 != null && bArr6.length > 0) {
                        pc7Var3.mo11468x92b714fd(bArr6);
                    }
                    dt3Var.f454277h.add(pc7Var3);
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.z50 z50Var3 = new r45.z50();
                    if (bArr7 != null && bArr7.length > 0) {
                        z50Var3.mo11468x92b714fd(bArr7);
                    }
                    dt3Var.f454278i = z50Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
