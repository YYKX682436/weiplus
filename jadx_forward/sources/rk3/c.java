package rk3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final rk3.c f478021d;

    /* renamed from: e, reason: collision with root package name */
    public static final rk3.c f478022e;

    /* renamed from: f, reason: collision with root package name */
    public static final rk3.c f478023f;

    /* renamed from: g, reason: collision with root package name */
    public static final rk3.c f478024g;

    /* renamed from: h, reason: collision with root package name */
    public static final rk3.c f478025h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rk3.c[] f478026i;

    static {
        rk3.c cVar = new rk3.c("EXPANDED", 0);
        f478021d = cVar;
        rk3.c cVar2 = new rk3.c("COLLAPSED", 1);
        f478022e = cVar2;
        rk3.c cVar3 = new rk3.c("ANCHORED", 2);
        f478023f = cVar3;
        rk3.c cVar4 = new rk3.c("HIDDEN", 3);
        f478024g = cVar4;
        rk3.c cVar5 = new rk3.c("DRAGGING", 4);
        f478025h = cVar5;
        rk3.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f478026i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static rk3.c m162560xdce0328(java.lang.String str) {
        return (rk3.c) java.lang.Enum.valueOf(rk3.c.class, str);
    }

    /* renamed from: values */
    public static rk3.c[] m162561xcee59d22() {
        return (rk3.c[]) f478026i.clone();
    }
}
