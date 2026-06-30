package gy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final gy0.c f359034d;

    /* renamed from: e, reason: collision with root package name */
    public static final gy0.c f359035e;

    /* renamed from: f, reason: collision with root package name */
    public static final gy0.c f359036f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gy0.c[] f359037g;

    static {
        gy0.c cVar = new gy0.c("TouchLeft", 0);
        f359034d = cVar;
        gy0.c cVar2 = new gy0.c("TouchRight", 1);
        f359035e = cVar2;
        gy0.c cVar3 = new gy0.c("LongPressDrag", 2);
        f359036f = cVar3;
        gy0.c[] cVarArr = {cVar, cVar2, cVar3};
        f359037g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static gy0.c m132519xdce0328(java.lang.String str) {
        return (gy0.c) java.lang.Enum.valueOf(gy0.c.class, str);
    }

    /* renamed from: values */
    public static gy0.c[] m132520xcee59d22() {
        return (gy0.c[]) f359037g.clone();
    }
}
