package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingEmojiMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/k;", "Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;", "f", "Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;", "getContent", "()Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;", "setContent", "(Lcom/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiView;)V", "content", "", "g", "Z", "isEmojiInited", "()Z", "setEmojiInited", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView */
/* loaded from: classes9.dex */
public final class C22076x79b79a85 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.k> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 content;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isEmojiInited;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22076x79b79a85(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd03243 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243(context);
        m80082xe9f5bdb7(c19694xdfd03243);
        return c19694xdfd03243;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        z01.k kVar = (z01.k) pVar2;
        if (kVar == null) {
            return;
        }
        if (!this.isEmojiInited) {
            int l17 = kVar.l();
            if (l17 == 0) {
                m80081x76847043().a();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 m80081x76847043 = m80081x76847043();
                m80081x76847043.getClass();
                m80081x76847043.addView(m80081x76847043.f272359m, new android.widget.FrameLayout.LayoutParams(-2, -2));
            } else if (l17 == 1) {
                m80081x76847043().a();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 m80081x768470432 = m80081x76847043();
                m80081x768470432.getClass();
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 3;
                m80081x768470432.addView(m80081x768470432.f272359m, layoutParams);
            } else if (l17 == 2) {
                m80081x76847043().a();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 m80081x768470433 = m80081x76847043();
                m80081x768470433.getClass();
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 5;
                m80081x768470433.addView(m80081x768470433.f272359m, layoutParams2);
            }
            this.isEmojiInited = true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(kVar.m178252xc128bcce());
        if (N == null) {
            return;
        }
        m80081x76847043().c(N, kVar.j(), kVar.l() == 2, kVar.n());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 m80081x768470434 = m80081x76847043();
        java.lang.String k17 = kVar.k();
        jz5.f0 f0Var = null;
        if (!(k17.length() > 0)) {
            k17 = null;
        }
        if (k17 == null) {
            k17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(N.mo42933xb5885648());
        }
        m80081x768470434.setContentDescription(k17);
        android.view.View.OnClickListener onClickListener = kVar.f550616d;
        if (onClickListener != null) {
            m80081x76847043().setOnClickListener(onClickListener);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            m80081x76847043().setOnClickListener(new af5.x(this, kVar));
        }
        m80081x76847043().setOnLongClickListener(kVar.f550617e);
        m80081x76847043().setOnTouchListener(kVar.f550618f);
    }

    /* renamed from: getContent */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 m80081x76847043() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd03243 = this.content;
        if (c19694xdfd03243 != null) {
            return c19694xdfd03243;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("content");
        throw null;
    }

    /* renamed from: setContent */
    public final void m80082xe9f5bdb7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd03243) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19694xdfd03243, "<set-?>");
        this.content = c19694xdfd03243;
    }

    /* renamed from: setEmojiInited */
    public final void m80083xb3e3c7d3(boolean z17) {
        this.isEmojiInited = z17;
    }

    public /* synthetic */ C22076x79b79a85(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22076x79b79a85(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
