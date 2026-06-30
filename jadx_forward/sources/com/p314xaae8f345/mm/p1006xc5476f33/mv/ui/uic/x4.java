package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class x4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f233059d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public kp4.s0 f233060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f233061f;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var) {
        this.f233061f = z5Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f233059d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        kk4.b player;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4 viewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        kp4.s0 s0Var = this.f233060e;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962 = viewHolder.f233088d;
        if (s0Var != null) {
            c16682xd79fb962.m67302x102fa5d7(s0Var);
            kk4.d dVar = this.f233061f.f233112r;
            c16682xd79fb962.m67301x2d9e567((dVar == null || (player = dVar.getPlayer()) == null) ? null : ((kk4.v) player).f390113e);
        }
        java.lang.Object obj = this.f233059d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        c16682xd79fb962.m67303x873c5e57((kp4.a) obj);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4(parent);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4 holder = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8161x38c82990(holder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "release frameListView");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962 = holder.f233088d;
        rm5.k kVar = c16682xd79fb962.f233143t;
        if (kVar != null) {
            kVar.mo122875x5cd39ffa();
        }
        c16682xd79fb962.f233143t = null;
        c16682xd79fb962.f233132f = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16682xd79fb962.f233130d, "clearThumb");
        c16682xd79fb962.f233133g.clear();
        c16682xd79fb962.f233134h = null;
        c16682xd79fb962.postInvalidate();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4 holder = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "release frameListView");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962 = holder.f233088d;
        rm5.k kVar = c16682xd79fb962.f233143t;
        if (kVar != null) {
            kVar.mo122875x5cd39ffa();
        }
        c16682xd79fb962.f233143t = null;
        c16682xd79fb962.f233132f = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16682xd79fb962.f233130d, "clearThumb");
        c16682xd79fb962.f233133g.clear();
        c16682xd79fb962.f233134h = null;
        c16682xd79fb962.postInvalidate();
    }
}
