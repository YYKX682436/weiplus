package bm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h3 {

    /* renamed from: d, reason: collision with root package name */
    public static final bm2.h3 f21938d;

    /* renamed from: e, reason: collision with root package name */
    public static final bm2.h3 f21939e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bm2.h3[] f21940f;

    static {
        bm2.h3 h3Var = new bm2.h3("INPUT_PLUGIN", 0);
        f21938d = h3Var;
        bm2.h3 h3Var2 = new bm2.h3("LIVE_ROOM", 1);
        f21939e = h3Var2;
        bm2.h3[] h3VarArr = {h3Var, h3Var2};
        f21940f = h3VarArr;
        rz5.b.a(h3VarArr);
    }

    public h3(java.lang.String str, int i17) {
    }

    public static bm2.h3 valueOf(java.lang.String str) {
        return (bm2.h3) java.lang.Enum.valueOf(bm2.h3.class, str);
    }

    public static bm2.h3[] values() {
        return (bm2.h3[]) f21940f.clone();
    }
}
