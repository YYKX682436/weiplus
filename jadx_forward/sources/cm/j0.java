package cm;

/* loaded from: classes6.dex */
public enum j0 {
    release(1),
    debug(2),
    demo(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f124651d;

    j0(int i17) {
        this.f124651d = i17;
    }

    public static cm.j0 a(int i17) {
        if (i17 == 1) {
            return release;
        }
        if (i17 == 2) {
            return debug;
        }
        if (i17 != 3) {
            return null;
        }
        return demo;
    }
}
