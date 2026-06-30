package bw5;

/* loaded from: classes11.dex */
public enum m20 implements com.tencent.mm.protobuf.h {
    HybridRouterPageStateDefault(0),
    HybridRouterPageStatePageEnter(1),
    HybridRouterPageStatePageExit(2),
    HybridRouterPageStatePageAppear(3),
    HybridRouterPageStatePageDisappear(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f30058d;

    m20(int i17) {
        this.f30058d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30058d;
    }
}
