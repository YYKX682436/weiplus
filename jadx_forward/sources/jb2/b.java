package jb2;

/* loaded from: classes2.dex */
public final class b extends h92.d {
    @Override // h92.d, h92.a
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        super.g(context, headerLayout);
        android.view.View view = this.f361223e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.d4v);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.q0(textView.getPaint());
        }
        android.view.View view2 = this.f361223e;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.byz);
        if (findViewById != null) {
            n().k(findViewById);
            findViewById.setOnClickListener(new jb2.a(this));
        }
    }

    @Override // h92.d
    public int o() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b5g;
    }
}
