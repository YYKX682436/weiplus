package sj3;

/* loaded from: classes4.dex */
public final class s5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f490274d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f490275e;

    public s5(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f490274d = context;
        this.f490275e = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return (int) java.lang.Math.ceil(this.f490275e.size() / 5);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        sj3.t5 holder = (sj3.t5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int i18 = (i17 + 1) * 5;
        java.util.ArrayList arrayList = this.f490275e;
        if (i18 >= arrayList.size()) {
            i18 = arrayList.size();
        }
        android.content.Context context = this.f490274d;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        if (i17 != 0) {
            layoutParams.topMargin = sj3.i1.f490092d;
        }
        if (i17 == mo1894x7e414b06() - 1) {
            int size = arrayList.size() % 5;
            layoutParams.leftMargin = size == 0 ? 0 : ((sj3.i1.f490097i + sj3.i1.f490092d) * (5 - size)) / 2;
        }
        linearLayout.setLayoutParams(layoutParams);
        int i19 = i17 * 5;
        for (int i27 = i19; i27 < i18; i27++) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            int i28 = sj3.i1.f490097i;
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i28, i28);
            if (i27 != i19) {
                layoutParams2.leftMargin = sj3.i1.f490092d;
            }
            imageView.setLayoutParams(layoutParams2);
            linearLayout.addView(imageView);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = (java.lang.String) arrayList.get(i27);
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            ((ke0.e) xVar).getClass();
            imageView.setContentDescription(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, e17));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, (java.lang.String) arrayList.get(i27), null);
        }
        android.widget.RelativeLayout relativeLayout = holder.f490283d;
        if (relativeLayout != null) {
            relativeLayout.addView(linearLayout);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f490274d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3y, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new sj3.t5(inflate);
    }

    public final boolean x(java.lang.String userName) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.Iterator it = this.f490275e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, userName)) {
                break;
            }
        }
        return obj != null;
    }
}
