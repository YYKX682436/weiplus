package com.tencent.ilink.network;

/* loaded from: classes4.dex */
public class IlinkKvReportInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkKvReportInfo DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkKvReportInfo();
    private final boolean[] hasSetFields = new boolean[8];
    private boolean ignore_freq_check;
    private int logid;
    private boolean report_now;
    private boolean report_to_wechat;
    private int report_uin_type;
    private int type;
    private com.tencent.mm.protobuf.g value;

    public static com.tencent.ilink.network.IlinkKvReportInfo create() {
        return new com.tencent.ilink.network.IlinkKvReportInfo();
    }

    public static com.tencent.ilink.network.IlinkKvReportInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkKvReportInfo newBuilder() {
        return new com.tencent.ilink.network.IlinkKvReportInfo();
    }

    public com.tencent.ilink.network.IlinkKvReportInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkKvReportInfo)) {
            return false;
        }
        com.tencent.ilink.network.IlinkKvReportInfo ilinkKvReportInfo = (com.tencent.ilink.network.IlinkKvReportInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.logid), java.lang.Integer.valueOf(ilinkKvReportInfo.logid)) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(ilinkKvReportInfo.type)) && n51.f.a(this.value, ilinkKvReportInfo.value) && n51.f.a(java.lang.Boolean.valueOf(this.report_now), java.lang.Boolean.valueOf(ilinkKvReportInfo.report_now)) && n51.f.a(java.lang.Boolean.valueOf(this.ignore_freq_check), java.lang.Boolean.valueOf(ilinkKvReportInfo.ignore_freq_check)) && n51.f.a(java.lang.Integer.valueOf(this.report_uin_type), java.lang.Integer.valueOf(ilinkKvReportInfo.report_uin_type)) && n51.f.a(java.lang.Boolean.valueOf(this.report_to_wechat), java.lang.Boolean.valueOf(ilinkKvReportInfo.report_to_wechat));
    }

    public boolean getIgnoreFreqCheck() {
        return this.ignore_freq_check;
    }

    public int getLogid() {
        return this.logid;
    }

    public boolean getReportNow() {
        return this.report_now;
    }

    public boolean getReportToWechat() {
        return this.report_to_wechat;
    }

    public int getReportUinType() {
        return this.report_uin_type;
    }

    public int getType() {
        return this.type;
    }

    public com.tencent.mm.protobuf.g getValue() {
        return this.hasSetFields[3] ? this.value : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIgnoreFreqCheck() {
        return hasFieldNumber(5);
    }

    public boolean hasLogid() {
        return hasFieldNumber(1);
    }

    public boolean hasReportNow() {
        return hasFieldNumber(4);
    }

    public boolean hasReportToWechat() {
        return hasFieldNumber(7);
    }

    public boolean hasReportUinType() {
        return hasFieldNumber(6);
    }

    public boolean hasType() {
        return hasFieldNumber(2);
    }

    public boolean hasValue() {
        return hasFieldNumber(3);
    }

    public com.tencent.ilink.network.IlinkKvReportInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkKvReportInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.logid);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.type);
            }
            com.tencent.mm.protobuf.g gVar = this.value;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.report_now);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.ignore_freq_check);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.report_uin_type);
            }
            if (this.hasSetFields[7]) {
                fVar.a(7, this.report_to_wechat);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.logid) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.type);
            }
            com.tencent.mm.protobuf.g gVar2 = this.value;
            if (gVar2 != null && this.hasSetFields[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.a(4, this.report_now);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.a(5, this.ignore_freq_check);
            }
            if (this.hasSetFields[6]) {
                e17 += b36.f.e(6, this.report_uin_type);
            }
            return this.hasSetFields[7] ? e17 + b36.f.a(7, this.report_to_wechat) : e17;
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
                this.logid = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.type = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.value = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.report_now = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.ignore_freq_check = aVar2.c(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.report_uin_type = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.report_to_wechat = aVar2.c(intValue);
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkKvReportInfo setIgnoreFreqCheck(boolean z17) {
        this.ignore_freq_check = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkKvReportInfo setLogid(int i17) {
        this.logid = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkKvReportInfo setReportNow(boolean z17) {
        this.report_now = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkKvReportInfo setReportToWechat(boolean z17) {
        this.report_to_wechat = z17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkKvReportInfo setReportUinType(int i17) {
        this.report_uin_type = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkKvReportInfo setType(int i17) {
        this.type = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkKvReportInfo setValue(com.tencent.mm.protobuf.g gVar) {
        this.value = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkKvReportInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkKvReportInfo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkKvReportInfo) super.parseFrom(bArr);
    }
}
