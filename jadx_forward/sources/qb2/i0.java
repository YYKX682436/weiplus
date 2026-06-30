package qb2;

/* loaded from: classes10.dex */
public final class i0 extends qb2.b0 {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f442755t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f442755t = new java.util.ArrayList();
    }

    @Override // qb2.b0
    public qb2.t E(int i17) {
        return (i17 < 0 || i17 >= K()) ? super.E(i17 - K()) : L(i17);
    }

    @Override // qb2.b0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: I */
    public wn.j mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 != 10000) {
            return super.mo865x9cc5cacc(parent, i17);
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.afs, parent, false);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.o_z);
        if (textView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(com.p314xaae8f345.mm.R.id.o_z)));
        }
        vb2.f fVar = new vb2.f(frameLayout, frameLayout, textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getRoot(...)");
        return new wn.j(frameLayout, fVar);
    }

    public final int K() {
        return this.f442755t.size();
    }

    public final qb2.t L(int i17) {
        java.util.ArrayList arrayList = this.f442755t;
        if (!(i17 >= 0 && i17 < arrayList.size())) {
            arrayList = null;
        }
        qb2.t tVar = arrayList != null ? (qb2.t) arrayList.get(i17) : null;
        return tVar == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a() : tVar;
    }

    @Override // qb2.b0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return super.mo1894x7e414b06() + K();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return E(i17).f65869x2262335f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        wn.j holder = (wn.j) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        qb2.t E = E(i17);
        int K = K();
        x4.a aVar = holder.f374656g;
        if (i17 >= K) {
            super.mo8157xe5e2e48d(holder, i17, payloads);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            vb2.e eVar = (vb2.e) aVar;
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null);
            int m75939xb282bd08 = j37 != null ? j37.u0().m75939xb282bd08(49) : 0;
            if ((m75939xb282bd08 == 2 || m75939xb282bd08 == 3) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(E.f65866xbed8694c, "findersayhisessionholder")) {
                return;
            }
            eVar.f516072g.setVisibility(8);
            eVar.f516071f.setVisibility(8);
            eVar.f516070e.setVisibility(8);
            android.widget.TextView textView = eVar.f516069d;
            textView.setVisibility(0);
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqg));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("finder_system_message", E.f65866xbed8694c)) {
            super.mo8157xe5e2e48d(holder, i17, payloads);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            ((vb2.e) aVar).f516067b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563343aa4);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("finder_wx_system_message", E.f65866xbed8694c)) {
            super.mo8157xe5e2e48d(holder, i17, payloads);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            vb2.e eVar2 = (vb2.e) aVar;
            eVar2.f516067b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563343aa4);
            java.lang.String str = E.f65853xf66fcca9;
            eVar2.f516069d.setText(str != null ? str : "");
            return;
        }
        if (E.f65869x2262335f == 10000) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationSysTipsItemBinding");
            vb2.f fVar = (vb2.f) aVar;
            java.lang.String str2 = E.G1;
            fVar.f516083b.setText(str2 != null ? str2 : "");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    public void p(int i17) {
        m8147xed6e4d18(i17 + K());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    public void q(int i17) {
        if (i17 >= 0) {
            m8149x8b456734(i17 + K());
        } else {
            m8149x8b456734(1);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    public void r(int i17, int i18) {
        m8153xd399a4d9(i17 + K(), i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    public void w(int i17) {
        m8155x27702c4(i17 + K());
    }
}
