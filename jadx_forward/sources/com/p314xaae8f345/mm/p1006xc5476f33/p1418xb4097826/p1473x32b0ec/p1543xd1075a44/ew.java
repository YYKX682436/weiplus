package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ew extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f199820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f199821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw f199822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw nwVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199820d = activityC0065xcd7aa112;
        this.f199821e = list;
        this.f199822f = nwVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ew(this.f199820d, this.f199821e, this.f199822f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ew ewVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ew) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        ewVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", "");
        intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", "");
        intent.putExtra("KEY_SOURCE", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dw dwVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dw(this.f199821e, this.f199822f);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f199820d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz2.x0 x0Var = jz2.x0.f384287a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f384296j).mo141623x754a37bb());
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        if (activityC21401x6ce6f73f != null && (m78751x5dc77fb5 = activityC21401x6ce6f73f.m78751x5dc77fb5(intent)) != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = dwVar;
        }
        return jz5.f0.f384359a;
    }
}
