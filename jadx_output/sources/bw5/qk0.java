package bw5;

/* loaded from: classes4.dex */
public enum qk0 implements com.tencent.mm.protobuf.h {
    SNS_VISIBILITY_UNKNOWN(0),
    SNS_VISIBILITY_PUBLIC(1),
    SNS_VISIBILITY_PRIVATE(2),
    SNS_VISIBILITY_VISIBLE(3),
    SNS_VISIBILITY_INVISIBLE(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f32151d;

    qk0(int i17) {
        this.f32151d = i17;
    }

    public static bw5.qk0 a(int i17) {
        if (i17 == 0) {
            return SNS_VISIBILITY_UNKNOWN;
        }
        if (i17 == 1) {
            return SNS_VISIBILITY_PUBLIC;
        }
        if (i17 == 2) {
            return SNS_VISIBILITY_PRIVATE;
        }
        if (i17 == 3) {
            return SNS_VISIBILITY_VISIBLE;
        }
        if (i17 != 4) {
            return null;
        }
        return SNS_VISIBILITY_INVISIBLE;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f32151d;
    }
}
