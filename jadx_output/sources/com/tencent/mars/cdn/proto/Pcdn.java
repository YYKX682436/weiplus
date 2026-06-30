package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Pcdn extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Pcdn DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Pcdn();
    private int appid;
    private final boolean[] hasSetFields = new boolean[3];
    private int max_conn;

    public static com.tencent.mars.cdn.proto.Pcdn create() {
        return new com.tencent.mars.cdn.proto.Pcdn();
    }

    public static com.tencent.mars.cdn.proto.Pcdn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Pcdn newBuilder() {
        return new com.tencent.mars.cdn.proto.Pcdn();
    }

    public com.tencent.mars.cdn.proto.Pcdn build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Pcdn)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Pcdn pcdn = (com.tencent.mars.cdn.proto.Pcdn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.appid), java.lang.Integer.valueOf(pcdn.appid)) && n51.f.a(java.lang.Integer.valueOf(this.max_conn), java.lang.Integer.valueOf(pcdn.max_conn));
    }

    public int getAppid() {
        return this.appid;
    }

    public int getMaxConn() {
        return this.max_conn;
    }

    public boolean hasAppid() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMaxConn() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.Pcdn mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Pcdn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.appid);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.max_conn);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.appid) : 0;
            return this.hasSetFields[2] ? e17 + b36.f.e(2, this.max_conn) : e17;
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
            this.appid = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.max_conn = aVar2.g(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.Pcdn setAppid(int i17) {
        this.appid = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Pcdn setMaxConn(int i17) {
        this.max_conn = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Pcdn mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Pcdn parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Pcdn) super.parseFrom(bArr);
    }
}
