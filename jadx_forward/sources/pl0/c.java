package pl0;

/* loaded from: classes6.dex */
public class c implements java.lang.Iterable {
    public c(pl0.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new pl0.b(this, null);
    }
}
