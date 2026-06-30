package e33;

/* loaded from: classes10.dex */
public class k2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.u2 f328836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f328837e;

    public k2(e33.v2 v2Var, e33.u2 u2Var) {
        this.f328837e = v2Var;
        this.f328836d = u2Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        e33.v2 v2Var = this.f328837e;
        e33.u2 u2Var = this.f328836d;
        v2Var.o(u2Var);
        u2Var.f329021f.mo69303x360802();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        this.f328837e.o(this.f328836d);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        e33.u2 u2Var = this.f328836d;
        u2Var.f329021f.mo69330x68ac462();
        e33.v2 v2Var = this.f328837e;
        v2Var.getClass();
        u2Var.f329021f.setVisibility(0);
        u2Var.f329019d.setVisibility(8);
        u2Var.f329018c.setVisibility(8);
        u2Var.f329017b.setVisibility(8);
        android.os.Handler handler = v2Var.f329047y;
        handler.sendMessageDelayed(handler.obtainMessage(1, u2Var), 500L);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
