package ox3;

/* loaded from: classes10.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final t45.i f431254d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f431255e;

    public a(t45.i exclusiveRingtoneData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exclusiveRingtoneData, "exclusiveRingtoneData");
        this.f431254d = exclusiveRingtoneData;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f431254d.f497121d != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
