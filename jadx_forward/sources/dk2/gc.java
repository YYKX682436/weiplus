package dk2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gc {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.gc f315057d;

    /* renamed from: e, reason: collision with root package name */
    public static final dk2.gc f315058e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ dk2.gc[] f315059f;

    static {
        dk2.gc gcVar = new dk2.gc("SingleResponseChoice", 0, 1);
        f315057d = gcVar;
        dk2.gc gcVar2 = new dk2.gc("MultipleResponseChoice", 1, 4);
        f315058e = gcVar2;
        dk2.gc[] gcVarArr = {gcVar, gcVar2};
        f315059f = gcVarArr;
        rz5.b.a(gcVarArr);
    }

    public gc(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static dk2.gc m124572xdce0328(java.lang.String str) {
        return (dk2.gc) java.lang.Enum.valueOf(dk2.gc.class, str);
    }

    /* renamed from: values */
    public static dk2.gc[] m124573xcee59d22() {
        return (dk2.gc[]) f315059f.clone();
    }
}
