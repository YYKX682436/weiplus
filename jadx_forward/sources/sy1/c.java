package sy1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f495368a;

    /* renamed from: b, reason: collision with root package name */
    public final ly1.b f495369b;

    /* renamed from: c, reason: collision with root package name */
    public final yy1.b f495370c;

    public c(sy1.b bVar, sy1.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f495368a = arrayList;
        this.f495370c = new yy1.a();
        if (bVar != null) {
            java.util.List list = bVar.f495365a;
            if (list != null && ((java.util.ArrayList) list).size() > 0) {
                arrayList.addAll(list);
            }
            yy1.b bVar2 = bVar.f495367c;
            if (bVar2 != null) {
                this.f495370c = bVar2;
            }
            this.f495369b = bVar.f495366b;
        }
    }
}
