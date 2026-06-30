package com.tencent.ilink.network;

/* loaded from: classes15.dex */
public class IlinkPullLogCmd extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkPullLogCmd DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkPullLogCmd();
    private int end_time;
    private java.lang.String ext_buffer;
    private java.lang.String ilink_capath;
    private boolean include_devlog;
    private int start_time;
    private java.lang.String upload_token;
    private int use_nettype;
    private java.util.LinkedList<java.lang.String> ilink_appids = new java.util.LinkedList<>();
    private java.util.LinkedList<java.lang.String> ilink_logs = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[10];

    public static com.tencent.ilink.network.IlinkPullLogCmd create() {
        return new com.tencent.ilink.network.IlinkPullLogCmd();
    }

    public static com.tencent.ilink.network.IlinkPullLogCmd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkPullLogCmd newBuilder() {
        return new com.tencent.ilink.network.IlinkPullLogCmd();
    }

    public com.tencent.ilink.network.IlinkPullLogCmd addAllElementIlinkAppids(java.util.Collection<java.lang.String> collection) {
        this.ilink_appids.addAll(collection);
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd addAllElementIlinkLogs(java.util.Collection<java.lang.String> collection) {
        this.ilink_logs.addAll(collection);
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd addElementIlinkAppids(java.lang.String str) {
        this.ilink_appids.add(str);
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd addElementIlinkLogs(java.lang.String str) {
        this.ilink_logs.add(str);
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkPullLogCmd)) {
            return false;
        }
        com.tencent.ilink.network.IlinkPullLogCmd ilinkPullLogCmd = (com.tencent.ilink.network.IlinkPullLogCmd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.start_time), java.lang.Integer.valueOf(ilinkPullLogCmd.start_time)) && n51.f.a(java.lang.Integer.valueOf(this.end_time), java.lang.Integer.valueOf(ilinkPullLogCmd.end_time)) && n51.f.a(this.upload_token, ilinkPullLogCmd.upload_token) && n51.f.a(java.lang.Integer.valueOf(this.use_nettype), java.lang.Integer.valueOf(ilinkPullLogCmd.use_nettype)) && n51.f.a(this.ilink_appids, ilinkPullLogCmd.ilink_appids) && n51.f.a(java.lang.Boolean.valueOf(this.include_devlog), java.lang.Boolean.valueOf(ilinkPullLogCmd.include_devlog)) && n51.f.a(this.ext_buffer, ilinkPullLogCmd.ext_buffer) && n51.f.a(this.ilink_capath, ilinkPullLogCmd.ilink_capath) && n51.f.a(this.ilink_logs, ilinkPullLogCmd.ilink_logs);
    }

    public int getEndTime() {
        return this.end_time;
    }

    public java.lang.String getExtBuffer() {
        return this.hasSetFields[7] ? this.ext_buffer : "";
    }

    public java.util.LinkedList<java.lang.String> getIlinkAppids() {
        return this.ilink_appids;
    }

    public java.lang.String getIlinkCapath() {
        return this.hasSetFields[8] ? this.ilink_capath : "";
    }

    public java.util.LinkedList<java.lang.String> getIlinkLogs() {
        return this.ilink_logs;
    }

    public boolean getIncludeDevlog() {
        return this.include_devlog;
    }

    public int getStartTime() {
        return this.start_time;
    }

    public java.lang.String getUploadToken() {
        return this.hasSetFields[3] ? this.upload_token : "";
    }

    public int getUseNettype() {
        return this.use_nettype;
    }

    public boolean hasEndTime() {
        return hasFieldNumber(2);
    }

    public boolean hasExtBuffer() {
        return hasFieldNumber(7);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkAppids() {
        return hasFieldNumber(5);
    }

    public boolean hasIlinkCapath() {
        return hasFieldNumber(8);
    }

    public boolean hasIlinkLogs() {
        return hasFieldNumber(9);
    }

    public boolean hasIncludeDevlog() {
        return hasFieldNumber(6);
    }

    public boolean hasStartTime() {
        return hasFieldNumber(1);
    }

    public boolean hasUploadToken() {
        return hasFieldNumber(3);
    }

    public boolean hasUseNettype() {
        return hasFieldNumber(4);
    }

    public com.tencent.ilink.network.IlinkPullLogCmd mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkPullLogCmd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.start_time);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.end_time);
            }
            java.lang.String str = this.upload_token;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.use_nettype);
            }
            fVar.g(5, 1, this.ilink_appids);
            if (this.hasSetFields[6]) {
                fVar.a(6, this.include_devlog);
            }
            java.lang.String str2 = this.ext_buffer;
            if (str2 != null && this.hasSetFields[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.ilink_capath;
            if (str3 != null && this.hasSetFields[8]) {
                fVar.j(8, str3);
            }
            fVar.g(9, 1, this.ilink_logs);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.start_time) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.end_time);
            }
            java.lang.String str4 = this.upload_token;
            if (str4 != null && this.hasSetFields[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.use_nettype);
            }
            int g17 = e17 + b36.f.g(5, 1, this.ilink_appids);
            if (this.hasSetFields[6]) {
                g17 += b36.f.a(6, this.include_devlog);
            }
            java.lang.String str5 = this.ext_buffer;
            if (str5 != null && this.hasSetFields[7]) {
                g17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.ilink_capath;
            if (str6 != null && this.hasSetFields[8]) {
                g17 += b36.f.j(8, str6);
            }
            return g17 + b36.f.g(9, 1, this.ilink_logs);
        }
        if (i17 == 2) {
            this.ilink_appids.clear();
            this.ilink_logs.clear();
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
                this.start_time = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.end_time = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.upload_token = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.use_nettype = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.ilink_appids.add(aVar2.k(intValue));
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.include_devlog = aVar2.c(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.ext_buffer = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.ilink_capath = aVar2.k(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.ilink_logs.add(aVar2.k(intValue));
                this.hasSetFields[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setEndTime(int i17) {
        this.end_time = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setExtBuffer(java.lang.String str) {
        this.ext_buffer = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setIlinkAppids(java.util.LinkedList<java.lang.String> linkedList) {
        this.ilink_appids = linkedList;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setIlinkCapath(java.lang.String str) {
        this.ilink_capath = str;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setIlinkLogs(java.util.LinkedList<java.lang.String> linkedList) {
        this.ilink_logs = linkedList;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setIncludeDevlog(boolean z17) {
        this.include_devlog = z17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setStartTime(int i17) {
        this.start_time = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setUploadToken(java.lang.String str) {
        this.upload_token = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd setUseNettype(int i17) {
        this.use_nettype = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkPullLogCmd mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkPullLogCmd parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkPullLogCmd) super.parseFrom(bArr);
    }
}
