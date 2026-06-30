package s33;

/* loaded from: classes8.dex */
public class a0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f484003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f484004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f484005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f484006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f484007e;

    public a0(q80.f0 f0Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c, int i17, java.lang.String str) {
        this.f484003a = f0Var;
        this.f484004b = context;
        this.f484005c = c15780xf49d6a1c;
        this.f484006d = i17;
        this.f484007e = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameChatRoom.GameChatUtils", "gamelog.util, jumpToPage, openLiteApp failed ");
        q80.f0 f0Var = this.f484003a;
        if (f0Var != null) {
            f0Var.mo555x2fd71e();
        }
        s33.y.j(this.f484004b, this.f484005c, this.f484006d, this.f484007e);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatUtils", "gamelog.util, jumpToPage, openLiteApp success ");
        q80.f0 f0Var = this.f484003a;
        if (f0Var != null) {
            f0Var.mo556x90b54003();
        }
    }
}
