package pp3;

/* loaded from: classes5.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public long f439003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pp3.j f439004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pp3.j jVar, android.os.Looper looper) {
        super(looper);
        this.f439004b = jVar;
        this.f439003a = 0L;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatHandler", "click msg %d", java.lang.Integer.valueOf(message.what));
        int i17 = message.what;
        pp3.j jVar = this.f439004b;
        switch (i17) {
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de /* 290 */:
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = this.f439003a;
                if (j17 <= 0 || currentTimeMillis - j17 >= pp3.j.f439014f) {
                    mo50311x7ab51103(jVar.f439019e.mo50292x733c63a2(291, message.obj), pp3.j.f439014f);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatHandler", "double click");
                    mo50303x856b99f0(291);
                    mo50308x2936bf5f(jVar.f439019e.mo50292x733c63a2(292, message.obj));
                }
                this.f439003a = currentTimeMillis;
                return;
            case 291:
                mp3.l lVar = jVar.f439015a;
                if (lVar != null && lVar.mo67508x69f39c87() != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PatHandler", "single click");
                    jVar.f439015a.mo67508x69f39c87().onClick((android.view.View) message.obj);
                }
                this.f439003a = 0L;
                return;
            case 292:
                mp3.l lVar2 = jVar.f439015a;
                if (!((lVar2 == null || lVar2.mo67507xa8abf2d5() == null) ? false : jVar.f439015a.mo67507xa8abf2d5().a((android.view.View) message.obj)) && jVar.f439015a != null) {
                    jVar.d();
                }
                this.f439003a = 0L;
                return;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de /* 293 */:
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf) jVar.f439016b).f234428i.dismiss();
                return;
            default:
                return;
        }
    }
}
