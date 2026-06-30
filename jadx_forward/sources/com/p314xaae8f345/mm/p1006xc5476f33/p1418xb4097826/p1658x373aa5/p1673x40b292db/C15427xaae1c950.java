package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B%\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/refresh/NewLifeProfileLoaderMoreFooter;", "Lcom/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter;", "", "translationY", "Ljz5/f0;", "setTranslationY", "setForceTranslationY", "Lkotlin/Function0;", "e", "Lyz5/a;", "getCallback", "()Lyz5/a;", "setCallback", "(Lyz5/a;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.refresh.NewLifeProfileLoaderMoreFooter */
/* loaded from: classes2.dex */
public final class C15427xaae1c950 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.a callback;

    public C15427xaae1c950(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final yz5.a getCallback() {
        return this.callback;
    }

    /* renamed from: setCallback */
    public final void m62877x6c4ebec7(yz5.a aVar) {
        this.callback = aVar;
    }

    /* renamed from: setForceTranslationY */
    public final void m62878x57a3ce11(float f17) {
        super.setTranslationY(f17);
    }

    @Override // android.view.View
    public void setTranslationY(float f17) {
        yz5.a aVar = this.callback;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public C15427xaae1c950(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
