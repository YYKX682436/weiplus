package fs;

/* loaded from: classes12.dex */
public class e implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Iterable f347600d;

    /* renamed from: e, reason: collision with root package name */
    public final fs.d f347601e;

    public e(java.lang.Iterable iterable, fs.d dVar) {
        this.f347600d = iterable;
        this.f347601e = dVar;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new fs.f(this.f347600d.iterator(), this.f347601e);
    }
}
