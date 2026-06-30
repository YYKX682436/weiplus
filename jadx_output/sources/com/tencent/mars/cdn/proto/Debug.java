package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Debug extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Debug DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Debug();
    private com.tencent.mm.protobuf.g authkey;
    private java.lang.String groupkey;
    private final boolean[] hasSetFields = new boolean[4];
    private java.lang.String svrip;

    public static com.tencent.mars.cdn.proto.Debug create() {
        return new com.tencent.mars.cdn.proto.Debug();
    }

    public static com.tencent.mars.cdn.proto.Debug getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Debug newBuilder() {
        return new com.tencent.mars.cdn.proto.Debug();
    }

    public com.tencent.mars.cdn.proto.Debug build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Debug)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Debug debug = (com.tencent.mars.cdn.proto.Debug) fVar;
        return n51.f.a(this.svrip, debug.svrip) && n51.f.a(this.authkey, debug.authkey) && n51.f.a(this.groupkey, debug.groupkey);
    }

    public com.tencent.mm.protobuf.g getAuthkey() {
        return this.hasSetFields[2] ? this.authkey : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getGroupkey() {
        return this.hasSetFields[3] ? this.groupkey : "";
    }

    public java.lang.String getSvrip() {
        return this.hasSetFields[1] ? this.svrip : "";
    }

    public boolean hasAuthkey() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasGroupkey() {
        return hasFieldNumber(3);
    }

    public boolean hasSvrip() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.Debug mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Debug();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.svrip;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.authkey;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.groupkey;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.svrip;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.authkey;
            if (gVar2 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str4 = this.groupkey;
            return (str4 == null || !this.hasSetFields[3]) ? i18 : i18 + b36.f.j(3, str4);
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
            this.svrip = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.authkey = aVar2.d(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.groupkey = aVar2.k(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.Debug setAuthkey(com.tencent.mm.protobuf.g gVar) {
        this.authkey = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Debug setGroupkey(java.lang.String str) {
        this.groupkey = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Debug setSvrip(java.lang.String str) {
        this.svrip = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Debug mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Debug parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Debug) super.parseFrom(bArr);
    }
}
