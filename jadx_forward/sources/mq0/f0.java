package mq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mq0.f0 f412086e;

    /* renamed from: f, reason: collision with root package name */
    public static final mq0.f0 f412087f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mq0.f0[] f412088g;

    /* renamed from: d, reason: collision with root package name */
    public final int f412089d;

    static {
        mq0.f0 f0Var = new mq0.f0("Unknown", 0, -1);
        mq0.f0 f0Var2 = new mq0.f0("Old", 1, 0);
        f412086e = f0Var2;
        mq0.f0 f0Var3 = new mq0.f0("New", 2, 1);
        f412087f = f0Var3;
        mq0.f0[] f0VarArr = {f0Var, f0Var2, f0Var3};
        f412088g = f0VarArr;
        rz5.b.a(f0VarArr);
    }

    public f0(java.lang.String str, int i17, int i18) {
        this.f412089d = i18;
    }

    /* renamed from: valueOf */
    public static mq0.f0 m148205xdce0328(java.lang.String str) {
        return (mq0.f0) java.lang.Enum.valueOf(mq0.f0.class, str);
    }

    /* renamed from: values */
    public static mq0.f0[] m148206xcee59d22() {
        return (mq0.f0[]) f412088g.clone();
    }
}
