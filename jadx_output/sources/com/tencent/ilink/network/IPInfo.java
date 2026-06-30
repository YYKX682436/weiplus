package com.tencent.ilink.network;

/* loaded from: classes4.dex */
public class IPInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IPInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.IPInfo();
    private final boolean[] hasSetFields = new boolean[4];
    private java.lang.String ipv4;
    private java.lang.String ipv6;
    private int type;

    public static com.tencent.ilink.network.IPInfo create() {
        return new com.tencent.ilink.network.IPInfo();
    }

    public static com.tencent.ilink.network.IPInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IPInfo newBuilder() {
        return new com.tencent.ilink.network.IPInfo();
    }

    public com.tencent.ilink.network.IPInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IPInfo)) {
            return false;
        }
        com.tencent.ilink.network.IPInfo iPInfo = (com.tencent.ilink.network.IPInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(iPInfo.type)) && n51.f.a(this.ipv4, iPInfo.ipv4) && n51.f.a(this.ipv6, iPInfo.ipv6);
    }

    public java.lang.String getIpv4() {
        return this.hasSetFields[2] ? this.ipv4 : "";
    }

    public java.lang.String getIpv6() {
        return this.hasSetFields[3] ? this.ipv6 : "";
    }

    public int getType() {
        return this.type;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIpv4() {
        return hasFieldNumber(2);
    }

    public boolean hasIpv6() {
        return hasFieldNumber(3);
    }

    public boolean hasType() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.network.IPInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IPInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.type);
            }
            java.lang.String str = this.ipv4;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.ipv6;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.type) : 0;
            java.lang.String str3 = this.ipv4;
            if (str3 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.ipv6;
            return (str4 == null || !this.hasSetFields[3]) ? e17 : e17 + b36.f.j(3, str4);
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
            this.type = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.ipv4 = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.ipv6 = aVar2.k(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.ilink.network.IPInfo setIpv4(java.lang.String str) {
        this.ipv4 = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IPInfo setIpv6(java.lang.String str) {
        this.ipv6 = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IPInfo setType(int i17) {
        this.type = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IPInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IPInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IPInfo) super.parseFrom(bArr);
    }
}
