package com.tencent.ilink.network;

/* loaded from: classes2.dex */
public class IlinkMsgIotAppMsg extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkMsgIotAppMsg DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkMsgIotAppMsg();
    private com.tencent.mm.protobuf.g appbody;
    private java.lang.String appid;
    private final boolean[] hasSetFields = new boolean[4];
    private long uin;

    public static com.tencent.ilink.network.IlinkMsgIotAppMsg create() {
        return new com.tencent.ilink.network.IlinkMsgIotAppMsg();
    }

    public static com.tencent.ilink.network.IlinkMsgIotAppMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkMsgIotAppMsg newBuilder() {
        return new com.tencent.ilink.network.IlinkMsgIotAppMsg();
    }

    public com.tencent.ilink.network.IlinkMsgIotAppMsg build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkMsgIotAppMsg)) {
            return false;
        }
        com.tencent.ilink.network.IlinkMsgIotAppMsg ilinkMsgIotAppMsg = (com.tencent.ilink.network.IlinkMsgIotAppMsg) fVar;
        return n51.f.a(this.appid, ilinkMsgIotAppMsg.appid) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(ilinkMsgIotAppMsg.uin)) && n51.f.a(this.appbody, ilinkMsgIotAppMsg.appbody);
    }

    public com.tencent.mm.protobuf.g getAppbody() {
        return this.hasSetFields[3] ? this.appbody : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getAppid() {
        return this.hasSetFields[1] ? this.appid : "";
    }

    public long getUin() {
        return this.uin;
    }

    public boolean hasAppbody() {
        return hasFieldNumber(3);
    }

    public boolean hasAppid() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasUin() {
        return hasFieldNumber(2);
    }

    public com.tencent.ilink.network.IlinkMsgIotAppMsg mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkMsgIotAppMsg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.appid;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.uin);
            }
            com.tencent.mm.protobuf.g gVar = this.appbody;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.appid;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.h(2, this.uin);
            }
            com.tencent.mm.protobuf.g gVar2 = this.appbody;
            return (gVar2 == null || !this.hasSetFields[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
            this.appid = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.uin = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.appbody = aVar2.d(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkMsgIotAppMsg setAppbody(com.tencent.mm.protobuf.g gVar) {
        this.appbody = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkMsgIotAppMsg setAppid(java.lang.String str) {
        this.appid = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkMsgIotAppMsg setUin(long j17) {
        this.uin = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkMsgIotAppMsg mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkMsgIotAppMsg parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkMsgIotAppMsg) super.parseFrom(bArr);
    }
}
