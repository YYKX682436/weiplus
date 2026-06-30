package bw5;

/* loaded from: classes2.dex */
public class tk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33491d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33492e;

    /* renamed from: f, reason: collision with root package name */
    public long f33493f;

    /* renamed from: g, reason: collision with root package name */
    public int f33494g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33495h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33496i = new boolean[6];

    static {
        new bw5.tk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tk parseFrom(byte[] bArr) {
        return (bw5.tk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tk)) {
            return false;
        }
        bw5.tk tkVar = (bw5.tk) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33491d), java.lang.Long.valueOf(tkVar.f33491d)) && n51.f.a(this.f33492e, tkVar.f33492e) && n51.f.a(java.lang.Long.valueOf(this.f33493f), java.lang.Long.valueOf(tkVar.f33493f)) && n51.f.a(java.lang.Integer.valueOf(this.f33494g), java.lang.Integer.valueOf(tkVar.f33494g)) && n51.f.a(java.lang.Boolean.valueOf(this.f33495h), java.lang.Boolean.valueOf(tkVar.f33495h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33496i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33491d);
            }
            java.lang.String str = this.f33492e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f33493f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33494g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f33495h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33491d) : 0;
            java.lang.String str2 = this.f33492e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f33493f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f33494g);
            }
            return zArr[5] ? h17 + b36.f.a(5, this.f33495h) : h17;
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
        if (intValue == 1) {
            this.f33491d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33492e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33493f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33494g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f33495h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
