package com.tencent.ilink.network;

/* loaded from: classes4.dex */
public class IlinkBypassMsgList extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkBypassMsgList DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkBypassMsgList();
    private java.util.LinkedList<com.tencent.ilink.network.IlinkBypassMsgItem> msgitems = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.ilink.network.IlinkBypassMsgList create() {
        return new com.tencent.ilink.network.IlinkBypassMsgList();
    }

    public static com.tencent.ilink.network.IlinkBypassMsgList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkBypassMsgList newBuilder() {
        return new com.tencent.ilink.network.IlinkBypassMsgList();
    }

    public com.tencent.ilink.network.IlinkBypassMsgList addAllElementMsgitems(java.util.Collection<com.tencent.ilink.network.IlinkBypassMsgItem> collection) {
        this.msgitems.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgList addElementMsgitems(com.tencent.ilink.network.IlinkBypassMsgItem ilinkBypassMsgItem) {
        this.msgitems.add(ilinkBypassMsgItem);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgList build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.network.IlinkBypassMsgList) && n51.f.a(this.msgitems, ((com.tencent.ilink.network.IlinkBypassMsgList) fVar).msgitems);
    }

    public java.util.LinkedList<com.tencent.ilink.network.IlinkBypassMsgItem> getMsgitems() {
        return this.msgitems;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMsgitems() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.network.IlinkBypassMsgList mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkBypassMsgList();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.msgitems);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.msgitems) + 0;
        }
        if (i17 == 2) {
            this.msgitems.clear();
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.ilink.network.IlinkBypassMsgItem ilinkBypassMsgItem = new com.tencent.ilink.network.IlinkBypassMsgItem();
            if (bArr != null && bArr.length > 0) {
                ilinkBypassMsgItem.parseFrom(bArr);
            }
            this.msgitems.add(ilinkBypassMsgItem);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkBypassMsgList setMsgitems(java.util.LinkedList<com.tencent.ilink.network.IlinkBypassMsgItem> linkedList) {
        this.msgitems = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkBypassMsgList mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkBypassMsgList parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkBypassMsgList) super.parseFrom(bArr);
    }
}
