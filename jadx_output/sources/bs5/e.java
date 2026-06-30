package bs5;

/* loaded from: classes13.dex */
public abstract class e implements tr5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs5.f f24018a;

    public e(bs5.f fVar) {
        this.f24018a = fVar;
    }

    public boolean a() {
        bs5.f fVar = this.f24018a;
        java.nio.channels.SelectionKey selectionKey = fVar.f24022d;
        if (selectionKey == null) {
            return 3 == fVar.f24019a;
        }
        if (selectionKey.isValid()) {
            return 3 == fVar.f24019a && fVar.f24022d.isReadable();
        }
        fVar.b();
        return false;
    }

    public boolean b() {
        bs5.f fVar = this.f24018a;
        java.nio.channels.SelectionKey selectionKey = fVar.f24022d;
        if (selectionKey == null) {
            return 2 == fVar.f24019a;
        }
        if (selectionKey.isValid()) {
            return 2 == fVar.f24019a && fVar.f24022d.isWritable();
        }
        fVar.b();
        return false;
    }
}
