package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010&R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveEmojiView;", "Lcom/tencent/mm/emoji/view/EmojiStatusView;", "", "s", "I", "getEmojiMaxSize", "()I", "setEmojiMaxSize", "(I)V", "emojiMaxSize", "t", "getEmojiMinSize", "setEmojiMinSize", "emojiMinSize", "Lkotlin/Function2;", "", "", "Ljz5/f0;", "u", "Lyz5/p;", "getDownloadListener", "()Lyz5/p;", "setDownloadListener", "(Lyz5/p;)V", "downloadListener", "Lsr/a;", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Lsr/a;", "getDelegate", "()Lsr/a;", "delegate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView */
/* loaded from: classes10.dex */
public final class C14309x7fd7c1d9 extends com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f197377r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int emojiMaxSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int emojiMinSize;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public yz5.p downloadListener;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final sr.a delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14309x7fd7c1d9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197377r = "MicroMsg.FinderLiveEmojiView";
        this.emojiMaxSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        this.emojiMinSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.k6 k6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.k6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.k6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v3 v3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v3(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j2) k6Var).getClass();
        this.delegate = new sr.m(this, v3Var);
    }

    @Override // com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9
    public sr.a getDelegate() {
        return this.delegate;
    }

    public final yz5.p getDownloadListener() {
        return this.downloadListener;
    }

    public final int getEmojiMaxSize() {
        return this.emojiMaxSize;
    }

    public final int getEmojiMinSize() {
        return this.emojiMinSize;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m43708x63ed375e() == null || getStatus() == 1) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reload onAttachedToWindow ");
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m43708x63ed375e = m43708x63ed375e();
        sb6.append(m43708x63ed375e != null ? m43708x63ed375e.mo42933xb5885648() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197377r, sb6.toString());
        getDelegate().mo165059xc84a8199();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int m64931xcb3a64b7;
        int m64930x82433856;
        super.onMeasure(i17, i18);
        if (getStatus() == 1 || m43708x63ed375e() == null) {
            m64931xcb3a64b7 = m64931xcb3a64b7();
            m64930x82433856 = m64930x82433856();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m43708x63ed375e());
            m64931xcb3a64b7 = (int) (r3.b0() * m64929x43aa77f2());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m43708x63ed375e());
            m64930x82433856 = (int) (r4.t1() * m64929x43aa77f2());
            if (m64931xcb3a64b7 <= 0) {
                m64931xcb3a64b7 = this.emojiMaxSize;
            }
            if (m64930x82433856 <= 0) {
                m64930x82433856 = this.emojiMaxSize;
            }
            if (m64931xcb3a64b7 <= 0) {
                m64931xcb3a64b7 = 0;
            }
            if (m64930x82433856 <= 0) {
                m64930x82433856 = 0;
            }
        }
        if (m64931xcb3a64b7 <= 0) {
            m64931xcb3a64b7 = this.emojiMaxSize;
        }
        if (m64930x82433856 <= 0) {
            m64930x82433856 = this.emojiMaxSize;
        }
        int i19 = this.emojiMinSize;
        if (m64930x82433856 < i19 || m64931xcb3a64b7 < i19) {
            if (m64931xcb3a64b7 < m64930x82433856) {
                m64930x82433856 = (int) (m64930x82433856 * (i19 / m64931xcb3a64b7));
                m64931xcb3a64b7 = i19;
            } else if (m64930x82433856 < m64931xcb3a64b7) {
                m64931xcb3a64b7 = (int) (m64931xcb3a64b7 * (i19 / m64930x82433856));
                m64930x82433856 = i19;
            } else {
                m64931xcb3a64b7 = i19;
                m64930x82433856 = m64931xcb3a64b7;
            }
        }
        int i27 = this.emojiMaxSize;
        if (m64931xcb3a64b7 > i27 || m64930x82433856 > i27) {
            if (m64931xcb3a64b7 > m64930x82433856) {
                m64930x82433856 = (int) (m64930x82433856 * (i27 / m64931xcb3a64b7));
                m64931xcb3a64b7 = i27;
            } else if (m64930x82433856 > m64931xcb3a64b7) {
                m64931xcb3a64b7 = (int) (m64931xcb3a64b7 * (i27 / m64930x82433856));
                m64930x82433856 = i27;
            } else {
                m64931xcb3a64b7 = i27;
                m64930x82433856 = m64931xcb3a64b7;
            }
        }
        setMeasuredDimension(m64931xcb3a64b7, m64930x82433856);
    }

    /* renamed from: setDownloadListener */
    public final void m57286x7619e5de(yz5.p pVar) {
        this.downloadListener = pVar;
    }

    /* renamed from: setEmojiMaxSize */
    public final void m57287x86c391e1(int i17) {
        this.emojiMaxSize = i17;
    }

    /* renamed from: setEmojiMinSize */
    public final void m57288x93dd6bcf(int i17) {
        this.emojiMinSize = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14309x7fd7c1d9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
