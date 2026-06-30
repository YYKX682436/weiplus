package hz4;

/* loaded from: classes12.dex */
public class a0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz4.b0 f367912d;

    public a0(hz4.b0 b0Var) {
        this.f367912d = b0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        hz4.b0 b0Var = this.f367912d;
        if (b0Var.f367919e == -1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            b0Var.f367919e = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = b0Var.f367919e;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 3590000 && elapsedRealtime <= 3600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteVoiceLogic", "onTimerExpired: duration ms %s", java.lang.Long.valueOf(elapsedRealtime));
            android.widget.Toast toast = b0Var.f367920f;
            if (toast == null) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                b0Var.f367920f = dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))), 0);
            } else {
                toast.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))));
            }
            b0Var.f367920f.show();
        }
        if (elapsedRealtime < 3600000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteVoiceLogic", "record stop on duration %s", java.lang.Long.valueOf(elapsedRealtime));
        b0Var.f367918d = true;
        b0Var.b();
        jz4.a aVar = b0Var.f367926l;
        if (aVar != null) {
            aVar.F0();
        }
        return false;
    }
}
