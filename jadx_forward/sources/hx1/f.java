package hx1;

/* loaded from: classes12.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx1.g f367154d;

    public f(hx1.g gVar) {
        this.f367154d = gVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        hx1.g gVar = this.f367154d;
        if (gVar.f367160e == -1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            gVar.f367160e = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = gVar.f367160e;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 3590000 && elapsedRealtime <= 3600000) {
            android.widget.Toast toast = gVar.f367161f;
            if (toast == null) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                gVar.f367161f = dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))), 0);
            } else {
                toast.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))));
            }
            gVar.f367161f.show();
        }
        if (elapsedRealtime < 3600000) {
            return true;
        }
        gVar.f367159d = true;
        gVar.b();
        jx1.a aVar = gVar.f367167l;
        if (aVar != null) {
            ((qx1.q) aVar).d(null);
        }
        return false;
    }
}
