package ww5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ww5.c f531929d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ww5.c[] f531930e;

    static {
        ww5.c cVar = new ww5.c("Surface", 0);
        ww5.c cVar2 = new ww5.c("Texture", 1);
        f531929d = cVar2;
        ww5.c[] cVarArr = {cVar, cVar2};
        f531930e = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ww5.c m174592xdce0328(java.lang.String str) {
        return (ww5.c) java.lang.Enum.valueOf(ww5.c.class, str);
    }

    /* renamed from: values */
    public static ww5.c[] m174593xcee59d22() {
        return (ww5.c[]) f531930e.clone();
    }
}
