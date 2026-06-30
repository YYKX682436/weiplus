package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryPageControlView;", "Lcom/tencent/mm/ui/base/MMPageControlView;", "Lrf4/f2;", "pageControlInterface", "Ljz5/f0;", "setPageIndicatorStatusInterface", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryPageControlView */
/* loaded from: classes12.dex */
public final class C18488xb61acdfe extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18488xb61acdfe(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3
    public void a(int i17) {
        super.a(i17);
        int i18 = this.f279047e;
        int i19 = 0;
        while (i19 < i18) {
            android.widget.ImageView imageView = (android.widget.ImageView) ((java.util.HashMap) this.f279048f).get(java.lang.Integer.valueOf(i19));
            this.f279049g = imageView;
            imageView.setSelected(i17 == i19);
            i19++;
        }
    }

    /* renamed from: setPageIndicatorStatusInterface */
    public final void m71467x69b69a89(rf4.f2 f2Var) {
    }
}
