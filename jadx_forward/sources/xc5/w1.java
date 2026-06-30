package xc5;

/* loaded from: classes3.dex */
public final class w1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc5.x1 f535114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f535115b;

    public w1(xc5.x1 x1Var, yz5.a aVar) {
        this.f535114a = x1Var;
        this.f535115b = aVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHistoryGalleryPageAni", "runExitAnimation onAnimationCancel");
        this.f535114a.f535122g = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    public void b(float f17) {
        lf3.i iVar = this.f535114a.f535123h;
        if (iVar != null) {
            ((yh5.e) iVar).W6(f17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    /* renamed from: onAnimationEnd */
    public void mo79588xbb3aa236() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPageAni", "runExitAnimation onAnimationEnd");
        this.f535114a.f535122g = false;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new xc5.v1(this.f535115b));
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    /* renamed from: onAnimationStart */
    public void mo79589xd7e2f2fd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPageAni", "runExitAnimation onAnimationStart");
        this.f535114a.f535122g = true;
    }
}
