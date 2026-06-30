package bw5;

/* loaded from: classes4.dex */
public enum g30 implements com.tencent.mm.protobuf.h {
    LiteAppEmoticonStoreStatus_UNKNOWN(0),
    LiteAppEmoticonStoreStatus_UNDOWNLOAD(1),
    LiteAppEmoticonStoreStatus_DOWNLOADING(2),
    LiteAppEmoticonStoreStatus_DOWNLOADED(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f27654d;

    g30(int i17) {
        this.f27654d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27654d;
    }
}
