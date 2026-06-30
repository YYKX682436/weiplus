package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/FinderSurveyView;", "Landroid/widget/FrameLayout;", "", "Lcom/tencent/mm/plugin/finder/feed/model/a8;", "list", "Ljz5/f0;", "setSurveyList", "Lin5/x;", "Lin5/s0;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setItemClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderSurveyView */
/* loaded from: classes.dex */
public final class C13793x66f13a05 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f187648d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f187649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13793x66f13a05(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f187649e = arrayList;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9t, (android.view.ViewGroup) this, true);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.nsn);
        this.f187648d = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderSurveyView$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zw();
            }
        }, arrayList, false);
        if (c22849x81a93d25 == null) {
            return;
        }
        c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
    }

    /* renamed from: setItemClickListener */
    public final void m56014x9bb105c7(in5.x listener) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f187648d;
        if (c22849x81a93d25 == null || (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) == null || !(mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf)) {
            return;
        }
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19).f374638o = listener;
    }

    /* renamed from: setSurveyList */
    public final void m56015xf435951a(java.util.Collection<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a8> list) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.ArrayList arrayList = this.f187649e;
        arrayList.clear();
        arrayList.addAll(list);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f187648d;
        if (c22849x81a93d25 == null || (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13793x66f13a05(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f187649e = arrayList;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9t, (android.view.ViewGroup) this, true);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.nsn);
        this.f187648d = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderSurveyView$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zw();
            }
        }, arrayList, false);
        if (c22849x81a93d25 == null) {
            return;
        }
        c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
    }
}
