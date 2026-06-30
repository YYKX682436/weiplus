package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsBarrageBoxView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.view.EcsBarrageBoxView */
/* loaded from: classes9.dex */
public final class C10557x47452fe5 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f147475d;

    /* renamed from: e, reason: collision with root package name */
    public final long f147476e;

    /* renamed from: f, reason: collision with root package name */
    public final long f147477f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f147478g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f147479h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f147480i;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.Animator f147481m;

    /* renamed from: n, reason: collision with root package name */
    public final int f147482n;

    /* renamed from: o, reason: collision with root package name */
    public int f147483o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f147484p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f147485q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10557x47452fe5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void a(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10557x47452fe5 c10557x47452fe5) {
        java.util.ArrayList arrayList = (java.util.ArrayList) c10557x47452fe5.f147480i;
        if (arrayList.isEmpty()) {
            return;
        }
        int childCount = c10557x47452fe5.getChildCount();
        int i17 = c10557x47452fe5.f147475d;
        if (childCount < i17) {
            return;
        }
        android.view.View childAt = c10557x47452fe5.getChildAt(0);
        if (childAt.getHeight() == 0) {
            c10557x47452fe5.post(new r20.b(c10557x47452fe5));
            return;
        }
        float height = childAt.getHeight() + c10557x47452fe5.f147482n;
        bw5.d9 d9Var = (bw5.d9) arrayList.get((c10557x47452fe5.f147483o + i17) % arrayList.size());
        android.view.View inflate = android.view.View.inflate(c10557x47452fe5.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e4_, null);
        ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10562xfadc7655) inflate.findViewById(com.p314xaae8f345.mm.R.id.azj)).a(d9Var);
        inflate.setTranslationY((i17 + 1) * height);
        c10557x47452fe5.addView(inflate);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        c10557x47452fe5.f147481m = ofFloat;
        ofFloat.setDuration(c10557x47452fe5.f147476e);
        ofFloat.addListener(new r20.a(c10557x47452fe5, childAt));
        ofFloat.addUpdateListener(new r20.c(c10557x47452fe5, childAt, q26.h0.y(q26.h0.o(new n3.r1(c10557x47452fe5), r20.d.f450306d)), height));
        ofFloat.start();
    }

    public final void b() {
        if (this.f147485q || !isAttachedToWindow() || !this.f147484p || ((java.util.ArrayList) this.f147480i).size() <= this.f147475d) {
            return;
        }
        this.f147485q = true;
        this.f147478g.postDelayed(this.f147479h, this.f147477f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        super.onMeasure(i17, i18);
        if (!(!q26.h0.y(new n3.r1(this)).isEmpty()) || (i19 = this.f147475d) <= 0) {
            return;
        }
        float measuredHeight = getChildAt(0).getMeasuredHeight() + this.f147482n;
        java.util.List list = this.f147480i;
        if (((java.util.ArrayList) list).size() <= i19) {
            i19 = ((java.util.ArrayList) list).size();
        }
        setMeasuredDimension(getMeasuredWidth(), (int) (measuredHeight * (i19 + 1)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10557x47452fe5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f147475d = 2;
        this.f147476e = 500L;
        this.f147477f = 2000L;
        this.f147478g = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f147479h = new r20.e(this);
        this.f147480i = new java.util.ArrayList();
        this.f147482n = i65.a.b(context, 4);
    }
}
