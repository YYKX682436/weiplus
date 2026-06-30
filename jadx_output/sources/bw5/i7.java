package bw5;

/* loaded from: classes9.dex */
public enum i7 implements com.tencent.mm.protobuf.h {
    EcsJsaPlatform_Unknown(0),
    EcsJsaPlatform_Cpp(1),
    EcsJsaPlatform_Native(2),
    EcsJsaPlatform_Flutter(3),
    EcsJsaPlatform_LiteApp(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f28488d;

    i7(int i17) {
        this.f28488d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28488d;
    }
}
