package bq;

/* loaded from: classes8.dex */
public abstract class v1 {
    public static final r45.hl0 a(r45.az2 az2Var) {
        kotlin.jvm.internal.o.g(az2Var, "<this>");
        return (r45.hl0) az2Var.getCustom(9);
    }

    public static final java.lang.String b(r45.qw0 qw0Var) {
        kotlin.jvm.internal.o.g(qw0Var, "<this>");
        return "check_expire_interval_sec=" + qw0Var.getInteger(1) + ", check_expire_max_count=" + qw0Var.getInteger(2) + ", check_expire_valid=" + qw0Var.getInteger(0);
    }
}
