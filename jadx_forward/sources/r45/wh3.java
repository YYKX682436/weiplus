package r45;

/* loaded from: classes2.dex */
public class wh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f470689d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470690e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470691f;

    static {
        new r45.wh3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wh3)) {
            return false;
        }
        r45.wh3 wh3Var = (r45.wh3) fVar;
        return n51.f.a(this.f76494x2de60e5e, wh3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f470689d), java.lang.Integer.valueOf(wh3Var.f470689d)) && n51.f.a(this.f470690e, wh3Var.f470690e) && n51.f.a(this.f470691f, wh3Var.f470691f);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f76494x2de60e5e;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.wh3();
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
            fVar.e(2, this.f470689d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470690e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470691f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f470689d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f470690e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f470691f;
            return gVar4 != null ? i18 + b36.f.b(4, gVar4) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f470689d = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.f470690e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f470691f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.mo11468x92b714fd(bArr);
            }
            this.f76494x2de60e5e = heVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.wh3) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        return this;
    }
}
