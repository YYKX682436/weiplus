package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class FinderVideoOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.FinderVideoOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.FinderVideoOptions();
    private com.tencent.mm.protobuf.g bypass;
    private com.tencent.mm.protobuf.g ctrlinfo;
    private java.lang.String feedid;
    private final boolean[] hasSetFields = new boolean[5];
    private boolean report_transinfo;

    public static com.tencent.mars.cdn.proto.FinderVideoOptions create() {
        return new com.tencent.mars.cdn.proto.FinderVideoOptions();
    }

    public static com.tencent.mars.cdn.proto.FinderVideoOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.FinderVideoOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.FinderVideoOptions();
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.FinderVideoOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.FinderVideoOptions finderVideoOptions = (com.tencent.mars.cdn.proto.FinderVideoOptions) fVar;
        return n51.f.a(this.bypass, finderVideoOptions.bypass) && n51.f.a(this.ctrlinfo, finderVideoOptions.ctrlinfo) && n51.f.a(java.lang.Boolean.valueOf(this.report_transinfo), java.lang.Boolean.valueOf(finderVideoOptions.report_transinfo)) && n51.f.a(this.feedid, finderVideoOptions.feedid);
    }

    public com.tencent.mm.protobuf.g getBypass() {
        return this.hasSetFields[1] ? this.bypass : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getCtrlinfo() {
        return this.hasSetFields[2] ? this.ctrlinfo : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getFeedid() {
        return this.hasSetFields[4] ? this.feedid : "";
    }

    public boolean getReportTransinfo() {
        return this.report_transinfo;
    }

    public boolean hasBypass() {
        return hasFieldNumber(1);
    }

    public boolean hasCtrlinfo() {
        return hasFieldNumber(2);
    }

    public boolean hasFeedid() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasReportTransinfo() {
        return hasFieldNumber(3);
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.FinderVideoOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.bypass;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.ctrlinfo;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.report_transinfo);
            }
            java.lang.String str = this.feedid;
            if (str != null && this.hasSetFields[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.bypass;
            if (gVar3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.ctrlinfo;
            if (gVar4 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.a(3, this.report_transinfo);
            }
            java.lang.String str2 = this.feedid;
            return (str2 == null || !this.hasSetFields[4]) ? i18 : i18 + b36.f.j(4, str2);
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
            this.bypass = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.ctrlinfo = aVar2.d(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.report_transinfo = aVar2.c(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.feedid = aVar2.k(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions setBypass(com.tencent.mm.protobuf.g gVar) {
        this.bypass = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions setCtrlinfo(com.tencent.mm.protobuf.g gVar) {
        this.ctrlinfo = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions setFeedid(java.lang.String str) {
        this.feedid = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions setReportTransinfo(boolean z17) {
        this.report_transinfo = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FinderVideoOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.FinderVideoOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.FinderVideoOptions) super.parseFrom(bArr);
    }
}
