package com.tencent.ilink.auth;

/* loaded from: classes2.dex */
public class IlinkCancelOAuthRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.IlinkCancelOAuthRequest DEFAULT_INSTANCE = new com.tencent.ilink.auth.IlinkCancelOAuthRequest();
    private java.util.LinkedList<java.lang.String> ilink_appid_list = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.ilink.auth.IlinkCancelOAuthRequest create() {
        return new com.tencent.ilink.auth.IlinkCancelOAuthRequest();
    }

    public static com.tencent.ilink.auth.IlinkCancelOAuthRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.IlinkCancelOAuthRequest newBuilder() {
        return new com.tencent.ilink.auth.IlinkCancelOAuthRequest();
    }

    public com.tencent.ilink.auth.IlinkCancelOAuthRequest addAllElementIlinkAppidList(java.util.Collection<java.lang.String> collection) {
        this.ilink_appid_list.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCancelOAuthRequest addElementIlinkAppidList(java.lang.String str) {
        this.ilink_appid_list.add(str);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCancelOAuthRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.ilink.auth.IlinkCancelOAuthRequest) && n51.f.a(this.ilink_appid_list, ((com.tencent.ilink.auth.IlinkCancelOAuthRequest) fVar).ilink_appid_list);
    }

    public java.util.LinkedList<java.lang.String> getIlinkAppidList() {
        return this.ilink_appid_list;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkAppidList() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.IlinkCancelOAuthRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.IlinkCancelOAuthRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 1, this.ilink_appid_list);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, this.ilink_appid_list) + 0;
        }
        if (i17 == 2) {
            this.ilink_appid_list.clear();
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
        this.ilink_appid_list.add(aVar2.k(intValue));
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.auth.IlinkCancelOAuthRequest setIlinkAppidList(java.util.LinkedList<java.lang.String> linkedList) {
        this.ilink_appid_list = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.IlinkCancelOAuthRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.IlinkCancelOAuthRequest parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.IlinkCancelOAuthRequest) super.parseFrom(bArr);
    }
}
