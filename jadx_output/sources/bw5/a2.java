package bw5;

/* loaded from: classes2.dex */
public enum a2 implements com.tencent.mm.protobuf.h {
    AudioMixReqInfoAction_None(0),
    AudioMixReqInfoAction_FirstScreen(11),
    AudioMixReqInfoAction_FirstScreen_Force(12),
    AudioMixReqInfoAction_LoadMore(21),
    AudioMixReqInfoAction_PullRefresh(31),
    AudioMixReqInfoAction_RedDotPreload(41);


    /* renamed from: d, reason: collision with root package name */
    public final int f24976d;

    a2(int i17) {
        this.f24976d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f24976d;
    }
}
