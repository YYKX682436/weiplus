package com.tencent.ilink.auth;

/* loaded from: classes8.dex */
public class IlinkUserInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkUserInfo DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkUserInfo();
    private final boolean[] hasSetFields = new boolean[8];
    private com.tencent.mm.protobuf.g ilink_network_buffer;
    private com.tencent.ilink.auth.IlinkLoginScene login_scene;
    private com.tencent.ilink.auth.IlinkLoginStatus login_status;
    private int login_type;
    private long uin;
    private java.lang.String username;
    private java.lang.String wss_token;

    public static com.tencent.ilink.auth.IlinkUserInfo create() {
        return new com.tencent.ilink.auth.IlinkUserInfo();
    }

    public static com.tencent.ilink.auth.IlinkUserInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkUserInfo newBuilder() {
        return new com.tencent.ilink.auth.IlinkUserInfo();
    }

    public com.tencent.ilink.auth.IlinkUserInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkUserInfo)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkUserInfo ilinkUserInfo = (com.tencent.ilink.auth.IlinkUserInfo) fVar;
        return n51.f.a(this.login_status, ilinkUserInfo.login_status) && n51.f.a(java.lang.Integer.valueOf(this.login_type), java.lang.Integer.valueOf(ilinkUserInfo.login_type)) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(ilinkUserInfo.uin)) && n51.f.a(this.username, ilinkUserInfo.username) && n51.f.a(this.login_scene, ilinkUserInfo.login_scene) && n51.f.a(this.wss_token, ilinkUserInfo.wss_token) && n51.f.a(this.ilink_network_buffer, ilinkUserInfo.ilink_network_buffer);
    }

    public com.tencent.mm.protobuf.g getIlinkNetworkBuffer() {
        return this.hasSetFields[7] ? this.ilink_network_buffer : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.auth.IlinkLoginScene getLoginScene() {
        return this.hasSetFields[5] ? this.login_scene : com.tencent.ilink.auth.IlinkLoginScene.kIlinkLoginSceneNone;
    }

    public com.tencent.ilink.auth.IlinkLoginStatus getLoginStatus() {
        return this.hasSetFields[1] ? this.login_status : com.tencent.ilink.auth.IlinkLoginStatus.kIlinkLoginUnknown;
    }

    public int getLoginType() {
        return this.login_type;
    }

    public long getUin() {
        return this.uin;
    }

    public java.lang.String getUsername() {
        return this.hasSetFields[4] ? this.username : "";
    }

    public java.lang.String getWssToken() {
        return this.hasSetFields[6] ? this.wss_token : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkNetworkBuffer() {
        return hasFieldNumber(7);
    }

    public boolean hasLoginScene() {
        return hasFieldNumber(5);
    }

    public boolean hasLoginStatus() {
        return hasFieldNumber(1);
    }

    public boolean hasLoginType() {
        return hasFieldNumber(2);
    }

    public boolean hasUin() {
        return hasFieldNumber(3);
    }

    public boolean hasUsername() {
        return hasFieldNumber(4);
    }

    public boolean hasWssToken() {
        return hasFieldNumber(6);
    }

    public com.tencent.ilink.auth.IlinkUserInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkUserInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.ilink.auth.IlinkLoginStatus ilinkLoginStatus = this.login_status;
            if (ilinkLoginStatus != null && this.hasSetFields[1]) {
                fVar.e(1, ilinkLoginStatus.value);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.login_type);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.uin);
            }
            java.lang.String str = this.username;
            if (str != null && this.hasSetFields[4]) {
                fVar.j(4, str);
            }
            com.tencent.ilink.auth.IlinkLoginScene ilinkLoginScene = this.login_scene;
            if (ilinkLoginScene != null && this.hasSetFields[5]) {
                fVar.e(5, ilinkLoginScene.value);
            }
            java.lang.String str2 = this.wss_token;
            if (str2 != null && this.hasSetFields[6]) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.ilink_network_buffer;
            if (gVar != null && this.hasSetFields[7]) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.ilink.auth.IlinkLoginStatus ilinkLoginStatus2 = this.login_status;
            if (ilinkLoginStatus2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.e(1, ilinkLoginStatus2.value);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.login_type);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.h(3, this.uin);
            }
            java.lang.String str3 = this.username;
            if (str3 != null && this.hasSetFields[4]) {
                i18 += b36.f.j(4, str3);
            }
            com.tencent.ilink.auth.IlinkLoginScene ilinkLoginScene2 = this.login_scene;
            if (ilinkLoginScene2 != null && this.hasSetFields[5]) {
                i18 += b36.f.e(5, ilinkLoginScene2.value);
            }
            java.lang.String str4 = this.wss_token;
            if (str4 != null && this.hasSetFields[6]) {
                i18 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.ilink_network_buffer;
            return (gVar2 == null || !this.hasSetFields[7]) ? i18 : i18 + b36.f.b(7, gVar2);
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
                this.login_status = com.tencent.ilink.auth.IlinkLoginStatus.forNumber(aVar2.g(intValue));
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.login_type = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.uin = aVar2.i(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.username = aVar2.k(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.login_scene = com.tencent.ilink.auth.IlinkLoginScene.forNumber(aVar2.g(intValue));
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.wss_token = aVar2.k(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.ilink_network_buffer = aVar2.d(intValue);
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.auth.IlinkUserInfo setIlinkNetworkBuffer(com.tencent.mm.protobuf.g gVar) {
        this.ilink_network_buffer = gVar;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkUserInfo setLoginScene(com.tencent.ilink.auth.IlinkLoginScene ilinkLoginScene) {
        this.login_scene = ilinkLoginScene;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkUserInfo setLoginStatus(com.tencent.ilink.auth.IlinkLoginStatus ilinkLoginStatus) {
        this.login_status = ilinkLoginStatus;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkUserInfo setLoginType(int i17) {
        this.login_type = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkUserInfo setUin(long j17) {
        this.uin = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkUserInfo setUsername(java.lang.String str) {
        this.username = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkUserInfo setWssToken(java.lang.String str) {
        this.wss_token = str;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkUserInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkUserInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkUserInfo) super.parseFrom(bArr);
    }
}
