package at2;

/* loaded from: classes3.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f95297p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f95298q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f95299r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f95297p = jz5.h.b(new at2.s(root));
        this.f95298q = jz5.h.b(new at2.r(root));
        this.f95299r = jz5.h.b(new at2.t(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1(java.lang.String anchorUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        ya2.b2 b17 = ya2.h.f542017a.b(anchorUsername);
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f95297p).mo141623x754a37bb();
        android.content.res.Resources resources = this.f446856d.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = b17 != null ? b17.z0() : "";
        textView.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekv, objArr));
    }
}
