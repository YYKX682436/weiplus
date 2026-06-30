package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements p012xc85e97e9.p100xa8fcbcdb.n {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 f93379d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f93380e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f93381f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f93382g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.w f93383h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f93384i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p100xa8fcbcdb.d f93385m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f93386n;

    public x(p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244) {
        android.os.Handler handler = new android.os.Handler();
        this.f93383h = new p012xc85e97e9.p100xa8fcbcdb.w();
        this.f93386n = new p012xc85e97e9.p100xa8fcbcdb.v(this);
        this.f93379d = abstractC1150xa1fed244;
        this.f93384i = handler;
        this.f93385m = new p012xc85e97e9.p100xa8fcbcdb.d(abstractC1150xa1fed244, this);
        abstractC1150xa1fed244.L = this;
        this.f93380e = new java.util.ArrayList();
        this.f93381f = new java.util.ArrayList();
        this.f93382g = new java.util.ArrayList();
        if (abstractC1150xa1fed244 instanceof p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47) {
            mo8164xbbdced85(((p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47) abstractC1150xa1fed244).X);
        } else {
            mo8164xbbdced85(true);
        }
        z();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f93380e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        if (m8145x24a16003()) {
            return y(i17).i();
        }
        return -1L;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb y17 = y(i17);
        p012xc85e97e9.p100xa8fcbcdb.w wVar = this.f93383h;
        if (wVar == null) {
            wVar = new p012xc85e97e9.p100xa8fcbcdb.w();
        }
        wVar.f93378c = y17.getClass().getName();
        wVar.f93376a = y17.f93279J;
        wVar.f93377b = y17.K;
        this.f93383h = wVar;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f93382g;
        int indexOf = arrayList.indexOf(wVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(new p012xc85e97e9.p100xa8fcbcdb.w(this.f93383h));
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        y(i17).s((p012xc85e97e9.p100xa8fcbcdb.f0) k3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p012xc85e97e9.p100xa8fcbcdb.w wVar = (p012xc85e97e9.p100xa8fcbcdb.w) ((java.util.ArrayList) this.f93382g).get(i17);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        android.content.res.TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((android.util.AttributeSet) null, p012xc85e97e9.p100xa8fcbcdb.g0.f93348a);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = b3.l.m9707x4a96be14(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        android.view.View inflate = from.inflate(wVar.f93376a, viewGroup, false);
        if (inflate.getBackground() == null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.q(inflate, drawable);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i18 = wVar.f93377b;
            if (i18 != 0) {
                from.inflate(i18, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new p012xc85e97e9.p100xa8fcbcdb.f0(inflate);
    }

    public final void x(java.util.List list, p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244) {
        synchronized (abstractC1150xa1fed244) {
            java.util.Collections.sort(abstractC1150xa1fed244.R);
        }
        int O = abstractC1150xa1fed244.O();
        for (int i17 = 0; i17 < O; i17++) {
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb N = abstractC1150xa1fed244.N(i17);
            list.add(N);
            p012xc85e97e9.p100xa8fcbcdb.w wVar = new p012xc85e97e9.p100xa8fcbcdb.w();
            wVar.f93378c = N.getClass().getName();
            wVar.f93376a = N.f93279J;
            wVar.f93377b = N.K;
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f93382g;
            if (!arrayList.contains(wVar)) {
                arrayList.add(wVar);
            }
            if (N instanceof p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) {
                p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed2442 = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) N;
                if (!(abstractC1150xa1fed2442 instanceof p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47)) {
                    x(list, abstractC1150xa1fed2442);
                }
            }
            N.L = this;
        }
    }

    public p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb y(int i17) {
        if (i17 < 0 || i17 >= mo1894x7e414b06()) {
            return null;
        }
        return (p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) this.f93380e.get(i17);
    }

    public void z() {
        java.util.Iterator it = this.f93381f.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) it.next()).L = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f93381f.size());
        p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244 = this.f93379d;
        x(arrayList, abstractC1150xa1fed244);
        this.f93380e = this.f93385m.a(abstractC1150xa1fed244);
        this.f93381f = arrayList;
        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = abstractC1150xa1fed244.f93281e;
        m8146xced61ae5();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) it6.next()).getClass();
        }
    }
}
