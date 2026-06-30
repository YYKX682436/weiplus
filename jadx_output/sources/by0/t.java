package by0;

/* loaded from: classes5.dex */
public abstract class t {
    public static final void a(android.content.Context context, int i17, int... formatArgs) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(formatArgs, "formatArgs");
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        android.content.res.Resources a17 = j65.q.a(context);
        int length = formatArgs.length;
        java.lang.Integer[] numArr = new java.lang.Integer[length];
        int length2 = formatArgs.length;
        for (int i19 = 0; i19 < length2; i19++) {
            numArr[i19] = java.lang.Integer.valueOf(formatArgs[i19]);
        }
        e4Var.f211776c = a17.getString(i17, java.util.Arrays.copyOf(numArr, length));
        e4Var.c();
    }
}
