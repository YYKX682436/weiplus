package cd5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final cd5.b f40661e;

    /* renamed from: f, reason: collision with root package name */
    public static final cd5.c f40662f;

    /* renamed from: g, reason: collision with root package name */
    public static final cd5.c f40663g;

    /* renamed from: h, reason: collision with root package name */
    public static final cd5.c f40664h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cd5.c[] f40665i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f40666m;

    /* renamed from: d, reason: collision with root package name */
    public final int f40667d;

    static {
        cd5.c cVar = new cd5.c("COMPACT", 0, 4);
        f40663g = cVar;
        cd5.c cVar2 = new cd5.c("DENSE", 1, 6);
        f40664h = cVar2;
        cd5.c[] cVarArr = {cVar, cVar2};
        f40665i = cVarArr;
        f40666m = rz5.b.a(cVarArr);
        f40661e = new cd5.b(null);
        f40662f = cVar;
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f40667d = i18;
    }

    public static cd5.c valueOf(java.lang.String str) {
        return (cd5.c) java.lang.Enum.valueOf(cd5.c.class, str);
    }

    public static cd5.c[] values() {
        return (cd5.c[]) f40665i.clone();
    }
}
