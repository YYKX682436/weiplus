package bw5;

/* loaded from: classes11.dex */
public enum m0 implements com.tencent.mm.protobuf.h {
    ENTER_FROM_DEFAULT(0),
    ENTER_FROM_SETTING(1),
    ENTER_FROM_BANNER(2),
    ENTER_FROM_MAIN_SEARCH(3),
    ENTER_FROM_WEB_SEARCH(4),
    ENTER_FROM_CAMERA_SCAN(5),
    ENTER_FROM_PC_NEW_XML(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f30029d;

    m0(int i17) {
        this.f30029d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30029d;
    }
}
