package fs;

/* loaded from: classes12.dex */
public class c implements fs.i {

    /* renamed from: d, reason: collision with root package name */
    public final fs.i f347587d;

    public c(fs.i iVar) {
        this.f347587d = iVar;
    }

    @Override // fs.i
    public java.lang.Iterable all() {
        return new fs.e(this.f347587d.all(), new fs.b(this));
    }
}
