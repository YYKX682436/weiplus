package com.tencent.ilink.network;

/* loaded from: classes15.dex */
public class IlinkStartConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkStartConfig DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkStartConfig();
    private int app_version;
    private java.lang.String debug_ip;
    private int debug_net;
    private boolean enable_cdn_dns_limit;
    private java.lang.String file_dir;
    private int group_key;
    private final boolean[] hasSetFields = new boolean[12];
    private com.tencent.ilink.network.IlinkRunningMode running_mode;
    private int select_domain;
    private java.lang.String short_debug_ip;
    private int short_debug_ip_port;
    private com.tencent.mm.protobuf.g wechat_devicetype;

    public static com.tencent.ilink.network.IlinkStartConfig create() {
        return new com.tencent.ilink.network.IlinkStartConfig();
    }

    public static com.tencent.ilink.network.IlinkStartConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkStartConfig newBuilder() {
        return new com.tencent.ilink.network.IlinkStartConfig();
    }

    public com.tencent.ilink.network.IlinkStartConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkStartConfig)) {
            return false;
        }
        com.tencent.ilink.network.IlinkStartConfig ilinkStartConfig = (com.tencent.ilink.network.IlinkStartConfig) fVar;
        return n51.f.a(this.file_dir, ilinkStartConfig.file_dir) && n51.f.a(java.lang.Integer.valueOf(this.debug_net), java.lang.Integer.valueOf(ilinkStartConfig.debug_net)) && n51.f.a(this.debug_ip, ilinkStartConfig.debug_ip) && n51.f.a(java.lang.Integer.valueOf(this.select_domain), java.lang.Integer.valueOf(ilinkStartConfig.select_domain)) && n51.f.a(this.running_mode, ilinkStartConfig.running_mode) && n51.f.a(java.lang.Integer.valueOf(this.app_version), java.lang.Integer.valueOf(ilinkStartConfig.app_version)) && n51.f.a(this.wechat_devicetype, ilinkStartConfig.wechat_devicetype) && n51.f.a(java.lang.Boolean.valueOf(this.enable_cdn_dns_limit), java.lang.Boolean.valueOf(ilinkStartConfig.enable_cdn_dns_limit)) && n51.f.a(java.lang.Integer.valueOf(this.group_key), java.lang.Integer.valueOf(ilinkStartConfig.group_key)) && n51.f.a(this.short_debug_ip, ilinkStartConfig.short_debug_ip) && n51.f.a(java.lang.Integer.valueOf(this.short_debug_ip_port), java.lang.Integer.valueOf(ilinkStartConfig.short_debug_ip_port));
    }

    public int getAppVersion() {
        return this.app_version;
    }

    public java.lang.String getDebugIp() {
        return this.hasSetFields[3] ? this.debug_ip : "";
    }

    public int getDebugNet() {
        return this.debug_net;
    }

    public boolean getEnableCdnDnsLimit() {
        return this.enable_cdn_dns_limit;
    }

    public java.lang.String getFileDir() {
        return this.hasSetFields[1] ? this.file_dir : "";
    }

    public int getGroupKey() {
        return this.group_key;
    }

    public com.tencent.ilink.network.IlinkRunningMode getRunningMode() {
        return this.hasSetFields[5] ? this.running_mode : com.tencent.ilink.network.IlinkRunningMode.kIlinkDeviceMode;
    }

    public int getSelectDomain() {
        return this.select_domain;
    }

    public java.lang.String getShortDebugIp() {
        return this.hasSetFields[10] ? this.short_debug_ip : "";
    }

    public int getShortDebugIpPort() {
        return this.short_debug_ip_port;
    }

    public com.tencent.mm.protobuf.g getWechatDevicetype() {
        return this.hasSetFields[7] ? this.wechat_devicetype : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasAppVersion() {
        return hasFieldNumber(6);
    }

    public boolean hasDebugIp() {
        return hasFieldNumber(3);
    }

    public boolean hasDebugNet() {
        return hasFieldNumber(2);
    }

    public boolean hasEnableCdnDnsLimit() {
        return hasFieldNumber(8);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileDir() {
        return hasFieldNumber(1);
    }

    public boolean hasGroupKey() {
        return hasFieldNumber(9);
    }

    public boolean hasRunningMode() {
        return hasFieldNumber(5);
    }

    public boolean hasSelectDomain() {
        return hasFieldNumber(4);
    }

    public boolean hasShortDebugIp() {
        return hasFieldNumber(10);
    }

    public boolean hasShortDebugIpPort() {
        return hasFieldNumber(11);
    }

    public boolean hasWechatDevicetype() {
        return hasFieldNumber(7);
    }

    public com.tencent.ilink.network.IlinkStartConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkStartConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.file_dir;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.debug_net);
            }
            java.lang.String str2 = this.debug_ip;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.select_domain);
            }
            com.tencent.ilink.network.IlinkRunningMode ilinkRunningMode = this.running_mode;
            if (ilinkRunningMode != null && this.hasSetFields[5]) {
                fVar.e(5, ilinkRunningMode.value);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.app_version);
            }
            com.tencent.mm.protobuf.g gVar = this.wechat_devicetype;
            if (gVar != null && this.hasSetFields[7]) {
                fVar.b(7, gVar);
            }
            if (this.hasSetFields[8]) {
                fVar.a(8, this.enable_cdn_dns_limit);
            }
            if (this.hasSetFields[9]) {
                fVar.e(9, this.group_key);
            }
            java.lang.String str3 = this.short_debug_ip;
            if (str3 != null && this.hasSetFields[10]) {
                fVar.j(10, str3);
            }
            if (this.hasSetFields[11]) {
                fVar.e(11, this.short_debug_ip_port);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.file_dir;
            if (str4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.debug_net);
            }
            java.lang.String str5 = this.debug_ip;
            if (str5 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str5);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.select_domain);
            }
            com.tencent.ilink.network.IlinkRunningMode ilinkRunningMode2 = this.running_mode;
            if (ilinkRunningMode2 != null && this.hasSetFields[5]) {
                i18 += b36.f.e(5, ilinkRunningMode2.value);
            }
            if (this.hasSetFields[6]) {
                i18 += b36.f.e(6, this.app_version);
            }
            com.tencent.mm.protobuf.g gVar2 = this.wechat_devicetype;
            if (gVar2 != null && this.hasSetFields[7]) {
                i18 += b36.f.b(7, gVar2);
            }
            if (this.hasSetFields[8]) {
                i18 += b36.f.a(8, this.enable_cdn_dns_limit);
            }
            if (this.hasSetFields[9]) {
                i18 += b36.f.e(9, this.group_key);
            }
            java.lang.String str6 = this.short_debug_ip;
            if (str6 != null && this.hasSetFields[10]) {
                i18 += b36.f.j(10, str6);
            }
            return this.hasSetFields[11] ? i18 + b36.f.e(11, this.short_debug_ip_port) : i18;
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
                this.file_dir = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.debug_net = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.debug_ip = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.select_domain = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.running_mode = com.tencent.ilink.network.IlinkRunningMode.forNumber(aVar2.g(intValue));
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.app_version = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.wechat_devicetype = aVar2.d(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.enable_cdn_dns_limit = aVar2.c(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.group_key = aVar2.g(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.short_debug_ip = aVar2.k(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.short_debug_ip_port = aVar2.g(intValue);
                this.hasSetFields[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkStartConfig setAppVersion(int i17) {
        this.app_version = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setDebugIp(java.lang.String str) {
        this.debug_ip = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setDebugNet(int i17) {
        this.debug_net = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setEnableCdnDnsLimit(boolean z17) {
        this.enable_cdn_dns_limit = z17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setFileDir(java.lang.String str) {
        this.file_dir = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setGroupKey(int i17) {
        this.group_key = i17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setRunningMode(com.tencent.ilink.network.IlinkRunningMode ilinkRunningMode) {
        this.running_mode = ilinkRunningMode;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setSelectDomain(int i17) {
        this.select_domain = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setShortDebugIp(java.lang.String str) {
        this.short_debug_ip = str;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setShortDebugIpPort(int i17) {
        this.short_debug_ip_port = i17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig setWechatDevicetype(com.tencent.mm.protobuf.g gVar) {
        this.wechat_devicetype = gVar;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkStartConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkStartConfig parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkStartConfig) super.parseFrom(bArr);
    }
}
