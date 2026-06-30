package com.p314xaae8f345.mm.p792xef98341b;

/* renamed from: com.tencent.mm.hotpatch.LegacyTinkerCore$PatchService */
/* loaded from: classes11.dex */
public class IntentServiceC10739x2d74beca extends com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.AbstractIntentServiceC26590x407102b6 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f149820e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f149821d = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.AbstractIntentServiceC26590x407102b6
    public void a(com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.C26592x819d2665 c26592x819d2665) {
        java.lang.String a17;
        java.lang.String str;
        if (c26592x819d2665 == null) {
            ak0.l.a("MicroMsg.HotPatch.LegacyCore", "TinkerPatchResultService received null result!!!!");
            return;
        }
        this.f149821d.postDelayed(new java.lang.Runnable() { // from class: ak0.w$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p792xef98341b.IntentServiceC10739x2d74beca.f149820e;
                com.p314xaae8f345.mm.p792xef98341b.IntentServiceC10739x2d74beca intentServiceC10739x2d74beca = com.p314xaae8f345.mm.p792xef98341b.IntentServiceC10739x2d74beca.this;
                intentServiceC10739x2d74beca.getClass();
                ak0.k kVar = ak0.l.f87073a;
                if (kVar == null) {
                    throw new java.lang.IllegalStateException("Log engine is not set");
                }
                kVar.a(5, "MicroMsg.HotPatch.LegacyCore", "actually kill tinker patch service!");
                uv5.a.b(intentServiceC10739x2d74beca.getApplicationContext());
            }
        }, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        ak0.x xVar = ak0.s.f87079a;
        if (xVar == null) {
            throw new java.lang.IllegalStateException("Helper is not initialized.");
        }
        ak0.q qVar = new ak0.q(c26592x819d2665);
        java.util.Iterator it = xVar.f87092j.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f) ((ak0.c) it.next())).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "TinkerPatchResultService receive result: %s", qVar.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "onPatchResult on service");
            com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.C26592x819d2665 c26592x819d26652 = qVar.f87078a;
            ak0.e a18 = ak0.g.a(new java.io.File(c26592x819d26652.f55415xf44864e1));
            if (a18 != null) {
                java.util.Properties properties = ((ak0.f) a18).f87070a;
                java.lang.String property = properties.getProperty("patch.client.ver");
                if (android.text.TextUtils.isEmpty(property)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerPatchResultService", "[-] Fail to get patch clientversion.");
                } else {
                    b83.e eVar = new b83.e(lp0.a.f401782c, property);
                    android.content.SharedPreferences b17 = eVar.b();
                    java.lang.String a19 = eVar.a(2);
                    if (b17.contains(a19)) {
                        eVar.c(2, java.lang.System.currentTimeMillis() - b17.getLong(a19, 0L));
                        b17.edit().remove(a19).remove(eVar.a(3)).commit();
                    }
                    y73.z.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g, property, properties.getProperty(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55696xe7860e3c), 0, c26592x819d26652.f55413x6e268779 ? 1 : 0);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "Diff package info is null.");
            }
            if (c26592x819d26652.f55413x6e268779) {
                if (!ak0.o.f() || (a17 = ak0.o.b().a()) == null || a17.isEmpty() || (str = c26592x819d26652.f55414x7bc63370) == null || !str.equals(a17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.m65147xbaebff27();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchResultService", "I have already install the newly patch version!");
                }
            }
            b83.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.f223937b;
            if (mVar != null) {
                wn4.g gVar = (wn4.g) mVar;
                com.p314xaae8f345.mm.p1006xc5476f33.hp.p1780xcbed6b1f.C16113x4eb7d20f.f223937b = null;
                long j17 = c26592x819d26652.f55418xe843839e;
                wn4.x xVar2 = wn4.x.f529104a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "patchResult costTime: %s, path: %s, isSuccess: %b", java.lang.Long.valueOf(j17), new java.io.File(c26592x819d26652.f55415xf44864e1).getAbsolutePath(), java.lang.Boolean.valueOf(c26592x819d26652.f55413x6e268779));
                if (c26592x819d26652.f55413x6e268779) {
                    wn4.x.h(gVar.f529079a);
                } else {
                    jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 24L, 1L, false);
                    wn4.x.f529104a.j();
                }
            }
        }
    }
}
