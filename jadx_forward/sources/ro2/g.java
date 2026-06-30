package ro2;

/* loaded from: classes2.dex */
public final class g extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479580c;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f479578a = qeVar;
        this.f479579b = context;
        this.f479580c = abstractC14490x69736cb5;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        ro2.t tVar = ro2.t.f479631i;
        android.content.Context context = this.f479579b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f479580c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        ro2.r.h(this.f479578a, tVar, context, item);
    }
}
