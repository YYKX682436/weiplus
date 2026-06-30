package com.tencent.cloud.component.common.ai.log;

/* loaded from: classes14.dex */
public class AiLogConfig {
    public static final java.lang.String DEFAULT_STRING = "aiLog";
    public java.lang.String defaultTag;
    public java.lang.String dirLog;
    public long fileOutTime;
    public boolean isLogCat;
    public boolean isOpen;
    public boolean isUseExternalFile;
    public java.lang.String logName;
    public int minLevel;
    public boolean recordLogContentOnly;
    public boolean useOriginFileName;

    /* loaded from: classes14.dex */
    public static class AiLogConfigBuilder {
        public java.lang.String defaultTag = com.tencent.cloud.component.common.ai.log.AiLogConfig.DEFAULT_STRING;
        public java.lang.String dirLog = com.tencent.cloud.component.common.ai.log.AiLogConfig.DEFAULT_STRING;
        public java.lang.String logName = com.tencent.cloud.component.common.ai.log.AiLogConfig.DEFAULT_STRING;
        public boolean isLogCat = true;
        public boolean isOpen = true;
        public int minLevel = 2;
        public long fileOutTime = 259200000;
        public boolean isUseExternalFile = false;
        public boolean recordLogContentOnly = false;
        public boolean useOriginFileName = false;

        public com.tencent.cloud.component.common.ai.log.AiLogConfig create() {
            return new com.tencent.cloud.component.common.ai.log.AiLogConfig(this);
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setDefaultTag(java.lang.String str) {
            this.defaultTag = str;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setDirLog(java.lang.String str) {
            this.dirLog = str;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setFileOutTime(long j17) {
            this.fileOutTime = j17;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setLogCat(boolean z17) {
            this.isLogCat = z17;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setLogName(java.lang.String str) {
            this.logName = str;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setMinLevel(int i17) {
            this.minLevel = i17;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setOpen(boolean z17) {
            this.isOpen = z17;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setRecordLogContentOnly(boolean z17) {
            this.recordLogContentOnly = z17;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setUseExternalFile(boolean z17) {
            this.isUseExternalFile = z17;
            return this;
        }

        public com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder setUseOriginFileName(boolean z17) {
            this.useOriginFileName = z17;
            return this;
        }
    }

    public java.lang.String getDefaultTag() {
        return this.defaultTag;
    }

    public java.lang.String getDirLog() {
        return this.dirLog;
    }

    public long getFileOutTime() {
        return this.fileOutTime;
    }

    public java.lang.String getLogName() {
        return this.logName;
    }

    public int getMinLevel() {
        return this.minLevel;
    }

    public boolean isLogCat() {
        return this.isLogCat;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public boolean isRecordLogContentOnly() {
        return this.recordLogContentOnly;
    }

    public boolean isUseExternalFile() {
        return this.isUseExternalFile;
    }

    public boolean isUseOriginFileName() {
        return this.useOriginFileName;
    }

    public AiLogConfig(com.tencent.cloud.component.common.ai.log.AiLogConfig.AiLogConfigBuilder aiLogConfigBuilder) {
        this.isUseExternalFile = false;
        this.recordLogContentOnly = false;
        this.useOriginFileName = false;
        this.defaultTag = aiLogConfigBuilder.defaultTag;
        this.dirLog = aiLogConfigBuilder.dirLog;
        this.isLogCat = aiLogConfigBuilder.isLogCat;
        this.isOpen = aiLogConfigBuilder.isOpen;
        this.fileOutTime = aiLogConfigBuilder.fileOutTime;
        this.minLevel = aiLogConfigBuilder.minLevel;
        this.logName = aiLogConfigBuilder.logName;
        this.isUseExternalFile = aiLogConfigBuilder.isUseExternalFile;
        this.recordLogContentOnly = aiLogConfigBuilder.recordLogContentOnly;
        this.useOriginFileName = aiLogConfigBuilder.useOriginFileName;
    }
}
