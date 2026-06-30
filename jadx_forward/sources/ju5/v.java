package ju5;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.y f383695d;

    public v(ju5.y yVar) {
        this.f383695d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f383695d.f383700c.f383706h;
        if (dVar != null) {
            pe4.g gVar = (pe4.g) dVar;
            gVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen success");
            pe4.m mVar = gVar.f435234a;
            mVar.f435241j = false;
            mVar.f435242k = null;
            if (mVar.f435250a.f476055d.booleanValue()) {
                return;
            }
            mVar.f435245n.removeCallbacks(mVar.f435249r);
            mVar.f435244m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c5q);
            android.widget.TextView textView = mVar.f435245n;
            textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561064a83));
            android.widget.TextView textView2 = mVar.f435245n;
            textView2.setText(textView2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiu));
        }
    }
}
