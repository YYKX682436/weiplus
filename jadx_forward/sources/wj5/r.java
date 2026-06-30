package wj5;

/* loaded from: classes14.dex */
public final class r extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f528367e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528368f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.r f528369g;

    public r(yb5.d mChattingContext, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, yj5.r processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mChattingContext, "mChattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528367e = mChattingContext;
        this.f528368f = tipsBarContext;
        this.f528369g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570851c43;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.g item = (xj5.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d dVar = this.f528368f;
        boolean z18 = dVar.f291459b == com.p314xaae8f345.mm.ui.p2738xb1dfbddb.e.f291463e;
        yb5.d dVar2 = this.f528367e;
        boolean z19 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) dVar2.f542241c.a(sb5.n.class))).u0() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar2.f542241c.a(sb5.f.class))).P;
        com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7 = (com.p314xaae8f345.mm.ui.C21424xdbf688d7) holder.p(com.p314xaae8f345.mm.R.id.jx8);
        c21424xdbf688d7.m78787x4001c3c7(dVar2);
        c21424xdbf688d7.m78790xbaa98b53(dVar2.x());
        c21424xdbf688d7.m78788x557dfce2(dVar2.t());
        c21424xdbf688d7.m78791x5d729e9a(z19);
        c21424xdbf688d7.h(z18);
        c21424xdbf688d7.m78792x9375ea91(item.f536436u);
        if (dVar.f291458a == com.p314xaae8f345.mm.ui.p2738xb1dfbddb.c.f291455d) {
            c21424xdbf688d7.c();
        } else {
            yj5.q qVar = item.f536437v;
            if (qVar.f544260a && (!qVar.f544261b.isEmpty())) {
                c21424xdbf688d7.g("", c21424xdbf688d7.b(qVar.f544261b, ""), dVar2.x(), qVar.f544261b.size(), 0L);
            } else {
                c21424xdbf688d7.c();
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c21424xdbf688d7.f278528e;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(dVar.a() ? 8 : 0);
        }
        c21424xdbf688d7.m78789x7741e463(new wj5.q(this));
        android.view.View findViewById = c21424xdbf688d7.findViewById(com.p314xaae8f345.mm.R.id.jvy);
        android.widget.Button button = findViewById instanceof android.widget.Button ? (android.widget.Button) findViewById : null;
        if (button != null) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(button, "group_msg_set_top_bar_join_btn");
            aVar.ik(button, 8, 26356);
        }
        this.f528369g.f544262f = c21424xdbf688d7;
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
