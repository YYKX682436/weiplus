package zk3;

/* loaded from: classes8.dex */
public interface b {
    default java.lang.Object a() {
        return null;
    }

    default boolean b() {
        return true;
    }

    default boolean c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(context);
    }

    default boolean d() {
        return false;
    }

    default boolean e() {
        return false;
    }

    default int f() {
        return -1;
    }

    default void g(int i17, int i18) {
    }

    default void h(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskCallback", "multiTaskTabChanged, curIndex: %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5718x259ce65d c5718x259ce65d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5718x259ce65d();
        c5718x259ce65d.f136040g.f88095a = i17;
        c5718x259ce65d.e();
    }
}
