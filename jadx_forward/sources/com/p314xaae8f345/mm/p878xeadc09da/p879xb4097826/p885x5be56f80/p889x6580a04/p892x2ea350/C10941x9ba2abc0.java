package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipStorylineSegmentTimelineView;", "Lcom/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView;", "", "ignoreStartTimeInMedia", "Ljz5/f0;", "setIgnoreStartTimeInMedia", "Lbx0/i;", "y", "Lbx0/i;", "getTimelineLayoutType", "()Lbx0/i;", "timelineLayoutType", "Lrv0/k5;", "value", "getAdapter", "()Lrv0/k5;", "setAdapter", "(Lrv0/k5;)V", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView */
/* loaded from: classes5.dex */
public final class C10941x9ba2abc0 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f150814z = 0;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final bx0.i timelineLayoutType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10941x9ba2abc0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getAdapter */
    private final rv0.k5 m47124xf939df19() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m47437x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 instanceof rv0.k5) {
            return (rv0.k5) mo7946xf939df19;
        }
        return null;
    }

    /* renamed from: setAdapter */
    private final void m47125x6cab2c8d(rv0.k5 k5Var) {
        m47437x4905e9fa().mo7960x6cab2c8d(k5Var);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public boolean c(ex0.a0 timelineVM, p3325xe03a0797.p3326xc267989b.y0 mainScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineVM, "timelineVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        bx0.h timelineLayoutCalc = getTimelineLayoutCalc();
        if (timelineLayoutCalc == null) {
            return false;
        }
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        m47125x6cab2c8d(new rv0.k5(context, timelineVM, timelineLayoutCalc, getThumbnailProviderManager()));
        rv0.k5 m47124xf939df19 = m47124xf939df19();
        if (m47124xf939df19 != null) {
            m47124xf939df19.f481626o = new rv0.l5(this);
        }
        return m47124xf939df19() != null;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public void d() {
        gy0.q mainItemDecoration = getMainItemDecoration();
        if (mainItemDecoration != null) {
            mainItemDecoration.f359063p.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public void e(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        int w17;
        int y17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m47437x4905e9fa().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null || (w17 = c1162x665295de.w()) > (y17 = c1162x665295de.y())) {
            return;
        }
        while (true) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m47437x4905e9fa().p0(w17);
            rv0.f5 f5Var = p07 instanceof rv0.f5 ? (rv0.f5) p07 : null;
            if (f5Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f5Var.f481536f, segmentID)) {
                f5Var.f481535e.post(new rv0.d5(f5Var, m47441x185482f6()));
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public void f(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a offsetRange) {
        int w17;
        int y17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetRange, "offsetRange");
        super.f(segmentID, offsetRange);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m47437x4905e9fa().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null || (w17 = c1162x665295de.w()) > (y17 = c1162x665295de.y())) {
            return;
        }
        while (true) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m47437x4905e9fa().p0(w17);
            rv0.f5 f5Var = p07 instanceof rv0.f5 ? (rv0.f5) p07 : null;
            if (f5Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f5Var.f481536f, segmentID)) {
                f5Var.f481535e.post(new rv0.e5(f5Var, m47441x185482f6(), offsetRange));
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public bx0.i getTimelineLayoutType() {
        return this.timelineLayoutType;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public void j() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m47437x4905e9fa().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int w17 = c1162x665295de.w();
        int y17 = c1162x665295de.y();
        android.graphics.Rect b17 = bx0.b.b((int) m47441x185482f6(), 0, m47438xd6cf2784(), getHeight());
        if (w17 > y17) {
            return;
        }
        while (true) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m47437x4905e9fa().p0(w17);
            rv0.f5 f5Var = p07 instanceof rv0.f5 ? (rv0.f5) p07 : null;
            if (f5Var != null) {
                f5Var.f481535e.post(new rv0.d5(f5Var, m47441x185482f6()));
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = f5Var.f481536f;
                if (c3971x241f78 != null) {
                    getThumbnailProviderManager().e(c3971x241f78, b17);
                }
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }

    public final void n(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        rv0.k5 m47124xf939df19 = m47124xf939df19();
        if (m47124xf939df19 != null) {
            m47124xf939df19.x(segmentID, null);
        }
        j();
    }

    /* renamed from: setIgnoreStartTimeInMedia */
    public final void m47126xc60f964(boolean z17) {
        getThumbnailProviderManager().f325996g = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10941x9ba2abc0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.timelineLayoutType = bx0.i.f117822e;
        getThumbnailProviderManager().f325999j = true;
    }
}
