package rs0;

/* loaded from: classes10.dex */
public abstract class o {
    public static final int a(android.media.MediaFormat mediaFormat, java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            return mediaFormat.getInteger(key);
        } catch (java.lang.Exception unused) {
            return i17;
        }
    }
}
