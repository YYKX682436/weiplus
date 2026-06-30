package s33;

@j95.b
/* loaded from: classes8.dex */
public class j0 extends i95.w implements t33.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484045d;

    /* renamed from: e, reason: collision with root package name */
    public d95.b0 f484046e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f484047f;

    /* renamed from: g, reason: collision with root package name */
    public y33.f f484048g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f484049h = false;

    public d95.b0 Ai() {
        if (!this.f484049h) {
            synchronized (this) {
                if (!this.f484049h) {
                    this.f484047f = gm0.j1.u().h() + "GameChatRoom.db";
                    d95.b0 b0Var = new d95.b0();
                    this.f484046e = b0Var;
                    java.lang.String str = this.f484047f;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(-1129824805, new s33.e0(this));
                    hashMap.put(-1899647075, new s33.f0(this));
                    if (b0Var.S(str, hashMap, true, true)) {
                        this.f484049h = true;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.PluginGameChatRoom", "GameChatRoom db init failed");
                    }
                }
            }
        }
        return this.f484046e;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.PluginGameChatRoom", "onAccountRelease");
        d95.b0 b0Var = this.f484046e;
        if (b0Var != null) {
            b0Var.L();
            this.f484046e = null;
        }
        this.f484048g = null;
    }

    public y33.f wi() {
        gm0.j1.b().c();
        if (this.f484048g == null) {
            this.f484048g = new y33.f(Ai());
        }
        return this.f484048g;
    }
}
