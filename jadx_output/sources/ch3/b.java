package ch3;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static long f41505b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f41506c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f41507d;

    /* renamed from: e, reason: collision with root package name */
    public static long f41508e;

    /* renamed from: a, reason: collision with root package name */
    public static final ch3.b f41504a = new ch3.b();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f41509f = jz5.h.b(ch3.a.f41503d);

    public final int a() {
        if (f41507d == 0) {
            f41507d = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f41509f).getValue()).getInt("daily_msg_count", 0);
        }
        return f41507d;
    }
}
