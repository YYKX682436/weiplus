package bx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final bx.s f117761d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bx.s[] f117762e;

    static {
        bx.s sVar = new bx.s("First", 0);
        f117761d = sVar;
        bx.s[] sVarArr = {sVar, new bx.s("All", 1)};
        f117762e = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static bx.s m13534xdce0328(java.lang.String str) {
        return (bx.s) java.lang.Enum.valueOf(bx.s.class, str);
    }

    /* renamed from: values */
    public static bx.s[] m13535xcee59d22() {
        return (bx.s[]) f117762e.clone();
    }
}
