package bw5;

/* loaded from: classes2.dex */
public class im0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28639e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f28640f = new boolean[3];

    static {
        new bw5.im0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.im0 parseFrom(byte[] bArr) {
        return (bw5.im0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.im0)) {
            return false;
        }
        bw5.im0 im0Var = (bw5.im0) fVar;
        return n51.f.a(this.f28638d, im0Var.f28638d) && n51.f.a(this.f28639e, im0Var.f28639e);
    }

    public java.lang.String getLocale() {
        return this.f28640f[1] ? this.f28638d : "";
    }

    public java.lang.String getText() {
        return this.f28640f[2] ? this.f28639e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.im0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28640f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28638d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28639e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f28638d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f28639e;
            return (str4 == null || !zArr[2]) ? i18 : i18 + b36.f.j(2, str4);
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
            this.f28638d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f28639e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
