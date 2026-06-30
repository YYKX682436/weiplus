package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class CDNDnsPortInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.CDNDnsPortInfo DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.CDNDnsPortInfo();
    private int PortCount;
    private java.util.LinkedList<java.lang.Integer> PortList = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.mars.cdn.proto.CDNDnsPortInfo create() {
        return new com.tencent.mars.cdn.proto.CDNDnsPortInfo();
    }

    public static com.tencent.mars.cdn.proto.CDNDnsPortInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.CDNDnsPortInfo newBuilder() {
        return new com.tencent.mars.cdn.proto.CDNDnsPortInfo();
    }

    public com.tencent.mars.cdn.proto.CDNDnsPortInfo addAllElementPortList(java.util.Collection<java.lang.Integer> collection) {
        this.PortList.addAll(collection);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsPortInfo addElementPortList(int i17) {
        this.PortList.add(java.lang.Integer.valueOf(i17));
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsPortInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.CDNDnsPortInfo)) {
            return false;
        }
        com.tencent.mars.cdn.proto.CDNDnsPortInfo cDNDnsPortInfo = (com.tencent.mars.cdn.proto.CDNDnsPortInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.PortCount), java.lang.Integer.valueOf(cDNDnsPortInfo.PortCount)) && n51.f.a(this.PortList, cDNDnsPortInfo.PortList);
    }

    public int getPortCount() {
        return this.PortCount;
    }

    public java.util.LinkedList<java.lang.Integer> getPortList() {
        return this.PortList;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasPortCount() {
        return hasFieldNumber(1);
    }

    public boolean hasPortList() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.CDNDnsPortInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.CDNDnsPortInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.PortCount);
            }
            fVar.g(2, 2, this.PortList);
            return 0;
        }
        if (i17 == 1) {
            return (this.hasSetFields[1] ? 0 + b36.f.e(1, this.PortCount) : 0) + b36.f.g(2, 2, this.PortList);
        }
        if (i17 == 2) {
            this.PortList.clear();
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
            this.PortCount = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.PortList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.CDNDnsPortInfo setPortCount(int i17) {
        this.PortCount = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsPortInfo setPortList(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.PortList = linkedList;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.CDNDnsPortInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.CDNDnsPortInfo parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.CDNDnsPortInfo) super.parseFrom(bArr);
    }
}
