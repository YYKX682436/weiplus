package fs5;

/* loaded from: classes13.dex */
public final class d implements tr5.x {
    public tr5.y a(java.lang.Class cls, android.content.Context context) {
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("klass".concat(" can not be null"));
        }
        if (context != null) {
            return bs5.q.class.equals(cls) ? new fs5.c(context) : new tr5.v((tr5.w) tr5.x.f503040a);
        }
        throw new java.lang.IllegalArgumentException("context".concat(" can not be null"));
    }
}
