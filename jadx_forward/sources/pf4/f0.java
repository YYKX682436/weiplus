package pf4;

/* loaded from: classes4.dex */
public final class f0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f435399d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f435400e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f435401f;

    public f0(java.util.ArrayList bubbleDatas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bubbleDatas, "bubbleDatas");
        this.f435399d = bubbleDatas;
        this.f435400e = "MicroMsg.StoryVisitorListAdapter";
        this.f435401f = new java.util.HashMap();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f435399d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        pf4.c0 holder = (pf4.c0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f435399d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        gf4.a aVar = (gf4.a) obj;
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18473x88f71108 c18473x88f71108 = holder.f435385e;
        java.lang.String userName = aVar.f352863a;
        wVar.Ni(c18473x88f71108, userName);
        boolean z17 = false;
        if (aVar.f352868f) {
            c18473x88f71108.setBackground(c18473x88f71108.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b4e));
            int i18 = holder.f435384d;
            c18473x88f71108.setPadding(i18, i18, i18, i18);
            c18473x88f71108.m71388xfbfb82e(c18473x88f71108.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7f));
        } else {
            c18473x88f71108.setBackground(null);
            c18473x88f71108.setPadding(0, 0, 0, 0);
            c18473x88f71108.m71388xfbfb82e(0);
        }
        java.util.HashMap hashMap = holder.f435387g.f435401f;
        ef4.v vVar = ef4.w.f334001t;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), userName) && vVar.g().P0(userName).t0()) {
            z17 = true;
        }
        hashMap.put(userName, java.lang.Boolean.valueOf(z17));
        c18473x88f71108.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (!android.text.TextUtils.equals(c18473x88f71108.f253413d, userName)) {
            c18473x88f71108.f253413d = userName;
        }
        c18473x88f71108.setOnClickListener(new pf4.b0(aVar, holder));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f352863a, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = holder.f435386f;
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f435399d.clone();
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cww, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new pf4.c0(this, inflate, 0, 2, null);
    }
}
