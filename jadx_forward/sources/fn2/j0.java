package fn2;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f345821d;

    public j0(fn2.m0 m0Var) {
        this.f345821d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fn2.m0 m0Var = this.f345821d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu vuVar = m0Var.f345852m;
        if (vuVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singingSongWidget");
            throw null;
        }
        if (vuVar.f201622a.getVisibility() == 0) {
            fn2.d dVar = fn2.d.f345775a;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = vuVar.f201637p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1073x7e08a787);
            android.content.Context a17 = vuVar.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "<get-context>(...)");
            dVar.a(c1073x7e08a787, a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSingingSongWidget", "Playing highlight animation for singing song widget");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabRequested", "Highlighted singing song widget for target: " + m0Var.f345848f);
    }
}
