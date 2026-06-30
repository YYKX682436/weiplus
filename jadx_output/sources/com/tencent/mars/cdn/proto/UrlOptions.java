package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class UrlOptions extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.UrlOptions DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.UrlOptions();
    private final boolean[] hasSetFields = new boolean[2];
    private int max_http_redirect;

    public static com.tencent.mars.cdn.proto.UrlOptions create() {
        return new com.tencent.mars.cdn.proto.UrlOptions();
    }

    public static com.tencent.mars.cdn.proto.UrlOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.UrlOptions newBuilder() {
        return new com.tencent.mars.cdn.proto.UrlOptions();
    }

    public com.tencent.mars.cdn.proto.UrlOptions build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mars.cdn.proto.UrlOptions) && n51.f.a(java.lang.Integer.valueOf(this.max_http_redirect), java.lang.Integer.valueOf(((com.tencent.mars.cdn.proto.UrlOptions) fVar).max_http_redirect));
    }

    public int getMaxHttpRedirect() {
        return this.max_http_redirect;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMaxHttpRedirect() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.UrlOptions mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.UrlOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.max_http_redirect);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.hasSetFields[1]) {
                return 0 + b36.f.e(1, this.max_http_redirect);
            }
            return 0;
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
        if (intValue != 1) {
            return -1;
        }
        this.max_http_redirect = aVar2.g(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.UrlOptions setMaxHttpRedirect(int i17) {
        this.max_http_redirect = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UrlOptions mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.UrlOptions parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.UrlOptions) super.parseFrom(bArr);
    }
}
