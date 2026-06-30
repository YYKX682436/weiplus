package al1;

/* loaded from: classes7.dex */
public enum j0 {
    BLACK(-16777216),
    WHITE(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f5782d;

    j0(int i17) {
        this.f5782d = i17;
    }

    public static al1.j0 a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            for (al1.j0 j0Var : values()) {
                if (j0Var.name().equalsIgnoreCase(str)) {
                    return j0Var;
                }
            }
        }
        return WHITE;
    }
}
