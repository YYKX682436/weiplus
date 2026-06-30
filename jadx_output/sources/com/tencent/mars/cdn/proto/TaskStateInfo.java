package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class TaskStateInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.TaskStateInfo DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.TaskStateInfo();
    private long cellular_recv_bytes;
    private long cellular_send_bytes;
    private final boolean[] hasSetFields = new boolean[6];
    private int task_state;
    private long wifi_recv_bytes;
    private long wifi_send_bytes;

    public static com.tencent.mars.cdn.proto.TaskStateInfo create() {
        return new com.tencent.mars.cdn.proto.TaskStateInfo();
    }

    public static com.tencent.mars.cdn.proto.TaskStateInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.TaskStateInfo newBuilder() {
        return new com.tencent.mars.cdn.proto.TaskStateInfo();
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.TaskStateInfo)) {
            return false;
        }
        com.tencent.mars.cdn.proto.TaskStateInfo taskStateInfo = (com.tencent.mars.cdn.proto.TaskStateInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.task_state), java.lang.Integer.valueOf(taskStateInfo.task_state)) && n51.f.a(java.lang.Long.valueOf(this.wifi_recv_bytes), java.lang.Long.valueOf(taskStateInfo.wifi_recv_bytes)) && n51.f.a(java.lang.Long.valueOf(this.wifi_send_bytes), java.lang.Long.valueOf(taskStateInfo.wifi_send_bytes)) && n51.f.a(java.lang.Long.valueOf(this.cellular_recv_bytes), java.lang.Long.valueOf(taskStateInfo.cellular_recv_bytes)) && n51.f.a(java.lang.Long.valueOf(this.cellular_send_bytes), java.lang.Long.valueOf(taskStateInfo.cellular_send_bytes));
    }

    public long getCellularRecvBytes() {
        return this.cellular_recv_bytes;
    }

    public long getCellularSendBytes() {
        return this.cellular_send_bytes;
    }

    public int getTaskState() {
        return this.task_state;
    }

    public long getWifiRecvBytes() {
        return this.wifi_recv_bytes;
    }

    public long getWifiSendBytes() {
        return this.wifi_send_bytes;
    }

    public boolean hasCellularRecvBytes() {
        return hasFieldNumber(4);
    }

    public boolean hasCellularSendBytes() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasTaskState() {
        return hasFieldNumber(1);
    }

    public boolean hasWifiRecvBytes() {
        return hasFieldNumber(2);
    }

    public boolean hasWifiSendBytes() {
        return hasFieldNumber(3);
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.TaskStateInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.task_state);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.wifi_recv_bytes);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.wifi_send_bytes);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.cellular_recv_bytes);
            }
            if (this.hasSetFields[5]) {
                fVar.h(5, this.cellular_send_bytes);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.task_state) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.h(2, this.wifi_recv_bytes);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.h(3, this.wifi_send_bytes);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.h(4, this.cellular_recv_bytes);
            }
            return this.hasSetFields[5] ? e17 + b36.f.h(5, this.cellular_send_bytes) : e17;
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
            this.task_state = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.wifi_recv_bytes = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.wifi_send_bytes = aVar2.i(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.cellular_recv_bytes = aVar2.i(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.cellular_send_bytes = aVar2.i(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo setCellularRecvBytes(long j17) {
        this.cellular_recv_bytes = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo setCellularSendBytes(long j17) {
        this.cellular_send_bytes = j17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo setTaskState(int i17) {
        this.task_state = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo setWifiRecvBytes(long j17) {
        this.wifi_recv_bytes = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo setWifiSendBytes(long j17) {
        this.wifi_send_bytes = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TaskStateInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.TaskStateInfo parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.TaskStateInfo) super.parseFrom(bArr);
    }
}
