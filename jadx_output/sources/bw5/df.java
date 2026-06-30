package bw5;

/* loaded from: classes2.dex */
public class df extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f26470d;

    /* renamed from: e, reason: collision with root package name */
    public int f26471e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26472f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26473g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26474h = new boolean[5];

    static {
        new bw5.df();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.df parseFrom(byte[] bArr) {
        return (bw5.df) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.df)) {
            return false;
        }
        bw5.df dfVar = (bw5.df) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f26470d), java.lang.Long.valueOf(dfVar.f26470d)) && n51.f.a(java.lang.Integer.valueOf(this.f26471e), java.lang.Integer.valueOf(dfVar.f26471e)) && n51.f.a(this.f26472f, dfVar.f26472f) && n51.f.a(this.f26473g, dfVar.f26473g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.df();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26474h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f26470d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26471e);
            }
            java.lang.String str = this.f26472f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f26473g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f26470d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f26471e);
            }
            java.lang.String str3 = this.f26472f;
            if (str3 != null && zArr[3]) {
                h17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f26473g;
            return (str4 == null || !zArr[4]) ? h17 : h17 + b36.f.j(4, str4);
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
            this.f26470d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26471e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26472f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f26473g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
