package by0;

/* loaded from: classes5.dex */
public abstract class t {
    public static final void a(android.content.Context context, int i17, int... formatArgs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatArgs, "formatArgs");
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        android.content.res.Resources a17 = j65.q.a(context);
        int length = formatArgs.length;
        java.lang.Integer[] numArr = new java.lang.Integer[length];
        int length2 = formatArgs.length;
        for (int i19 = 0; i19 < length2; i19++) {
            numArr[i19] = java.lang.Integer.valueOf(formatArgs[i19]);
        }
        e4Var.f293309c = a17.getString(i17, java.util.Arrays.copyOf(numArr, length));
        e4Var.c();
    }
}
