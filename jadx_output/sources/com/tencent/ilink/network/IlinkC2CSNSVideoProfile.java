package com.tencent.ilink.network;

/* loaded from: classes8.dex */
public class IlinkC2CSNSVideoProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkC2CSNSVideoProfile DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkC2CSNSVideoProfile();
    private int experimental_group_id;
    private final boolean[] hasSetFields = new boolean[6];
    private int mode;
    private com.tencent.mm.protobuf.g strategy;
    private boolean used_coldrule;
    private int used_province;

    public static com.tencent.ilink.network.IlinkC2CSNSVideoProfile create() {
        return new com.tencent.ilink.network.IlinkC2CSNSVideoProfile();
    }

    public static com.tencent.ilink.network.IlinkC2CSNSVideoProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkC2CSNSVideoProfile newBuilder() {
        return new com.tencent.ilink.network.IlinkC2CSNSVideoProfile();
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkC2CSNSVideoProfile)) {
            return false;
        }
        com.tencent.ilink.network.IlinkC2CSNSVideoProfile ilinkC2CSNSVideoProfile = (com.tencent.ilink.network.IlinkC2CSNSVideoProfile) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.mode), java.lang.Integer.valueOf(ilinkC2CSNSVideoProfile.mode)) && n51.f.a(java.lang.Boolean.valueOf(this.used_coldrule), java.lang.Boolean.valueOf(ilinkC2CSNSVideoProfile.used_coldrule)) && n51.f.a(java.lang.Integer.valueOf(this.used_province), java.lang.Integer.valueOf(ilinkC2CSNSVideoProfile.used_province)) && n51.f.a(java.lang.Integer.valueOf(this.experimental_group_id), java.lang.Integer.valueOf(ilinkC2CSNSVideoProfile.experimental_group_id)) && n51.f.a(this.strategy, ilinkC2CSNSVideoProfile.strategy);
    }

    public int getExperimentalGroupId() {
        return this.experimental_group_id;
    }

    public int getMode() {
        return this.mode;
    }

    public com.tencent.mm.protobuf.g getStrategy() {
        return this.hasSetFields[5] ? this.strategy : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean getUsedColdrule() {
        return this.used_coldrule;
    }

    public int getUsedProvince() {
        return this.used_province;
    }

    public boolean hasExperimentalGroupId() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMode() {
        return hasFieldNumber(1);
    }

    public boolean hasStrategy() {
        return hasFieldNumber(5);
    }

    public boolean hasUsedColdrule() {
        return hasFieldNumber(2);
    }

    public boolean hasUsedProvince() {
        return hasFieldNumber(3);
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkC2CSNSVideoProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.mode);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.used_coldrule);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.used_province);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.experimental_group_id);
            }
            com.tencent.mm.protobuf.g gVar = this.strategy;
            if (gVar != null && this.hasSetFields[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.mode) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.a(2, this.used_coldrule);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.used_province);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.experimental_group_id);
            }
            com.tencent.mm.protobuf.g gVar2 = this.strategy;
            return (gVar2 == null || !this.hasSetFields[5]) ? e17 : e17 + b36.f.b(5, gVar2);
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
            this.mode = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.used_coldrule = aVar2.c(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.used_province = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.experimental_group_id = aVar2.g(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.strategy = aVar2.d(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile setExperimentalGroupId(int i17) {
        this.experimental_group_id = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile setMode(int i17) {
        this.mode = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile setStrategy(com.tencent.mm.protobuf.g gVar) {
        this.strategy = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile setUsedColdrule(boolean z17) {
        this.used_coldrule = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile setUsedProvince(int i17) {
        this.used_province = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkC2CSNSVideoProfile) super.parseFrom(bArr);
    }
}
