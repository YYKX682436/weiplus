package kg3;

/* loaded from: classes8.dex */
public interface a {
    default void a(java.lang.String format, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        format.concat("");
        java.util.Arrays.copyOf(args, args.length);
    }
}
