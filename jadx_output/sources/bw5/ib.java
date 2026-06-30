package bw5;

/* loaded from: classes10.dex */
public class ib extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.kb f28515d;

    /* renamed from: e, reason: collision with root package name */
    public int f28516e;

    /* renamed from: f, reason: collision with root package name */
    public long f28517f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28518g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28519h = new boolean[5];

    static {
        new bw5.ib();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ib)) {
            return false;
        }
        bw5.ib ibVar = (bw5.ib) fVar;
        return n51.f.a(this.f28515d, ibVar.f28515d) && n51.f.a(java.lang.Integer.valueOf(this.f28516e), java.lang.Integer.valueOf(ibVar.f28516e)) && n51.f.a(java.lang.Long.valueOf(this.f28517f), java.lang.Long.valueOf(ibVar.f28517f)) && n51.f.a(java.lang.Boolean.valueOf(this.f28518g), java.lang.Boolean.valueOf(ibVar.f28518g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ib();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28519h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.kb kbVar = this.f28515d;
            if (kbVar != null && zArr[1]) {
                fVar.e(1, kbVar.f29328d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28516e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28517f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f28518g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.kb kbVar2 = this.f28515d;
            if (kbVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, kbVar2.f29328d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f28516e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f28517f);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f28518g) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f28515d = g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.kb.Media_All : bw5.kb.Media_Video_Only : bw5.kb.Media_Image_Only;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28516e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28517f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28518g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ib) super.parseFrom(bArr);
    }
}
