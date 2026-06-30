package uc5;

/* loaded from: classes10.dex */
public final class q extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final in5.r f508075e;

    public q(in5.r delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f508075e = delegate;
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        return this.f508075e.c(recyclerView);
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        this.f508075e.g(recyclerView, adapter);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uc5.l0 item = (uc5.l0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.r rVar = this.f508075e;
        uc5.d dVar = ((uc5.h0) item).f508027d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar, "null cannot be cast to non-null type Item of com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryContentRowConvert");
        rVar.h(holder, dVar, i17, i18, z17, list);
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        this.f508075e.j(recyclerView);
    }
}
