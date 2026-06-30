package r45;

/* loaded from: classes7.dex */
public class ov extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f464067e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f464068f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.wf5 f464069g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wf5 f464070h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ov)) {
            return false;
        }
        r45.ov ovVar = (r45.ov) fVar;
        return n51.f.a(this.f76492x92037252, ovVar.f76492x92037252) && n51.f.a(this.f464066d, ovVar.f464066d) && n51.f.a(java.lang.Boolean.valueOf(this.f464067e), java.lang.Boolean.valueOf(ovVar.f464067e)) && n51.f.a(this.f464068f, ovVar.f464068f) && n51.f.a(this.f464069g, ovVar.f464069g) && n51.f.a(this.f464070h, ovVar.f464070h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464068f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f464066d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f464067e);
            fVar.g(4, 8, linkedList);
            r45.wf5 wf5Var = this.f464069g;
            if (wf5Var != null) {
                fVar.i(5, wf5Var.mo75928xcd1e8d8());
                this.f464069g.mo75956x3d5d1f78(fVar);
            }
            r45.wf5 wf5Var2 = this.f464070h;
            if (wf5Var2 != null) {
                fVar.i(6, wf5Var2.mo75928xcd1e8d8());
                this.f464070h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f464066d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int a17 = i18 + b36.f.a(3, this.f464067e) + b36.f.g(4, 8, linkedList);
            r45.wf5 wf5Var3 = this.f464069g;
            if (wf5Var3 != null) {
                a17 += b36.f.i(5, wf5Var3.mo75928xcd1e8d8());
            }
            r45.wf5 wf5Var4 = this.f464070h;
            return wf5Var4 != null ? a17 + b36.f.i(6, wf5Var4.mo75928xcd1e8d8()) : a17;
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
        r45.ov ovVar = (r45.ov) objArr[1];
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
                    ovVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ovVar.f464066d = aVar2.k(intValue);
                return 0;
            case 3:
                ovVar.f464067e = aVar2.c(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hg5 hg5Var = new r45.hg5();
                    if (bArr3 != null && bArr3.length > 0) {
                        hg5Var.mo11468x92b714fd(bArr3);
                    }
                    ovVar.f464068f.add(hg5Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wf5 wf5Var5 = new r45.wf5();
                    if (bArr4 != null && bArr4.length > 0) {
                        wf5Var5.mo11468x92b714fd(bArr4);
                    }
                    ovVar.f464069g = wf5Var5;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.wf5 wf5Var6 = new r45.wf5();
                    if (bArr5 != null && bArr5.length > 0) {
                        wf5Var6.mo11468x92b714fd(bArr5);
                    }
                    ovVar.f464070h = wf5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
