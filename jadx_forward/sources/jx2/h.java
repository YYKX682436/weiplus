package jx2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f383953a;

    /* renamed from: b, reason: collision with root package name */
    public jx2.k f383954b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f383955c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f383956d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f383957e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f383958f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f383959g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f383960h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f383961i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f383962j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f383963k;

    public static final void a(jx2.h hVar, android.view.View view, android.content.Context context) {
        hVar.getClass();
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        if (textView != null) {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        }
        view.setBackgroundDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
    }

    public final android.view.View b(android.content.Context context, java.lang.String str, int i17) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ady, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        if (i17 == 0) {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setImageDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79139xd0065291));
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else if (i17 != 1) {
            c22699x3dcdb352.setVisibility(8);
        } else {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setImageDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79138x48487796));
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        textView.setText(str);
        return inflate;
    }

    public final void c(android.content.Context context) {
        jx2.k kVar = this.f383954b;
        if (kVar == null) {
            return;
        }
        boolean z17 = !this.f383962j.isEmpty();
        android.widget.TextView textView = this.f383961i;
        if (textView != null) {
            textView.setVisibility(z17 ? 0 : 8);
        }
        java.lang.String string = ((jx2.l) kVar).f383969a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.widget.TextView textView2 = this.f383961i;
        if (textView2 != null) {
            textView2.setText(string);
        }
        android.widget.TextView textView3 = this.f383961i;
        if (textView3 != null) {
            textView3.setBackground(z17 ? context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk) : context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562596jr));
        }
        android.widget.TextView textView4 = this.f383961i;
        if (textView4 != null) {
            textView4.setTextColor(context.getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
    }
}
