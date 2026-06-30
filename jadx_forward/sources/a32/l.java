package a32;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f82559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb, android.content.Context context) {
        super(2);
        this.f82559d = c13392x8bacb7fb;
        this.f82560e = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.v75 v75Var;
        t85.j jVar = (t85.j) obj;
        r45.p64 p64Var = (r45.p64) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82559d;
        r22.a presenter = c13392x8bacb7fb.getPresenter();
        if (presenter != null) {
            w22.g gVar = (w22.g) presenter;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CapturePresenter", "changeSticker:" + jVar);
            gVar.f524072j.f505511e = jVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb) gVar.f524064b;
            c13392x8bacb7fb2.f180183p.m54911xcf62b5c9(jVar);
            c13392x8bacb7fb2.f180176f.l(new a32.n(c13392x8bacb7fb2, jVar));
        }
        java.lang.String str = (p64Var == null || (v75Var = p64Var.f464328g) == null) ? null : v75Var.f469498e;
        android.widget.TextView textView = c13392x8bacb7fb.f180186s;
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setText((java.lang.CharSequence) null);
        } else {
            java.lang.String string = this.f82560e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572622bv5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string.concat(str));
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(c13392x8bacb7fb.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)), string.length(), spannableString.length(), 33);
            textView.setText(spannableString);
        }
        c13392x8bacb7fb.f180189v = p64Var;
        return jz5.f0.f384359a;
    }
}
