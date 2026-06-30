package hn;

/* loaded from: classes4.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f363850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f363851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hn.f f363852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg3.j3 f363853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, int i18, hn.f fVar, vg3.j3 j3Var, android.content.Context context) {
        super(0);
        this.f363849d = h0Var;
        this.f363850e = i17;
        this.f363851f = i18;
        this.f363852g = fVar;
        this.f363853h = j3Var;
        this.f363854i = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f363849d.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = this.f363850e;
        vg3.j3 j3Var = this.f363853h;
        if (i17 == 0 && this.f363851f == 0) {
            hn.f fVar = this.f363852g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f424751i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOpenService", "doAppCreateChatRoom success");
                if (j3Var != null) {
                    j3Var.a(true, null, fVar.f424751i);
                }
                return jz5.f0.f384359a;
            }
        }
        if (j3Var != null) {
            j3Var.a(false, null, null);
        }
        java.lang.String string = this.f363854i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573919gb0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string);
        return jz5.f0.f384359a;
    }
}
