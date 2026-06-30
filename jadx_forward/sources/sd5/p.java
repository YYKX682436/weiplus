package sd5;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f488258a = new java.util.LinkedHashMap();

    public static final java.lang.Object a(java.lang.String message, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmMsgDataSource", message + " start:[" + currentTimeMillis + ']');
        java.lang.Object mo152xb9724478 = block.mo152xb9724478();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        f488258a.put(message, java.lang.Long.valueOf(currentTimeMillis2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmMsgDataSource", message + " cost:[" + currentTimeMillis2 + ']');
        return mo152xb9724478;
    }
}
