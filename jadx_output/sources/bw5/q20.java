package bw5;

/* loaded from: classes6.dex */
public enum q20 implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    INIT_CMD_UNKNOWN(0),
    INIT_CMD_GET_CARD_HOLDER_ENTRANCE_INFO(1),
    INIT_CMD_GET_ECS_STRATEGY(2),
    INIT_CMD_GET_PRESENT_ENTRANCE_INFO(3),
    INIT_CMD_GET_ECS_CONFIG(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f31912d;

    q20(int i17) {
        this.f31912d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f31912d;
    }
}
