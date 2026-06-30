package mx0;

/* loaded from: classes5.dex */
public final class j7 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f413604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413605b;

    public j7(boolean z17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        this.f413604a = z17;
        this.f413605b = c10977x8e40eced;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue() || this.f413604a) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.f151074d2;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413605b;
        c10977x8e40eced.getClass();
        try {
            c10977x8e40eced.f151080n.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
            c10977x8e40eced.M = android.os.SystemClock.elapsedRealtime();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShootComposingPluginLayout", e17, "handleLifecycleEvent error", new java.lang.Object[0]);
        }
    }
}
