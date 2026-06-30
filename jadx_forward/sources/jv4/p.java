package jv4;

/* loaded from: classes12.dex */
public final class p extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements jv4.i {

    /* renamed from: d, reason: collision with root package name */
    public final jv4.k f383794d;

    /* renamed from: e, reason: collision with root package name */
    public final jv4.f f383795e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f383796f;

    public p(jv4.k boxMgr, jv4.f uicDelegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxMgr, "boxMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uicDelegate, "uicDelegate");
        this.f383794d = boxMgr;
        this.f383795e = uicDelegate;
        this.f383796f = kz5.p0.f395529d;
        boxMgr.f383774a.c(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f383794d.a()).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        jv4.m mo141457xfb85f7b0;
        jv4.n nVar = (jv4.n) kz5.n0.a0(this.f383794d.a(), i17);
        if (nVar != null && (mo141457xfb85f7b0 = nVar.mo141457xfb85f7b0()) != null) {
            return mo141457xfb85f7b0.f383791d;
        }
        jv4.l lVar = jv4.m.f383775e;
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        jv4.n nVar = (jv4.n) kz5.n0.a0(this.f383794d.a(), i17);
        if (nVar != null) {
            nVar.c(holder);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        jv4.h hVar = this.f383794d.f383774a;
        jv4.m.f383775e.getClass();
        java.util.Iterator it = ((kz5.h) jv4.m.f383790w).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jv4.m) obj).f383791d == i17) {
                break;
            }
        }
        jv4.m mVar = (jv4.m) obj;
        if (mVar == null) {
            mVar = jv4.m.f383776f;
        }
        return hVar.a(parent, mVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        android.view.ViewParent parent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.f3639x46306858.isAttachedToWindow() && (parent = holder.f3639x46306858.getParent()) != null && (parent instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) parent).removeView(holder.f3639x46306858);
        }
        super.mo8162x34789575(holder);
    }

    public org.json.JSONObject x() {
        return ((jv4.e) this.f383795e).f383768a.d();
    }

    public void y(boolean z17) {
        if (z17) {
            this.f383796f = kz5.p0.f395529d;
            m8146xced61ae5();
            return;
        }
        java.util.List<jv4.n> a17 = this.f383794d.a();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a18 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new jv4.o(this.f383796f, a17), true);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (jv4.n nVar : a17) {
            arrayList.add(new mv4.g(nVar.v(), nVar.mo141457xfb85f7b0()));
        }
        this.f383796f = arrayList;
        a18.b(this);
    }
}
