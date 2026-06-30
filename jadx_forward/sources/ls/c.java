package ls;

/* loaded from: classes6.dex */
public class c implements java.lang.Iterable {
    public c(ls.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new ls.b(this, null);
    }
}
