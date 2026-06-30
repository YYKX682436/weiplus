package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class VideoProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.VideoProfile DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.VideoProfile();
    private java.lang.String cdnmsg;
    private java.lang.String flag;
    private int format;
    private final boolean[] hasSetFields = new boolean[6];
    private int original_format;
    private java.lang.String request_flag;

    public static com.tencent.mars.cdn.proto.VideoProfile create() {
        return new com.tencent.mars.cdn.proto.VideoProfile();
    }

    public static com.tencent.mars.cdn.proto.VideoProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.VideoProfile newBuilder() {
        return new com.tencent.mars.cdn.proto.VideoProfile();
    }

    public com.tencent.mars.cdn.proto.VideoProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.VideoProfile)) {
            return false;
        }
        com.tencent.mars.cdn.proto.VideoProfile videoProfile = (com.tencent.mars.cdn.proto.VideoProfile) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.format), java.lang.Integer.valueOf(videoProfile.format)) && n51.f.a(java.lang.Integer.valueOf(this.original_format), java.lang.Integer.valueOf(videoProfile.original_format)) && n51.f.a(this.flag, videoProfile.flag) && n51.f.a(this.cdnmsg, videoProfile.cdnmsg) && n51.f.a(this.request_flag, videoProfile.request_flag);
    }

    public java.lang.String getCdnmsg() {
        return this.hasSetFields[4] ? this.cdnmsg : "";
    }

    public java.lang.String getFlag() {
        return this.hasSetFields[3] ? this.flag : "";
    }

    public int getFormat() {
        return this.format;
    }

    public int getOriginalFormat() {
        return this.original_format;
    }

    public java.lang.String getRequestFlag() {
        return this.hasSetFields[5] ? this.request_flag : "";
    }

    public boolean hasCdnmsg() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFlag() {
        return hasFieldNumber(3);
    }

    public boolean hasFormat() {
        return hasFieldNumber(1);
    }

    public boolean hasOriginalFormat() {
        return hasFieldNumber(2);
    }

    public boolean hasRequestFlag() {
        return hasFieldNumber(5);
    }

    public com.tencent.mars.cdn.proto.VideoProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.VideoProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.format);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.original_format);
            }
            java.lang.String str = this.flag;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.cdnmsg;
            if (str2 != null && this.hasSetFields[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.request_flag;
            if (str3 != null && this.hasSetFields[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.format) : 0;
            if (this.hasSetFields[2]) {
                e17 += b36.f.e(2, this.original_format);
            }
            java.lang.String str4 = this.flag;
            if (str4 != null && this.hasSetFields[3]) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.cdnmsg;
            if (str5 != null && this.hasSetFields[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.request_flag;
            return (str6 == null || !this.hasSetFields[5]) ? e17 : e17 + b36.f.j(5, str6);
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
            this.format = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.original_format = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.flag = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.cdnmsg = aVar2.k(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.request_flag = aVar2.k(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.VideoProfile setCdnmsg(java.lang.String str) {
        this.cdnmsg = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoProfile setFlag(java.lang.String str) {
        this.flag = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoProfile setFormat(int i17) {
        this.format = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoProfile setOriginalFormat(int i17) {
        this.original_format = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoProfile setRequestFlag(java.lang.String str) {
        this.request_flag = str;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.VideoProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.VideoProfile parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.VideoProfile) super.parseFrom(bArr);
    }
}
