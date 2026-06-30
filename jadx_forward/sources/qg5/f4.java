package qg5;

/* loaded from: classes8.dex */
public final class f4 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f444513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444514b;

    public f4(qg5.q4 q4Var, yz5.a aVar) {
        this.f444513a = q4Var;
        this.f444514b = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public final void a(boolean z17, boolean z18) {
        qg5.q4 q4Var = this.f444513a;
        if (z17 || z18) {
            qg5.q4.U6(q4Var, z17 ? 1 : 0);
        }
        if (z17) {
            qg5.q4.T6(q4Var);
            yz5.a aVar = this.f444514b;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }
}
