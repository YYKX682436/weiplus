package r23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r23.a[] f450341d;

    static {
        r23.a[] aVarArr = {new r23.a("NO_SELECT", 0, 0), new r23.a("SELECTED", 1, 1), new r23.a("SELECTED_NO_ENABLE_CHANGE", 2, 2)};
        f450341d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static r23.a m161378xdce0328(java.lang.String str) {
        return (r23.a) java.lang.Enum.valueOf(r23.a.class, str);
    }

    /* renamed from: values */
    public static r23.a[] m161379xcee59d22() {
        return (r23.a[]) f450341d.clone();
    }
}
