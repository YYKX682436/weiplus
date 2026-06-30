package n1;

/* loaded from: classes14.dex */
public abstract class c {
    public static final long a(android.view.KeyEvent key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "$this$key");
        return n1.g.a(key.getKeyCode());
    }

    public static final int b(android.view.KeyEvent type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "$this$type");
        int action = type.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
