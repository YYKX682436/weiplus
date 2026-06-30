package bw5;

/* loaded from: classes8.dex */
public class h9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j9 f109655d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109656e;

    /* renamed from: f, reason: collision with root package name */
    public int f109657f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109659h;

    /* renamed from: i, reason: collision with root package name */
    public long f109660i;

    /* renamed from: m, reason: collision with root package name */
    public int f109661m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f109662n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f109658g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f109663o = new android.util.ArrayMap();

    static {
        new bw5.h9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.h9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h9)) {
            return false;
        }
        bw5.h9 h9Var = (bw5.h9) fVar;
        return n51.f.a(this.f109655d, h9Var.f109655d) && n51.f.a(this.f109656e, h9Var.f109656e) && n51.f.a(java.lang.Integer.valueOf(this.f109657f), java.lang.Integer.valueOf(h9Var.f109657f)) && n51.f.a(this.f109658g, h9Var.f109658g) && n51.f.a(java.lang.Boolean.valueOf(this.f109659h), java.lang.Boolean.valueOf(h9Var.f109659h)) && n51.f.a(java.lang.Long.valueOf(this.f109660i), java.lang.Long.valueOf(h9Var.f109660i)) && n51.f.a(java.lang.Integer.valueOf(this.f109661m), java.lang.Integer.valueOf(h9Var.f109661m)) && n51.f.a(this.f109662n, h9Var.f109662n);
    }

    /* renamed from: hasFieldNumber */
    public boolean m12054x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f109663o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.h9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109658g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f109655d != null && m12054x6e095e9(1)) {
                fVar.e(1, this.f109655d.f110410d);
            }
            if (this.f109656e != null && m12054x6e095e9(2)) {
                fVar.j(2, this.f109656e);
            }
            if (m12054x6e095e9(3)) {
                fVar.e(3, this.f109657f);
            }
            fVar.g(4, 8, linkedList);
            if (m12054x6e095e9(5)) {
                fVar.a(5, this.f109659h);
            }
            if (m12054x6e095e9(6)) {
                fVar.h(6, this.f109660i);
            }
            if (m12054x6e095e9(100)) {
                fVar.e(100, this.f109661m);
            }
            if (this.f109662n != null && m12054x6e095e9(101)) {
                fVar.j(101, this.f109662n);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f109655d != null && m12054x6e095e9(1)) {
                i18 = 0 + b36.f.e(1, this.f109655d.f110410d);
            }
            if (this.f109656e != null && m12054x6e095e9(2)) {
                i18 += b36.f.j(2, this.f109656e);
            }
            if (m12054x6e095e9(3)) {
                i18 += b36.f.e(3, this.f109657f);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            if (m12054x6e095e9(5)) {
                g17 += b36.f.a(5, this.f109659h);
            }
            if (m12054x6e095e9(6)) {
                g17 += b36.f.h(6, this.f109660i);
            }
            if (m12054x6e095e9(100)) {
                g17 += b36.f.e(100, this.f109661m);
            }
            return (this.f109662n == null || !m12054x6e095e9(101)) ? g17 : g17 + b36.f.j(101, this.f109662n);
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
        android.util.ArrayMap arrayMap = this.f109663o;
        if (intValue == 100) {
            this.f109661m = aVar2.g(intValue);
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 101) {
            this.f109662n = aVar2.k(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f109655d = bw5.j9.a(aVar2.g(intValue));
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f109656e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f109657f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.m9 m9Var = new bw5.m9();
                    if (bArr != null && bArr.length > 0) {
                        m9Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(m9Var);
                }
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f109659h = aVar2.c(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f109660i = aVar2.i(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
