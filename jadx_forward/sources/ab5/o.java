package ab5;

/* loaded from: classes9.dex */
public class o implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.z f84505d;

    public o(ab5.z zVar) {
        this.f84505d = zVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        ab5.y yVar = this.f84505d.f84520c;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceActionSheet", "resetOnCreateMenuListener, state is null");
        } else {
            yVar.mo1048xc459429a(g4Var);
        }
    }
}
