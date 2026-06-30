package bw5;

/* loaded from: classes9.dex */
public enum h7 implements com.tencent.mm.protobuf.h {
    EcsJsaEnv_Unknown(0),
    EcsJsaEnv_WeApp(1),
    EcsJsaEnv_WebView(2),
    EcsJsaEnv_MagicBrush(4),
    EcsJsaEnv_LiteApp(8),
    EcsJsaEnv_All(15);


    /* renamed from: d, reason: collision with root package name */
    public final int f28105d;

    h7(int i17) {
        this.f28105d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28105d;
    }
}
