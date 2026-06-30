package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkAppMessage extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkAppMessage DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkAppMessage();
    private com.tencent.mm.protobuf.g body;
    private long create_time;
    private final boolean[] hasSetFields = new boolean[4];
    private long msgid;

    public static com.tencent.ilink.auth.IlinkAppMessage create() {
        return new com.tencent.ilink.auth.IlinkAppMessage();
    }

    public static com.tencent.ilink.auth.IlinkAppMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkAppMessage newBuilder() {
        return new com.tencent.ilink.auth.IlinkAppMessage();
    }

    public com.tencent.ilink.auth.IlinkAppMessage build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.IlinkAppMessage)) {
            return false;
        }
        com.tencent.ilink.auth.IlinkAppMessage ilinkAppMessage = (com.tencent.ilink.auth.IlinkAppMessage) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.msgid), java.lang.Long.valueOf(ilinkAppMessage.msgid)) && n51.f.a(java.lang.Long.valueOf(this.create_time), java.lang.Long.valueOf(ilinkAppMessage.create_time)) && n51.f.a(this.body, ilinkAppMessage.body);
    }

    public com.tencent.mm.protobuf.g getBody() {
        return this.hasSetFields[3] ? this.body : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getCreateTime() {
        return this.create_time;
    }

    public long getMsgid() {
        return this.msgid;
    }

    public boolean hasBody() {
        return hasFieldNumber(3);
    }

    public boolean hasCreateTime() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMsgid() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkAppMessage mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkAppMessage();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.msgid);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.create_time);
            }
            com.tencent.mm.protobuf.g gVar = this.body;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.msgid) : 0;
            if (this.hasSetFields[2]) {
                h17 += b36.f.h(2, this.create_time);
            }
            com.tencent.mm.protobuf.g gVar2 = this.body;
            return (gVar2 == null || !this.hasSetFields[3]) ? h17 : h17 + b36.f.b(3, gVar2);
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
            this.msgid = aVar2.i(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.create_time = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.body = aVar2.d(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkAppMessage setBody(com.tencent.mm.protobuf.g gVar) {
        this.body = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkAppMessage setCreateTime(long j17) {
        this.create_time = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkAppMessage setMsgid(long j17) {
        this.msgid = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkAppMessage mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkAppMessage parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkAppMessage) super.parseFrom(bArr);
    }
}
