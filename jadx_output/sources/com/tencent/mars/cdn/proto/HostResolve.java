package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class HostResolve extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.HostResolve DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.HostResolve();
    private int flags;
    private final boolean[] hasSetFields = new boolean[3];
    private int priority;

    public static com.tencent.mars.cdn.proto.HostResolve create() {
        return new com.tencent.mars.cdn.proto.HostResolve();
    }

    public static com.tencent.mars.cdn.proto.HostResolve getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.HostResolve newBuilder() {
        return new com.tencent.mars.cdn.proto.HostResolve();
    }

    public com.tencent.mars.cdn.proto.HostResolve build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.HostResolve)) {
            return false;
        }
        com.tencent.mars.cdn.proto.HostResolve hostResolve = (com.tencent.mars.cdn.proto.HostResolve) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.priority), java.lang.Integer.valueOf(hostResolve.priority)) && n51.f.a(java.lang.Integer.valueOf(this.flags), java.lang.Integer.valueOf(hostResolve.flags));
    }

    public int getFlags() {
        return this.flags;
    }

    public int getPriority() {
        return this.priority;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFlags() {
        return hasFieldNumber(2);
    }

    public boolean hasPriority() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.HostResolve mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.HostResolve();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.priority);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.flags);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.priority) : 0;
            return this.hasSetFields[2] ? e17 + b36.f.e(2, this.flags) : e17;
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
            this.priority = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.flags = aVar2.g(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.HostResolve setFlags(int i17) {
        this.flags = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HostResolve setPriority(int i17) {
        this.priority = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HostResolve mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.HostResolve parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.HostResolve) super.parseFrom(bArr);
    }
}
