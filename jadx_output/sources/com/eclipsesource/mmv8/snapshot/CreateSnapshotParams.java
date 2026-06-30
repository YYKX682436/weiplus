package com.eclipsesource.mmv8.snapshot;

/* loaded from: classes7.dex */
public final class CreateSnapshotParams {
    public final java.util.List<com.eclipsesource.mmv8.snapshot.ContextBootstrapParams> contextBootstrapParamsList;
    public final com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo globalSnapshotGlueScriptInfo;
    public boolean injectConsole;
    public final boolean keepCompiledData;
    public final java.lang.String snapshotDirPath;
    public final java.util.List<com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo> warmupScriptInfoList;

    public CreateSnapshotParams(boolean z17, com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo snapshotScriptInfo, java.util.List<com.eclipsesource.mmv8.snapshot.ContextBootstrapParams> list, java.util.List<com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo> list2, boolean z18, java.lang.String str) {
        if (list != null) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.eclipsesource.mmv8.snapshot.ContextBootstrapParams contextBootstrapParams = list.get(i17);
                if (contextBootstrapParams == null) {
                    throw new java.lang.IllegalArgumentException("contextBootstrapParams is null");
                }
                if (contextBootstrapParams.setupNodeEnv && com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.NODE_MAIN_CONTEXT_INDEX != i17) {
                    throw new java.lang.IllegalArgumentException("only the first contextBootstrapParams support setupNodeEnv");
                }
            }
        }
        if (list2 != null) {
            java.util.Iterator<com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo> it = list2.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new java.lang.IllegalArgumentException("warmupScriptInfo is null");
                }
            }
        }
        if (com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(str)) {
            throw new java.lang.IllegalArgumentException("snapshotDirPath is illegal");
        }
        this.injectConsole = z17;
        this.globalSnapshotGlueScriptInfo = snapshotScriptInfo;
        this.contextBootstrapParamsList = list == null ? java.util.Collections.emptyList() : list;
        this.warmupScriptInfoList = list2 == null ? java.util.Collections.emptyList() : list2;
        this.keepCompiledData = z18;
        this.snapshotDirPath = str;
    }

    public java.lang.String toString() {
        return "CreateSnapshotParams{injectConsole=" + this.injectConsole + ", globalSnapshotGlueScriptInfo=" + this.globalSnapshotGlueScriptInfo + ", contextBootstrapParamsList=" + java.util.Arrays.toString(this.contextBootstrapParamsList.toArray()) + ", warmupScriptInfoList=" + java.util.Arrays.toString(this.warmupScriptInfoList.toArray()) + ", keepCompiledData=" + this.keepCompiledData + ", snapshotDirPath='" + this.snapshotDirPath + "'}";
    }
}
