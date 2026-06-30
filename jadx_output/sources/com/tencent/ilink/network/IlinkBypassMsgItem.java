package com.tencent.ilink.network;

/* loaded from: classes4.dex */
public class IlinkBypassMsgItem extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkBypassMsgItem DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkBypassMsgItem();
    private com.tencent.mm.protobuf.g content;
    private long createtime;
    private java.lang.String from_username;
    private final boolean[] hasSetFields = new boolean[9];
    private java.lang.String msg_session_id;
    private int msg_type;
    private long msgid;
    private long seq;
    private java.lang.String to_username;

    public static com.tencent.ilink.network.IlinkBypassMsgItem create() {
        return new com.tencent.ilink.network.IlinkBypassMsgItem();
    }

    public static com.tencent.ilink.network.IlinkBypassMsgItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkBypassMsgItem newBuilder() {
        return new com.tencent.ilink.network.IlinkBypassMsgItem();
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkBypassMsgItem)) {
            return false;
        }
        com.tencent.ilink.network.IlinkBypassMsgItem ilinkBypassMsgItem = (com.tencent.ilink.network.IlinkBypassMsgItem) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.msgid), java.lang.Long.valueOf(ilinkBypassMsgItem.msgid)) && n51.f.a(this.from_username, ilinkBypassMsgItem.from_username) && n51.f.a(this.to_username, ilinkBypassMsgItem.to_username) && n51.f.a(java.lang.Integer.valueOf(this.msg_type), java.lang.Integer.valueOf(ilinkBypassMsgItem.msg_type)) && n51.f.a(this.content, ilinkBypassMsgItem.content) && n51.f.a(java.lang.Long.valueOf(this.createtime), java.lang.Long.valueOf(ilinkBypassMsgItem.createtime)) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(ilinkBypassMsgItem.seq)) && n51.f.a(this.msg_session_id, ilinkBypassMsgItem.msg_session_id);
    }

    public com.tencent.mm.protobuf.g getContent() {
        return this.hasSetFields[5] ? this.content : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getCreatetime() {
        return this.createtime;
    }

    public java.lang.String getFromUsername() {
        return this.hasSetFields[2] ? this.from_username : "";
    }

    public java.lang.String getMsgSessionId() {
        return this.hasSetFields[8] ? this.msg_session_id : "";
    }

    public int getMsgType() {
        return this.msg_type;
    }

    public long getMsgid() {
        return this.msgid;
    }

    public long getSeq() {
        return this.seq;
    }

    public java.lang.String getToUsername() {
        return this.hasSetFields[3] ? this.to_username : "";
    }

    public boolean hasContent() {
        return hasFieldNumber(5);
    }

    public boolean hasCreatetime() {
        return hasFieldNumber(6);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFromUsername() {
        return hasFieldNumber(2);
    }

    public boolean hasMsgSessionId() {
        return hasFieldNumber(8);
    }

    public boolean hasMsgType() {
        return hasFieldNumber(4);
    }

    public boolean hasMsgid() {
        return hasFieldNumber(1);
    }

    public boolean hasSeq() {
        return hasFieldNumber(7);
    }

    public boolean hasToUsername() {
        return hasFieldNumber(3);
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkBypassMsgItem();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.msgid);
            }
            java.lang.String str = this.from_username;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.to_username;
            if (str2 != null && this.hasSetFields[3]) {
                fVar.j(3, str2);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.msg_type);
            }
            com.tencent.mm.protobuf.g gVar = this.content;
            if (gVar != null && this.hasSetFields[5]) {
                fVar.b(5, gVar);
            }
            if (this.hasSetFields[6]) {
                fVar.h(6, this.createtime);
            }
            if (this.hasSetFields[7]) {
                fVar.h(7, this.seq);
            }
            java.lang.String str3 = this.msg_session_id;
            if (str3 != null && this.hasSetFields[8]) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.msgid) : 0;
            java.lang.String str4 = this.from_username;
            if (str4 != null && this.hasSetFields[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.to_username;
            if (str5 != null && this.hasSetFields[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (this.hasSetFields[4]) {
                h17 += b36.f.e(4, this.msg_type);
            }
            com.tencent.mm.protobuf.g gVar2 = this.content;
            if (gVar2 != null && this.hasSetFields[5]) {
                h17 += b36.f.b(5, gVar2);
            }
            if (this.hasSetFields[6]) {
                h17 += b36.f.h(6, this.createtime);
            }
            if (this.hasSetFields[7]) {
                h17 += b36.f.h(7, this.seq);
            }
            java.lang.String str6 = this.msg_session_id;
            return (str6 == null || !this.hasSetFields[8]) ? h17 : h17 + b36.f.j(8, str6);
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
                this.msgid = aVar2.i(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.from_username = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.to_username = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.msg_type = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.content = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.createtime = aVar2.i(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.seq = aVar2.i(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.msg_session_id = aVar2.k(intValue);
                this.hasSetFields[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setContent(com.tencent.mm.protobuf.g gVar) {
        this.content = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setCreatetime(long j17) {
        this.createtime = j17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setFromUsername(java.lang.String str) {
        this.from_username = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setMsgSessionId(java.lang.String str) {
        this.msg_session_id = str;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setMsgType(int i17) {
        this.msg_type = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setMsgid(long j17) {
        this.msgid = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setSeq(long j17) {
        this.seq = j17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem setToUsername(java.lang.String str) {
        this.to_username = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgItem mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkBypassMsgItem parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkBypassMsgItem) super.parseFrom(bArr);
    }
}
