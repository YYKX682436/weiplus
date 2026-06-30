package uu0;

/* loaded from: classes5.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu0.c f512764d;

    public f(uu0.c cVar) {
        this.f512764d = cVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "timer, onTimerExpired to stop record");
        this.f512764d.h(java.lang.Boolean.FALSE);
        return true;
    }
}
