package bw5;

/* loaded from: classes9.dex */
public enum x8 implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    ECS_REQ_SCENE_UNKNOWN(0),
    ECS_REQ_SCENE_CONVERSATION(1),
    ECS_REQ_SCENE_RECORD(2),
    /* JADX INFO: Fake field, exist only in values array */
    ECS_REQ_SCENE_SNS(3),
    ECS_REQ_SCENE_SHARE(4),
    ECS_REQ_SCENE_SEARCH(5),
    /* JADX INFO: Fake field, exist only in values array */
    ECS_REQ_SCENE_FAV(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f35000d;

    x8(int i17) {
        this.f35000d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f35000d;
    }
}
