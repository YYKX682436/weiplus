package wl0;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f528560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.q f528562g;

    public p(wl0.q qVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f528562g = qVar;
        this.f528559d = str;
        this.f528560e = i17;
        this.f528561f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        dm.qa qaVar;
        wl0.q qVar = this.f528562g;
        java.util.HashSet hashSet = qVar.f528563a.f528566a;
        int i17 = this.f528560e;
        if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
            em0.b.b("MomentVideo", 501);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i18 = calendar.get(11);
            int i19 = calendar.get(7);
            dm.qa qaVar2 = new dm.qa();
            java.lang.String str = this.f528559d;
            qaVar2.f68080x29d12d0e = str;
            qaVar2.f68082x2262335f = i17;
            qaVar2.f68079x299cd32e = this.f528561f;
            ul0.d dVar = qVar.f528563a.f528567b;
            dVar.getClass();
            android.database.Cursor B = dVar.f510094d.B("select * from SnsFeature where owner = '" + qaVar2.f68079x299cd32e + "' and snsid = '" + qaVar2.f68080x29d12d0e + "' and type = ?", new java.lang.String[]{java.lang.String.valueOf(qaVar2.f68082x2262335f)});
            try {
                if (B.moveToFirst()) {
                    qaVar = new dm.qa();
                    qaVar.f68080x29d12d0e = B.getString(B.getColumnIndex("snsid"));
                    qaVar.f68079x299cd32e = B.getString(B.getColumnIndex("owner"));
                    qaVar.f68076x225a3d90 = B.getString(B.getColumnIndex("city"));
                    qaVar.f68082x2262335f = B.getInt(B.getColumnIndex("type"));
                    qaVar.f68083xfff66e8f = B.getInt(B.getColumnIndex("weishang"));
                    qaVar.f68077x6f12d422 = B.getInt(B.getColumnIndex("dayOfWeek"));
                    qaVar.f68078xd557edbc = B.getInt(B.getColumnIndex("hourOfDay"));
                    qaVar.f68075xf102ad1b = B.getInt(B.getColumnIndex("action"));
                    qaVar.f68081x9de75411 = B.getLong(B.getColumnIndex(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
                } else {
                    B.close();
                    qaVar = null;
                }
                if (qaVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsScanner", "find failed! %s", str);
                    return;
                }
                qaVar.f68078xd557edbc = i18;
                qaVar.f68077x6f12d422 = i19;
                qaVar.f68081x9de75411 = currentTimeMillis;
                qaVar.f68075xf102ad1b = 12;
                qVar.f528563a.f528567b.J0(qaVar);
                if (i17 == 15) {
                    qVar.f528563a.getClass();
                    hl0.e eVar = new hl0.e("MomentVideo", str);
                    eVar.f363593h = java.lang.System.currentTimeMillis();
                    eVar.a();
                }
            } finally {
                B.close();
            }
        }
    }
}
