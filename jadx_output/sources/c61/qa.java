package c61;

/* loaded from: classes7.dex */
public final class qa extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f39269d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f39270e;

    public qa() {
        this(false, 1, null);
    }

    @Override // com.tencent.mm.protobuf.f
    public int op(int i17, java.lang.Object... objs) {
        kotlin.jvm.internal.o.g(objs, "objs");
        if (i17 == 0) {
            java.lang.Object obj = objs[0];
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type net.jarlehansen.protobuf.output.OutputWriter");
            g36.f fVar = (g36.f) obj;
            fVar.i(1, this.BaseResponse.computeSize());
            this.BaseResponse.writeFields(fVar);
        } else {
            if (i17 == 1) {
                r45.ie ieVar = this.BaseResponse;
                return (ieVar != null ? 0 + b36.f.i(1, ieVar.computeSize()) : 0) + this.f39270e.length;
            }
            if (i17 == 2) {
                java.lang.Object obj2 = objs[0];
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.f(unknownTagHandler, "unknownTagHandler");
                c36.a aVar = new c36.a((byte[]) obj2, unknownTagHandler);
                int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar);
                if (nextFieldNumber == 1 && !super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
                return 0;
            }
            if (i17 == 3) {
                java.lang.Object obj3 = objs[0];
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type net.jarlehansen.protobuf.input.InputReader");
                c36.a aVar2 = (c36.a) obj3;
                java.lang.Object obj4 = objs[1];
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ResponseProtoBuf");
                r45.js5 js5Var = (r45.js5) obj4;
                java.lang.Object obj5 = objs[2];
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) obj5).intValue();
                if (intValue == 1) {
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        java.lang.Object obj6 = j17.get(i18);
                        kotlin.jvm.internal.o.f(obj6, "get(...)");
                        byte[] bArr = (byte[]) obj6;
                        r45.ie ieVar2 = new r45.ie();
                        if (!(bArr.length == 0)) {
                            ieVar2.parseFrom(bArr);
                        }
                        js5Var.BaseResponse = ieVar2;
                    }
                }
                return 0;
            }
        }
        return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        this.f39270e = bArr == null ? new byte[0] : bArr;
        if (this.f39269d) {
            op(2, bArr);
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        int i17;
        validate();
        byte[] bArr = new byte[computeSize()];
        g36.f fVar = new g36.f(bArr);
        r45.ie ieVar = this.BaseResponse;
        if (ieVar != null) {
            fVar.i(1, ieVar.computeSize());
            this.BaseResponse.writeFields(fVar);
            i17 = b36.f.i(1, this.BaseResponse.computeSize());
        } else {
            i17 = 0;
        }
        byte[] bArr2 = this.f39270e;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }

    public qa(boolean z17) {
        this.f39269d = z17;
        this.f39270e = new byte[0];
        this.BaseResponse = new r45.ie();
    }

    public /* synthetic */ qa(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
