package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusExpandMoreFriendsView;", "Landroid/widget/LinearLayout;", "", "", "userNameList", "Ljz5/f0;", "setUserNameList", "Landroid/view/View;", "d", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getTvTips", "()Landroid/widget/TextView;", "setTvTips", "(Landroid/widget/TextView;)V", "tvTips", "f", "Landroid/widget/LinearLayout;", "getAvatarLayout", "()Landroid/widget/LinearLayout;", "setAvatarLayout", "(Landroid/widget/LinearLayout;)V", "avatarLayout", "", "g", "I", "getAvatarCountLimit", "()I", "avatarCountLimit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusExpandMoreFriendsView */
/* loaded from: classes.dex */
public final class C18645xc7db3eec extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.view.View root;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView tvTips;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.LinearLayout avatarLayout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int avatarCountLimit;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18645xc7db3eec(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final int getAvatarCountLimit() {
        return this.avatarCountLimit;
    }

    public final android.widget.LinearLayout getAvatarLayout() {
        return this.avatarLayout;
    }

    public final android.view.View getRoot() {
        return this.root;
    }

    public final android.widget.TextView getTvTips() {
        return this.tvTips;
    }

    /* renamed from: setAvatarLayout */
    public final void m71848x53e40f65(android.widget.LinearLayout linearLayout) {
        this.avatarLayout = linearLayout;
    }

    /* renamed from: setRoot */
    public final void m71849x764fb064(android.view.View view) {
        this.root = view;
    }

    /* renamed from: setTvTips */
    public final void m71850x24e51bdc(android.widget.TextView textView) {
        this.tvTips = textView;
    }

    /* renamed from: setUserNameList */
    public final void m71851xd7274436(java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setUserNameList: ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusExpandMoreFriendsView", sb6.toString());
        if (list == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        android.widget.TextView textView = this.tvTips;
        if (textView != null) {
            textView.setText(list.size() == 1 ? getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ma7) : getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ma6, java.lang.Integer.valueOf(list.size())));
        }
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.LinearLayout linearLayout = this.avatarLayout;
        java.util.List<java.lang.String> K0 = kz5.n0.K0(list, this.avatarCountLimit);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        int dimensionPixelOffset = valueOf != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf.intValue()) : 0;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        int dimensionPixelOffset2 = valueOf2 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf2.intValue()) : 0;
        for (java.lang.String str : K0) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            android.view.View view = new android.view.View(context);
            if (linearLayout != null) {
                linearLayout.addView(imageView);
            }
            if (linearLayout != null) {
                linearLayout.addView(view);
            }
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = dimensionPixelOffset;
            }
            if (layoutParams2 != null) {
                layoutParams2.height = dimensionPixelOffset;
            }
            imageView.setAdjustViewBounds(true);
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.width = dimensionPixelOffset2;
            }
            if (layoutParams4 != null) {
                layoutParams4.height = 1;
            }
            imageView.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78922x61de8d17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        }
    }

    public /* synthetic */ C18645xc7db3eec(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18645xc7db3eec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.avatarCountLimit = 3;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dol, this);
        this.root = inflate;
        if (inflate != null) {
            this.tvTips = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oqc);
            this.avatarLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hvl);
        }
    }
}
