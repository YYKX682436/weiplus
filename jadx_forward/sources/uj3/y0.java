package uj3;

/* loaded from: classes14.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final uj3.b f509917a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f509918b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f509919c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f509920d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f509921e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f509922f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f509923g;

    /* renamed from: h, reason: collision with root package name */
    public int f509924h;

    /* renamed from: i, reason: collision with root package name */
    public int f509925i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f509926j;

    public y0(uj3.b statusManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509917a = statusManager;
        this.f509924h = -1;
        this.f509925i = -1;
    }

    public final void a() {
        android.widget.FrameLayout frameLayout = this.f509919c;
        if (frameLayout != null) {
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.mbu);
            this.f509918b = textView;
            if (textView != null) {
                textView.setVisibility(4);
            }
            android.widget.FrameLayout frameLayout2 = this.f509919c;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(4);
            }
            this.f509922f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.mbx);
            this.f509923g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.mbz);
            this.f509920d = (android.widget.FrameLayout) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.mby);
            this.f509921e = (android.widget.FrameLayout) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f568280mc0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f509922f;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setRotation(180.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f509922f;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(frameLayout.getContext(), com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, b(true)));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f509922f;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.m82040x7541828(frameLayout.getContext().getResources().getColor(b(true)));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f509923g;
            if (c22699x3dcdb3524 != null) {
                c22699x3dcdb3524.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(frameLayout.getContext(), com.p314xaae8f345.mm.R.raw.f79634x412ce3f1, b(false)));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.f509923g;
            if (c22699x3dcdb3525 != null) {
                c22699x3dcdb3525.m82040x7541828(frameLayout.getContext().getResources().getColor(b(false)));
            }
            android.widget.FrameLayout frameLayout3 = this.f509920d;
            if (frameLayout3 != null) {
                frameLayout3.setOnClickListener(new uj3.w0(this));
            }
            android.widget.FrameLayout frameLayout4 = this.f509921e;
            if (frameLayout4 != null) {
                frameLayout4.setOnClickListener(new uj3.x0(this));
            }
            java.lang.String str = this.f509926j;
            if (str != null) {
                e(str);
            }
        }
    }

    public final int b(boolean z17) {
        if (z17) {
            if (this.f509924h == 0) {
                return com.p314xaae8f345.mm.R.C30859x5a72f63.f560743sy;
            }
        } else if (this.f509924h == this.f509925i - 1) {
            return com.p314xaae8f345.mm.R.C30859x5a72f63.f560743sy;
        }
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an;
    }

    public final android.view.View c(android.content.Context context, android.widget.FrameLayout viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        if (this.f509917a.c()) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3q, viewGroup);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f509919c = (android.widget.FrameLayout) inflate;
            a();
        } else {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3p, viewGroup);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f509919c = (android.widget.FrameLayout) inflate2;
            a();
        }
        return this.f509919c;
    }

    public final void d() {
        android.widget.TextView textView = this.f509918b;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f509922f;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(textView.getContext().getResources().getColor(b(true)));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f509923g;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(textView.getContext().getResources().getColor(b(false)));
            }
        }
    }

    public final void e(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        android.widget.TextView textView = this.f509918b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f509919c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        this.f509926j = str;
        android.widget.TextView textView2 = this.f509918b;
        if (textView2 != null) {
            textView2.setText(str);
        }
        android.widget.TextView textView3 = this.f509918b;
        if (textView3 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f509922f;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(textView3.getContext().getResources().getColor(b(true)));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f509923g;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(textView3.getContext().getResources().getColor(b(false)));
            }
        }
    }
}
