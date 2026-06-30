package pf4;

/* loaded from: classes4.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f435439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f435440e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f435441f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f435442g;

    public x(int i17, int i18) {
        this.f435439d = i17;
        this.f435440e = i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f435441f.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0362 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[LOOP:1: B:110:0x033f->B:121:?, LOOP_END, SYNTHETIC] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r28, int r29) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf4.x.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryAdapter", "onCreateViewHolder " + this);
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 c18495x53f31c35 = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35(context, null, 0);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        layoutParams.width = this.f435439d;
        layoutParams.height = this.f435440e;
        c18495x53f31c35.setLayoutParams(layoutParams);
        return new pf4.y(c18495x53f31c35);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        pf4.y holder = (pf4.y) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryAdapter", "onViewAttachedToWindow " + this);
        super.mo8160xd8bfd53(holder);
        holder.i();
    }
}
