package re5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ re5.d[] f476095d;

    static {
        re5.d[] dVarArr = {new re5.d("LocalVideoPlayerOnPrepare", 0, "tp_on_prepare"), new re5.d("LocalVideoPlayerOnFirstFrame", 1, "tp_on_first_frame"), new re5.d("LocalVideoPlayerOnError", 2, "tp_on_error"), new re5.d("LocalVideoTryStart", 3, "tp_pre_start")};
        f476095d = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, java.lang.String str2) {
    }

    /* renamed from: valueOf */
    public static re5.d m162260xdce0328(java.lang.String str) {
        return (re5.d) java.lang.Enum.valueOf(re5.d.class, str);
    }

    /* renamed from: values */
    public static re5.d[] m162261xcee59d22() {
        return (re5.d[]) f476095d.clone();
    }
}
