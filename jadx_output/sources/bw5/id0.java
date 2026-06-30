package bw5;

/* loaded from: classes2.dex */
public class id0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28539d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28540e;

    /* renamed from: f, reason: collision with root package name */
    public long f28541f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28542g;

    /* renamed from: h, reason: collision with root package name */
    public int f28543h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28544i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f28545m;

    /* renamed from: n, reason: collision with root package name */
    public int f28546n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.zc0 f28547o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ad0 f28548p;

    /* renamed from: q, reason: collision with root package name */
    public int f28549q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.wc0 f28550r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f28551s;

    /* renamed from: t, reason: collision with root package name */
    public int f28552t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28553u;

    /* renamed from: v, reason: collision with root package name */
    public int f28554v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f28555w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.hd0 f28556x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28557y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.ArrayMap f28558z = new android.util.ArrayMap();

    static {
        new bw5.id0();
    }

    public bw5.zc0 b() {
        return hasFieldNumber(101) ? this.f28547o : new bw5.zc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.id0 parseFrom(byte[] bArr) {
        return (bw5.id0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.id0)) {
            return false;
        }
        bw5.id0 id0Var = (bw5.id0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28539d), java.lang.Integer.valueOf(id0Var.f28539d)) && n51.f.a(this.f28540e, id0Var.f28540e) && n51.f.a(java.lang.Long.valueOf(this.f28541f), java.lang.Long.valueOf(id0Var.f28541f)) && n51.f.a(java.lang.Boolean.valueOf(this.f28542g), java.lang.Boolean.valueOf(id0Var.f28542g)) && n51.f.a(java.lang.Integer.valueOf(this.f28543h), java.lang.Integer.valueOf(id0Var.f28543h)) && n51.f.a(this.f28544i, id0Var.f28544i) && n51.f.a(this.f28545m, id0Var.f28545m) && n51.f.a(java.lang.Integer.valueOf(this.f28546n), java.lang.Integer.valueOf(id0Var.f28546n)) && n51.f.a(this.f28547o, id0Var.f28547o) && n51.f.a(this.f28548p, id0Var.f28548p) && n51.f.a(java.lang.Integer.valueOf(this.f28549q), java.lang.Integer.valueOf(id0Var.f28549q)) && n51.f.a(this.f28550r, id0Var.f28550r) && n51.f.a(java.lang.Boolean.valueOf(this.f28551s), java.lang.Boolean.valueOf(id0Var.f28551s)) && n51.f.a(java.lang.Integer.valueOf(this.f28552t), java.lang.Integer.valueOf(id0Var.f28552t)) && n51.f.a(java.lang.Boolean.valueOf(this.f28553u), java.lang.Boolean.valueOf(id0Var.f28553u)) && n51.f.a(java.lang.Integer.valueOf(this.f28554v), java.lang.Integer.valueOf(id0Var.f28554v)) && n51.f.a(java.lang.Boolean.valueOf(this.f28555w), java.lang.Boolean.valueOf(id0Var.f28555w)) && n51.f.a(this.f28556x, id0Var.f28556x) && n51.f.a(java.lang.Boolean.valueOf(this.f28557y), java.lang.Boolean.valueOf(id0Var.f28557y));
    }

    public bw5.id0 d(int i17) {
        this.f28539d = i17;
        this.f28558z.put(1, java.lang.Boolean.TRUE);
        return this;
    }

    public bw5.id0 e(bw5.zc0 zc0Var) {
        this.f28547o = zc0Var;
        this.f28558z.put(101, java.lang.Boolean.TRUE);
        return this;
    }

    public bw5.id0 f(java.lang.String str) {
        this.f28540e = str;
        this.f28558z.put(2, java.lang.Boolean.TRUE);
        return this;
    }

    public bw5.id0 g(int i17) {
        this.f28552t = i17;
        this.f28558z.put(2001, java.lang.Boolean.TRUE);
        return this;
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f28558z.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.id0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.e(1, this.f28539d);
            }
            if (this.f28540e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f28540e);
            }
            if (hasFieldNumber(3)) {
                fVar.h(3, this.f28541f);
            }
            if (hasFieldNumber(4)) {
                fVar.a(4, this.f28542g);
            }
            if (hasFieldNumber(50)) {
                fVar.e(50, this.f28543h);
            }
            if (this.f28544i != null && hasFieldNumber(51)) {
                fVar.j(51, this.f28544i);
            }
            if (this.f28545m != null && hasFieldNumber(99)) {
                fVar.j(99, this.f28545m);
            }
            if (hasFieldNumber(100)) {
                fVar.e(100, this.f28546n);
            }
            if (this.f28547o != null && hasFieldNumber(101)) {
                fVar.i(101, this.f28547o.computeSize());
                this.f28547o.writeFields(fVar);
            }
            if (this.f28548p != null && hasFieldNumber(102)) {
                fVar.i(102, this.f28548p.computeSize());
                this.f28548p.writeFields(fVar);
            }
            if (hasFieldNumber(201)) {
                fVar.e(201, this.f28549q);
            }
            if (this.f28550r != null && hasFieldNumber(202)) {
                fVar.i(202, this.f28550r.computeSize());
                this.f28550r.writeFields(fVar);
            }
            if (hasFieldNumber(2000)) {
                fVar.a(2000, this.f28551s);
            }
            if (hasFieldNumber(2001)) {
                fVar.e(2001, this.f28552t);
            }
            if (hasFieldNumber(2002)) {
                fVar.a(2002, this.f28553u);
            }
            if (hasFieldNumber(2003)) {
                fVar.e(2003, this.f28554v);
            }
            if (hasFieldNumber(3000)) {
                fVar.a(3000, this.f28555w);
            }
            if (this.f28556x != null && hasFieldNumber(3001)) {
                fVar.i(3001, this.f28556x.computeSize());
                this.f28556x.writeFields(fVar);
            }
            if (hasFieldNumber(3100)) {
                fVar.a(3100, this.f28557y);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = hasFieldNumber(1) ? b36.f.e(1, this.f28539d) + 0 : 0;
            if (this.f28540e != null && hasFieldNumber(2)) {
                e17 += b36.f.j(2, this.f28540e);
            }
            if (hasFieldNumber(3)) {
                e17 += b36.f.h(3, this.f28541f);
            }
            if (hasFieldNumber(4)) {
                e17 += b36.f.a(4, this.f28542g);
            }
            if (hasFieldNumber(50)) {
                e17 += b36.f.e(50, this.f28543h);
            }
            if (this.f28544i != null && hasFieldNumber(51)) {
                e17 += b36.f.j(51, this.f28544i);
            }
            if (this.f28545m != null && hasFieldNumber(99)) {
                e17 += b36.f.j(99, this.f28545m);
            }
            if (hasFieldNumber(100)) {
                e17 += b36.f.e(100, this.f28546n);
            }
            if (this.f28547o != null && hasFieldNumber(101)) {
                e17 += b36.f.i(101, this.f28547o.computeSize());
            }
            if (this.f28548p != null && hasFieldNumber(102)) {
                e17 += b36.f.i(102, this.f28548p.computeSize());
            }
            if (hasFieldNumber(201)) {
                e17 += b36.f.e(201, this.f28549q);
            }
            if (this.f28550r != null && hasFieldNumber(202)) {
                e17 += b36.f.i(202, this.f28550r.computeSize());
            }
            if (hasFieldNumber(2000)) {
                e17 += b36.f.a(2000, this.f28551s);
            }
            if (hasFieldNumber(2001)) {
                e17 += b36.f.e(2001, this.f28552t);
            }
            if (hasFieldNumber(2002)) {
                e17 += b36.f.a(2002, this.f28553u);
            }
            if (hasFieldNumber(2003)) {
                e17 += b36.f.e(2003, this.f28554v);
            }
            if (hasFieldNumber(3000)) {
                e17 += b36.f.a(3000, this.f28555w);
            }
            if (this.f28556x != null && hasFieldNumber(3001)) {
                e17 += b36.f.i(3001, this.f28556x.computeSize());
            }
            return hasFieldNumber(3100) ? e17 + b36.f.a(3100, this.f28557y) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
        android.util.ArrayMap arrayMap = this.f28558z;
        if (intValue == 1) {
            this.f28539d = aVar2.g(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f28540e = aVar2.k(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f28541f = aVar2.i(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            this.f28542g = aVar2.c(intValue);
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 50) {
            this.f28543h = aVar2.g(intValue);
            arrayMap.put(50, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 51) {
            this.f28544i = aVar2.k(intValue);
            arrayMap.put(51, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 201) {
            this.f28549q = aVar2.g(intValue);
            arrayMap.put(201, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 202) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.wc0 wc0Var = new bw5.wc0();
                if (bArr != null && bArr.length > 0) {
                    wc0Var.parseFrom(bArr);
                }
                this.f28550r = wc0Var;
            }
            arrayMap.put(202, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3000) {
            this.f28555w = aVar2.c(intValue);
            arrayMap.put(3000, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3001) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.hd0 hd0Var = new bw5.hd0();
                if (bArr2 != null && bArr2.length > 0) {
                    hd0Var.parseFrom(bArr2);
                }
                this.f28556x = hd0Var;
            }
            arrayMap.put(3001, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3100) {
            this.f28557y = aVar2.c(intValue);
            arrayMap.put(3100, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 99:
                this.f28545m = aVar2.k(intValue);
                arrayMap.put(99, java.lang.Boolean.TRUE);
                return 0;
            case 100:
                this.f28546n = aVar2.g(intValue);
                arrayMap.put(100, java.lang.Boolean.TRUE);
                return 0;
            case 101:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.zc0 zc0Var = new bw5.zc0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zc0Var.parseFrom(bArr3);
                    }
                    this.f28547o = zc0Var;
                }
                arrayMap.put(101, java.lang.Boolean.TRUE);
                return 0;
            case 102:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.ad0 ad0Var = new bw5.ad0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ad0Var.parseFrom(bArr4);
                    }
                    this.f28548p = ad0Var;
                }
                arrayMap.put(102, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 2000:
                        this.f28551s = aVar2.c(intValue);
                        arrayMap.put(2000, java.lang.Boolean.TRUE);
                        return 0;
                    case 2001:
                        this.f28552t = aVar2.g(intValue);
                        arrayMap.put(2001, java.lang.Boolean.TRUE);
                        return 0;
                    case 2002:
                        this.f28553u = aVar2.c(intValue);
                        arrayMap.put(2002, java.lang.Boolean.TRUE);
                        return 0;
                    case 2003:
                        this.f28554v = aVar2.g(intValue);
                        arrayMap.put(2003, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
