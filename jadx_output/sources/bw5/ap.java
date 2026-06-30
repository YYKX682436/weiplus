package bw5;

/* loaded from: classes2.dex */
public enum ap implements com.tencent.mm.protobuf.h {
    PkBattle(1),
    VoiceRoom(2),
    Game(3),
    KTV(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f25298d;

    ap(int i17) {
        this.f25298d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25298d;
    }
}
