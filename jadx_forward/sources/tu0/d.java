package tu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public tu0.b f503613a;

    /* renamed from: b, reason: collision with root package name */
    public tu0.g f503614b;

    public d(tu0.a audioEncodeFormat, java.lang.String filePath, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioEncodeFormat, "audioEncodeFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        int ordinal = audioEncodeFormat.ordinal();
        if (ordinal == 0) {
            tu0.h hVar = new tu0.h();
            hVar.mo167050x316510(filePath, i17, i18, i19);
            this.f503613a = hVar;
        } else if (ordinal == 1) {
            tu0.i iVar = new tu0.i();
            iVar.mo167050x316510(filePath, i17, i18, i19);
            this.f503613a = iVar;
        } else if (ordinal == 2) {
            tu0.g gVar = new tu0.g(i17, i19);
            gVar.b(filePath);
            this.f503614b = gVar;
        }
        tu0.b bVar = this.f503613a;
        if (bVar != null) {
            bVar.f503608a = new tu0.c();
        }
    }

    public final void a() {
        tu0.b bVar = this.f503613a;
        if (bVar != null) {
            ((tu0.h) bVar).a(new byte[0], 0, true);
        }
        tu0.b bVar2 = this.f503613a;
        if (bVar2 != null) {
            bVar2.mo167049x5a5ddf8();
        }
        this.f503613a = null;
        tu0.g gVar = this.f503614b;
        if (gVar != null) {
            gVar.d();
        }
        this.f503614b = null;
    }
}
