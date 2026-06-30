package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class InitConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.InitConfig DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.InitConfig();
    private final boolean[] hasSetFields = new boolean[4];
    private java.lang.String history_savepath;
    private boolean is_weixin_user;
    private java.lang.String username;

    public static com.tencent.mars.cdn.proto.InitConfig create() {
        return new com.tencent.mars.cdn.proto.InitConfig();
    }

    public static com.tencent.mars.cdn.proto.InitConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.InitConfig newBuilder() {
        return new com.tencent.mars.cdn.proto.InitConfig();
    }

    public com.tencent.mars.cdn.proto.InitConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.InitConfig)) {
            return false;
        }
        com.tencent.mars.cdn.proto.InitConfig initConfig = (com.tencent.mars.cdn.proto.InitConfig) fVar;
        return n51.f.a(this.history_savepath, initConfig.history_savepath) && n51.f.a(this.username, initConfig.username) && n51.f.a(java.lang.Boolean.valueOf(this.is_weixin_user), java.lang.Boolean.valueOf(initConfig.is_weixin_user));
    }

    public java.lang.String getHistorySavepath() {
        return this.hasSetFields[1] ? this.history_savepath : "";
    }

    public boolean getIsWeixinUser() {
        return this.is_weixin_user;
    }

    public java.lang.String getUsername() {
        return this.hasSetFields[2] ? this.username : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHistorySavepath() {
        return hasFieldNumber(1);
    }

    public boolean hasIsWeixinUser() {
        return hasFieldNumber(3);
    }

    public boolean hasUsername() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.InitConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.InitConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.history_savepath;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.username;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.is_weixin_user);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.history_savepath;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.username;
            if (str4 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str4);
            }
            return this.hasSetFields[3] ? i18 + b36.f.a(3, this.is_weixin_user) : i18;
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
            this.history_savepath = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.username = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.is_weixin_user = aVar2.c(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.InitConfig setHistorySavepath(java.lang.String str) {
        this.history_savepath = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.InitConfig setIsWeixinUser(boolean z17) {
        this.is_weixin_user = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.InitConfig setUsername(java.lang.String str) {
        this.username = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.InitConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.InitConfig parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.InitConfig) super.parseFrom(bArr);
    }
}
