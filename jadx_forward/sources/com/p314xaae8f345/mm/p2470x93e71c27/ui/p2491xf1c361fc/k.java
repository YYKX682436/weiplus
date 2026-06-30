package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* loaded from: classes15.dex */
public class k implements com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m f273597a;

    public k(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar) {
        this.f273597a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null || strArr.length <= 0 || strArr[0].length() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273597a;
        if (mVar.f273613v) {
            mVar.f273613v = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "onDetected %s", strArr[0]);
        mVar.f273603i.setText(strArr[0]);
        if (!mVar.f273607p && strArr[0].length() != 0) {
            mVar.f273607p = true;
            mVar.f273610s = java.lang.System.currentTimeMillis();
            java.lang.System.currentTimeMillis();
            long j17 = mVar.f273610s;
            long j18 = mVar.f273609r;
        }
        ((java.util.ArrayList) mVar.f273615x).addAll(list);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273597a;
        mVar.f273602h.getClass();
        mVar.f273603i.setHint((java.lang.CharSequence) null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273597a;
        mVar.f273609r = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", java.lang.Long.valueOf(currentTimeMillis));
        mVar.f273607p = false;
        mVar.f273608q = true;
        mVar.f273613v = true;
        mVar.f273610s = 0L;
        mVar.f();
        mVar.f273604m.setVisibility(8);
        mVar.f273608q = false;
        android.media.AudioManager audioManager = mVar.A;
        if (audioManager != null) {
            audioManager.setStreamMute(3, true);
        }
        android.content.Context context = mVar.f273605n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().addFlags(128);
        }
        mVar.f273601g.setVisibility(4);
        mVar.f273599e.setVisibility(4);
        mVar.f273600f.setVisibility(8);
        mVar.f273603i.setHint(mVar.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9b));
        zk5.c cVar = (zk5.c) mVar.f273602h;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.ui.p2746xf1c361fc.ActivityC22595x36a11daa activityC22595x36a11daa = cVar.f555082a;
        g0Var.d(15178, 2, valueOf, "", activityC22595x36a11daa.f292759f, activityC22595x36a11daa.f292760g, java.lang.Integer.valueOf(activityC22595x36a11daa.f292761h), java.lang.Integer.valueOf(activityC22595x36a11daa.f292762i));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273597a;
        mVar.f();
        android.content.Context context = mVar.f273605n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        mVar.f273602h.getClass();
        mVar.f273603i.setHint((java.lang.CharSequence) null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273597a;
        mVar.f();
        android.content.Context context = mVar.f273605n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        mVar.f273602h.getClass();
        mVar.f273603i.setHint((java.lang.CharSequence) null);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m.b(mVar, 2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273597a;
        mVar.f();
        android.content.Context context = mVar.f273605n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        mVar.f273602h.getClass();
        mVar.f273603i.setHint((java.lang.CharSequence) null);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m.b(mVar, 2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void g(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273597a;
        mVar.f();
        android.content.Context context = mVar.f273605n;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        if (i17 == 12) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m.a(mVar, com.p314xaae8f345.mm.R.C30867xcad56011.k9c);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m.a(mVar, com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
        }
        mVar.f273602h.getClass();
        mVar.f273603i.setHint((java.lang.CharSequence) null);
    }
}
