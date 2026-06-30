package bw5;

/* loaded from: classes6.dex */
public enum h0 implements com.tencent.mm.protobuf.h {
    SUCCESS(1),
    NO_CHAT_LOG(2),
    MATCH_FAIL(3),
    QRCODE_EXPIRED(4),
    OTHER_ERROR(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f28037d;

    h0(int i17) {
        this.f28037d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28037d;
    }
}
