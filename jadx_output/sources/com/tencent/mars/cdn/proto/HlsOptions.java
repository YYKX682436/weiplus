package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class HlsOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.HlsOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.HlsOptions();
    private java.lang.String aeskey;
    private final boolean[] hasSetFields = new boolean[4];

    /* renamed from: iv, reason: collision with root package name */
    private java.lang.String f52530iv;
    private java.lang.String videoflag;

    public static com.tencent.mars.cdn.proto.HlsOptions create() {
        return new com.tencent.mars.cdn.proto.HlsOptions();
    }

    public static com.tencent.mars.cdn.proto.HlsOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.HlsOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.HlsOptions();
    }

    public com.tencent.mars.cdn.proto.HlsOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.HlsOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.HlsOptions hlsOptions = (com.tencent.mars.cdn.proto.HlsOptions) fVar;
        return n51.f.a(this.videoflag, hlsOptions.videoflag) && n51.f.a(this.aeskey, hlsOptions.aeskey) && n51.f.a(this.f52530iv, hlsOptions.f52530iv);
    }

    public java.lang.String getAeskey() {
        return this.hasSetFields[2] ? this.aeskey : "";
    }

    public java.lang.String getIv() {
        return this.hasSetFields[3] ? this.f52530iv : "";
    }

    public java.lang.String getVideoflag() {
        return this.hasSetFields[1] ? this.videoflag : "";
    }

    public boolean hasAeskey() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIv() {
        return hasFieldNumber(3);
    }

    public boolean hasVideoflag() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.HlsOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.HlsOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.videoflag;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.aeskey;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f52530iv;
            if (str3 != null && this.hasSetFields[3]) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.videoflag;
            if (str4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.aeskey;
            if (str5 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f52530iv;
            return (str6 == null || !this.hasSetFields[3]) ? i18 : i18 + b36.f.j(3, str6);
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
            this.videoflag = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.aeskey = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f52530iv = aVar2.k(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.HlsOptions setAeskey(java.lang.String str) {
        this.aeskey = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HlsOptions setIv(java.lang.String str) {
        this.f52530iv = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HlsOptions setVideoflag(java.lang.String str) {
        this.videoflag = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.HlsOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.HlsOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.HlsOptions) super.parseFrom(bArr);
    }
}
