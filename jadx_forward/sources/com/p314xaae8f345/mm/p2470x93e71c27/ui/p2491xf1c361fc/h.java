package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m f273594d;

    public h(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar) {
        this.f273594d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.m mVar = this.f273594d;
        if (mVar.f273602h != null) {
            mVar.f273611t = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "closePanel onClearBtnDown");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f273603i;
            if (c22621x7603e017 == null || c22621x7603e017.getText() == null || mVar.f273603i.getText().length() <= 0) {
                if (mVar.f273611t) {
                    c17189xc14104a.f37845xae7a2e7a = 2;
                } else {
                    c17189xc14104a.f37845xae7a2e7a = 15;
                }
            } else if (mVar.f273611t) {
                c17189xc14104a.f37845xae7a2e7a = 14;
            } else {
                c17189xc14104a.f37845xae7a2e7a = 16;
            }
            long j17 = mVar.f273606o;
            if (j17 != 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                c17189xc14104a.f37867x8182a0a5 = android.os.SystemClock.elapsedRealtime() - j17;
                mVar.f273606o = 0L;
            }
            ((zk5.c) mVar.f273602h).a();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
