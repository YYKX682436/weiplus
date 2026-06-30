package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\f¨\u0006#"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/crop/CropMaterialTimelineView;", "Lcom/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView;", "Lcom/tencent/maas/moviecomposing/segments/ClipSegment;", "clipSegment", "Ljz5/f0;", "setTargetSegment$plugin_mj_template_release", "(Lcom/tencent/maas/moviecomposing/segments/ClipSegment;)V", "setTargetSegment", "", "y", "Z", "getProhibitSelectStorylineSegment", "()Z", "prohibitSelectStorylineSegment", "Lrv0/k5;", "value", "getAdapter", "()Lrv0/k5;", "setAdapter", "(Lrv0/k5;)V", "adapter", "Lbx0/i;", "getTimelineLayoutType", "()Lbx0/i;", "timelineLayoutType", "enableTrim", "getEnableTrim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView */
/* loaded from: classes5.dex */
public final class C10942x373bdc1d extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final boolean prohibitSelectStorylineSegment;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f150817z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10942x373bdc1d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getAdapter */
    private final rv0.k5 m47127xf939df19() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m47437x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 instanceof rv0.k5) {
            return (rv0.k5) mo7946xf939df19;
        }
        return null;
    }

    /* renamed from: setAdapter */
    private final void m47128x6cab2c8d(rv0.k5 k5Var) {
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
        m47128x6cab2c8d(new rv0.k5(context, timelineVM, timelineLayoutCalc, getThumbnailProviderManager()));
        rv0.k5 m47127xf939df19 = m47127xf939df19();
        if (m47127xf939df19 == null) {
            return true;
        }
        m47127xf939df19.f481626o = new tv0.l0(this);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public void d() {
        gy0.q mainItemDecoration = getMainItemDecoration();
        if (mainItemDecoration != null) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            mainItemDecoration.l(kz5.b0.c(new hy0.y(context)));
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
    public boolean getEnableTrim() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public boolean getProhibitSelectStorylineSegment() {
        return this.prohibitSelectStorylineSegment;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817
    public bx0.i getTimelineLayoutType() {
        return bx0.i.f117826i;
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

    public final void n(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a timeInTimeline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeInTimeline, "timeInTimeline");
        rv0.k5 m47127xf939df19 = m47127xf939df19();
        if (m47127xf939df19 != null) {
            m47127xf939df19.x(segmentID, timeInTimeline);
        }
        j();
    }

    /* renamed from: setTargetSegment$plugin_mj_template_release */
    public final void m47130x52abbc9c(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 clipSegment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipSegment, "clipSegment");
        this.f150817z = clipSegment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10942x373bdc1d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.prohibitSelectStorylineSegment = true;
    }
}
