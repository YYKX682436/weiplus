package wu2;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15127x5eaa8791 f531238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 f531239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15127x5eaa8791 c15127x5eaa8791, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 c13867x8e7f7db8) {
        super(1);
        this.f531238d = c15127x5eaa8791;
        this.f531239e = c13867x8e7f7db8;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.f189355a != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15127x5eaa8791 c15127x5eaa8791 = this.f531238d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kd kdVar = c15127x5eaa8791.f210806v;
            if (kdVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View view = kdVar.f187718r;
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13867x8e7f7db8 c13867x8e7f7db8 = this.f531239e;
            if (textView != null) {
                textView.setText(c15127x5eaa8791.y0().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuu, java.lang.Integer.valueOf(c13867x8e7f7db8.f189006e)));
            }
            c15127x5eaa8791.F0(c13867x8e7f7db8.f189006e);
        }
        return jz5.f0.f384359a;
    }
}
