package gq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f356076a;

    /* renamed from: b, reason: collision with root package name */
    public final oa.i f356077b;

    /* renamed from: c, reason: collision with root package name */
    public int f356078c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f356079d;

    public a(gq2.d dVar, android.content.Context context, oa.i tab, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f356076a = context;
        this.f356077b = tab;
        tab.f425311a = this;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c7_, (android.view.ViewGroup) tab.f425318h, false);
        tab.d(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nuw);
        this.f356079d = textView;
        if (textView != null) {
            android.view.View view = tab.f425316f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d : com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        }
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f356079d;
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }
}
