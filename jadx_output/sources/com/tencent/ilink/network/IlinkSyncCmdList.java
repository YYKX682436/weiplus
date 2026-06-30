package com.tencent.ilink.network;

/* loaded from: classes4.dex */
public class IlinkSyncCmdList extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkSyncCmdList DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkSyncCmdList();
    private java.util.LinkedList<com.tencent.ilink.network.IlinkCmdItem> cmdlist = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.ilink.network.IlinkSyncCmdList create() {
        return new com.tencent.ilink.network.IlinkSyncCmdList();
    }

    public static com.tencent.ilink.network.IlinkSyncCmdList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkSyncCmdList newBuilder() {
        return new com.tencent.ilink.network.IlinkSyncCmdList();
    }

    public com.tencent.ilink.network.IlinkSyncCmdList addAllElementCmdlist(java.util.Collection<com.tencent.ilink.network.IlinkCmdItem> collection) {
        this.cmdlist.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkSyncCmdList addElementCmdlist(com.tencent.ilink.network.IlinkCmdItem ilinkCmdItem) {
        this.cmdlist.add(ilinkCmdItem);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkSyncCmdList build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.network.IlinkSyncCmdList) && n51.f.a(this.cmdlist, ((com.tencent.ilink.network.IlinkSyncCmdList) fVar).cmdlist);
    }

    public java.util.LinkedList<com.tencent.ilink.network.IlinkCmdItem> getCmdlist() {
        return this.cmdlist;
    }

    public boolean hasCmdlist() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.ilink.network.IlinkSyncCmdList mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkSyncCmdList();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.cmdlist);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.cmdlist) + 0;
        }
        if (i17 == 2) {
            this.cmdlist.clear();
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
            com.tencent.ilink.network.IlinkCmdItem ilinkCmdItem = new com.tencent.ilink.network.IlinkCmdItem();
            if (bArr != null && bArr.length > 0) {
                ilinkCmdItem.parseFrom(bArr);
            }
            this.cmdlist.add(ilinkCmdItem);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkSyncCmdList setCmdlist(java.util.LinkedList<com.tencent.ilink.network.IlinkCmdItem> linkedList) {
        this.cmdlist = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkSyncCmdList mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkSyncCmdList parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkSyncCmdList) super.parseFrom(bArr);
    }
}
