package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsView;", "Landroid/widget/RelativeLayout;", "", "lyric", "Ljz5/f0;", "setupLyricContent", "", "currentPos", "setupCurrentTime", "Lom3/i;", "d", "Ljz5/g;", "getLyricManager", "()Lom3/i;", "lyricManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView */
/* loaded from: classes10.dex */
public final class C16660xe738cfd0 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g lyricManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16660xe738cfd0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d0h, this);
        this.lyricManager = jz5.h.b(new om3.f(context, this));
    }

    /* renamed from: getLyricManager */
    private final om3.i m67275x59d8bcc4() {
        return (om3.i) ((jz5.n) this.lyricManager).mo141623x754a37bb();
    }

    public final void a() {
        om3.i m67275x59d8bcc4 = m67275x59d8bcc4();
        m67275x59d8bcc4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting.TingMusicLyricsViewManager", "onCreate" + kl3.t.g().a());
        m67275x59d8bcc4.a().mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1917xbb6ca34f.C16657x90cca9e9(m67275x59d8bcc4.f427937a, 0, false, 6, null));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) m67275x59d8bcc4.a().getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        android.content.Context context = m67275x59d8bcc4.f427937a;
        marginLayoutParams.topMargin = (int) ((context.getResources().getDisplayMetrics().heightPixels * 0.37f) - i65.a.b(context, 15));
    }

    public final void b() {
        om3.i m67275x59d8bcc4 = m67275x59d8bcc4();
        m67275x59d8bcc4.f427940d.clear();
        m67275x59d8bcc4.f427941e = null;
    }

    /* renamed from: setupCurrentTime */
    public final void m67276x7710d29(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        om3.i m67275x59d8bcc4 = m67275x59d8bcc4();
        int i18 = m67275x59d8bcc4.f427942f;
        ll3.h1 h1Var = m67275x59d8bcc4.f427941e;
        if (h1Var != null) {
            i18 = h1Var.a(i17);
        }
        if (i18 != m67275x59d8bcc4.f427942f && i18 >= 0 && (c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) m67275x59d8bcc4.a().getLayoutManager()) != null) {
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            m67275x59d8bcc4.a().f1();
            if (i18 <= y17 + 1 && w17 - 1 <= i18) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 a17 = m67275x59d8bcc4.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                a17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 a18 = m67275x59d8bcc4.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(a18, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                a18.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(a18, "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        m67275x59d8bcc4.f427942f = i18;
    }

    /* renamed from: setupLyricContent */
    public final void m67277x8f970a37(java.lang.String lyric) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyric, "lyric");
        om3.i m67275x59d8bcc4 = m67275x59d8bcc4();
        m67275x59d8bcc4.getClass();
        if (!(lyric.length() > 0)) {
            lyric = null;
        }
        if (lyric != null) {
            java.util.ArrayList arrayList = m67275x59d8bcc4.f427940d;
            arrayList.clear();
            ll3.h1 f17 = ll3.h1.f(lyric, "", "", true, "", false, false);
            ll3.h1 h1Var = f17.e() > 1 ? f17 : null;
            m67275x59d8bcc4.f427941e = h1Var;
            if (h1Var != null) {
                int e17 = h1Var.e();
                for (int i17 = 0; i17 < e17; i17++) {
                    java.lang.String str = h1Var.d(i17).f400701b;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            }
            if (((km3.d) m67275x59d8bcc4.a().mo7946xf939df19()) == null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 a17 = m67275x59d8bcc4.a();
                km3.d dVar = new km3.d(m67275x59d8bcc4.f427943g);
                dVar.x(arrayList);
                a17.mo7960x6cab2c8d(dVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting.TingMusicLyricsViewManager", "setSongInfo, lyric.length:" + lyric.length() + ", lyricLine.size:" + arrayList.size() + ", lyricRv-Visisble:" + m67275x59d8bcc4.a().getVisibility() + ", lyricRv.alpha:" + m67275x59d8bcc4.a().getAlpha());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16660xe738cfd0(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16660xe738cfd0(android.content.Context context) {
        this(context, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
