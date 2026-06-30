package com.eclipsesource.mmv8.snapshot;

/* loaded from: classes7.dex */
public final class ContextBootstrapParams {
    public final com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo[] bootstrapScriptInfos;
    public final java.lang.String name;
    public final boolean setupNodeEnv;
    public final com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo snapshotGlueScriptInfo;

    /* loaded from: classes7.dex */
    public static class Builder {
        private com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo mSnapshotGlueScriptInfo;
        private java.lang.String mName = null;
        private final java.util.List<com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo> mBootstrapScriptInfos = new java.util.ArrayList();
        private boolean mSetupNodeEnv = false;

        public com.eclipsesource.mmv8.snapshot.ContextBootstrapParams.Builder appendBootstrapScriptInfo(com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo snapshotScriptInfo) {
            this.mBootstrapScriptInfos.add(snapshotScriptInfo);
            return this;
        }

        public com.eclipsesource.mmv8.snapshot.ContextBootstrapParams build() {
            if (com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(this.mName)) {
                throw new java.lang.IllegalStateException("name is empty");
            }
            int size = this.mBootstrapScriptInfos.size();
            com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo[] snapshotScriptInfoArr = new com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo[size];
            for (int i17 = 0; i17 < size; i17++) {
                snapshotScriptInfoArr[i17] = this.mBootstrapScriptInfos.get(i17);
            }
            return new com.eclipsesource.mmv8.snapshot.ContextBootstrapParams(this.mName, this.mSnapshotGlueScriptInfo, snapshotScriptInfoArr, this.mSetupNodeEnv);
        }

        public com.eclipsesource.mmv8.snapshot.ContextBootstrapParams.Builder name(java.lang.String str) {
            if (com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(str)) {
                throw new java.lang.IllegalArgumentException("name is empty");
            }
            this.mName = str;
            return this;
        }

        public com.eclipsesource.mmv8.snapshot.ContextBootstrapParams.Builder setupNodeEnv(boolean z17) {
            this.mSetupNodeEnv = z17;
            return this;
        }

        public com.eclipsesource.mmv8.snapshot.ContextBootstrapParams.Builder snapshotGlueScriptInfo(com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo snapshotScriptInfo) {
            this.mSnapshotGlueScriptInfo = snapshotScriptInfo;
            return this;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.eclipsesource.mmv8.snapshot.ContextBootstrapParams.class != obj.getClass()) {
            return false;
        }
        return this.name.equals(((com.eclipsesource.mmv8.snapshot.ContextBootstrapParams) obj).name);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.name);
    }

    public java.lang.String toString() {
        return "ContextBootstrapParams{name='" + this.name + "', snapshotGlueScriptInfo=" + this.snapshotGlueScriptInfo + ", bootstrapScriptInfos=" + java.util.Arrays.toString(this.bootstrapScriptInfos) + ", setupNodeEnv=" + this.setupNodeEnv + '}';
    }

    private ContextBootstrapParams(java.lang.String str, com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo snapshotScriptInfo, com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo[] snapshotScriptInfoArr, boolean z17) {
        this.name = str;
        this.snapshotGlueScriptInfo = snapshotScriptInfo;
        this.bootstrapScriptInfos = snapshotScriptInfoArr;
        this.setupNodeEnv = z17;
    }
}
