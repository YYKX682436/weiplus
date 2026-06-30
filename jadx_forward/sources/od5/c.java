package od5;

/* loaded from: classes9.dex */
public final class c implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q {

    /* renamed from: b, reason: collision with root package name */
    public final in5.s0 f426189b;

    public c(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f426189b = holder;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q
    /* renamed from: getAdapterPosition */
    public int mo79416xf806b362() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r3 r3Var;
        in5.s0 holder = this.f426189b;
        int m8183xf806b362 = holder.m8183xf806b362();
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.gyi);
        java.lang.ref.WeakReference weakReference = tag instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) tag : null;
        if (weakReference == null || (r3Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r3) weakReference.get()) == null) {
            return m8183xf806b362;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return holder.m8183xf806b362() - r3Var.y();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q
    /* renamed from: getViewHolderScope */
    public p3325xe03a0797.p3326xc267989b.y0 mo79417x33dec1ed() {
        return this.f426189b.f374653d;
    }

    /* renamed from: toString */
    public java.lang.String m151089x9616526c() {
        return java.lang.String.valueOf(mo79416xf806b362());
    }
}
