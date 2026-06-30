package oh5;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh5.i f427027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f427028e;

    public f(oh5.i iVar, android.content.Intent intent) {
        this.f427027d = iVar;
        this.f427028e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (oh5.i.f427031d.e(true)) {
            pm0.v.X(new oh5.e(this.f427027d, this.f427028e));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixMemoryHookResultHelper", "skip start ui, no leak now");
        }
    }
}
