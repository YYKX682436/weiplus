package iw2;

/* loaded from: classes10.dex */
public final class b implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c f376762d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f376763e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f376764f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f376762d = view;
        this.f376763e = status;
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.hug));
        arrayList.add(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.huf));
        view.f212325e.addAll(arrayList);
        view.f212327g.m8146xced61ae5();
        view.m61566x10ee1022(new iw2.a(this));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (i17 == 0) {
            sa5.d.c(this.f376762d, 0.0f, 0L, null, 7, null);
        } else {
            sa5.d.d(this.f376762d, 0, 0L, null, 7, null);
        }
    }
}
