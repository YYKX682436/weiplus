package ro2;

/* loaded from: classes2.dex */
public final class k implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f479590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479591c;

    public k(android.content.Context context, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        this.f479589a = context;
        this.f479590b = map;
        this.f479591c = qeVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    /* renamed from: onHide */
    public void mo50890xc39a57c1() {
        this.f479591c.F = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.content.Context context = this.f479589a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        d2Var.h(context, "poster_send_to_cmt", "view_unexp", false, this.f479590b);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h
    /* renamed from: onShow */
    public void mo50891xc39f557c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.content.Context context = this.f479589a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        d2Var.h(context, "poster_send_to_cmt", "view_exp", false, this.f479590b);
    }
}
