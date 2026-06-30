package lx4;

/* loaded from: classes8.dex */
public final class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f403680d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f403681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 f403682f;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f403682f = c19355x505bfc55;
        this.f403680d = context;
        this.f403681e = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f403681e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        hx4.x xVar = (hx4.x) kz5.n0.a0(this.f403681e, i17);
        if (xVar != null) {
            return xVar.f367233a;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        lx4.n viewHolder = (lx4.n) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        hx4.x xVar = (hx4.x) kz5.n0.a0(this.f403681e, i17);
        if (xVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55 = this.f403682f;
        lx4.k kVar = new lx4.k(c19355x505bfc55, viewHolder, this);
        android.widget.RelativeLayout relativeLayout = viewHolder.f403683d;
        relativeLayout.setOnClickListener(kVar);
        viewHolder.f403686g.setVisibility(c19355x505bfc55.f265552o == i17 ? 0 : 8);
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        android.widget.ImageView imageView = viewHolder.f403684e;
        android.widget.TextView textView = viewHolder.f403687h;
        android.widget.TextView textView2 = viewHolder.f403685f;
        if (mo863xcdaf1228 != 1) {
            if (mo863xcdaf1228 != 2) {
                return;
            }
            textView.setVisibility(0);
            imageView.setVisibility(8);
            textView2.setVisibility(8);
            java.lang.String string = c19355x505bfc55.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{c19355x505bfc55.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5i)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            relativeLayout.setContentDescription(format);
            return;
        }
        textView.setVisibility(8);
        if (xVar.f367235c == null) {
            new hx4.w(this.f403680d, xVar.f367236d, new lx4.l(xVar, this, i17)).execute(xVar.f367234b);
        }
        imageView.setImageDrawable(xVar.f367235c);
        textView2.setText(xVar.f367236d);
        textView2.setContentDescription(xVar.f367236d);
        if (c19355x505bfc55.f265552o == i17) {
            java.lang.String string2 = c19355x505bfc55.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            str = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{xVar.f367236d}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
        } else {
            str = xVar.f367236d;
        }
        relativeLayout.setContentDescription(str);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f403680d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnw, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new lx4.n(inflate);
    }
}
