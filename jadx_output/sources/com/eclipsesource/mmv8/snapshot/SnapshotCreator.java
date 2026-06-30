package com.eclipsesource.mmv8.snapshot;

/* loaded from: classes7.dex */
public class SnapshotCreator {
    private static final java.lang.String SNAPSHOT_FLAGS = "--turbo-instruction-scheduling";
    private static final java.lang.String SNAPSHOT_PROFILE_FLAGS = "--profile-deserialization";

    static {
        com.eclipsesource.mmv8.V8.setFlags(com.eclipsesource.mmv8.V8.getFlags() + " --turbo-instruction-scheduling --profile-deserialization");
    }

    private SnapshotCreator() {
    }

    public static com.eclipsesource.mmv8.snapshot.CreateSnapshotResult create(com.eclipsesource.mmv8.snapshot.CreateSnapshotParams createSnapshotParams) {
        return create(null, createSnapshotParams);
    }

    public static com.eclipsesource.mmv8.snapshot.CreateSnapshotResult create(java.lang.String str, com.eclipsesource.mmv8.snapshot.CreateSnapshotParams createSnapshotParams) {
        if (createSnapshotParams == null) {
            return new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-101, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure.ERR_MSG_ILLEGAL_PARAMS);
        }
        if (!com.eclipsesource.mmv8.V8.requireSoLoaded(str)) {
            return new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-102, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure.ERR_MSG_LOAD_SO_FAILURE);
        }
        com.eclipsesource.mmv8.snapshot.CreateSnapshotResult _createSnapshot = com.eclipsesource.mmv8.V8._createSnapshot(createSnapshotParams);
        return _createSnapshot == null ? new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-103, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure.ERR_MSG_JNI_SERIALIZE_DESERIALIZE_FAILURE) : _createSnapshot;
    }
}
