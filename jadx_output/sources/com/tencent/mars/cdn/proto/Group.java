package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Group extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Group DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Group();
    private int capacity;
    private final boolean[] hasSetFields = new boolean[3];
    private java.lang.String name;

    public static com.tencent.mars.cdn.proto.Group create() {
        return new com.tencent.mars.cdn.proto.Group();
    }

    public static com.tencent.mars.cdn.proto.Group getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Group newBuilder() {
        return new com.tencent.mars.cdn.proto.Group();
    }

    public com.tencent.mars.cdn.proto.Group build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Group)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Group group = (com.tencent.mars.cdn.proto.Group) fVar;
        return n51.f.a(this.name, group.name) && n51.f.a(java.lang.Integer.valueOf(this.capacity), java.lang.Integer.valueOf(group.capacity));
    }

    public int getCapacity() {
        return this.capacity;
    }

    public java.lang.String getName() {
        return this.hasSetFields[1] ? this.name : "";
    }

    public boolean hasCapacity() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasName() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.Group mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Group();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.name;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.capacity);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.name;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return this.hasSetFields[2] ? i18 + b36.f.e(2, this.capacity) : i18;
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
            this.name = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.capacity = aVar2.g(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.Group setCapacity(int i17) {
        this.capacity = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Group setName(java.lang.String str) {
        this.name = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Group mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Group parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Group) super.parseFrom(bArr);
    }
}
