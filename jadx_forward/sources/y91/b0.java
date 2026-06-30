package y91;

/* loaded from: classes16.dex */
public class b0 implements r56.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w91.f f541793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z91.a f541794e;

    public b0(y91.i0 i0Var, w91.f fVar, z91.a aVar) {
        this.f541793d = fVar;
        this.f541794e = aVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        aa1.e eVar = (aa1.e) obj;
        int i17 = y91.i0.f541814h;
        v91.b.b("i0", "Send Tcp Custom:" + this.f541793d.b() + " response: code=" + eVar.f84020c);
        z91.a aVar = this.f541794e;
        if (aVar != null) {
            if (eVar.f84020c == 200) {
                aVar.b(eVar);
            } else {
                aVar.a(eVar);
            }
        }
    }
}
