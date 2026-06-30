package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\r\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/TingChatRoomView;", "Landroid/widget/RelativeLayout;", "", "color", "Ljz5/f0;", "setContainerBackgroundColor", "d", "Ljz5/g;", "getCornerRadius", "()I", "cornerRadius", "e", "getCoverSize", "coverSize", "", "q", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "categoryId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.widget.TingChatRoomView */
/* loaded from: classes9.dex */
public final class C18737x1ba35fc6 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cornerRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g coverSize;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f256406f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f256407g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f256408h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f256409i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f256410m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f256411n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f256412o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f256413p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public java.lang.String categoryId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18737x1ba35fc6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCornerRadius */
    public final int m72282x83bb89bd() {
        return ((java.lang.Number) ((jz5.n) this.cornerRadius).mo141623x754a37bb()).intValue();
    }

    /* renamed from: getCoverSize */
    private final int m72283x756d65a2() {
        return ((java.lang.Number) ((jz5.n) this.coverSize).mo141623x754a37bb()).intValue();
    }

    public final void b(nm4.m liveState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveState, "liveState");
        int ordinal = liveState.ordinal();
        if (ordinal == 0) {
            android.widget.FrameLayout frameLayout = this.f256409i;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.widget.FrameLayout frameLayout2 = this.f256409i;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
            frameLayout2.setVisibility(0);
            android.widget.TextView textView = this.f256408h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveText");
                throw null;
            }
            textView.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.omi));
            android.widget.FrameLayout frameLayout3 = this.f256409i;
            if (frameLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
            android.graphics.drawable.Drawable background = frameLayout3.getBackground();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) background;
            gradientDrawable.setColor(-1725618907);
            if (this.f256409i != null) {
                gradientDrawable.setCornerRadius(r2.getHeight() / 2.0f);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveContainer");
                throw null;
            }
        }
        if (ordinal != 2) {
            return;
        }
        android.widget.FrameLayout frameLayout4 = this.f256409i;
        if (frameLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveContainer");
            throw null;
        }
        frameLayout4.setVisibility(0);
        android.widget.TextView textView2 = this.f256408h;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveText");
            throw null;
        }
        textView2.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.omj));
        android.widget.FrameLayout frameLayout5 = this.f256409i;
        if (frameLayout5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveContainer");
            throw null;
        }
        android.graphics.drawable.Drawable background2 = frameLayout5.getBackground();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        android.graphics.drawable.GradientDrawable gradientDrawable2 = (android.graphics.drawable.GradientDrawable) background2;
        gradientDrawable2.setColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        if (this.f256409i != null) {
            gradientDrawable2.setCornerRadius(r2.getHeight() / 2.0f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomLiveContainer");
            throw null;
        }
    }

    public final void c(r45.lm6 tingCategoryViewData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingCategoryViewData, "tingCategoryViewData");
        android.widget.TextView textView = this.f256411n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomTitle");
            throw null;
        }
        textView.setText(tingCategoryViewData.f461170d);
        if (tingCategoryViewData.f461172f != null) {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            java.lang.String tingCategoryCoverUrl = tingCategoryViewData.f461172f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingCategoryCoverUrl, "tingCategoryCoverUrl");
            android.widget.ImageView imageView = this.f256410m;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomHeadImage");
                throw null;
            }
            ((dl4.m0) tVar).bj(tingCategoryCoverUrl, imageView, null);
        }
        java.util.LinkedList covers = tingCategoryViewData.f461177n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(covers, "covers");
        java.lang.String str = (java.lang.String) kz5.n0.Z(covers);
        if (str == null) {
            android.widget.ImageView imageView2 = this.f256413p;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatCoverImage");
                throw null;
            }
        }
        ff0.t tVar2 = (ff0.t) i95.n0.c(ff0.t.class);
        android.widget.ImageView imageView3 = this.f256413p;
        if (imageView3 != null) {
            ((dl4.m0) tVar2).bj(str, imageView3, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatCoverImage");
            throw null;
        }
    }

    public final java.lang.String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: setCategoryId */
    public final void m72285x69ac84bb(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.categoryId = str;
    }

    /* renamed from: setContainerBackgroundColor */
    public final void m72286xefe20a96(int i17) {
        android.view.View view = this.f256406f;
        if (view != null) {
            view.setBackgroundColor(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomContainer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18737x1ba35fc6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.cornerRadius = jz5.h.b(new nm4.n(this));
        this.coverSize = jz5.h.b(new nm4.o(this));
        this.categoryId = "";
        nm4.m mVar = nm4.m.f420033d;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571107eq2, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568850vf4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f256406f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568849vf3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f256407g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vf8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f256408h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vf6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f256410m = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vf_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f256411n = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vf9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f256412o = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568851vf5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f256413p = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vf7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f256409i = (android.widget.FrameLayout) findViewById8;
        android.widget.ImageView imageView = this.f256407g;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d9y);
            android.widget.TextView textView = this.f256412o;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.omh);
                setClipToOutline(true);
                setOutlineProvider(new nm4.p(this));
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomSubtitle");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingChatRoomBackGround");
        throw null;
    }
}
