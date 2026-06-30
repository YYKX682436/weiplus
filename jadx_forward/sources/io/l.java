package io;

/* loaded from: classes5.dex */
public final class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f374947d;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f374947d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        mf5.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f374947d;
        if (list == null || (cVar = (mf5.c) kz5.n0.a0(list, i17)) == null) {
            return;
        }
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.q0f);
        q31.n nVar = tag instanceof q31.n ? (q31.n) tag : null;
        if (nVar == null) {
            return;
        }
        nVar.b(cVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
        io.j jVar = new io.j();
        jVar.f374946c = null;
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View a17 = jVar.a(context);
        a17.setTag(com.p314xaae8f345.mm.R.id.q0f, jVar);
        android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -2);
        }
        a17.setLayoutParams(layoutParams);
        return new io.k(a17);
    }
}
