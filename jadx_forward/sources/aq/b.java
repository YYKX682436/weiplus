package aq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final aq.b f94368d;

    /* renamed from: e, reason: collision with root package name */
    public static final aq.b f94369e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq.b f94370f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ aq.b[] f94371g;

    static {
        aq.b bVar = new aq.b("IDLE", 0);
        f94368d = bVar;
        aq.b bVar2 = new aq.b("ALL_OLD", 1);
        f94369e = bVar2;
        aq.b bVar3 = new aq.b("NEW", 2);
        f94370f = bVar3;
        aq.b[] bVarArr = {bVar, bVar2, bVar3};
        f94371g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static aq.b m8790xdce0328(java.lang.String str) {
        return (aq.b) java.lang.Enum.valueOf(aq.b.class, str);
    }

    /* renamed from: values */
    public static aq.b[] m8791xcee59d22() {
        return (aq.b[]) f94371g.clone();
    }
}
