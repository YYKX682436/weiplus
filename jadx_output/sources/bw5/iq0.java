package bw5;

/* loaded from: classes11.dex */
public enum iq0 implements com.tencent.mm.protobuf.h {
    PlayTaskInfoPlayRateChanged(2),
    PlayTaskInfoPlayingItemReplaced(3),
    PlayTaskInfoStartPlayingItemReplace(4),
    PlayTaskInfoListRefresh(24),
    PlayTaskInfoNextListChanged(25);


    /* renamed from: d, reason: collision with root package name */
    public final int f28681d;

    iq0(int i17) {
        this.f28681d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28681d;
    }
}
