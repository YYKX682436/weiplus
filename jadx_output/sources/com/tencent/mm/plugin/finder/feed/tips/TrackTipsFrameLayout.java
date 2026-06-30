package com.tencent.mm.plugin.finder.feed.tips;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/tips/TrackTipsFrameLayout;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Led2/m;", "d", "Led2/m;", "getVisibilityManager", "()Led2/m;", "visibilityManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class TrackTipsFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final ed2.m visibilityManager;

    /* renamed from: e, reason: collision with root package name */
    public ed2.j f109065e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackTipsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(yz5.l key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f109065e = (ed2.j) key.invoke(ed2.k.f251275a);
    }

    public final ed2.m getVisibilityManager() {
        return this.visibilityManager;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 != getVisibility()) {
            this.visibilityManager.P6(this.f109065e, i17 == 0);
        }
        super.setVisibility(i17);
    }

    public /* synthetic */ TrackTipsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackTipsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.visibilityManager = ed2.m.f251276f.a(context);
        setVisibility(8);
    }
}
