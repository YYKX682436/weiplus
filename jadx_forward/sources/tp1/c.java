package tp1;

/* loaded from: classes6.dex */
public class c implements java.lang.Iterable {
    public c(tp1.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new tp1.b(this, null);
    }
}
