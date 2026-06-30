package gg1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.l f353145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg1.w f353146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg1.p f353147f;

    public o(gg1.l lVar, gg1.w wVar, gg1.p pVar) {
        this.f353145d = lVar;
        this.f353146e = wVar;
        this.f353147f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.l lVar = this.f353145d;
        lVar.f353132e.setVisibility(8);
        android.widget.TextView textView = lVar.f353131d;
        gg1.w wVar = this.f353146e;
        boolean a17 = gg1.w.a(wVar);
        gg1.p pVar = this.f353147f;
        textView.setText(a17 ? pVar.y(com.p314xaae8f345.mm.R.C30867xcad56011.f571873s9) : wVar.f353168e.f353124d.isEmpty() ? pVar.y(com.p314xaae8f345.mm.R.C30867xcad56011.f571871s7) : pVar.y(com.p314xaae8f345.mm.R.C30867xcad56011.f571870s6));
    }
}
