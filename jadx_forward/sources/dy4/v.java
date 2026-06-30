package dy4;

/* loaded from: classes8.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.w f326244d;

    public v(dy4.w wVar) {
        this.f326244d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar = this.f326244d;
        dy4.d dVar = wVar.f326249b;
        if (dVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            if (dVar.f326146a.f422393a instanceof android.app.Activity) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f326248a, "startKeepScreenOn");
                try {
                    dy4.d dVar2 = wVar.f326249b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
                    android.content.Context context = dVar2.f326146a.f422393a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    ((android.app.Activity) context).getWindow().clearFlags(128);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "startKeepScreenOn exception", e17);
                }
            }
        }
    }
}
