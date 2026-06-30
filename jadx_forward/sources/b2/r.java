package b2;

/* loaded from: classes7.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final android.text.Layout.Alignment f98845a;

    /* renamed from: b, reason: collision with root package name */
    public static final android.text.Layout.Alignment f98846b;

    static {
        android.text.Layout.Alignment[] values = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = alignment;
        for (android.text.Layout.Alignment alignment3 : values) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f98845a = alignment;
        f98846b = alignment2;
    }
}
