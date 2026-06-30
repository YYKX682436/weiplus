package lx0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f403565a;

    public c(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f403565a = (i18 & 1) != 0 ? 131 : i17;
    }

    public final int a(int i17) {
        boolean z17 = i17 < 100;
        if (z17) {
            return i17;
        }
        if (z17) {
            throw new jz5.j();
        }
        return ((i17 - 100) * 10) + 100;
    }
}
