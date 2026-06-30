package eo1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final eo1.c f337082d;

    /* renamed from: e, reason: collision with root package name */
    public static final eo1.c f337083e;

    /* renamed from: f, reason: collision with root package name */
    public static final eo1.c f337084f;

    /* renamed from: g, reason: collision with root package name */
    public static final eo1.c f337085g;

    /* renamed from: h, reason: collision with root package name */
    public static final eo1.c f337086h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ eo1.c[] f337087i;

    static {
        eo1.c cVar = new eo1.c("DEVICE_NOT_FOUND", 0);
        f337082d = cVar;
        eo1.c cVar2 = new eo1.c("UUID_NOT_MATCH", 1);
        f337083e = cVar2;
        eo1.c cVar3 = new eo1.c("DEVICE_ID_NOT_MATCH", 2);
        f337084f = cVar3;
        eo1.c cVar4 = new eo1.c("REGENERATE_DEVICE_ID_FAIL", 3);
        f337085g = cVar4;
        eo1.c cVar5 = new eo1.c("PATH_CORRUPTED", 4);
        f337086h = cVar5;
        eo1.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f337087i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static eo1.c m127953xdce0328(java.lang.String str) {
        return (eo1.c) java.lang.Enum.valueOf(eo1.c.class, str);
    }

    /* renamed from: values */
    public static eo1.c[] m127954xcee59d22() {
        return (eo1.c[]) f337087i.clone();
    }
}
