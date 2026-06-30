package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderNameCardMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/p;", "Lem/n;", "f", "Lem/n;", "getHolder", "()Lem/n;", "setHolder", "(Lem/n;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderNameCardMvvmView */
/* loaded from: classes9.dex */
public final class C22080x46c0e48c extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.p> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.n holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22080x46c0e48c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0x, (android.view.ViewGroup) this, false);
        m80093x101324ae(new em.n(inflate));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        x05.c cVar;
        z01.p pVar3 = (z01.p) pVar2;
        if (pVar3 == null || (cVar = pVar3.f550669d) == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f542035a;
        mn2.h3 e17 = lVar.e(cVar.l(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        em.n m80092x1cddf0a2 = m80092x1cddf0a2();
        if (m80092x1cddf0a2.f336152b == null) {
            m80092x1cddf0a2.f336152b = (android.widget.ImageView) m80092x1cddf0a2.f336151a.findViewById(com.p314xaae8f345.mm.R.id.e_f);
        }
        android.widget.ImageView imageView = m80092x1cddf0a2.f336152b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getFinderAvatarIv(...)");
        a17.c(e17, imageView, g1Var.h(mn2.f1.f411495p));
        em.n m80092x1cddf0a22 = m80092x1cddf0a2();
        if (m80092x1cddf0a22.f336156f == null) {
            m80092x1cddf0a22.f336156f = (android.widget.TextView) m80092x1cddf0a22.f336151a.findViewById(com.p314xaae8f345.mm.R.id.fux);
        }
        android.widget.TextView textView = m80092x1cddf0a22.f336156f;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.String m174809x8010e5e4 = cVar.m174809x8010e5e4();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m174809x8010e5e4));
        int j17 = cVar.j();
        if (j17 > 0) {
            m80092x1cddf0a2().a().setVisibility(0);
            if (j17 == 1) {
                java.lang.String m174808x11716638 = cVar.m174808x11716638();
                if (m174808x11716638 == null || m174808x11716638.length() == 0) {
                    m80092x1cddf0a2().a().setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79909x77ca9e41, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
                } else {
                    vo0.d e18 = g1Var.e();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    mn2.h3 e19 = lVar.e(cVar.m174808x11716638(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
                    android.widget.ImageView a18 = m80092x1cddf0a2().a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getFinderJobIcon(...)");
                    e18.c(e19, a18, g1Var.h(mn2.f1.B));
                }
            } else if (j17 == 2) {
                m80092x1cddf0a2().a().setImageResource(com.p314xaae8f345.mm.R.raw.f79910x4f27281f);
            } else if (j17 == 100) {
                m80092x1cddf0a2().a().setVisibility(8);
            }
        } else {
            m80092x1cddf0a2().a().setVisibility(8);
        }
        if (j17 != 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.k())) {
            m80092x1cddf0a2().b().setVisibility(8);
        } else {
            m80092x1cddf0a2().b().setVisibility(0);
            m80092x1cddf0a2().b().setText(cVar.k());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(pVar3.f550670e);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            em.n m80092x1cddf0a23 = m80092x1cddf0a2();
            if (m80092x1cddf0a23.f336153c == null) {
                m80092x1cddf0a23.f336153c = (android.widget.LinearLayout) m80092x1cddf0a23.f336151a.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            }
            m80092x1cddf0a23.f336153c.setBackgroundResource(intValue);
        }
        android.view.View.OnClickListener onClickListener = pVar3.f550671f;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
    }

    /* renamed from: getHolder */
    public final em.n m80092x1cddf0a2() {
        em.n nVar = this.holder;
        if (nVar != null) {
            return nVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: setHolder */
    public final void m80093x101324ae(em.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<set-?>");
        this.holder = nVar;
    }

    public /* synthetic */ C22080x46c0e48c(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22080x46c0e48c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
