package q;

/* loaded from: classes13.dex */
public class e implements java.util.Iterator, q.g {

    /* renamed from: d, reason: collision with root package name */
    public q.d f440739d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f440740e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.h f440741f;

    public e(q.h hVar) {
        this.f440741f = hVar;
    }

    @Override // q.g
    public void a(q.d dVar) {
        q.d dVar2 = this.f440739d;
        if (dVar == dVar2) {
            q.d dVar3 = dVar2.f440738g;
            this.f440739d = dVar3;
            this.f440740e = dVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f440740e) {
            return this.f440741f.f440744d != null;
        }
        q.d dVar = this.f440739d;
        return (dVar == null || dVar.f440737f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f440740e) {
            this.f440740e = false;
            this.f440739d = this.f440741f.f440744d;
        } else {
            q.d dVar = this.f440739d;
            this.f440739d = dVar != null ? dVar.f440737f : null;
        }
        return this.f440739d;
    }
}
