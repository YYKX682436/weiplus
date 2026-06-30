package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class C2cResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.C2cResult DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.C2cResult();
    private final boolean[] hasSetFields = new boolean[7];
    private int hitcache_type;
    private boolean is_reduced_video;
    private boolean is_safecdn;
    private boolean sendmsg_from_cdn;
    private com.tencent.mm.protobuf.g session_response;
    private java.lang.String talker;

    public static com.tencent.mars.cdn.proto.C2cResult create() {
        return new com.tencent.mars.cdn.proto.C2cResult();
    }

    public static com.tencent.mars.cdn.proto.C2cResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.C2cResult newBuilder() {
        return new com.tencent.mars.cdn.proto.C2cResult();
    }

    public com.tencent.mars.cdn.proto.C2cResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.C2cResult)) {
            return false;
        }
        com.tencent.mars.cdn.proto.C2cResult c2cResult = (com.tencent.mars.cdn.proto.C2cResult) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.hitcache_type), java.lang.Integer.valueOf(c2cResult.hitcache_type)) && n51.f.a(this.session_response, c2cResult.session_response) && n51.f.a(java.lang.Boolean.valueOf(this.sendmsg_from_cdn), java.lang.Boolean.valueOf(c2cResult.sendmsg_from_cdn)) && n51.f.a(java.lang.Boolean.valueOf(this.is_reduced_video), java.lang.Boolean.valueOf(c2cResult.is_reduced_video)) && n51.f.a(java.lang.Boolean.valueOf(this.is_safecdn), java.lang.Boolean.valueOf(c2cResult.is_safecdn)) && n51.f.a(this.talker, c2cResult.talker);
    }

    public int getHitcacheType() {
        return this.hitcache_type;
    }

    public boolean getIsReducedVideo() {
        return this.is_reduced_video;
    }

    public boolean getIsSafecdn() {
        return this.is_safecdn;
    }

    public boolean getSendmsgFromCdn() {
        return this.sendmsg_from_cdn;
    }

    public com.tencent.mm.protobuf.g getSessionResponse() {
        return this.hasSetFields[2] ? this.session_response : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getTalker() {
        return this.hasSetFields[6] ? this.talker : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHitcacheType() {
        return hasFieldNumber(1);
    }

    public boolean hasIsReducedVideo() {
        return hasFieldNumber(4);
    }

    public boolean hasIsSafecdn() {
        return hasFieldNumber(5);
    }

    public boolean hasSendmsgFromCdn() {
        return hasFieldNumber(3);
    }

    public boolean hasSessionResponse() {
        return hasFieldNumber(2);
    }

    public boolean hasTalker() {
        return hasFieldNumber(6);
    }

    public com.tencent.mars.cdn.proto.C2cResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.C2cResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.hitcache_type);
            }
            com.tencent.mm.protobuf.g gVar = this.session_response;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.sendmsg_from_cdn);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.is_reduced_video);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.is_safecdn);
            }
            java.lang.String str = this.talker;
            if (str != null && this.hasSetFields[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.hitcache_type) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.session_response;
            if (gVar2 != null && this.hasSetFields[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (this.hasSetFields[3]) {
                e17 += b36.f.a(3, this.sendmsg_from_cdn);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.a(4, this.is_reduced_video);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.a(5, this.is_safecdn);
            }
            java.lang.String str2 = this.talker;
            return (str2 == null || !this.hasSetFields[6]) ? e17 : e17 + b36.f.j(6, str2);
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
                this.hitcache_type = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.session_response = aVar2.d(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.sendmsg_from_cdn = aVar2.c(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.is_reduced_video = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.is_safecdn = aVar2.c(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.talker = aVar2.k(intValue);
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.C2cResult setHitcacheType(int i17) {
        this.hitcache_type = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cResult setIsReducedVideo(boolean z17) {
        this.is_reduced_video = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cResult setIsSafecdn(boolean z17) {
        this.is_safecdn = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cResult setSendmsgFromCdn(boolean z17) {
        this.sendmsg_from_cdn = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cResult setSessionResponse(com.tencent.mm.protobuf.g gVar) {
        this.session_response = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cResult setTalker(java.lang.String str) {
        this.talker = str;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.C2cResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.C2cResult parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.C2cResult) super.parseFrom(bArr);
    }
}
