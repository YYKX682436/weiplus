package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod */
/* loaded from: classes15.dex */
public class C22673x4548f3a5 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1 {

    /* renamed from: sInstance */
    private static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5 f39751xbfaed628;

    /* renamed from: getInstance */
    public static il5.a m81862x9cf0d20b() {
        if (f39751xbfaed628 == null) {
            f39751xbfaed628 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5();
        }
        return f39751xbfaed628;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: bottom */
    public boolean mo81820xad8d9a2b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81849xb6b15f58(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: down */
    public boolean mo81822x2f24a2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81850x3ec510f(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    public boolean end(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return mo81820xad8d9a2b(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: home */
    public boolean mo81824x30f4df(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return top(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: left */
    public boolean mo81826x32a007(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81851x3efcc74(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: lineEnd */
    public boolean mo81828xa8aec47(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81852x25dfccba(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: lineStart */
    public boolean mo81829x9448fcce(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81853x2de78c81(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: onTakeFocus */
    public void mo81830x56212972(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        if (m81661x22f21e20 != null && (i17 & 2) != 0) {
            viewTreeObserverOnPreDrawListenerC22668xe0605023.scrollTo(viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop(0));
        }
        if (m81661x22f21e20 == null || (i17 & 1) == 0) {
            return;
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.scrollTo(viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop((m81661x22f21e20.getLineCount() - 1) + 1) - (viewTreeObserverOnPreDrawListenerC22668xe0605023.getHeight() - (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81716xd5538bb2() + viewTreeObserverOnPreDrawListenerC22668xe0605023.m81711xe699d6ae())));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: onTouchEvent */
    public boolean mo81831x667eb1da(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        return il5.c.a(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: pageDown */
    public boolean mo81832x33331bd1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81854x827a49be(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: pageUp */
    public boolean mo81833xc4a6058a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81855xcdc9cab7(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: right */
    public boolean mo81834x677c21c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81856x7a60234f(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    public boolean top(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81857x18e6d348(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    public boolean up(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return m81858xe8077248(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, 1);
    }
}
