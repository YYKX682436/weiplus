package sx2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final sx2.c f495058d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ sx2.c[] f495059e;

    static {
        sx2.c cVar = new sx2.c("LEFT_TO_RIGHT", 0);
        sx2.c cVar2 = new sx2.c("RIGHT_TO_LEFT", 1);
        f495058d = cVar2;
        sx2.c[] cVarArr = {cVar, cVar2, new sx2.c("TOP_TO_BOTTOM", 2), new sx2.c("BOTTOM_TO_TOP", 3)};
        f495059e = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static sx2.c m165438xdce0328(java.lang.String str) {
        return (sx2.c) java.lang.Enum.valueOf(sx2.c.class, str);
    }

    /* renamed from: values */
    public static sx2.c[] m165439xcee59d22() {
        return (sx2.c[]) f495059e.clone();
    }
}
