package lr;

/* loaded from: classes15.dex */
public final class f1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f402049d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f402050e;

    /* renamed from: f, reason: collision with root package name */
    public lr.c1 f402051f;

    /* renamed from: g, reason: collision with root package name */
    public int f402052g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f402053h;

    public f1(ir.h config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f402049d = config;
        this.f402050e = new java.util.ArrayList();
        this.f402052g = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f402050e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        ir.y0 x17 = x(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
        return x17.f375452a.f375428a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        lr.d1 viewHolder = (lr.d1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        android.content.Context context = viewHolder.f3639x46306858.getContext();
        android.content.res.Resources resources = context.getResources();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559796f3, typedValue, true);
        int color = resources.getColor(typedValue.resourceId);
        viewHolder.f3639x46306858.setSelected(this.f402052g == i17);
        ir.y0 x17 = x(i17);
        android.widget.ImageView imageView = viewHolder.f402040d;
        if (x17 == null) {
            imageView.setVisibility(8);
            imageView.setTag("");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "emoji group info is null. position:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = viewHolder.f402041e;
        imageView2.setVisibility(8);
        int i18 = x17.f375452a.f375428a;
        if (i18 == 2) {
            rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f79056x5597b96f, color);
            imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iql));
            return;
        }
        if (i18 == 3) {
            if (w75.a.a() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, color);
            } else {
                rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f79051x96e03afb, color);
            }
            imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0t));
            if (z65.c.a()) {
                viewHolder.f3639x46306858.setOnLongClickListener(lr.e1.f402045d);
                return;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return;
            }
        }
        ir.y0 x18 = x(i17);
        if (x18 == null) {
            return;
        }
        android.util.SparseArray sparseArray = ir.c0.f375353a;
        ir.r rVar = x18.f375452a;
        java.lang.String groupId = rVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        if (((ir.a0) ir.c0.f375354b.get(groupId)) == null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("smiley", rVar.c())) {
                rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f79055x23a15976, color);
                imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buq));
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("custom", rVar.c())) {
                rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f79054x7da85463, color);
                imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0s));
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("17", rVar.c())) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhv);
                imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572648c00));
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("capture", rVar.c())) {
                rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f79052x3a20d976, color);
                imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0r));
                if (((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().x()) {
                    int i19 = this.f402049d.f375375a;
                    int i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
                    if (i19 == 1) {
                        imageView2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (rVar instanceof ir.t) {
                zq.e.f556504a.a(new zq.a(((ir.t) rVar).f375433b)).c(imageView);
            } else {
                wo0.c a17 = vo0.e.f520001b.a(rVar.d());
                yo0.f fVar = new yo0.f();
                fVar.f545611b = true;
                a17.f529405c = fVar.a();
                ((wo0.b) a17).c(imageView);
            }
            java.lang.String e17 = rVar.e();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzu));
                return;
            }
            imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572640by3) + e17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.co_, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new lr.d1(this, inflate);
    }

    public final ir.y0 x(int i17) {
        java.util.ArrayList arrayList = this.f402050e;
        if (arrayList.isEmpty() || arrayList.size() < i17 || i17 < 0) {
            return null;
        }
        return (ir.y0) arrayList.get(i17);
    }

    public final void y(int i17) {
        ir.r rVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "setSelection: %s", java.lang.Integer.valueOf(i17));
        int i18 = this.f402052g;
        if (i18 != i17) {
            m8147xed6e4d18(i18);
            this.f402052g = i17;
            ir.y0 x17 = x(i17);
            this.f402053h = (x17 == null || (rVar = x17.f375452a) == null) ? null : rVar.c();
            m8147xed6e4d18(this.f402052g);
        }
    }
}
