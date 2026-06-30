package cg0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final cg0.c f122577d;

    /* renamed from: e, reason: collision with root package name */
    public static final cg0.c f122578e;

    /* renamed from: f, reason: collision with root package name */
    public static final cg0.c f122579f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cg0.c[] f122580g;

    static {
        cg0.c cVar = new cg0.c("Success", 0);
        f122577d = cVar;
        cg0.c cVar2 = new cg0.c("Cancel", 1);
        f122578e = cVar2;
        cg0.c cVar3 = new cg0.c("DownloadError", 2);
        f122579f = cVar3;
        cg0.c[] cVarArr = {cVar, cVar2, cVar3, new cg0.c("OtherError", 3)};
        f122580g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cg0.c m14779xdce0328(java.lang.String str) {
        return (cg0.c) java.lang.Enum.valueOf(cg0.c.class, str);
    }

    /* renamed from: values */
    public static cg0.c[] m14780xcee59d22() {
        return (cg0.c[]) f122580g.clone();
    }
}
