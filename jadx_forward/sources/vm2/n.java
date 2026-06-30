package vm2;

/* loaded from: classes10.dex */
public final class n implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final dk2.rf f519632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f519633e;

    public n(dk2.rf micReplayInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayInfo, "micReplayInfo");
        this.f519632d = micReplayInfo;
        this.f519633e = i17;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f519632d.f315572d != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }
}
