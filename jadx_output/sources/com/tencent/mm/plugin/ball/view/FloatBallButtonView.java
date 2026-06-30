package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallButtonView;", "Lcom/tencent/mm/plugin/ball/view/BaseFloatBallButtonView;", "", "isLargeMode", "Ljz5/f0;", "setLargeMode", "", "color", "setPlayButtonColor", "setDeleteButtonColor", "Landroid/view/View$OnClickListener;", "clickListener", "setOnPlayButtonClickListener", "setOnDeleteButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FloatBallButtonView extends com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f93469d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93470e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f93471f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93472g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93473h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView
    public void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        setLargeMode(ballInfo.f93053n == 1);
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
        boolean z17 = ballButtonInfo.f93070e;
        boolean z18 = ballButtonInfo.f93071f;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93470e;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        weImageView.setVisibility(z17 ? 0 : 8);
        android.widget.ImageView imageView = this.f93469d;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mPlayButtonShadow");
            throw null;
        }
        imageView.setVisibility(z17 ? 0 : 8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f93470e;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        weImageView2.setEnabled(z18);
        setPlayButtonColor(ballButtonInfo.f93072g);
        boolean z19 = ballButtonInfo.f93073h;
        boolean z27 = ballButtonInfo.f93074i;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f93472g;
        if (weImageView3 == null) {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
        weImageView3.setVisibility(z19 ? 0 : 8);
        android.widget.ImageView imageView2 = this.f93471f;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("mDelButtonShadow");
            throw null;
        }
        imageView2.setVisibility(z19 ? 0 : 8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f93472g;
        if (weImageView4 == null) {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
        weImageView4.setEnabled(z27);
        setDeleteButtonColor(ballButtonInfo.f93075m);
        boolean z28 = ballButtonInfo.f93069d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f93470e;
        if (weImageView5 == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        weImageView5.setImageResource(z28 ? com.tencent.mm.R.raw.float_ball_icon_pause_regular : com.tencent.mm.R.raw.float_ball_icon_specialplay_regular);
        android.widget.ImageView imageView3 = this.f93469d;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("mPlayButtonShadow");
            throw null;
        }
        imageView3.setImageResource(z28 ? com.tencent.mm.R.drawable.f481834cx0 : com.tencent.mm.R.drawable.f481835cx1);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f93470e;
        if (weImageView6 != null) {
            weImageView6.setContentDescription(z28 ? getResources().getString(com.tencent.mm.R.string.f493313lg1) : getResources().getString(com.tencent.mm.R.string.f493314lg2));
        } else {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
    }

    public final void b(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = qp1.e0.a(i17);
        layoutParams.height = qp1.e0.a(i17);
        view.setLayoutParams(layoutParams);
    }

    public final void setDeleteButtonColor(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93472g;
        if (weImageView != null) {
            weImageView.setIconColor(i17);
        } else {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
    }

    public final void setLargeMode(boolean z17) {
        if (this.f93473h != z17) {
            this.f93473h = z17;
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480510zz));
                setLayoutParams(layoutParams);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93470e;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("mPlayButton");
                    throw null;
                }
                b(weImageView, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480512a01));
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f93472g;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("mDeleteButton");
                    throw null;
                }
                b(weImageView2, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480512a01));
                setBackgroundResource(com.tencent.mm.R.drawable.f480881ek);
                android.widget.ImageView imageView = this.f93471f;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("mDelButtonShadow");
                    throw null;
                }
                imageView.setVisibility(8);
                android.widget.ImageView imageView2 = this.f93469d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("mPlayButtonShadow");
                    throw null;
                }
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.height = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480511a00));
            setLayoutParams(layoutParams2);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f93470e;
            if (weImageView3 == null) {
                kotlin.jvm.internal.o.o("mPlayButton");
                throw null;
            }
            b(weImageView3, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480513a02));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f93472g;
            if (weImageView4 == null) {
                kotlin.jvm.internal.o.o("mDeleteButton");
                throw null;
            }
            b(weImageView4, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480513a02));
            setBackground(null);
            android.widget.ImageView imageView3 = this.f93471f;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("mDelButtonShadow");
                throw null;
            }
            imageView3.setVisibility(0);
            android.widget.ImageView imageView4 = this.f93469d;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("mPlayButtonShadow");
                throw null;
            }
            imageView4.setVisibility(0);
            android.widget.ImageView imageView5 = this.f93469d;
            if (imageView5 == null) {
                kotlin.jvm.internal.o.o("mPlayButtonShadow");
                throw null;
            }
            b(imageView5, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480513a02));
            android.widget.ImageView imageView6 = this.f93471f;
            if (imageView6 != null) {
                b(imageView6, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480513a02));
            } else {
                kotlin.jvm.internal.o.o("mDelButtonShadow");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView
    public void setOnDeleteButtonClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93472g;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView
    public void setOnPlayButtonClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93470e;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
    }

    public final void setPlayButtonColor(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93470e;
        if (weImageView != null) {
            weImageView.setIconColor(i17);
        } else {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489204bo4, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kwj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f93470e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s0f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f93469d = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.crz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f93472g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ri_);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f93471f = (android.widget.ImageView) findViewById4;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93472g;
        if (weImageView != null) {
            weImageView.setContentDescription(getResources().getString(com.tencent.mm.R.string.f493312lg0));
            int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f93470e;
            if (weImageView2 != null) {
                weImageView2.setPadding(a17, a17, a17, a17);
                android.widget.ImageView imageView = this.f93469d;
                if (imageView != null) {
                    imageView.setPadding(a17, a17, a17, a17);
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f93472g;
                    if (weImageView3 != null) {
                        weImageView3.setPadding(a17, a17, a17, a17);
                        android.widget.ImageView imageView2 = this.f93471f;
                        if (imageView2 != null) {
                            imageView2.setPadding(a17, a17, a17, a17);
                            return;
                        } else {
                            kotlin.jvm.internal.o.o("mDelButtonShadow");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.o.o("mDeleteButton");
                    throw null;
                }
                kotlin.jvm.internal.o.o("mPlayButtonShadow");
                throw null;
            }
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        kotlin.jvm.internal.o.o("mDeleteButton");
        throw null;
    }
}
