package g06;

/* loaded from: classes14.dex */
public final class b extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.IllegalAccessException cause) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cause, "cause");
    }
}
