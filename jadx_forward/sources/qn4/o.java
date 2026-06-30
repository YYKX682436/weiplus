package qn4;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f446795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn4.a f446796e;

    public o(qn4.t tVar, qn4.a aVar) {
        this.f446795d = tVar;
        this.f446796e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qn4.t tVar = this.f446795d;
        if (!tVar.f446812a || tVar.f446816e) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - tVar.f446818g;
        if (currentTimeMillis >= 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechController", "Show loading, elapsed: " + currentTimeMillis + " ms");
            tVar.f446816e = true;
            ((qn4.w) this.f446796e).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onShowLoading");
            qn4.i iVar = qn4.y.f446838d;
            iVar.getClass();
            qn4.v.f446830a.a(new qn4.e(iVar), new qn4.f(iVar));
        }
    }
}
