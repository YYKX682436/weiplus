package dt5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final dt5.c f324843d;

    /* renamed from: e, reason: collision with root package name */
    public static final dt5.c f324844e;

    /* renamed from: f, reason: collision with root package name */
    public static final dt5.c f324845f;

    /* renamed from: g, reason: collision with root package name */
    public static final dt5.c f324846g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dt5.c[] f324847h;

    static {
        dt5.c cVar = new dt5.c("DETECT_MODEL", 0);
        f324843d = cVar;
        dt5.c cVar2 = new dt5.c("SR_MODEL", 1);
        f324844e = cVar2;
        dt5.c cVar3 = new dt5.c("SEGMENTATION_MODEL", 2);
        f324845f = cVar3;
        dt5.c cVar4 = new dt5.c("REVERSE_CLS", 3);
        f324846g = cVar4;
        dt5.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f324847h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static dt5.c m126223xdce0328(java.lang.String str) {
        return (dt5.c) java.lang.Enum.valueOf(dt5.c.class, str);
    }

    /* renamed from: values */
    public static dt5.c[] m126224xcee59d22() {
        return (dt5.c[]) f324847h.clone();
    }
}
