package u56;

/* loaded from: classes13.dex */
public abstract class l implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public static final int f506365d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f506366e;

    /* renamed from: f, reason: collision with root package name */
    public static final u56.g f506367f;

    /* renamed from: g, reason: collision with root package name */
    public static final u56.g f506368g;

    static {
        f506365d = 128;
        if (u56.i.f506364b) {
            f506365d = 16;
        }
        java.lang.String property = java.lang.System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                f506365d = java.lang.Integer.parseInt(property);
            } catch (java.lang.NumberFormatException e17) {
                java.lang.System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e17.getMessage());
            }
        }
        f506366e = f506365d;
        f506367f = new u56.j();
        f506368g = new u56.k();
    }
}
