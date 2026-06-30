package z35;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 f551574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f551575e;

    public s(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240, android.content.Context context) {
        this.f551574d = c19717xb0837240;
        this.f551575e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView m75639x418325a0;
        android.widget.TextView m75641x43215548;
        android.widget.SeekBar m75640xa19403eb;
        android.widget.SeekBar m75640xa19403eb2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19717xb0837240 c19717xb0837240 = this.f551574d;
        c19717xb0837240.m75642xa589f587(com.p314xaae8f345.mm.R.C30861xcebc809e.d1h);
        m75639x418325a0 = c19717xb0837240.m75639x418325a0();
        m75639x418325a0.setVisibility(4);
        m75641x43215548 = c19717xb0837240.m75641x43215548();
        m75641x43215548.setVisibility(4);
        m75640xa19403eb = c19717xb0837240.m75640xa19403eb();
        android.content.Context context = this.f551575e;
        m75640xa19403eb.setProgressDrawable(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.d1h));
        m75640xa19403eb2 = c19717xb0837240.m75640xa19403eb();
        m75640xa19403eb2.setThumb(i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.d1k));
        c19717xb0837240.g(c19717xb0837240.f272664m, false);
        c19717xb0837240.f272663i = true;
    }
}
