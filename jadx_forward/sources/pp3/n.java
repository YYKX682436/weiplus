package pp3;

/* loaded from: classes5.dex */
public final class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f439024d;

    public n(pp3.u uVar) {
        this.f439024d = uVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        pp3.u uVar = this.f439024d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f439033g, "errorTimeHandler callback");
        android.widget.TextView textView = (android.widget.TextView) uVar.findViewById(com.p314xaae8f345.mm.R.id.kpz);
        if (textView != null) {
            textView.setText(uVar.f439032f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hg8));
        }
        if (textView == null) {
            return false;
        }
        textView.setTextColor(i65.a.d(uVar.f439032f, com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        return false;
    }
}
