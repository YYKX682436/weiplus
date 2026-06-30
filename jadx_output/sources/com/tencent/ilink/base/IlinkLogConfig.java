package com.tencent.ilink.base;

/* loaded from: classes15.dex */
public class IlinkLogConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.base.IlinkLogConfig DEFAULT_INSTANCE = new com.tencent.ilink.base.IlinkLogConfig();
    private boolean config_xlog;
    private boolean custom_log;
    private boolean enable_console;
    private boolean enable_filter;
    private boolean enable_xlog;
    private final boolean[] hasSetFields = new boolean[9];
    private com.tencent.ilink.network.IlinkLogLevel level;
    private com.tencent.ilink.base.IlinkLogMode log_mode;
    private java.lang.String xlog_so_name;

    public static com.tencent.ilink.base.IlinkLogConfig create() {
        return new com.tencent.ilink.base.IlinkLogConfig();
    }

    public static com.tencent.ilink.base.IlinkLogConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.base.IlinkLogConfig newBuilder() {
        return new com.tencent.ilink.base.IlinkLogConfig();
    }

    public com.tencent.ilink.base.IlinkLogConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.base.IlinkLogConfig)) {
            return false;
        }
        com.tencent.ilink.base.IlinkLogConfig ilinkLogConfig = (com.tencent.ilink.base.IlinkLogConfig) fVar;
        return n51.f.a(this.level, ilinkLogConfig.level) && n51.f.a(java.lang.Boolean.valueOf(this.custom_log), java.lang.Boolean.valueOf(ilinkLogConfig.custom_log)) && n51.f.a(java.lang.Boolean.valueOf(this.enable_console), java.lang.Boolean.valueOf(ilinkLogConfig.enable_console)) && n51.f.a(java.lang.Boolean.valueOf(this.enable_filter), java.lang.Boolean.valueOf(ilinkLogConfig.enable_filter)) && n51.f.a(java.lang.Boolean.valueOf(this.enable_xlog), java.lang.Boolean.valueOf(ilinkLogConfig.enable_xlog)) && n51.f.a(this.xlog_so_name, ilinkLogConfig.xlog_so_name) && n51.f.a(java.lang.Boolean.valueOf(this.config_xlog), java.lang.Boolean.valueOf(ilinkLogConfig.config_xlog)) && n51.f.a(this.log_mode, ilinkLogConfig.log_mode);
    }

    public boolean getConfigXlog() {
        return this.config_xlog;
    }

    public boolean getCustomLog() {
        return this.custom_log;
    }

    public boolean getEnableConsole() {
        return this.enable_console;
    }

    public boolean getEnableFilter() {
        return this.enable_filter;
    }

    public boolean getEnableXlog() {
        return this.enable_xlog;
    }

    public com.tencent.ilink.network.IlinkLogLevel getLevel() {
        return this.hasSetFields[1] ? this.level : com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelVerbose;
    }

    public com.tencent.ilink.base.IlinkLogMode getLogMode() {
        return this.hasSetFields[8] ? this.log_mode : com.tencent.ilink.base.IlinkLogMode.kIlinkLogModeSync;
    }

    public java.lang.String getXlogSoName() {
        return this.hasSetFields[6] ? this.xlog_so_name : "";
    }

    public boolean hasConfigXlog() {
        return hasFieldNumber(7);
    }

    public boolean hasCustomLog() {
        return hasFieldNumber(2);
    }

    public boolean hasEnableConsole() {
        return hasFieldNumber(3);
    }

    public boolean hasEnableFilter() {
        return hasFieldNumber(4);
    }

    public boolean hasEnableXlog() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLevel() {
        return hasFieldNumber(1);
    }

    public boolean hasLogMode() {
        return hasFieldNumber(8);
    }

    public boolean hasXlogSoName() {
        return hasFieldNumber(6);
    }

    public com.tencent.ilink.base.IlinkLogConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.base.IlinkLogConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.ilink.network.IlinkLogLevel ilinkLogLevel = this.level;
            if (ilinkLogLevel != null && this.hasSetFields[1]) {
                fVar.e(1, ilinkLogLevel.value);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.custom_log);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.enable_console);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.enable_filter);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.enable_xlog);
            }
            java.lang.String str = this.xlog_so_name;
            if (str != null && this.hasSetFields[6]) {
                fVar.j(6, str);
            }
            if (this.hasSetFields[7]) {
                fVar.a(7, this.config_xlog);
            }
            com.tencent.ilink.base.IlinkLogMode ilinkLogMode = this.log_mode;
            if (ilinkLogMode != null && this.hasSetFields[8]) {
                fVar.e(8, ilinkLogMode.value);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.ilink.network.IlinkLogLevel ilinkLogLevel2 = this.level;
            if (ilinkLogLevel2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.e(1, ilinkLogLevel2.value);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.a(2, this.custom_log);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.a(3, this.enable_console);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.a(4, this.enable_filter);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.a(5, this.enable_xlog);
            }
            java.lang.String str2 = this.xlog_so_name;
            if (str2 != null && this.hasSetFields[6]) {
                i18 += b36.f.j(6, str2);
            }
            if (this.hasSetFields[7]) {
                i18 += b36.f.a(7, this.config_xlog);
            }
            com.tencent.ilink.base.IlinkLogMode ilinkLogMode2 = this.log_mode;
            return (ilinkLogMode2 == null || !this.hasSetFields[8]) ? i18 : i18 + b36.f.e(8, ilinkLogMode2.value);
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
                this.level = com.tencent.ilink.network.IlinkLogLevel.forNumber(aVar2.g(intValue));
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.custom_log = aVar2.c(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.enable_console = aVar2.c(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.enable_filter = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.enable_xlog = aVar2.c(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.xlog_so_name = aVar2.k(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.config_xlog = aVar2.c(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.log_mode = com.tencent.ilink.base.IlinkLogMode.forNumber(aVar2.g(intValue));
                this.hasSetFields[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.base.IlinkLogConfig setConfigXlog(boolean z17) {
        this.config_xlog = z17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig setCustomLog(boolean z17) {
        this.custom_log = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig setEnableConsole(boolean z17) {
        this.enable_console = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig setEnableFilter(boolean z17) {
        this.enable_filter = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig setEnableXlog(boolean z17) {
        this.enable_xlog = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig setLevel(com.tencent.ilink.network.IlinkLogLevel ilinkLogLevel) {
        this.level = ilinkLogLevel;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig setLogMode(com.tencent.ilink.base.IlinkLogMode ilinkLogMode) {
        this.log_mode = ilinkLogMode;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig setXlogSoName(java.lang.String str) {
        this.xlog_so_name = str;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.base.IlinkLogConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.base.IlinkLogConfig parseFrom(byte[] bArr) {
        return (com.tencent.ilink.base.IlinkLogConfig) super.parseFrom(bArr);
    }
}
