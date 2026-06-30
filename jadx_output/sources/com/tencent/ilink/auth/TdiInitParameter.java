package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class TdiInitParameter extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.TdiInitParameter DEFAULT_INSTANCE = new com.tencent.ilink.auth.TdiInitParameter();
    private java.lang.String app_dir;
    private final boolean[] hasSetFields = new boolean[9];
    private java.lang.String ilink_id;
    private int ilink_product_id;
    private java.lang.String ilink_sn;
    private java.lang.String ilink_token;
    private java.lang.String ios_idfa;
    private int session_module_type;
    private int session_type;

    public static com.tencent.ilink.auth.TdiInitParameter create() {
        return new com.tencent.ilink.auth.TdiInitParameter();
    }

    public static com.tencent.ilink.auth.TdiInitParameter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.TdiInitParameter newBuilder() {
        return new com.tencent.ilink.auth.TdiInitParameter();
    }

    public com.tencent.ilink.auth.TdiInitParameter build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.TdiInitParameter)) {
            return false;
        }
        com.tencent.ilink.auth.TdiInitParameter tdiInitParameter = (com.tencent.ilink.auth.TdiInitParameter) fVar;
        return n51.f.a(this.app_dir, tdiInitParameter.app_dir) && n51.f.a(java.lang.Integer.valueOf(this.ilink_product_id), java.lang.Integer.valueOf(tdiInitParameter.ilink_product_id)) && n51.f.a(this.ilink_sn, tdiInitParameter.ilink_sn) && n51.f.a(this.ilink_id, tdiInitParameter.ilink_id) && n51.f.a(this.ilink_token, tdiInitParameter.ilink_token) && n51.f.a(this.ios_idfa, tdiInitParameter.ios_idfa) && n51.f.a(java.lang.Integer.valueOf(this.session_type), java.lang.Integer.valueOf(tdiInitParameter.session_type)) && n51.f.a(java.lang.Integer.valueOf(this.session_module_type), java.lang.Integer.valueOf(tdiInitParameter.session_module_type));
    }

    public java.lang.String getAppDir() {
        return this.hasSetFields[1] ? this.app_dir : "";
    }

    public java.lang.String getIlinkId() {
        return this.hasSetFields[4] ? this.ilink_id : "";
    }

    public int getIlinkProductId() {
        return this.ilink_product_id;
    }

    public java.lang.String getIlinkSn() {
        return this.hasSetFields[3] ? this.ilink_sn : "";
    }

    public java.lang.String getIlinkToken() {
        return this.hasSetFields[5] ? this.ilink_token : "";
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

    public boolean hasAppDir() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkId() {
        return hasFieldNumber(4);
    }

    public boolean hasIlinkProductId() {
        return hasFieldNumber(2);
    }

    public boolean hasIlinkSn() {
        return hasFieldNumber(3);
    }

    public boolean hasIlinkToken() {
        return hasFieldNumber(5);
    }

    public boolean hasIosIdfa() {
        return hasFieldNumber(6);
    }

    public boolean hasSessionModuleType() {
        return hasFieldNumber(8);
    }

    public boolean hasSessionType() {
        return hasFieldNumber(7);
    }

    public com.tencent.ilink.auth.TdiInitParameter mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.TdiInitParameter();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.app_dir;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.ilink_product_id);
            }
            java.lang.String str2 = this.ilink_sn;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.ilink_id;
            if (str3 != null && this.hasSetFields[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.ilink_token;
            if (str4 != null && this.hasSetFields[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.ios_idfa;
            if (str5 != null && this.hasSetFields[6]) {
                fVar.j(6, str5);
            }
            if (this.hasSetFields[7]) {
                fVar.e(7, this.session_type);
            }
            if (this.hasSetFields[8]) {
                fVar.e(8, this.session_module_type);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.app_dir;
            if (str6 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.ilink_product_id);
            }
            java.lang.String str7 = this.ilink_sn;
            if (str7 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.ilink_id;
            if (str8 != null && this.hasSetFields[4]) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.ilink_token;
            if (str9 != null && this.hasSetFields[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.ios_idfa;
            if (str10 != null && this.hasSetFields[6]) {
                i18 += b36.f.j(6, str10);
            }
            if (this.hasSetFields[7]) {
                i18 += b36.f.e(7, this.session_type);
            }
            return this.hasSetFields[8] ? i18 + b36.f.e(8, this.session_module_type) : i18;
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
                this.app_dir = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.ilink_product_id = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.ilink_sn = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.ilink_id = aVar2.k(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.ilink_token = aVar2.k(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.ios_idfa = aVar2.k(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.session_type = aVar2.g(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.session_module_type = aVar2.g(intValue);
                this.hasSetFields[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.auth.TdiInitParameter setAppDir(java.lang.String str) {
        this.app_dir = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter setIlinkId(java.lang.String str) {
        this.ilink_id = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter setIlinkProductId(int i17) {
        this.ilink_product_id = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter setIlinkSn(java.lang.String str) {
        this.ilink_sn = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter setIlinkToken(java.lang.String str) {
        this.ilink_token = str;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter setIosIdfa(java.lang.String str) {
        this.ios_idfa = str;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter setSessionModuleType(int i17) {
        this.session_module_type = i17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter setSessionType(int i17) {
        this.session_type = i17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.auth.TdiInitParameter mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.TdiInitParameter parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.TdiInitParameter) super.parseFrom(bArr);
    }
}
