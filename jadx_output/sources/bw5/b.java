package bw5;

/* loaded from: classes2.dex */
public enum b implements com.tencent.mm.protobuf.h {
    AI_CHAT_ASR_RESULT_TYPE_UNKNOWN(0),
    AI_CHAT_ASR_RESULT_TYPE_TEXT(1),
    AI_CHAT_ASR_RESULT_TYPE_LLM_POLLING_KEY(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f25467d;

    b(int i17) {
        this.f25467d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25467d;
    }
}
