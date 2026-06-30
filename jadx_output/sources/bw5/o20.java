package bw5;

/* loaded from: classes11.dex */
public enum o20 implements com.tencent.mm.protobuf.h {
    DEFAULT(0),
    WHITE(1),
    ORANGE(2),
    GREEN(3),
    LINK(4),
    GREY(5),
    FG_1(6),
    FG_0(7),
    FG_2(8),
    FG_3(9),
    NORMAL_TXT_COLOR(10);


    /* renamed from: d, reason: collision with root package name */
    public final int f30920d;

    o20(int i17) {
        this.f30920d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30920d;
    }
}
