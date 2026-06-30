package he2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f362420a;

    /* renamed from: b, reason: collision with root package name */
    public int f362421b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f362422c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f362423d;

    public e(oa.i tab, int i17, yz5.a aVar) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f362420a = tab;
        tab.f425311a = this;
        tab.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.apf);
        android.view.View view2 = tab.f425316f;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nuw) : null;
        this.f362422c = textView;
        if (j65.f.f379476g > 1.0f && textView != null) {
            textView.setTextSize(15.0f);
        }
        android.view.View view3 = tab.f425316f;
        this.f362423d = view3 != null ? (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.nut) : null;
        if (aVar != null && (view = tab.f425316f) != null) {
            view.setOnClickListener(new he2.c(aVar));
        }
        oa.k kVar = tab.f425318h;
        oa.k kVar2 = kVar instanceof android.view.View ? kVar : null;
        if (kVar2 != null) {
            kVar2.setOnTouchListener(he2.d.f362419d);
        }
        b(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        a(false);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f362422c;
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }

    public final void b(int i17) {
        android.widget.TextView textView = this.f362422c;
        if (textView != null) {
            android.view.View view = this.f362420a.f425316f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(i17));
        }
    }

    public final void c(boolean z17) {
        android.widget.ImageView imageView = this.f362423d;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z17 ? 0 : 8);
    }
}
