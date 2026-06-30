package u20;

/* loaded from: classes9.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w05.h f505483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u20.y f505484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f505485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w05.h hVar, u20.y yVar, android.content.Context context) {
        super(1);
        this.f505483d = hVar;
        this.f505484e = yVar;
        this.f505485f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        if (x7Var != null) {
            try {
                java.lang.String encodeToString = android.util.Base64.encodeToString(x7Var.mo14344x5f01b1f6(), 2);
                w05.h hVar = this.f505483d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
                hVar.K(encodeToString);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicWAAPPMsg", "requestCardJumpInfoAndForward: jumpInfo set to ecsJumpInfoBase64");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsShareToContactLogicWAAPPMsg", "requestCardJumpInfoAndForward: failed to serialize jumpInfo: " + e17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicWAAPPMsg", "requestCardJumpInfoAndForward: jumpInfo is null, use original ecsJumpInfoBase64");
        }
        u20.y yVar = this.f505484e;
        android.content.Context context = this.f505485f;
        if (yVar.f505486d != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new u20.t(yVar, context));
        }
        return jz5.f0.f384359a;
    }
}
