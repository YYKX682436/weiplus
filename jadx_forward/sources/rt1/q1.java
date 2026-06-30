package rt1;

/* loaded from: classes7.dex */
public final class q1 {
    public q1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final long a(java.lang.CharSequence source) {
        rt1.r1[] r1VarArr;
        rt1.r1 r1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (!(source instanceof android.text.SpannableStringBuilder) || (r1VarArr = (rt1.r1[]) ((android.text.SpannableStringBuilder) source).getSpans(0, source.length(), rt1.r1.class)) == null) {
            return 0L;
        }
        if (r1VarArr.length == 0) {
            r1Var = null;
        } else {
            rt1.r1 r1Var2 = r1VarArr[0];
            int length = r1VarArr.length - 1;
            if (length != 0) {
                long j17 = r1Var2.f481015d;
                kz5.x0 it = new e06.k(1, length).iterator();
                while (((e06.j) it).f327747f) {
                    rt1.r1 r1Var3 = r1VarArr[it.b()];
                    long j18 = r1Var3.f481015d;
                    if (j17 < j18) {
                        r1Var2 = r1Var3;
                        j17 = j18;
                    }
                }
            }
            r1Var = r1Var2;
        }
        if (r1Var != null) {
            return r1Var.f481015d;
        }
        return 0L;
    }
}
