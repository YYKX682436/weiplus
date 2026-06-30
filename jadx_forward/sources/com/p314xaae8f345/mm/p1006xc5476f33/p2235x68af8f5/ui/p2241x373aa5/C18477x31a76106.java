package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryAvatarItemView;", "Landroid/widget/RelativeLayout;", "", dm.i4.f66875xa013b0d5, "Ljz5/f0;", "setAvatar", "", "count", "setTipCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryAvatarItemView */
/* loaded from: classes.dex */
public final class C18477x31a76106 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f253457d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f253458e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f253459f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f253460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18477x31a76106(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        this.f253457d = i65.a.b(getContext(), 2);
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cw7, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568652nk3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f253458e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568653nk4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f253459f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f568654nk5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f253460g = (android.widget.TextView) findViewById3;
    }

    /* renamed from: setAvatar */
    public final void m71410x47f185b(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = this.f253458e;
        wVar.Ri(imageView, username, 0.5f);
        imageView.setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b3u));
        int i17 = this.f253457d;
        imageView.setPadding(i17, i17, i17, i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        android.widget.TextView textView = this.f253459f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize));
    }

    /* renamed from: setTipCount */
    public final void m71411xfe0c67b6(int i17) {
        android.widget.TextView textView = this.f253460g;
        if (i17 <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(java.lang.String.valueOf(i17));
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18477x31a76106(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        this.f253457d = i65.a.b(getContext(), 2);
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cw7, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568652nk3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f253458e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568653nk4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f253459f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f568654nk5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f253460g = (android.widget.TextView) findViewById3;
    }
}
