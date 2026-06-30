package cu3;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f303993d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f303994e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd f303995f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f303996g;

    public a(android.view.ViewGroup viewGroup, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f303993d = status;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.e4i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd) findViewById;
        this.f303995f = c17002x1531c3fd;
        c17002x1531c3fd.m67934x231a26f4(status);
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.d7i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f303996g = imageView;
        imageView.setVisibility(0);
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f80117xb5b82fa3, -1));
        imageView.setOnClickListener(this);
    }

    @Override // yt3.r2
    /* renamed from: name */
    public java.lang.String mo122733x337a8b() {
        return "plugin_filter";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/filter/EditPhotoFilterPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = !this.f303994e;
        this.f303994e = z17;
        android.widget.ImageView imageView = this.f303996g;
        if (z17) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f80117xb5b82fa3, imageView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
        } else {
            ju3.d0.k(this.f303993d, ju3.c0.W1, null, 2, null);
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f80117xb5b82fa3, -1));
        }
        boolean z18 = this.f303994e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd = this.f303995f;
        if (z18) {
            c17002x1531c3fd.mo9067x901b6914(0);
        } else {
            c17002x1531c3fd.mo9067x901b6914(4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/filter/EditPhotoFilterPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        oj0.h hVar = oj0.c.f427261c;
        if (hVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = hVar.f427269a;
            n3Var.mo50302x6b17ad39(null);
            android.os.Handler handler = hVar.f427271c;
            if (handler == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callbackHandler");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            n3Var.mo50293x3498a0(new oj0.g(hVar));
        }
        oj0.c.f427262d = false;
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f303994e = false;
        this.f303995f.mo9067x901b6914(4);
        ju3.d0.k(this.f303993d, ju3.c0.W1, null, 2, null);
        android.widget.ImageView imageView = this.f303996g;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f80117xb5b82fa3, -1));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f303996g.setVisibility(i17);
    }
}
