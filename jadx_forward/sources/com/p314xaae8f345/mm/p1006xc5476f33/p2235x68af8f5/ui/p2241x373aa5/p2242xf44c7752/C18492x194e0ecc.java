package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "Landroid/widget/FrameLayout;", "", "position", "Ljz5/f0;", "setSelection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView */
/* loaded from: classes3.dex */
public final class C18492x194e0ecc extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f253577d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f253578e;

    /* renamed from: f, reason: collision with root package name */
    public final pf4.b f253579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18492x194e0ecc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f253577d = new java.util.ArrayList();
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cwj, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nnt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f253578e = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2240xbddafb2a.C18472x61335774(context, 0, false));
        pf4.b bVar = new pf4.b();
        this.f253579f = bVar;
        c1163xf1deaba4.mo7960x6cab2c8d(bVar);
        c1163xf1deaba4.setFocusable(false);
        c1163xf1deaba4.setVisibility(8);
        setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.bl.c(context));
    }

    public final void a(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        java.util.ArrayList items2 = this.f253577d;
        items2.clear();
        items2.addAll(items);
        pf4.b bVar = this.f253579f;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items2, "items");
        java.util.ArrayList arrayList = bVar.f435379e;
        arrayList.clear();
        arrayList.addAll(items2);
        bVar.m8146xced61ae5();
        int size = items2.size();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f253578e;
        if (size <= 1) {
            c1163xf1deaba4.setVisibility(8);
        } else {
            c1163xf1deaba4.setVisibility(0);
        }
    }

    /* renamed from: setSelection */
    public final void m71477xf579a34a(int i17) {
        pf4.b bVar = this.f253579f;
        int i18 = bVar.f435378d;
        if (i18 != i17) {
            bVar.m8147xed6e4d18(i18);
            bVar.f435378d = i17;
            bVar.m8147xed6e4d18(i17);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f253578e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18492x194e0ecc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
