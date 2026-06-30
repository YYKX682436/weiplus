package bw5;

/* loaded from: classes6.dex */
public enum f30 implements com.tencent.mm.protobuf.h {
    PREVIEW_NONE(0),
    PREVIEW_PASSWORD(1),
    PREVIEW_FILES(2),
    PREVIEW_SIZE(3),
    PREVIEW_DEPTH(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f27141d;

    f30(int i17) {
        this.f27141d = i17;
    }

    public static bw5.f30 a(int i17) {
        if (i17 == 0) {
            return PREVIEW_NONE;
        }
        if (i17 == 1) {
            return PREVIEW_PASSWORD;
        }
        if (i17 == 2) {
            return PREVIEW_FILES;
        }
        if (i17 == 3) {
            return PREVIEW_SIZE;
        }
        if (i17 != 4) {
            return null;
        }
        return PREVIEW_DEPTH;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27141d;
    }
}
