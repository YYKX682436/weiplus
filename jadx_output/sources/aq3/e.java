package aq3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ aq3.e[] f13170d;

    static {
        aq3.e[] eVarArr = {new aq3.e("TYPE_EXPIRED", 0, 1), new aq3.e("TYPE_CONTROL", 1, 2), new aq3.e("TYPE_REJECT", 2, 3), new aq3.e("TYPE_TIMEOUT", 3, 4), new aq3.e("TYPE_STATISTICS_COUNT_BLOWOUT", 4, 5), new aq3.e("TYPE_STATISTICS_UI_TIME", 5, 6), new aq3.e("TYPE_STATISTICS_UI_THREAD_TIME", 6, 7), new aq3.e("TYPE_STATISTICS_UI_TIME_RADIO", 7, 8), new aq3.e("TYPE_STATISTICS_OTHER_TIME", 8, 9), new aq3.e("TYPE_STATISTICS_OTHER_THREAD_TIME", 9, 10), new aq3.e("TYPE_STATISTICS_OTHER_TIME_RADIO", 10, 11), new aq3.e("TYPE_STATISTICS_THREAD_COUNT", 11, 12), new aq3.e("TYPE_STATISTICS_UI_OTHER_AVERAGE", 12, 13), new aq3.e("TYPE_STATISTICS_MAX_COUNT_BLOWOUT", 13, 14), new aq3.e("TYPE_STATISTICS_TASK_THREAD_TIME", 14, 15), new aq3.e("TYPE_LOOPER_PREPARE", 15, 16)};
        f13170d = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
    }

    public static aq3.e valueOf(java.lang.String str) {
        return (aq3.e) java.lang.Enum.valueOf(aq3.e.class, str);
    }

    public static aq3.e[] values() {
        return (aq3.e[]) f13170d.clone();
    }
}
