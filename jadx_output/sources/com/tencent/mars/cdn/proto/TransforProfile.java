package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class TransforProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.TransforProfile DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.TransforProfile();
    private long cellular_recv_bytes;
    private long cellular_send_bytes;
    private final boolean[] hasSetFields = new boolean[12];
    private java.lang.String json_profile;
    private long previous_completed_size;
    private int protocol;
    private int protocol_error;
    private long recved_bytes;
    private long sent_bytes;
    private int seq_check;
    private long wifi_recv_bytes;
    private long wifi_send_bytes;

    public static com.tencent.mars.cdn.proto.TransforProfile create() {
        return new com.tencent.mars.cdn.proto.TransforProfile();
    }

    public static com.tencent.mars.cdn.proto.TransforProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.TransforProfile newBuilder() {
        return new com.tencent.mars.cdn.proto.TransforProfile();
    }

    public com.tencent.mars.cdn.proto.TransforProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.TransforProfile)) {
            return false;
        }
        com.tencent.mars.cdn.proto.TransforProfile transforProfile = (com.tencent.mars.cdn.proto.TransforProfile) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.protocol), java.lang.Integer.valueOf(transforProfile.protocol)) && n51.f.a(java.lang.Integer.valueOf(this.protocol_error), java.lang.Integer.valueOf(transforProfile.protocol_error)) && n51.f.a(java.lang.Long.valueOf(this.previous_completed_size), java.lang.Long.valueOf(transforProfile.previous_completed_size)) && n51.f.a(java.lang.Long.valueOf(this.recved_bytes), java.lang.Long.valueOf(transforProfile.recved_bytes)) && n51.f.a(java.lang.Long.valueOf(this.sent_bytes), java.lang.Long.valueOf(transforProfile.sent_bytes)) && n51.f.a(java.lang.Integer.valueOf(this.seq_check), java.lang.Integer.valueOf(transforProfile.seq_check)) && n51.f.a(this.json_profile, transforProfile.json_profile) && n51.f.a(java.lang.Long.valueOf(this.wifi_recv_bytes), java.lang.Long.valueOf(transforProfile.wifi_recv_bytes)) && n51.f.a(java.lang.Long.valueOf(this.wifi_send_bytes), java.lang.Long.valueOf(transforProfile.wifi_send_bytes)) && n51.f.a(java.lang.Long.valueOf(this.cellular_recv_bytes), java.lang.Long.valueOf(transforProfile.cellular_recv_bytes)) && n51.f.a(java.lang.Long.valueOf(this.cellular_send_bytes), java.lang.Long.valueOf(transforProfile.cellular_send_bytes));
    }

    public long getCellularRecvBytes() {
        return this.cellular_recv_bytes;
    }

    public long getCellularSendBytes() {
        return this.cellular_send_bytes;
    }

    public java.lang.String getJsonProfile() {
        return this.hasSetFields[7] ? this.json_profile : "";
    }

    public long getPreviousCompletedSize() {
        return this.previous_completed_size;
    }

    public int getProtocol() {
        return this.protocol;
    }

    public int getProtocolError() {
        return this.protocol_error;
    }

    public long getRecvedBytes() {
        return this.recved_bytes;
    }

    public long getSentBytes() {
        return this.sent_bytes;
    }

    public int getSeqCheck() {
        return this.seq_check;
    }

    public long getWifiRecvBytes() {
        return this.wifi_recv_bytes;
    }

    public long getWifiSendBytes() {
        return this.wifi_send_bytes;
    }

    public boolean hasCellularRecvBytes() {
        return hasFieldNumber(10);
    }

    public boolean hasCellularSendBytes() {
        return hasFieldNumber(11);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasJsonProfile() {
        return hasFieldNumber(7);
    }

    public boolean hasPreviousCompletedSize() {
        return hasFieldNumber(3);
    }

    public boolean hasProtocol() {
        return hasFieldNumber(1);
    }

    public boolean hasProtocolError() {
        return hasFieldNumber(2);
    }

    public boolean hasRecvedBytes() {
        return hasFieldNumber(4);
    }

    public boolean hasSentBytes() {
        return hasFieldNumber(5);
    }

    public boolean hasSeqCheck() {
        return hasFieldNumber(6);
    }

    public boolean hasWifiRecvBytes() {
        return hasFieldNumber(8);
    }

    public boolean hasWifiSendBytes() {
        return hasFieldNumber(9);
    }

    public com.tencent.mars.cdn.proto.TransforProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.TransforProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.protocol);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.protocol_error);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.previous_completed_size);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.recved_bytes);
            }
            if (this.hasSetFields[5]) {
                fVar.h(5, this.sent_bytes);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.seq_check);
            }
            java.lang.String str = this.json_profile;
            if (str != null && this.hasSetFields[7]) {
                fVar.j(7, str);
            }
            if (this.hasSetFields[8]) {
                fVar.h(8, this.wifi_recv_bytes);
            }
            if (this.hasSetFields[9]) {
                fVar.h(9, this.wifi_send_bytes);
            }
            if (this.hasSetFields[10]) {
                fVar.h(10, this.cellular_recv_bytes);
            }
            if (this.hasSetFields[11]) {
                fVar.h(11, this.cellular_send_bytes);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.protocol) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.protocol_error);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.h(3, this.previous_completed_size);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.h(4, this.recved_bytes);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.h(5, this.sent_bytes);
            }
            if (this.hasSetFields[6]) {
                e17 += b36.f.e(6, this.seq_check);
            }
            java.lang.String str2 = this.json_profile;
            if (str2 != null && this.hasSetFields[7]) {
                e17 += b36.f.j(7, str2);
            }
            if (this.hasSetFields[8]) {
                e17 += b36.f.h(8, this.wifi_recv_bytes);
            }
            if (this.hasSetFields[9]) {
                e17 += b36.f.h(9, this.wifi_send_bytes);
            }
            if (this.hasSetFields[10]) {
                e17 += b36.f.h(10, this.cellular_recv_bytes);
            }
            return this.hasSetFields[11] ? e17 + b36.f.h(11, this.cellular_send_bytes) : e17;
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
                this.protocol = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.protocol_error = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.previous_completed_size = aVar2.i(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.recved_bytes = aVar2.i(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.sent_bytes = aVar2.i(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.seq_check = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.json_profile = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.wifi_recv_bytes = aVar2.i(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.wifi_send_bytes = aVar2.i(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.cellular_recv_bytes = aVar2.i(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.cellular_send_bytes = aVar2.i(intValue);
                this.hasSetFields[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.TransforProfile setCellularRecvBytes(long j17) {
        this.cellular_recv_bytes = j17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setCellularSendBytes(long j17) {
        this.cellular_send_bytes = j17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setJsonProfile(java.lang.String str) {
        this.json_profile = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setPreviousCompletedSize(long j17) {
        this.previous_completed_size = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setProtocol(int i17) {
        this.protocol = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setProtocolError(int i17) {
        this.protocol_error = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setRecvedBytes(long j17) {
        this.recved_bytes = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setSentBytes(long j17) {
        this.sent_bytes = j17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setSeqCheck(int i17) {
        this.seq_check = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setWifiRecvBytes(long j17) {
        this.wifi_recv_bytes = j17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile setWifiSendBytes(long j17) {
        this.wifi_send_bytes = j17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.TransforProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.TransforProfile parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.TransforProfile) super.parseFrom(bArr);
    }
}
