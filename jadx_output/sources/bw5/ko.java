package bw5;

/* loaded from: classes2.dex */
public class ko extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f29449d;

    /* renamed from: e, reason: collision with root package name */
    public long f29450e;

    /* renamed from: f, reason: collision with root package name */
    public long f29451f;

    /* renamed from: g, reason: collision with root package name */
    public long f29452g;

    /* renamed from: h, reason: collision with root package name */
    public int f29453h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29454i = new boolean[6];

    static {
        new bw5.ko();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ko parseFrom(byte[] bArr) {
        return (bw5.ko) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ko)) {
            return false;
        }
        bw5.ko koVar = (bw5.ko) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f29449d), java.lang.Long.valueOf(koVar.f29449d)) && n51.f.a(java.lang.Long.valueOf(this.f29450e), java.lang.Long.valueOf(koVar.f29450e)) && n51.f.a(java.lang.Long.valueOf(this.f29451f), java.lang.Long.valueOf(koVar.f29451f)) && n51.f.a(java.lang.Long.valueOf(this.f29452g), java.lang.Long.valueOf(koVar.f29452g)) && n51.f.a(java.lang.Integer.valueOf(this.f29453h), java.lang.Integer.valueOf(koVar.f29453h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ko();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29454i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f29449d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f29450e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f29451f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f29452g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29453h);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f29449d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f29450e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f29451f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f29452g);
            }
            return zArr[5] ? h17 + b36.f.e(5, this.f29453h) : h17;
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
            this.f29449d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29450e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29451f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f29452g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f29453h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
