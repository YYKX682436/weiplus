package com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.kindalite.KindaLiteMgr$stopDuplicateAndContinue$1 */
/* loaded from: classes15.dex */
public final class C3201x385b2269 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $continued */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f12295x424850f9;

    /* renamed from: $onContinue */
    final /* synthetic */ yz5.l f12296x737472ca;

    /* renamed from: $task */
    final /* synthetic */ com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d.StartTask f12297x23183a9;

    /* renamed from: $timeoutRunnable */
    final /* synthetic */ java.lang.Runnable f12298x43cdc6fa;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d f12299xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3201x385b2269(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d c3194xff8cea9d, java.lang.Runnable runnable, com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d.StartTask startTask, yz5.l lVar) {
        super(0);
        this.f12295x424850f9 = c0Var;
        this.f12299xcbdd23aa = c3194xff8cea9d;
        this.f12298x43cdc6fa = runnable;
        this.f12297x23183a9 = startTask;
        this.f12296x737472ca = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m25662xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m25662xb9724478() {
        android.os.Handler handler;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f12295x424850f9;
        if (!c0Var.f391645d) {
            c0Var.f391645d = true;
            handler = this.f12299xcbdd23aa.mainHandler;
            handler.removeCallbacks(this.f12298x43cdc6fa);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d.TAG, "duplicatePayUseCase stopped, now start next url=" + this.f12297x23183a9.m25653xb5887639());
            this.f12296x737472ca.mo146xb9724478(this.f12297x23183a9);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3194xff8cea9d.TAG, "duplicate.stop completion ignored (already continued)");
    }
}
