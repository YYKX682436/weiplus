package com.tencent.ilink.base;

/* loaded from: classes8.dex */
public class IlinkAuthConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.base.IlinkAuthConfig DEFAULT_INSTANCE = new com.tencent.ilink.base.IlinkAuthConfig();
    private final boolean[] hasSetFields = new boolean[7];
    private java.lang.String ilink_id;
    private java.lang.String ilink_sn;
    private java.lang.String ilink_token;
    private java.lang.String ios_idfa;
    private int session_module_type;
    private int session_type;

    public static com.tencent.ilink.base.IlinkAuthConfig create() {
        return new com.tencent.ilink.base.IlinkAuthConfig();
    }

    public static com.tencent.ilink.base.IlinkAuthConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.base.IlinkAuthConfig newBuilder() {
        return new com.tencent.ilink.base.IlinkAuthConfig();
    }

    public com.tencent.ilink.base.IlinkAuthConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.base.IlinkAuthConfig)) {
            return false;
        }
        com.tencent.ilink.base.IlinkAuthConfig ilinkAuthConfig = (com.tencent.ilink.base.IlinkAuthConfig) fVar;
        return n51.f.a(this.ilink_sn, ilinkAuthConfig.ilink_sn) && n51.f.a(this.ilink_id, ilinkAuthConfig.ilink_id) && n51.f.a(this.ilink_token, ilinkAuthConfig.ilink_token) && n51.f.a(java.lang.Integer.valueOf(this.session_type), java.lang.Integer.valueOf(ilinkAuthConfig.session_type)) && n51.f.a(java.lang.Integer.valueOf(this.session_module_type), java.lang.Integer.valueOf(ilinkAuthConfig.session_module_type)) && n51.f.a(this.ios_idfa, ilinkAuthConfig.ios_idfa);
    }

    public java.lang.String getIlinkId() {
        return this.hasSetFields[2] ? this.ilink_id : "";
    }

    public java.lang.String getIlinkSn() {
        return this.hasSetFields[1] ? this.ilink_sn : "";
    }

    public java.lang.String getIlinkToken() {
        return this.hasSetFields[3] ? this.ilink_token : "";
    }

    public java.lang.String getIosIdfa() {
        return this.hasSetFields[6] ? this.ios_idfa : "";
    }

    public int getSessionModuleType() {
        return this.session_module_type;
    }

    public int getSessionType() {
        return this.session_type;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkId() {
        return hasFieldNumber(2);
    }

    public boolean hasIlinkSn() {
        return hasFieldNumber(1);
    }

    public boolean hasIlinkToken() {
        return hasFieldNumber(3);
    }

    public boolean hasIosIdfa() {
        return hasFieldNumber(6);
    }

    public boolean hasSessionModuleType() {
        return hasFieldNumber(5);
    }

    public boolean hasSessionType() {
        return hasFieldNumber(4);
    }

    public com.tencent.ilink.base.IlinkAuthConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.base.IlinkAuthConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.ilink_sn;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.ilink_id;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.ilink_token;
            if (str3 != null && this.hasSetFields[3]) {
                fVar.j(3, str3);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.session_type);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.session_module_type);
            }
            java.lang.String str4 = this.ios_idfa;
            if (str4 != null && this.hasSetFields[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.ilink_sn;
            if (str5 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.ilink_id;
            if (str6 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.ilink_token;
            if (str7 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.session_type);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.e(5, this.session_module_type);
            }
            java.lang.String str8 = this.ios_idfa;
            return (str8 == null || !this.hasSetFields[6]) ? i18 : i18 + b36.f.j(6, str8);
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
        switch (intValue) {
            case 1:
                this.ilink_sn = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.ilink_id = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.ilink_token = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.session_type = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.session_module_type = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.ios_idfa = aVar2.k(intValue);
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.base.IlinkAuthConfig setIlinkId(java.lang.String str) {
        this.ilink_id = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkAuthConfig setIlinkSn(java.lang.String str) {
        this.ilink_sn = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkAuthConfig setIlinkToken(java.lang.String str) {
        this.ilink_token = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkAuthConfig setIosIdfa(java.lang.String str) {
        this.ios_idfa = str;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkAuthConfig setSessionModuleType(int i17) {
        this.session_module_type = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkAuthConfig setSessionType(int i17) {
        this.session_type = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkAuthConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.base.IlinkAuthConfig parseFrom(byte[] bArr) {
        return (com.tencent.ilink.base.IlinkAuthConfig) super.parseFrom(bArr);
    }
}
