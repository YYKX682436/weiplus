package zf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zf0.c[] f553922d;

    static {
        zf0.c[] cVarArr = {new zf0.c("SendStart", 0, 1L), new zf0.c("SendSuc", 1, 2L), new zf0.c("SendFail", 2, 3L), new zf0.c("SendResume", 3, 4L), new zf0.c("SendPause", 4, 5L)};
        f553922d = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, long j17) {
    }

    /* renamed from: valueOf */
    public static zf0.c m178841xdce0328(java.lang.String str) {
        return (zf0.c) java.lang.Enum.valueOf(zf0.c.class, str);
    }

    /* renamed from: values */
    public static zf0.c[] m178842xcee59d22() {
        return (zf0.c[]) f553922d.clone();
    }
}
