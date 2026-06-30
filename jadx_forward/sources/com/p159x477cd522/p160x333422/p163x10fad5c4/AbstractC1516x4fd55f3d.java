package com.p159x477cd522.p160x333422.p163x10fad5c4;

/* renamed from: com.eclipsesource.mmv8.snapshot.CreateSnapshotResult */
/* loaded from: classes7.dex */
public abstract class AbstractC1516x4fd55f3d {

    /* renamed from: com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Failure */
    /* loaded from: classes7.dex */
    public static final class Failure extends com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d {

        /* renamed from: ERRNO_CREATE_SNAPSHOT_FAILURE */
        public static final int f5007xe2957759 = -9;

        /* renamed from: ERRNO_CREATE_WARMUP_SNAPSHOT_FAILURE */
        public static final int f5008x98f85fc4 = -11;

        /* renamed from: ERRNO_ILLEGAL_PARAMS */
        public static final int f5009xd9e98e28 = -101;

        /* renamed from: ERRNO_INJECT_CONSOLE_FAILURE */
        public static final int f5010xeccfc64d = -1;

        /* renamed from: ERRNO_INVALID_BOOTSTRAP_SCRIPT */
        public static final int f5011xcf13619d = -4;

        /* renamed from: ERRNO_JNI_SERIALIZE_DESERIALIZE_FAILURE */
        public static final int f5012x4cda7118 = -103;

        /* renamed from: ERRNO_LOAD_SO_FAILURE */
        public static final int f5013x9d10e307 = -102;

        /* renamed from: ERRNO_OFFSET */
        private static final int f5014x6b3a112c = -100;

        /* renamed from: ERRNO_READ_BOOTSTRAP_SCRIPT_FAILURE */
        public static final int f5015x733259d7 = -5;

        /* renamed from: ERRNO_READ_GLUE_SCRIPT_FAILURE */
        public static final int f5016x2b4cb970 = 2;

        /* renamed from: ERRNO_READ_WARMUP_SCRIPT_FAILURE */
        public static final int f5017x5ee1e865 = -7;

        /* renamed from: ERRNO_RUN_BOOTSTRAP_SCRIPT_FAILURE */
        public static final int f5018x81b5bb34 = -6;

        /* renamed from: ERRNO_RUN_GLUE_SCRIPT_FAILURE */
        public static final int f5019x151f31f3 = -3;

        /* renamed from: ERRNO_RUN_WARMUP_SCRIPT_FAILURE */
        public static final int f5020x1df84c28 = -8;

        /* renamed from: ERRNO_WRITE_SNAPSHOT_FAILURE */
        public static final int f5021xe7682508 = -10;

        /* renamed from: ERR_MSG_ILLEGAL_PARAMS */
        public static final java.lang.String f5022x9bb5467 = "Illegal params";

        /* renamed from: ERR_MSG_JNI_SERIALIZE_DESERIALIZE_FAILURE */
        public static final java.lang.String f5023xee0aac79 = "Jni serialize/deserialize failure";

        /* renamed from: ERR_MSG_LOAD_SO_FAILURE */
        public static final java.lang.String f5024x6777e4a8 = "Load so failure";

        /* renamed from: errMsg */
        public final java.lang.String f5025xb2d4efdc;

        /* renamed from: errno */
        public final int f5026x5c4d1e6;

        public Failure(int i17, java.lang.String str) {
            if (com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str)) {
                throw new java.lang.IllegalArgumentException("errMsg is illegal");
            }
            this.f5026x5c4d1e6 = i17;
            this.f5025xb2d4efdc = str;
        }

        /* renamed from: toString */
        public java.lang.String m16627x9616526c() {
            return "CreateSnapshotResult$Failure{errno=" + this.f5026x5c4d1e6 + ", errMsg='" + this.f5025xb2d4efdc + "'}";
        }
    }

    /* renamed from: com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Success */
    /* loaded from: classes7.dex */
    public static final class Success extends com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d {

        /* renamed from: INVALID_CONTEXT_INDEX */
        public static int f5027x1f5f799a = -1;

        /* renamed from: NODE_MAIN_CONTEXT_INDEX */
        public static int f5028x572d1359;

        /* renamed from: contextNameToSnapshotIndexMap */
        public java.util.Map<java.lang.String, java.lang.Integer> f5029x86815c23;

        /* renamed from: snapshotPath */
        public java.lang.String f5030xc8782c09;

        public Success(java.lang.String str, java.util.Map<java.lang.String, java.lang.Integer> map) {
            if (com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str)) {
                throw new java.lang.IllegalArgumentException("snapshotPath is illegal");
            }
            if (map == null) {
                throw new java.lang.IllegalArgumentException("contextNameToSnapshotIndexMap is illegal");
            }
            this.f5030xc8782c09 = str;
            this.f5029x86815c23 = map;
        }

        /* renamed from: toString */
        public java.lang.String m16628x9616526c() {
            return "CreateSnapshotResult$Success{snapshotPath='" + this.f5030xc8782c09 + "', contextNameToSnapshotIndexMap=" + this.f5029x86815c23 + '}';
        }
    }
}
