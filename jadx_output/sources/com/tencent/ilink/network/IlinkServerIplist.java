package com.tencent.ilink.network;

/* loaded from: classes2.dex */
public class IlinkServerIplist extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkServerIplist DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkServerIplist();
    private java.util.LinkedList<java.lang.String> svr_iplist = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.ilink.network.IlinkServerIplist create() {
        return new com.tencent.ilink.network.IlinkServerIplist();
    }

    public static com.tencent.ilink.network.IlinkServerIplist getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkServerIplist newBuilder() {
        return new com.tencent.ilink.network.IlinkServerIplist();
    }

    public com.tencent.ilink.network.IlinkServerIplist addAllElementSvrIplist(java.util.Collection<java.lang.String> collection) {
        this.svr_iplist.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkServerIplist addElementSvrIplist(java.lang.String str) {
        this.svr_iplist.add(str);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkServerIplist build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.network.IlinkServerIplist) && n51.f.a(this.svr_iplist, ((com.tencent.ilink.network.IlinkServerIplist) fVar).svr_iplist);
    }

    public java.util.LinkedList<java.lang.String> getSvrIplist() {
        return this.svr_iplist;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasSvrIplist() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.network.IlinkServerIplist mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkServerIplist();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 1, this.svr_iplist);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, this.svr_iplist) + 0;
        }
        if (i17 == 2) {
            this.svr_iplist.clear();
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
        this.svr_iplist.add(aVar2.k(intValue));
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkServerIplist setSvrIplist(java.util.LinkedList<java.lang.String> linkedList) {
        this.svr_iplist = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkServerIplist mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkServerIplist parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkServerIplist) super.parseFrom(bArr);
    }
}
