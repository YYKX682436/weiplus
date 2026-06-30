package ab5;

/* loaded from: classes9.dex */
public class o implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.z f2972d;

    public o(ab5.z zVar) {
        this.f2972d = zVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        ab5.y yVar = this.f2972d.f2987c;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceActionSheet", "resetOnCreateMenuListener, state is null");
        } else {
            yVar.onCreateMMMenu(g4Var);
        }
    }
}
