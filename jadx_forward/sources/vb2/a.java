package vb2;

/* loaded from: classes2.dex */
public final class a implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f516036a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f516037b;

    public a(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b c15384x34dfb03b, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView2) {
        this.f516036a = c1073x7e08a787;
        this.f516037b = textView;
    }

    public static vb2.a a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.e7u;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.e7u);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.fzb;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b c15384x34dfb03b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b) x4.b.a(view, com.p314xaae8f345.mm.R.id.fzb);
            if (c15384x34dfb03b != null) {
                i17 = com.p314xaae8f345.mm.R.id.h5n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.h5n);
                if (c22699x3dcdb352 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.o3b;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.o3b);
                    if (textView2 != null) {
                        return new vb2.a((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) view, textView, c15384x34dfb03b, c22699x3dcdb352, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f516036a;
    }
}
