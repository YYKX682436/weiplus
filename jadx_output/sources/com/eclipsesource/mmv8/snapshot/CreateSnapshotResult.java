package com.eclipsesource.mmv8.snapshot;

/* loaded from: classes7.dex */
public abstract class CreateSnapshotResult {

    /* loaded from: classes7.dex */
    public static final class Failure extends com.eclipsesource.mmv8.snapshot.CreateSnapshotResult {
        public static final int ERRNO_CREATE_SNAPSHOT_FAILURE = -9;
        public static final int ERRNO_CREATE_WARMUP_SNAPSHOT_FAILURE = -11;
        public static final int ERRNO_ILLEGAL_PARAMS = -101;
        public static final int ERRNO_INJECT_CONSOLE_FAILURE = -1;
        public static final int ERRNO_INVALID_BOOTSTRAP_SCRIPT = -4;
        public static final int ERRNO_JNI_SERIALIZE_DESERIALIZE_FAILURE = -103;
        public static final int ERRNO_LOAD_SO_FAILURE = -102;
        private static final int ERRNO_OFFSET = -100;
        public static final int ERRNO_READ_BOOTSTRAP_SCRIPT_FAILURE = -5;
        public static final int ERRNO_READ_GLUE_SCRIPT_FAILURE = 2;
        public static final int ERRNO_READ_WARMUP_SCRIPT_FAILURE = -7;
        public static final int ERRNO_RUN_BOOTSTRAP_SCRIPT_FAILURE = -6;
        public static final int ERRNO_RUN_GLUE_SCRIPT_FAILURE = -3;
        public static final int ERRNO_RUN_WARMUP_SCRIPT_FAILURE = -8;
        public static final int ERRNO_WRITE_SNAPSHOT_FAILURE = -10;
        public static final java.lang.String ERR_MSG_ILLEGAL_PARAMS = "Illegal params";
        public static final java.lang.String ERR_MSG_JNI_SERIALIZE_DESERIALIZE_FAILURE = "Jni serialize/deserialize failure";
        public static final java.lang.String ERR_MSG_LOAD_SO_FAILURE = "Load so failure";
        public final java.lang.String errMsg;
        public final int errno;

        public Failure(int i17, java.lang.String str) {
            if (com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(str)) {
                throw new java.lang.IllegalArgumentException("errMsg is illegal");
            }
            this.errno = i17;
            this.errMsg = str;
        }

        public java.lang.String toString() {
            return "CreateSnapshotResult$Failure{errno=" + this.errno + ", errMsg='" + this.errMsg + "'}";
        }
    }

    /* loaded from: classes7.dex */
    public static final class Success extends com.eclipsesource.mmv8.snapshot.CreateSnapshotResult {
        public static int INVALID_CONTEXT_INDEX = -1;
        public static int NODE_MAIN_CONTEXT_INDEX;
        public java.util.Map<java.lang.String, java.lang.Integer> contextNameToSnapshotIndexMap;
        public java.lang.String snapshotPath;

        public Success(java.lang.String str, java.util.Map<java.lang.String, java.lang.Integer> map) {
            if (com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(str)) {
                throw new java.lang.IllegalArgumentException("snapshotPath is illegal");
            }
            if (map == null) {
                throw new java.lang.IllegalArgumentException("contextNameToSnapshotIndexMap is illegal");
            }
            this.snapshotPath = str;
            this.contextNameToSnapshotIndexMap = map;
        }

        public java.lang.String toString() {
            return "CreateSnapshotResult$Success{snapshotPath='" + this.snapshotPath + "', contextNameToSnapshotIndexMap=" + this.contextNameToSnapshotIndexMap + '}';
        }
    }
}
