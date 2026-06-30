package ax2;

/* loaded from: classes3.dex */
public final class b extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15390x96b299ef f96564a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15390x96b299ef c15390x96b299ef) {
        this.f96564a = c15390x96b299ef;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.f96564a.f213337d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
    }
}
