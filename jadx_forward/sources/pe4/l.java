package pe4;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe4.m f435240d;

    public l(pe4.m mVar) {
        this.f435240d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pe4.m mVar = this.f435240d;
        android.widget.TextView textView = mVar.f435245n;
        textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560763ti));
        android.widget.TextView textView2 = mVar.f435245n;
        textView2.setText(textView2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jit));
        mVar.f435244m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c5o);
    }
}
