package bw5;

/* loaded from: classes9.dex */
public enum k8 implements com.tencent.mm.protobuf.h {
    EcsOpenPlatform_Unknown(0),
    EcsOpenPlatform_Cpp(1),
    EcsOpenPlatform_Native(2),
    EcsOpenPlatform_Flutter(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f29285d;

    k8(int i17) {
        this.f29285d = i17;
    }

    public static bw5.k8 a(int i17) {
        if (i17 == 0) {
            return EcsOpenPlatform_Unknown;
        }
        if (i17 == 1) {
            return EcsOpenPlatform_Cpp;
        }
        if (i17 == 2) {
            return EcsOpenPlatform_Native;
        }
        if (i17 != 3) {
            return null;
        }
        return EcsOpenPlatform_Flutter;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29285d;
    }
}
