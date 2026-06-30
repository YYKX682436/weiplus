package zl2;

/* loaded from: classes2.dex */
public final class h2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555337h;

    public h2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.lang.String str) {
        this.f555333d = h0Var;
        this.f555334e = abstractC14490x69736cb5;
        this.f555335f = context;
        this.f555336g = h0Var2;
        this.f555337h = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        o25.y1 y1Var = (o25.y1) this.f555333d.f391656d;
        if (y1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).aj((db5.h4) menuItem, new zl2.g2(this.f555334e, this.f555333d, menuItem, this.f555335f, this.f555336g, this.f555337h));
        }
    }
}
