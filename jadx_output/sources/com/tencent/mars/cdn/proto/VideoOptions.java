package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class VideoOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.VideoOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.VideoOptions();
    private int blocksize;
    private int c2c_video_format;
    private final boolean[] hasSetFields = new boolean[8];
    private boolean is_small;
    private com.tencent.mars.cdn.proto.VideoFormatPolicy match_policy;
    private com.tencent.mm.protobuf.g sns_coldrule;
    private java.lang.String sns_video_flag;
    private com.tencent.mm.protobuf.g wxdata;

    public static com.tencent.mars.cdn.proto.VideoOptions create() {
        return new com.tencent.mars.cdn.proto.VideoOptions();
    }

    public static com.tencent.mars.cdn.proto.VideoOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.VideoOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.VideoOptions();
    }

    public com.tencent.mars.cdn.proto.VideoOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.VideoOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.VideoOptions videoOptions = (com.tencent.mars.cdn.proto.VideoOptions) fVar;
        return n51.f.a(this.sns_video_flag, videoOptions.sns_video_flag) && n51.f.a(java.lang.Integer.valueOf(this.c2c_video_format), java.lang.Integer.valueOf(videoOptions.c2c_video_format)) && n51.f.a(this.match_policy, videoOptions.match_policy) && n51.f.a(java.lang.Boolean.valueOf(this.is_small), java.lang.Boolean.valueOf(videoOptions.is_small)) && n51.f.a(this.sns_coldrule, videoOptions.sns_coldrule) && n51.f.a(this.wxdata, videoOptions.wxdata) && n51.f.a(java.lang.Integer.valueOf(this.blocksize), java.lang.Integer.valueOf(videoOptions.blocksize));
    }

    public int getBlocksize() {
        return this.blocksize;
    }

    public int getC2cVideoFormat() {
        return this.c2c_video_format;
    }

    public boolean getIsSmall() {
        return this.is_small;
    }

    public com.tencent.mars.cdn.proto.VideoFormatPolicy getMatchPolicy() {
        return this.hasSetFields[3] ? this.match_policy : com.tencent.mars.cdn.proto.VideoFormatPolicy.VIDEO_FORMAT_POLICY_AUTO;
    }

    public com.tencent.mm.protobuf.g getSnsColdrule() {
        return this.hasSetFields[5] ? this.sns_coldrule : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getSnsVideoFlag() {
        return this.hasSetFields[1] ? this.sns_video_flag : "";
    }

    public com.tencent.mm.protobuf.g getWxdata() {
        return this.hasSetFields[6] ? this.wxdata : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasBlocksize() {
        return hasFieldNumber(7);
    }

    public boolean hasC2cVideoFormat() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIsSmall() {
        return hasFieldNumber(4);
    }

    public boolean hasMatchPolicy() {
        return hasFieldNumber(3);
    }

    public boolean hasSnsColdrule() {
        return hasFieldNumber(5);
    }

    public boolean hasSnsVideoFlag() {
        return hasFieldNumber(1);
    }

    public boolean hasWxdata() {
        return hasFieldNumber(6);
    }

    public com.tencent.mars.cdn.proto.VideoOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.VideoOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.sns_video_flag;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.c2c_video_format);
            }
            com.tencent.mars.cdn.proto.VideoFormatPolicy videoFormatPolicy = this.match_policy;
            if (videoFormatPolicy != null && this.hasSetFields[3]) {
                fVar.e(3, videoFormatPolicy.value);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.is_small);
            }
            com.tencent.mm.protobuf.g gVar = this.sns_coldrule;
            if (gVar != null && this.hasSetFields[5]) {
                fVar.b(5, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.wxdata;
            if (gVar2 != null && this.hasSetFields[6]) {
                fVar.b(6, gVar2);
            }
            if (this.hasSetFields[7]) {
                fVar.e(7, this.blocksize);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.sns_video_flag;
            if (str2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.c2c_video_format);
            }
            com.tencent.mars.cdn.proto.VideoFormatPolicy videoFormatPolicy2 = this.match_policy;
            if (videoFormatPolicy2 != null && this.hasSetFields[3]) {
                i18 += b36.f.e(3, videoFormatPolicy2.value);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.a(4, this.is_small);
            }
            com.tencent.mm.protobuf.g gVar3 = this.sns_coldrule;
            if (gVar3 != null && this.hasSetFields[5]) {
                i18 += b36.f.b(5, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.wxdata;
            if (gVar4 != null && this.hasSetFields[6]) {
                i18 += b36.f.b(6, gVar4);
            }
            return this.hasSetFields[7] ? i18 + b36.f.e(7, this.blocksize) : i18;
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
                this.sns_video_flag = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.c2c_video_format = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.match_policy = com.tencent.mars.cdn.proto.VideoFormatPolicy.forNumber(aVar2.g(intValue));
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.is_small = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.sns_coldrule = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.wxdata = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.blocksize = aVar2.g(intValue);
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.VideoOptions setBlocksize(int i17) {
        this.blocksize = i17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoOptions setC2cVideoFormat(int i17) {
        this.c2c_video_format = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoOptions setIsSmall(boolean z17) {
        this.is_small = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoOptions setMatchPolicy(com.tencent.mars.cdn.proto.VideoFormatPolicy videoFormatPolicy) {
        this.match_policy = videoFormatPolicy;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoOptions setSnsColdrule(com.tencent.mm.protobuf.g gVar) {
        this.sns_coldrule = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoOptions setSnsVideoFlag(java.lang.String str) {
        this.sns_video_flag = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoOptions setWxdata(com.tencent.mm.protobuf.g gVar) {
        this.wxdata = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.VideoOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.VideoOptions) super.parseFrom(bArr);
    }
}
