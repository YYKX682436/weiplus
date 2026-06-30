package dl4;

/* loaded from: classes3.dex */
public final class h0 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f316939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316940b;

    public h0(yz5.l lVar, android.view.View view) {
        this.f316939a = lVar;
        this.f316940b = view;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        pm0.v.X(new dl4.g0(zVar, this.f316940b));
        yz5.l lVar = this.f316939a;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(zVar != null));
        }
    }
}
