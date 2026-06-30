package aq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final aq.b f12835d;

    /* renamed from: e, reason: collision with root package name */
    public static final aq.b f12836e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq.b f12837f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ aq.b[] f12838g;

    static {
        aq.b bVar = new aq.b("IDLE", 0);
        f12835d = bVar;
        aq.b bVar2 = new aq.b("ALL_OLD", 1);
        f12836e = bVar2;
        aq.b bVar3 = new aq.b("NEW", 2);
        f12837f = bVar3;
        aq.b[] bVarArr = {bVar, bVar2, bVar3};
        f12838g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static aq.b valueOf(java.lang.String str) {
        return (aq.b) java.lang.Enum.valueOf(aq.b.class, str);
    }

    public static aq.b[] values() {
        return (aq.b[]) f12838g.clone();
    }
}
