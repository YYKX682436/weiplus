package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes13.dex */
public final class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private h() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d dVar;
        boolean z17;
        java.lang.Class<?> cls;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.e.f165621b;
        java.lang.String m46222x9616526c = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).m46222x9616526c();
        eVar.getClass();
        if (!android.text.TextUtils.isEmpty(m46222x9616526c)) {
            synchronized (eVar.f165622a) {
                dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d) eVar.f165622a.get(m46222x9616526c);
                if (dVar == null) {
                    dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d(m46222x9616526c);
                    eVar.f165622a.put(m46222x9616526c, dVar);
                }
            }
            synchronized (dVar) {
                dVar.f165618a++;
                z17 = dVar.f165618a == 1;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s", dVar.f165619b);
                java.lang.String str = dVar.f165619b;
                java.lang.Class<?> cls2 = null;
                try {
                    try {
                        if (android.text.TextUtils.isEmpty(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, null, java.lang.Boolean.FALSE);
                        } else {
                            str = str.replaceFirst(java.util.regex.Pattern.quote(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b), "");
                            cls = (java.lang.Class) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.d.f165617d.get(str);
                            if (cls == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, java.lang.Boolean.FALSE);
                            } else {
                                try {
                                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.setClass(context, cls);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, java.lang.Boolean.valueOf(context.bindService(intent, dVar.f165620c, 1)));
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    cls2 = cls;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, exception:%s", str, cls2, e);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls2, java.lang.Boolean.FALSE);
                                    rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, java.lang.Boolean.FALSE);
                                    throw th;
                                }
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    cls = cls2;
                }
            }
        }
        try {
            rVar.a(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d);
        } catch (java.lang.SecurityException unused) {
        }
    }
}
