package r45;

/* loaded from: classes4.dex */
public class vi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.kj0 f469808d;

    /* renamed from: e, reason: collision with root package name */
    public int f469809e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f469810f = new java.util.LinkedList();

    static {
        new r45.vi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vi0 mo11468x92b714fd(byte[] bArr) {
        return (r45.vi0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vi0)) {
            return false;
        }
        r45.vi0 vi0Var = (r45.vi0) fVar;
        return n51.f.a(this.f469808d, vi0Var.f469808d) && n51.f.a(java.lang.Integer.valueOf(this.f469809e), java.lang.Integer.valueOf(vi0Var.f469809e)) && n51.f.a(this.f469810f, vi0Var.f469810f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.vi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469810f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.kj0 kj0Var = this.f469808d;
            if (kj0Var != null) {
                fVar.i(1, kj0Var.mo75928xcd1e8d8());
                this.f469808d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f469809e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.kj0 kj0Var2 = this.f469808d;
            return (kj0Var2 != null ? 0 + b36.f.i(1, kj0Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469809e) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.kj0 kj0Var3 = new r45.kj0();
                if (bArr != null && bArr.length > 0) {
                    kj0Var3.mo11468x92b714fd(bArr);
                }
                this.f469808d = kj0Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f469809e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ri0 ri0Var = new r45.ri0();
            if (bArr2 != null && bArr2.length > 0) {
                ri0Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(ri0Var);
        }
        return 0;
    }
}
