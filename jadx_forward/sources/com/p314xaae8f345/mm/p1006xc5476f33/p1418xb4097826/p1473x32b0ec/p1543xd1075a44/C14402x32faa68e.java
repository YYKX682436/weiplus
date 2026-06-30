package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveLocSingleTagLayout;", "Lcom/tencent/mm/ui/base/MMSingelLinePanel;", "", dm.i4.f66865x76d1ec5a, "Ljz5/f0;", "setTagView", "Lcom/tencent/mm/plugin/finder/live/widget/ao;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f, "Lcom/tencent/mm/plugin/finder/live/widget/ao;", "getOnTagClickListener", "()Lcom/tencent/mm/plugin/finder/live/widget/ao;", "setOnTagClickListener", "(Lcom/tencent/mm/plugin/finder/live/widget/ao;)V", "onTagClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout */
/* loaded from: classes3.dex */
public final class C14402x32faa68e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21513x4f979dda {
    public java.lang.Integer V;

    /* renamed from: W, reason: from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ao onTagClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14402x32faa68e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21513x4f979dda, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ao getOnTagClickListener() {
        return this.onTagClickListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public android.widget.TextView j() {
        java.lang.Integer num = this.V;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(num != null ? num.intValue() : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570500eb5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return (android.widget.TextView) inflate;
    }

    /* renamed from: setOnTagClickListener */
    public final void m57912x12498e3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ao aoVar) {
        this.onTagClickListener = aoVar;
    }

    /* renamed from: setTagView */
    public final void m57913x54eb9a9d(int i17) {
        this.V = java.lang.Integer.valueOf(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public void u(android.widget.TextView textView, boolean z17, boolean z18) {
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bo(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14402x32faa68e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
