package tl;

/* loaded from: classes12.dex */
public class u0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.q0 f501679d;

    public u0(tl.q0 q0Var) {
        this.f501679d = q0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        tl.q0 q0Var = this.f501679d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "onTimerExpired[%s]", q0Var.toString());
        tl.q0.b(q0Var);
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m166742x9616526c() {
        return super.toString() + "|scenePusher";
    }
}
