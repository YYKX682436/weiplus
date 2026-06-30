package com.tencent.mars.cdn.proto;

/* loaded from: classes2.dex */
public class DownloadInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.DownloadInfo DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.DownloadInfo();
    private long begin_tickcount;
    private long end_tickcount;
    private final boolean[] hasSetFields = new boolean[5];
    private long recved_bytes;
    private long transfor_ms;

    public static com.tencent.mars.cdn.proto.DownloadInfo create() {
        return new com.tencent.mars.cdn.proto.DownloadInfo();
    }

    public static com.tencent.mars.cdn.proto.DownloadInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.DownloadInfo newBuilder() {
        return new com.tencent.mars.cdn.proto.DownloadInfo();
    }

    public com.tencent.mars.cdn.proto.DownloadInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.DownloadInfo)) {
            return false;
        }
        com.tencent.mars.cdn.proto.DownloadInfo downloadInfo = (com.tencent.mars.cdn.proto.DownloadInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.recved_bytes), java.lang.Long.valueOf(downloadInfo.recved_bytes)) && n51.f.a(java.lang.Long.valueOf(this.transfor_ms), java.lang.Long.valueOf(downloadInfo.transfor_ms)) && n51.f.a(java.lang.Long.valueOf(this.begin_tickcount), java.lang.Long.valueOf(downloadInfo.begin_tickcount)) && n51.f.a(java.lang.Long.valueOf(this.end_tickcount), java.lang.Long.valueOf(downloadInfo.end_tickcount));
    }

    public long getBeginTickcount() {
        return this.begin_tickcount;
    }

    public long getEndTickcount() {
        return this.end_tickcount;
    }

    public long getRecvedBytes() {
        return this.recved_bytes;
    }

    public long getTransforMs() {
        return this.transfor_ms;
    }

    public boolean hasBeginTickcount() {
        return hasFieldNumber(3);
    }

    public boolean hasEndTickcount() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasRecvedBytes() {
        return hasFieldNumber(1);
    }

    public boolean hasTransforMs() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.DownloadInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.DownloadInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.h(1, this.recved_bytes);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.transfor_ms);
            }
            if (this.hasSetFields[3]) {
                fVar.h(3, this.begin_tickcount);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.end_tickcount);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.hasSetFields[1] ? 0 + b36.f.h(1, this.recved_bytes) : 0;
            if (this.hasSetFields[2]) {
                h17 += b36.f.h(2, this.transfor_ms);
            }
            if (this.hasSetFields[3]) {
                h17 += b36.f.h(3, this.begin_tickcount);
            }
            return this.hasSetFields[4] ? h17 + b36.f.h(4, this.end_tickcount) : h17;
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
            this.recved_bytes = aVar2.i(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.transfor_ms = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.begin_tickcount = aVar2.i(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.end_tickcount = aVar2.i(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.DownloadInfo setBeginTickcount(long j17) {
        this.begin_tickcount = j17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadInfo setEndTickcount(long j17) {
        this.end_tickcount = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadInfo setRecvedBytes(long j17) {
        this.recved_bytes = j17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadInfo setTransforMs(long j17) {
        this.transfor_ms = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.DownloadInfo parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.DownloadInfo) super.parseFrom(bArr);
    }
}
