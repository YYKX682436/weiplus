package y45;

/* loaded from: classes11.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final d55.v[] f540920a = {null};

    public static d55.v a(android.content.Context context) {
        d55.v[] vVarArr = f540920a;
        if (vVarArr[0] == null) {
            synchronized (vVarArr) {
                if (vVarArr[0] == null) {
                    vVarArr[0] = new d55.v(context, "wc_spec_settings");
                }
            }
        }
        return vVarArr[0];
    }
}
