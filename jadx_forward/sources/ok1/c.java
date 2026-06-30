package ok1;

/* loaded from: classes7.dex */
public final class c implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f427497a;

    public c(android.os.Handler handler) {
        this.f427497a = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        ok1.b bVar = new ok1.b(this.f427497a, dataSource);
        if (dataSource instanceof mk1.z) {
            return (ye1.r) bVar.mo152xb9724478();
        }
        return null;
    }
}
