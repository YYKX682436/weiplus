package com.tencent.mars.cdn.proto;

/* loaded from: classes4.dex */
public class SnsOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.SnsOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.SnsOptions();
    private long decrypt_key;
    private final boolean[] hasSetFields = new boolean[5];
    private boolean is_colddata;
    private boolean is_hotdata;
    private java.lang.String scene;

    public static com.tencent.mars.cdn.proto.SnsOptions create() {
        return new com.tencent.mars.cdn.proto.SnsOptions();
    }

    public static com.tencent.mars.cdn.proto.SnsOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.SnsOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.SnsOptions();
    }

    public com.tencent.mars.cdn.proto.SnsOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.SnsOptions)) {
            return false;
        }
        com.tencent.mars.cdn.proto.SnsOptions snsOptions = (com.tencent.mars.cdn.proto.SnsOptions) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.is_colddata), java.lang.Boolean.valueOf(snsOptions.is_colddata)) && n51.f.a(java.lang.Boolean.valueOf(this.is_hotdata), java.lang.Boolean.valueOf(snsOptions.is_hotdata)) && n51.f.a(this.scene, snsOptions.scene) && n51.f.a(java.lang.Long.valueOf(this.decrypt_key), java.lang.Long.valueOf(snsOptions.decrypt_key));
    }

    public long getDecryptKey() {
        return this.decrypt_key;
    }

    public boolean getIsColddata() {
        return this.is_colddata;
    }

    public boolean getIsHotdata() {
        return this.is_hotdata;
    }

    public java.lang.String getScene() {
        return this.hasSetFields[3] ? this.scene : "";
    }

    public boolean hasDecryptKey() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIsColddata() {
        return hasFieldNumber(1);
    }

    public boolean hasIsHotdata() {
        return hasFieldNumber(2);
    }

    public boolean hasScene() {
        return hasFieldNumber(3);
    }

    public com.tencent.mars.cdn.proto.SnsOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.SnsOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.a(1, this.is_colddata);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.is_hotdata);
            }
            java.lang.String str = this.scene;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.decrypt_key);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.hasSetFields[1] ? 0 + b36.f.a(1, this.is_colddata) : 0;
            if (this.hasSetFields[2]) {
                a17 += b36.f.a(2, this.is_hotdata);
            }
            java.lang.String str2 = this.scene;
            if (str2 != null && this.hasSetFields[3]) {
                a17 += b36.f.j(3, str2);
            }
            return this.hasSetFields[4] ? a17 + b36.f.h(4, this.decrypt_key) : a17;
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
            this.is_colddata = aVar2.c(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.is_hotdata = aVar2.c(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.scene = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.decrypt_key = aVar2.i(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.SnsOptions setDecryptKey(long j17) {
        this.decrypt_key = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsOptions setIsColddata(boolean z17) {
        this.is_colddata = z17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsOptions setIsHotdata(boolean z17) {
        this.is_hotdata = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsOptions setScene(java.lang.String str) {
        this.scene = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.SnsOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.SnsOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.SnsOptions) super.parseFrom(bArr);
    }
}
