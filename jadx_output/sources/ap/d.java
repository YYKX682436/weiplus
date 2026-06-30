package ap;

/* loaded from: classes12.dex */
public abstract class d {
    public static java.lang.String a() {
        java.lang.String a17 = bm5.f1.a();
        return android.text.TextUtils.isEmpty(a17) ? "" : a17.contains(":") ? a17.substring(a17.lastIndexOf(":") + 1) : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
    }
}
