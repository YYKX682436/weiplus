package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/sns/ui/widget/c1", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView */
/* loaded from: classes.dex */
public final class C18408xcca3e490 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f252371d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f252372e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f252373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18408xcca3e490(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f252371d = "MicroMsg.SnsAlbumThumbStateIconView";
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ctx, (android.view.ViewGroup) this, true);
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c1 state) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showIconFG2", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        c(state, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showIconFG2", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c1 state) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showIconWhite", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        c(state, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz), false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showIconWhite", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c1 c1Var, int i17, boolean z17) {
        android.graphics.drawable.Drawable e17;
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
        if (this.f252372e == null) {
            this.f252372e = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.h7l);
        }
        if (this.f252373f == null) {
            android.widget.FrameLayout frameLayout2 = this.f252372e;
            this.f252373f = frameLayout2 != null ? (android.widget.ImageView) frameLayout2.findViewById(com.p314xaae8f345.mm.R.id.h7k) : null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f252371d, "showIconWithState state: " + c1Var);
        int ordinal = c1Var.ordinal();
        if (ordinal == 0) {
            e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79759x10b2fd29, i17);
        } else if (ordinal == 1) {
            e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79789xc850b843, i17);
        } else {
            if (ordinal != 2) {
                jz5.j jVar = new jz5.j();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
                throw jVar;
            }
            e17 = i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.bl8);
        }
        if (e17 != null) {
            if (z17 && (frameLayout = this.f252372e) != null) {
                frameLayout.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.b2t));
            }
            android.widget.ImageView imageView = this.f252373f;
            if (imageView != null) {
                imageView.setImageDrawable(e17);
            }
            android.widget.ImageView imageView2 = this.f252373f;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showIconWithState", "com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18408xcca3e490(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
