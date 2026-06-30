package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class FriendsVideoProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.FriendsVideoProfile DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.FriendsVideoProfile();
    private int expt_id;
    private final boolean[] hasSetFields = new boolean[6];
    private int mode;
    private java.lang.String strategy;
    private boolean use_coldrule;
    private int used_province;

    public static com.tencent.mars.cdn.proto.FriendsVideoProfile create() {
        return new com.tencent.mars.cdn.proto.FriendsVideoProfile();
    }

    public static com.tencent.mars.cdn.proto.FriendsVideoProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.FriendsVideoProfile newBuilder() {
        return new com.tencent.mars.cdn.proto.FriendsVideoProfile();
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.FriendsVideoProfile)) {
            return false;
        }
        com.tencent.mars.cdn.proto.FriendsVideoProfile friendsVideoProfile = (com.tencent.mars.cdn.proto.FriendsVideoProfile) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.mode), java.lang.Integer.valueOf(friendsVideoProfile.mode)) && n51.f.a(java.lang.Boolean.valueOf(this.use_coldrule), java.lang.Boolean.valueOf(friendsVideoProfile.use_coldrule)) && n51.f.a(java.lang.Integer.valueOf(this.used_province), java.lang.Integer.valueOf(friendsVideoProfile.used_province)) && n51.f.a(java.lang.Integer.valueOf(this.expt_id), java.lang.Integer.valueOf(friendsVideoProfile.expt_id)) && n51.f.a(this.strategy, friendsVideoProfile.strategy);
    }

    public int getExptId() {
        return this.expt_id;
    }

    public int getMode() {
        return this.mode;
    }

    public java.lang.String getStrategy() {
        return this.hasSetFields[5] ? this.strategy : "";
    }

    public boolean getUseColdrule() {
        return this.use_coldrule;
    }

    public int getUsedProvince() {
        return this.used_province;
    }

    public boolean hasExptId() {
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

    public boolean hasUseColdrule() {
        return hasFieldNumber(2);
    }

    public boolean hasUsedProvince() {
        return hasFieldNumber(3);
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.FriendsVideoProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.mode);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.use_coldrule);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.used_province);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.expt_id);
            }
            java.lang.String str = this.strategy;
            if (str != null && this.hasSetFields[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.mode) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.a(2, this.use_coldrule);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.e(3, this.used_province);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.expt_id);
            }
            java.lang.String str2 = this.strategy;
            return (str2 == null || !this.hasSetFields[5]) ? e17 : e17 + b36.f.j(5, str2);
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
            this.use_coldrule = aVar2.c(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.used_province = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.expt_id = aVar2.g(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.strategy = aVar2.k(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile setExptId(int i17) {
        this.expt_id = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile setMode(int i17) {
        this.mode = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile setStrategy(java.lang.String str) {
        this.strategy = str;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile setUseColdrule(boolean z17) {
        this.use_coldrule = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile setUsedProvince(int i17) {
        this.used_province = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.FriendsVideoProfile parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.FriendsVideoProfile) super.parseFrom(bArr);
    }
}
