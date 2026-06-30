package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2292xb01d87d6.p2293x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/ting/membership/view/TingMembershipInfoDialog;", "Lcom/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.membership.view.TingMembershipInfoDialog */
/* loaded from: classes11.dex */
public final class DialogC18718x36d28c3a extends com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2286x2e06d1.p2287x373aa5.AbstractDialogC18712xbaa9ebba {

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f256237s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f256238t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f256239u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f256240v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f256241w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f256242x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f256243y;

    /* renamed from: z, reason: collision with root package name */
    public hl4.b f256244z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC18718x36d28c3a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dcu, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2286x2e06d1.p2287x373aa5.AbstractDialogC18712xbaa9ebba, hg5.d
    public void G() {
        super.G();
        android.view.View view = this.f362936i;
        this.f256237s = view != null ? (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.cg7) : null;
        android.view.View view2 = this.f362936i;
        this.f256238t = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.obc) : null;
        android.view.View view3 = this.f362936i;
        this.f256239u = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2) : null;
        android.view.View view4 = this.f362936i;
        this.f256240v = view4 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.bz6) : null;
        android.view.View view5 = this.f362936i;
        this.f256241w = view5 != null ? (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.khs) : null;
        android.view.View view6 = this.f362936i;
        this.f256242x = view6 != null ? (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.q1n) : null;
        android.widget.TextView textView = this.f256238t;
        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.TextView textView2 = this.f256241w;
        if (textView2 != null) {
            textView2.setOnClickListener(new hl4.c(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f256240v;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new hl4.d(this));
        }
        android.widget.TextView textView3 = this.f256242x;
        if (textView3 != null) {
            textView3.setOnClickListener(new hl4.e(this));
        }
        L(this.f256244z);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2286x2e06d1.p2287x373aa5.AbstractDialogC18712xbaa9ebba
    public int K() {
        return getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561244d5);
    }

    public final void L(hl4.b bVar) {
        android.widget.TextView textView;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (bVar == null) {
            return;
        }
        android.widget.TextView textView2 = this.f256238t;
        if (textView2 != null) {
            textView2.setText(bVar.f363637a);
        }
        android.widget.TextView textView3 = this.f256239u;
        if (textView3 != null) {
            textView3.setText(bVar.f363638b);
        }
        android.widget.TextView textView4 = this.f256241w;
        if (textView4 != null) {
            textView4.setText(bVar.f363639c);
        }
        hl4.a aVar = bVar.f363640d;
        if (aVar == hl4.a.f363634d) {
            android.widget.TextView textView5 = this.f256241w;
            if (textView5 != null) {
                textView5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
                textView5.setTextColor(b3.l.m9703x441695a2(textView5.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
            }
        } else if (aVar == hl4.a.f363635e && (textView = this.f256241w) != null) {
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy);
            textView.setTextColor(b3.l.m9703x441695a2(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
        }
        android.widget.TextView textView6 = this.f256241w;
        if (textView6 != null) {
            if (textView6 == null || (layoutParams = textView6.getLayoutParams()) == null) {
                layoutParams = null;
            } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f363643g;
            }
            textView6.setLayoutParams(layoutParams);
        }
        android.widget.TextView textView7 = this.f256242x;
        if (textView7 != null) {
            textView7.setVisibility(bVar.f363644h ? 0 : 8);
        }
        android.widget.TextView textView8 = this.f256242x;
        if (textView8 != null) {
            textView8.setText(bVar.f363645i);
        }
        if (this.f256237s != null) {
            android.widget.ImageView imageView = bVar.f363647k;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f256243y, imageView)) {
                return;
            }
            android.widget.ImageView imageView2 = this.f256243y;
            if (imageView2 != null && (viewGroup = this.f256237s) != null) {
                viewGroup.removeView(imageView2);
            }
            if (imageView != null) {
                android.view.ViewParent parent = imageView.getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(imageView);
                }
                this.f256243y = imageView;
                android.view.ViewGroup viewGroup3 = this.f256237s;
                if (viewGroup3 != null) {
                    viewGroup3.addView(imageView, 1);
                }
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC18718x36d28c3a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
