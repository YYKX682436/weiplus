package xn2;

/* loaded from: classes2.dex */
public final class c0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f537013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537014b;

    public c0(in5.s0 s0Var, xn2.p0 p0Var) {
        this.f537013a = s0Var;
        this.f537014b = p0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        in5.s0 s0Var = this.f537013a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.qoi);
        boolean z17 = false;
        if (textView != null && textView.getVisibility() == 0) {
            z17 = true;
        }
        return kz5.c1.k(new jz5.l("finder_context_id", this.f537014b.f537077b), new jz5.l("comment_scene", 281), new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())), new jz5.l("session_buffer", abstractC14490x69736cb5.getFeedObject().getFeedObject().m76829x97edf6c0()), new jz5.l("show_word", z17 ? textView != null ? textView.getText() : null : ""));
    }
}
