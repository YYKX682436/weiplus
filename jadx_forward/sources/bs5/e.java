package bs5;

/* loaded from: classes13.dex */
public abstract class e implements tr5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs5.f f105551a;

    public e(bs5.f fVar) {
        this.f105551a = fVar;
    }

    public boolean a() {
        bs5.f fVar = this.f105551a;
        java.nio.channels.SelectionKey selectionKey = fVar.f105555d;
        if (selectionKey == null) {
            return 3 == fVar.f105552a;
        }
        if (selectionKey.isValid()) {
            return 3 == fVar.f105552a && fVar.f105555d.isReadable();
        }
        fVar.b();
        return false;
    }

    public boolean b() {
        bs5.f fVar = this.f105551a;
        java.nio.channels.SelectionKey selectionKey = fVar.f105555d;
        if (selectionKey == null) {
            return 2 == fVar.f105552a;
        }
        if (selectionKey.isValid()) {
            return 2 == fVar.f105552a && fVar.f105555d.isWritable();
        }
        fVar.b();
        return false;
    }
}
