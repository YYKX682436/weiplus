package bw5;

/* loaded from: classes6.dex */
public enum cr implements com.tencent.mm.protobuf.h {
    FinderModifyFeedRetSuc(1),
    FinderModifyFeedRetFail(2),
    FinderModifyFeedRetExit(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f26205d;

    cr(int i17) {
        this.f26205d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f26205d;
    }
}
