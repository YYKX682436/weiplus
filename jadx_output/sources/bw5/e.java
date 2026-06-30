package bw5;

/* loaded from: classes6.dex */
public enum e implements com.tencent.mm.protobuf.h {
    AICHAT_STATUS_IDLE(0),
    AICHAT_STATUS_LISTENING(1),
    AICHAT_STATUS_THINKING(2),
    AICHAT_STATUS_SPEAKING(3),
    AICHAT_STATUS_WAITING(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f26670d;

    e(int i17) {
        this.f26670d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f26670d;
    }
}
