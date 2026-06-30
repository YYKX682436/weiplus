package bw5;

/* loaded from: classes9.dex */
public enum k8 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    EcsOpenPlatform_Unknown(0),
    EcsOpenPlatform_Cpp(1),
    EcsOpenPlatform_Native(2),
    EcsOpenPlatform_Flutter(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f110818d;

    k8(int i17) {
        this.f110818d = i17;
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f110818d;
    }
}
