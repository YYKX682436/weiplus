package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/custom/LiveCustomRoomLayoutView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgi2/f;", "Lgi2/d;", "Lxh2/a;", "adapter", "Ljz5/f0;", "setAdapter", "getAdapter", "", "visibility", "setVisibility", "", "alpha", "setAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView */
/* loaded from: classes10.dex */
public class C14233xcca2a527 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 implements gi2.f {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f193232v;

    /* renamed from: w, reason: collision with root package name */
    public gi2.d f193233w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14233xcca2a527(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193232v = "LiveVoiceRoomLayoutView_" + hashCode();
    }

    /* renamed from: getAdapter, reason: from getter */
    public final gi2.d getF193233w() {
        return this.f193233w;
    }

    /* renamed from: setAdapter */
    public void m56838x6cab2c8d(gi2.d adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f193233w = adapter;
        adapter.f353800a = this;
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193232v, "setAlpha alpha: " + f17);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193232v, "setVisibility visibility: " + i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14233xcca2a527(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193232v = "LiveVoiceRoomLayoutView_" + hashCode();
    }
}
