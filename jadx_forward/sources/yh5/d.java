package yh5;

/* loaded from: classes3.dex */
public final class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh5.e f543957a;

    public d(yh5.e eVar) {
        this.f543957a = eVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        yh5.g gVar;
        java.lang.Integer S;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
        yh5.e eVar = this.f543957a;
        if (eVar.f543963i) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanGalleryToolbarComponent", "select changed position=" + eVar.f543964m + " checked=" + z17);
        eVar.f543961g = z17;
        int i17 = eVar.f543964m;
        if (i17 >= 0 && (gVar = eVar.f543962h) != null && i17 >= 0 && (S = kz5.z.S(gVar.f543966e, i17)) != null) {
            int intValue = S.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanMediaDataProvider", "setSelectedAt position=" + i17 + " originIndex=" + intValue + " selected=" + z17);
            gVar.f543967f.set(intValue, z17);
        }
        eVar.X6(eVar.f543961g);
    }
}
