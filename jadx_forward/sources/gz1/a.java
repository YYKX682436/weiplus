package gz1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final gz1.a f359229d;

    /* renamed from: e, reason: collision with root package name */
    public static final gz1.a f359230e;

    /* renamed from: f, reason: collision with root package name */
    public static final gz1.a f359231f;

    /* renamed from: g, reason: collision with root package name */
    public static final gz1.a f359232g;

    /* renamed from: h, reason: collision with root package name */
    public static final gz1.a f359233h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ gz1.a[] f359234i;

    static {
        gz1.a aVar = new gz1.a("ON_CREATE", 0);
        f359229d = aVar;
        gz1.a aVar2 = new gz1.a("ON_RESUME", 1);
        f359230e = aVar2;
        gz1.a aVar3 = new gz1.a("ON_PAUSE", 2);
        f359231f = aVar3;
        gz1.a aVar4 = new gz1.a("ON_DESTROY_VIEW", 3);
        f359232g = aVar4;
        gz1.a aVar5 = new gz1.a("ON_DESTROY", 4);
        f359233h = aVar5;
        gz1.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f359234i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static gz1.a m132546xdce0328(java.lang.String str) {
        return (gz1.a) java.lang.Enum.valueOf(gz1.a.class, str);
    }

    /* renamed from: values */
    public static gz1.a[] m132547xcee59d22() {
        return (gz1.a[]) f359234i.clone();
    }
}
