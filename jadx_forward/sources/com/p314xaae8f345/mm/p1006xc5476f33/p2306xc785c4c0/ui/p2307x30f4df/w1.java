package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 f256628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wm4.y f256629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f256630f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f256631g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f256632h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 y1Var, wm4.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var, android.view.View view) {
        super(0);
        this.f256628d = y1Var;
        this.f256629e = yVar;
        this.f256630f = jbVar;
        this.f256631g = f03Var;
        this.f256632h = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popwindow onDismiss isClickOnBubbleTab:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 y1Var = this.f256628d;
        sb6.append(y1Var.f256647e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryTabBubbleUIC", sb6.toString());
        boolean z17 = y1Var.f256647e;
        wm4.y yVar = this.f256629e;
        if (!z17) {
            yVar.a(1, "", this.f256630f, this.f256631g);
        }
        y1Var.f256646d = yVar;
        this.f256632h.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.v1(y1Var), 250L);
        return jz5.f0.f384359a;
    }
}
