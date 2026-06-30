package ry4;

/* loaded from: classes.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f483156d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f483157e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f483158f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f483159g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.q f483160h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f483161i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f483162m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f483163n;

    /* renamed from: o, reason: collision with root package name */
    public int f483164o;

    public g(java.util.List items, boolean z17, yz5.p onItemClick, yz5.l onSelectionChanged, yz5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSelectionChanged, "onSelectionChanged");
        this.f483156d = items;
        this.f483157e = z17;
        this.f483158f = onItemClick;
        this.f483159g = onSelectionChanged;
        this.f483160h = qVar;
        this.f483163n = new java.util.LinkedHashSet();
    }

    public final void B(android.widget.TextView textView, java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        android.content.Context context = textView.getContext();
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834, context.getTheme());
        int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, context.getTheme());
        int i17 = 0;
        while (i17 < str.length()) {
            int codePointAt = str.codePointAt(i17);
            int charCount = java.lang.Character.charCount(codePointAt);
            boolean z17 = true;
            if (!(128512 <= codePointAt && codePointAt < 128592)) {
                if (!(127744 <= codePointAt && codePointAt < 128512)) {
                    if (!(128640 <= codePointAt && codePointAt < 128768)) {
                        if (!(129280 <= codePointAt && codePointAt < 129536)) {
                            if (!(9728 <= codePointAt && codePointAt < 9984)) {
                                if (!(9984 <= codePointAt && codePointAt < 10176)) {
                                    if (!(65024 <= codePointAt && codePointAt < 65040)) {
                                        if (!(129536 <= codePointAt && codePointAt < 129648)) {
                                            if (!(129648 <= codePointAt && codePointAt < 129792)) {
                                                if (!(8986 <= codePointAt && codePointAt < 8988)) {
                                                    if (!(9642 <= codePointAt && codePointAt < 9644)) {
                                                        if (!(9723 <= codePointAt && codePointAt < 9727)) {
                                                            if (!(9748 <= codePointAt && codePointAt < 9750)) {
                                                                z17 = false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z17) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(color2), i17, i17 + charCount, 33);
            } else {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), i17, i17 + charCount, 33);
            }
            i17 += charCount;
        }
        textView.setText(spannableString);
    }

    public final void E(android.view.View view, int i17, int i18, int i19) {
        boolean z17;
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        boolean z18 = true;
        if (layoutParams2.width != i17) {
            layoutParams2.width = i17;
            z17 = true;
        } else {
            z17 = false;
        }
        if (layoutParams2.getMarginStart() != i18) {
            layoutParams2.setMarginStart(i18);
            z17 = true;
        }
        if (layoutParams2.getMarginEnd() != i19) {
            layoutParams2.setMarginEnd(i19);
        } else {
            z18 = z17;
        }
        if (z18) {
            view.setLayoutParams(layoutParams2);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f483156d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehh, parent, false);
        if (this.f483164o == 0) {
            this.f483164o = parent.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ry4.a(inflate);
    }

    public final void x(ry4.a aVar) {
        if (this.f483157e) {
            android.content.Context context = aVar.f3639x46306858.getContext();
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84, context.getTheme());
            android.widget.TextView textView = aVar.f483099d;
            if (textView != null) {
                textView.setTextColor(color);
            }
            android.widget.TextView textView2 = aVar.f483100e;
            if (textView2 != null) {
                textView2.setTextColor(color);
            }
        }
    }

    public final void y(ry4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8, int i17) {
        if (this.f483162m) {
            android.widget.CheckBox checkBox = aVar.f483101f;
            if (checkBox != null) {
                checkBox.setChecked(this.f483163n.contains(java.lang.Integer.valueOf(i17)));
            }
            aVar.f3639x46306858.setOnClickListener(new ry4.b(aVar, this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = aVar.f483102g;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setOnClickListener(new ry4.c(aVar, this));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = aVar.f483103h;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setOnLongClickListener(new ry4.d(this, aVar));
            }
            aVar.f3639x46306858.setOnLongClickListener(null);
            return;
        }
        android.widget.CheckBox checkBox2 = aVar.f483101f;
        if (checkBox2 != null) {
            checkBox2.setChecked(false);
        }
        aVar.f3639x46306858.setOnClickListener(new ry4.e(this, c19510x90fb7cb8, i17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = aVar.f483102g;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setOnClickListener(null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = aVar.f483103h;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setOnLongClickListener(null);
        }
        if (this.f483157e || this.f483160h == null) {
            aVar.f3639x46306858.setOnLongClickListener(null);
        } else {
            aVar.f3639x46306858.setOnLongClickListener(new ry4.f(aVar, this));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(ry4.a holder, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) this.f483156d.get(i17);
        android.widget.TextView textView = holder.f483099d;
        if (textView != null) {
            textView.setText(c19510x90fb7cb8.a());
        }
        android.widget.TextView textView2 = holder.f483100e;
        if (textView2 != null) {
            textView2.setVisibility(0);
            B(textView2, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19510x90fb7cb8.f269613e) ? c19510x90fb7cb8.c() : c19510x90fb7cb8.a());
        }
        x(holder);
        boolean z18 = this.f483162m;
        int dimensionPixelSize = z18 ? holder.f3639x46306858.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) : 0;
        android.widget.CheckBox checkBox = holder.f483101f;
        E(checkBox, dimensionPixelSize, 0, 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f483102g;
        E(c22699x3dcdb352, dimensionPixelSize, 0, 0);
        int dimensionPixelSize2 = z18 ? holder.f3639x46306858.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs) : 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = holder.f483103h;
        E(c22699x3dcdb3522, dimensionPixelSize, dimensionPixelSize2, 0);
        int dimensionPixelSize3 = z18 ? holder.f3639x46306858.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : 0;
        int dimensionPixelSize4 = z18 ? holder.f3639x46306858.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : 0;
        android.view.View view = holder.f483105m;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                boolean z19 = true;
                if (layoutParams2.getMarginStart() != dimensionPixelSize3) {
                    layoutParams2.setMarginStart(dimensionPixelSize3);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (layoutParams2.getMarginEnd() != dimensionPixelSize4) {
                    layoutParams2.setMarginEnd(dimensionPixelSize4);
                } else {
                    z19 = z17;
                }
                if (z19) {
                    view.setLayoutParams(layoutParams2);
                }
            }
        }
        int dimensionPixelSize5 = z18 ? holder.f3639x46306858.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : 0;
        android.view.View view2 = holder.f483104i;
        if (view2 != null && view2.getPaddingEnd() != dimensionPixelSize5) {
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), dimensionPixelSize5, view2.getPaddingBottom());
        }
        if (z18) {
            if (checkBox != null) {
                checkBox.setVisibility(0);
            }
            if (checkBox != null) {
                checkBox.setTranslationX(0.0f);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setTranslationX(0.0f);
            }
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(0);
            }
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setTranslationX(0.0f);
            }
        } else {
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            if (checkBox != null) {
                checkBox.setTranslationX(0.0f);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setTranslationX(0.0f);
            }
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(8);
            }
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setTranslationX(0.0f);
            }
        }
        y(holder, c19510x90fb7cb8, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        android.widget.CheckBox checkBox;
        ry4.a holder = (ry4.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) this.f483156d.get(i17);
        android.widget.TextView textView = holder.f483099d;
        if (textView != null) {
            textView.setText(c19510x90fb7cb8.a());
        }
        android.widget.TextView textView2 = holder.f483100e;
        if (textView2 != null) {
            textView2.setVisibility(0);
            B(textView2, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19510x90fb7cb8.f269613e) ? c19510x90fb7cb8.c() : c19510x90fb7cb8.a());
        }
        x(holder);
        y(holder, c19510x90fb7cb8, i17);
        if (!payloads.contains("PAYLOAD_SELECTION") || (checkBox = holder.f483101f) == null) {
            return;
        }
        checkBox.setChecked(this.f483163n.contains(java.lang.Integer.valueOf(i17)));
    }
}
