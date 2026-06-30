package mh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final mh2.o f407959e;

    /* renamed from: f, reason: collision with root package name */
    public static final mh2.o f407960f;

    /* renamed from: g, reason: collision with root package name */
    public static final mh2.o f407961g;

    /* renamed from: h, reason: collision with root package name */
    public static final mh2.o f407962h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mh2.o[] f407963i;

    /* renamed from: d, reason: collision with root package name */
    public final int f407964d;

    static {
        mh2.o oVar = new mh2.o("TUNING", 0, 1);
        f407959e = oVar;
        mh2.o oVar2 = new mh2.o("ORIGINAL_TOGGLE", 1, 2);
        f407960f = oVar2;
        mh2.o oVar3 = new mh2.o("PAUSE_RESUME", 2, 3);
        f407961g = oVar3;
        mh2.o oVar4 = new mh2.o("FINISH_SINGING", 3, 4);
        f407962h = oVar4;
        mh2.o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        f407963i = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17, int i18) {
        this.f407964d = i18;
    }

    /* renamed from: valueOf */
    public static mh2.o m147313xdce0328(java.lang.String str) {
        return (mh2.o) java.lang.Enum.valueOf(mh2.o.class, str);
    }

    /* renamed from: values */
    public static mh2.o[] m147314xcee59d22() {
        return (mh2.o[]) f407963i.clone();
    }
}
