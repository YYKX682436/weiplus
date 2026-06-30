package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class UrlDownload extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.UrlDownload DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.UrlDownload();
    private java.lang.String aeskey;
    private final boolean[] hasSetFields = new boolean[7];
    private int max_http_redirect;
    private com.tencent.mars.cdn.proto.Pcdn pcdn;
    private com.tencent.mars.cdn.proto.HostResolve resolve;
    private boolean treat_as_video;
    private com.tencent.mars.cdn.proto.Url url;

    public static com.tencent.mars.cdn.proto.UrlDownload create() {
        return new com.tencent.mars.cdn.proto.UrlDownload();
    }

    public static com.tencent.mars.cdn.proto.UrlDownload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.UrlDownload newBuilder() {
        return new com.tencent.mars.cdn.proto.UrlDownload();
    }

    public com.tencent.mars.cdn.proto.UrlDownload build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.UrlDownload)) {
            return false;
        }
        com.tencent.mars.cdn.proto.UrlDownload urlDownload = (com.tencent.mars.cdn.proto.UrlDownload) fVar;
        return n51.f.a(this.url, urlDownload.url) && n51.f.a(this.resolve, urlDownload.resolve) && n51.f.a(this.pcdn, urlDownload.pcdn) && n51.f.a(java.lang.Boolean.valueOf(this.treat_as_video), java.lang.Boolean.valueOf(urlDownload.treat_as_video)) && n51.f.a(java.lang.Integer.valueOf(this.max_http_redirect), java.lang.Integer.valueOf(urlDownload.max_http_redirect)) && n51.f.a(this.aeskey, urlDownload.aeskey);
    }

    public java.lang.String getAeskey() {
        return this.hasSetFields[6] ? this.aeskey : "";
    }

    public int getMaxHttpRedirect() {
        return this.max_http_redirect;
    }

    public com.tencent.mars.cdn.proto.Pcdn getPcdn() {
        return this.hasSetFields[3] ? this.pcdn : com.tencent.mars.cdn.proto.Pcdn.create();
    }

    public com.tencent.mars.cdn.proto.HostResolve getResolve() {
        return this.hasSetFields[2] ? this.resolve : com.tencent.mars.cdn.proto.HostResolve.create();
    }

    public boolean getTreatAsVideo() {
        return this.treat_as_video;
    }

    public com.tencent.mars.cdn.proto.Url getUrl() {
        return this.hasSetFields[1] ? this.url : com.tencent.mars.cdn.proto.Url.create();
    }

    public boolean hasAeskey() {
        return hasFieldNumber(6);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMaxHttpRedirect() {
        return hasFieldNumber(5);
    }

    public boolean hasPcdn() {
        return hasFieldNumber(3);
    }

    public boolean hasResolve() {
        return hasFieldNumber(2);
    }

    public boolean hasTreatAsVideo() {
        return hasFieldNumber(4);
    }

    public boolean hasUrl() {
        return hasFieldNumber(1);
    }

    public com.tencent.mars.cdn.proto.UrlDownload mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.UrlDownload();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.Url url = this.url;
            if (url != null && this.hasSetFields[1]) {
                fVar.i(1, url.computeSize());
                this.url.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.HostResolve hostResolve = this.resolve;
            if (hostResolve != null && this.hasSetFields[2]) {
                fVar.i(2, hostResolve.computeSize());
                this.resolve.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.Pcdn pcdn = this.pcdn;
            if (pcdn != null && this.hasSetFields[3]) {
                fVar.i(3, pcdn.computeSize());
                this.pcdn.writeFields(fVar);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.treat_as_video);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.max_http_redirect);
            }
            java.lang.String str = this.aeskey;
            if (str != null && this.hasSetFields[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.Url url2 = this.url;
            if (url2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.i(1, url2.computeSize());
            }
            com.tencent.mars.cdn.proto.HostResolve hostResolve2 = this.resolve;
            if (hostResolve2 != null && this.hasSetFields[2]) {
                i18 += b36.f.i(2, hostResolve2.computeSize());
            }
            com.tencent.mars.cdn.proto.Pcdn pcdn2 = this.pcdn;
            if (pcdn2 != null && this.hasSetFields[3]) {
                i18 += b36.f.i(3, pcdn2.computeSize());
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.a(4, this.treat_as_video);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.e(5, this.max_http_redirect);
            }
            java.lang.String str2 = this.aeskey;
            return (str2 == null || !this.hasSetFields[6]) ? i18 : i18 + b36.f.j(6, str2);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.Url url3 = new com.tencent.mars.cdn.proto.Url();
                    if (bArr != null && bArr.length > 0) {
                        url3.parseFrom(bArr);
                    }
                    this.url = url3;
                }
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mars.cdn.proto.HostResolve hostResolve3 = new com.tencent.mars.cdn.proto.HostResolve();
                    if (bArr2 != null && bArr2.length > 0) {
                        hostResolve3.parseFrom(bArr2);
                    }
                    this.resolve = hostResolve3;
                }
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mars.cdn.proto.Pcdn pcdn3 = new com.tencent.mars.cdn.proto.Pcdn();
                    if (bArr3 != null && bArr3.length > 0) {
                        pcdn3.parseFrom(bArr3);
                    }
                    this.pcdn = pcdn3;
                }
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.treat_as_video = aVar2.c(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.max_http_redirect = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.aeskey = aVar2.k(intValue);
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.UrlDownload setAeskey(java.lang.String str) {
        this.aeskey = str;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UrlDownload setMaxHttpRedirect(int i17) {
        this.max_http_redirect = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UrlDownload setPcdn(com.tencent.mars.cdn.proto.Pcdn pcdn) {
        this.pcdn = pcdn;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UrlDownload setResolve(com.tencent.mars.cdn.proto.HostResolve hostResolve) {
        this.resolve = hostResolve;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UrlDownload setTreatAsVideo(boolean z17) {
        this.treat_as_video = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UrlDownload setUrl(com.tencent.mars.cdn.proto.Url url) {
        this.url = url;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.UrlDownload mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.UrlDownload parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.UrlDownload) super.parseFrom(bArr);
    }
}
