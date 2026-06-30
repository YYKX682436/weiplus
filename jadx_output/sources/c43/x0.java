package c43;

/* loaded from: classes15.dex */
public class x0 implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43.x f38517a;

    public x0(c43.x xVar) {
        this.f38517a = xVar;
    }

    @Override // u33.f
    public void a(java.util.Map map) {
        if (map != null) {
            c43.x xVar = this.f38517a;
            if (map.containsKey(xVar.f38495m.from_username)) {
                u33.h hVar = (u33.h) map.get(xVar.f38495m.from_username);
                xVar.M = hVar;
                xVar.f38501s.post(new c43.w0(this, hVar));
            }
        }
    }
}
