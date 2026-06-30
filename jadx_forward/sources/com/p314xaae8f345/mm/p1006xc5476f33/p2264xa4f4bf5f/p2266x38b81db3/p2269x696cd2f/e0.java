package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class e0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f254806e = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f254807f;

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dhc;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        nj4.h item = (nj4.h) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onBindViewHolder " + i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.p(com.p314xaae8f345.mm.R.id.qdp);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        java.util.ArrayList arrayList = item.f419470d;
        if (mo7946xf939df19 != null && (mo7946xf939df19 instanceof tj4.e)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder ");
            tj4.e eVar = (tj4.e) mo7946xf939df19;
            sb6.append(eVar.f501361e);
            sb6.append(' ');
            sb6.append(eVar.f501363g);
            sb6.append(' ');
            sb6.append(eVar.f501362f);
            sb6.append(' ');
            sb6.append(arrayList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", sb6.toString());
            eVar.f501360d = arrayList;
            if (eVar.f501361e) {
                if (eVar.f501362f) {
                    eVar.m8155x27702c4(arrayList.size());
                    eVar.f501362f = false;
                }
                eVar.m8149x8b456734(1);
                eVar.f501361e = false;
                return;
            }
            if (eVar.f501363g) {
                eVar.m8155x27702c4(1);
                eVar.m8149x8b456734(1);
                eVar.f501363g = false;
                return;
            }
        }
        android.content.Context context = holder.f374654e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context);
        c1162x665295de.Q(0);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onBindViewHolder >> all to notify");
        tj4.e eVar2 = new tj4.e(arrayList);
        eVar2.f501364h = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d0(this, holder, eVar2);
        c1163xf1deaba4.mo7960x6cab2c8d(eVar2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class)).f255264i = eVar2;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onCreateViewHolder");
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "onDetachedFromRecyclerView");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f254807f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
