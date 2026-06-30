package ch4;

/* loaded from: classes6.dex */
public class c implements java.lang.Iterable {
    public c(ch4.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new ch4.b(this, null);
    }
}
