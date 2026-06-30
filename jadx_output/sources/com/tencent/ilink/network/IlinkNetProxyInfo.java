package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkNetProxyInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkNetProxyInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkNetProxyInfo();
    private final boolean[] hasSetFields = new boolean[6];

    /* renamed from: ip, reason: collision with root package name */
    private java.lang.String f45950ip;
    private com.tencent.mm.protobuf.g password;
    private int port;
    private int proxytype;
    private com.tencent.mm.protobuf.g username;

    public static com.tencent.ilink.network.IlinkNetProxyInfo create() {
        return new com.tencent.ilink.network.IlinkNetProxyInfo();
    }

    public static com.tencent.ilink.network.IlinkNetProxyInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkNetProxyInfo newBuilder() {
        return new com.tencent.ilink.network.IlinkNetProxyInfo();
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkNetProxyInfo)) {
            return false;
        }
        com.tencent.ilink.network.IlinkNetProxyInfo ilinkNetProxyInfo = (com.tencent.ilink.network.IlinkNetProxyInfo) fVar;
        return n51.f.a(this.f45950ip, ilinkNetProxyInfo.f45950ip) && n51.f.a(java.lang.Integer.valueOf(this.port), java.lang.Integer.valueOf(ilinkNetProxyInfo.port)) && n51.f.a(this.username, ilinkNetProxyInfo.username) && n51.f.a(this.password, ilinkNetProxyInfo.password) && n51.f.a(java.lang.Integer.valueOf(this.proxytype), java.lang.Integer.valueOf(ilinkNetProxyInfo.proxytype));
    }

    public java.lang.String getIp() {
        return this.hasSetFields[1] ? this.f45950ip : "";
    }

    public com.tencent.mm.protobuf.g getPassword() {
        return this.hasSetFields[4] ? this.password : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getPort() {
        return this.port;
    }

    public int getProxytype() {
        return this.proxytype;
    }

    public com.tencent.mm.protobuf.g getUsername() {
        return this.hasSetFields[3] ? this.username : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIp() {
        return hasFieldNumber(1);
    }

    public boolean hasPassword() {
        return hasFieldNumber(4);
    }

    public boolean hasPort() {
        return hasFieldNumber(2);
    }

    public boolean hasProxytype() {
        return hasFieldNumber(5);
    }

    public boolean hasUsername() {
        return hasFieldNumber(3);
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkNetProxyInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f45950ip;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.port);
            }
            com.tencent.mm.protobuf.g gVar = this.username;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.password;
            if (gVar2 != null && this.hasSetFields[4]) {
                fVar.b(4, gVar2);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.proxytype);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f45950ip;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.port);
            }
            com.tencent.mm.protobuf.g gVar3 = this.username;
            if (gVar3 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.password;
            if (gVar4 != null && this.hasSetFields[4]) {
                i18 += b36.f.b(4, gVar4);
            }
            return this.hasSetFields[5] ? i18 + b36.f.e(5, this.proxytype) : i18;
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
            this.f45950ip = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.port = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.username = aVar2.d(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.password = aVar2.d(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.proxytype = aVar2.g(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo setIp(java.lang.String str) {
        this.f45950ip = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo setPassword(com.tencent.mm.protobuf.g gVar) {
        this.password = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo setPort(int i17) {
        this.port = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo setProxytype(int i17) {
        this.proxytype = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo setUsername(com.tencent.mm.protobuf.g gVar) {
        this.username = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkNetProxyInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkNetProxyInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkNetProxyInfo) super.parseFrom(bArr);
    }
}
