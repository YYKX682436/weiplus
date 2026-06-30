package ai4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final ai4.a f5113d;

    /* renamed from: e, reason: collision with root package name */
    public static final ai4.a f5114e;

    /* renamed from: f, reason: collision with root package name */
    public static final ai4.a f5115f;

    /* renamed from: g, reason: collision with root package name */
    public static final ai4.a f5116g;

    /* renamed from: h, reason: collision with root package name */
    public static final ai4.a f5117h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ai4.a[] f5118i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f5119m;

    static {
        ai4.a aVar = new ai4.a("SELF_STATUS", 0);
        f5113d = aVar;
        ai4.a aVar2 = new ai4.a("FRIENDS_STATUS", 1);
        f5114e = aVar2;
        ai4.a aVar3 = new ai4.a("SELF_LIKE", 2);
        f5115f = aVar3;
        ai4.a aVar4 = new ai4.a("FRIENDS_LIKE", 3);
        f5116g = aVar4;
        ai4.a aVar5 = new ai4.a("FRIENDS_COMMENT", 4);
        f5117h = aVar5;
        ai4.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f5118i = aVarArr;
        f5119m = rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static ai4.a valueOf(java.lang.String str) {
        return (ai4.a) java.lang.Enum.valueOf(ai4.a.class, str);
    }

    public static ai4.a[] values() {
        return (ai4.a[]) f5118i.clone();
    }
}
