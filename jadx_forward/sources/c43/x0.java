package c43;

/* loaded from: classes15.dex */
public class x0 implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43.x f120050a;

    public x0(c43.x xVar) {
        this.f120050a = xVar;
    }

    @Override // u33.f
    public void a(java.util.Map map) {
        if (map != null) {
            c43.x xVar = this.f120050a;
            if (map.containsKey(xVar.f120028m.f36570xfd4da1cb)) {
                u33.h hVar = (u33.h) map.get(xVar.f120028m.f36570xfd4da1cb);
                xVar.M = hVar;
                xVar.f120034s.post(new c43.w0(this, hVar));
            }
        }
    }
}
