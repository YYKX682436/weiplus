package bw5;

/* loaded from: classes6.dex */
public enum zi0 implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_NORMAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_DEVICE_DISCONNECT(1),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_PROGRAM_ERROR(2),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_NEED_UPDATE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_NO_SPACE(4),
    ERROR_CODE_NETWORK_DISCONNECT(5),
    ERROR_CODE_ACCOUNT_MISMATCH(6),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_NO_CHAT_LOG(7),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_UI_QRCODE_EXPIRED(8),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_CONNECT_FAILED_NOT_SAME_SUBNET(9),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CODE_AUTH_FAILED(10);


    /* renamed from: d, reason: collision with root package name */
    public final int f36027d;

    zi0(int i17) {
        this.f36027d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f36027d;
    }
}
