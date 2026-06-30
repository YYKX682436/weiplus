package vb2;

/* loaded from: classes3.dex */
public final class u implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f516262a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.CheckBox f516263b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f516264c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f516265d;

    public u(android.widget.RelativeLayout relativeLayout, android.widget.CheckBox checkBox, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f516262a = relativeLayout;
        this.f516263b = checkBox;
        this.f516264c = textView;
        this.f516265d = textView2;
    }

    public static vb2.u a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5l, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.p314xaae8f345.mm.R.id.f566438fw1;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566438fw1);
        if (checkBox != null) {
            i17 = com.p314xaae8f345.mm.R.id.fw9;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fw9);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.obc;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.obc);
                if (textView2 != null) {
                    return new vb2.u((android.widget.RelativeLayout) inflate, checkBox, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f516262a;
    }
}
