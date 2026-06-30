package bx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final bx.s f36228d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bx.s[] f36229e;

    static {
        bx.s sVar = new bx.s("First", 0);
        f36228d = sVar;
        bx.s[] sVarArr = {sVar, new bx.s("All", 1)};
        f36229e = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    public static bx.s valueOf(java.lang.String str) {
        return (bx.s) java.lang.Enum.valueOf(bx.s.class, str);
    }

    public static bx.s[] values() {
        return (bx.s[]) f36229e.clone();
    }
}
