package bw5;

/* loaded from: classes4.dex */
public enum gz implements com.tencent.mm.protobuf.h {
    Pcm(1),
    Wav(2),
    Silk(3),
    Aac(4),
    M4a(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f28027d;

    gz(int i17) {
        this.f28027d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28027d;
    }
}
