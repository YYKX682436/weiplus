package co0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final co0.u f43737d;

    /* renamed from: e, reason: collision with root package name */
    public static final co0.u f43738e;

    /* renamed from: f, reason: collision with root package name */
    public static final co0.u f43739f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ co0.u[] f43740g;

    static {
        co0.u uVar = new co0.u("PLAYING", 0);
        f43737d = uVar;
        co0.u uVar2 = new co0.u("TEMP_PAUSE", 1);
        f43738e = uVar2;
        co0.u uVar3 = new co0.u("REAL_PAUSE", 2);
        f43739f = uVar3;
        co0.u[] uVarArr = {uVar, uVar2, uVar3};
        f43740g = uVarArr;
        rz5.b.a(uVarArr);
    }

    public u(java.lang.String str, int i17) {
    }

    public static co0.u valueOf(java.lang.String str) {
        return (co0.u) java.lang.Enum.valueOf(co0.u.class, str);
    }

    public static co0.u[] values() {
        return (co0.u[]) f43740g.clone();
    }
}
