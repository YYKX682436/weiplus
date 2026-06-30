package lm3;

/* loaded from: classes10.dex */
public final class e implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final fm3.u f401015d;

    public e(fm3.u mv6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mv6, "mv");
        this.f401015d = mv6;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        fm3.u uVar = this.f401015d;
        java.lang.Long l17 = uVar.f345654a;
        if (l17 != null) {
            return l17.longValue();
        }
        java.lang.Long l18 = uVar.f345656c;
        if (l18 != null) {
            return l18.longValue();
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
