package com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000e\u0002\u000fB'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/voice/MCVoiceInputLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkx0/c;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setRecordListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kx0/b", "kx0/d", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MCVoiceInputLayout extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int I = 0;
    public final kx0.g A;
    public final kx0.g B;
    public kx0.c C;
    public final android.graphics.Rect D;
    public final android.graphics.Rect E;
    public boolean F;
    public kx0.d G;
    public kx0.b H;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f69473v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f69474w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f69475x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f69476y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f69477z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MCVoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void A(int i17, int i18) {
        if (this.G == kx0.d.f313244e) {
            boolean contains = this.E.contains(i17, i18);
            com.tencent.mars.xlog.Log.i("MCVoiceInputLayout", "actionUp: cancel endRecord cancel " + contains);
            B(contains);
        }
    }

    public final void B(boolean z17) {
        android.view.View view;
        kx0.c cVar = this.C;
        if (cVar != null) {
            cw0.l0 l0Var = ((cw0.q) cVar).f222668a;
            cw0.d dVar = (cw0.d) l0Var.f69240i;
            if (dVar != null && (view = dVar.G) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "onRecordEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "onRecordEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            kotlinx.coroutines.l.d(l0Var.getMainScope(), null, null, new cw0.o(l0Var, z17, null), 3, null);
        }
        E(kx0.b.f313239d);
        I(kx0.d.f313243d);
    }

    public final void C() {
        android.view.View view = this.f69474w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/voice/MCVoiceInputLayout", "hideCancelButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/voice/MCVoiceInputLayout", "hideCancelButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void D() {
        android.view.View view = this.f69474w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/voice/MCVoiceInputLayout", "showCancelButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/voice/MCVoiceInputLayout", "showCancelButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void E(kx0.b bVar) {
        kx0.b bVar2 = this.H;
        if (bVar2 == bVar) {
            return;
        }
        java.util.Objects.toString(bVar2);
        java.util.Objects.toString(bVar);
        this.H = bVar;
        int ordinal = bVar.ordinal();
        kx0.g gVar = this.B;
        if (ordinal == 0) {
            gVar.d();
            return;
        }
        android.widget.TextView textView = this.f69475x;
        android.widget.TextView textView2 = this.f69476y;
        kx0.g gVar2 = this.A;
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            textView.setVisibility(8);
            textView2.setVisibility(0);
            gVar.d();
            gVar2.e();
            performHapticFeedback(0, 2);
            return;
        }
        this.f69477z.setVisibility(8);
        textView2.setVisibility(8);
        D();
        textView.setVisibility(0);
        gVar.e();
        kx0.f fVar = gVar2.f313255d;
        kx0.f fVar2 = kx0.f.HOVER;
        if (fVar != fVar2) {
            gVar2.f313255d = fVar2;
            gVar2.invalidateSelf();
        }
        performHapticFeedback(0, 2);
    }

    public final void F() {
        if (this.G != kx0.d.f313244e) {
            boolean z17 = this.F;
            android.widget.TextView textView = this.f69477z;
            if (z17) {
                textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479401a22));
            } else {
                textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.acz));
            }
        }
    }

    public final void G() {
        kx0.d dVar = this.G;
        kx0.d dVar2 = kx0.d.f313244e;
        android.widget.TextView textView = this.f69476y;
        if (dVar == dVar2) {
            textView.setText(i65.a.r(getContext(), com.tencent.mm.R.string.h_));
            textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478502m));
            textView.setTranslationY(j65.q.a(getContext()).getDimension(com.tencent.mm.R.dimen.f479673ca));
        } else {
            textView.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f492502h8));
            if (this.F) {
                textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.ac_));
            } else {
                textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479398pp));
            }
            textView.setTranslationY(0.0f);
        }
    }

    public final void I(kx0.d dVar) {
        kx0.d dVar2 = this.G;
        if (dVar == dVar2) {
            return;
        }
        java.util.Objects.toString(dVar2);
        java.util.Objects.toString(dVar);
        this.G = dVar;
        int ordinal = dVar.ordinal();
        android.widget.TextView textView = this.f69477z;
        android.widget.TextView textView2 = this.f69476y;
        kx0.g gVar = this.A;
        if (ordinal == 0) {
            this.f69475x.setVisibility(8);
            C();
            textView2.setVisibility(0);
            G();
            textView.setVisibility(0);
            gVar.d();
            return;
        }
        if (ordinal != 1) {
            return;
        }
        D();
        textView2.setVisibility(0);
        G();
        textView.setVisibility(8);
        gVar.e();
    }

    public final void setRecordListener(kx0.c listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.C = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCVoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kx0.g gVar = new kx0.g(context, kx0.h.RECORD);
        this.A = gVar;
        kx0.g gVar2 = new kx0.g(context, kx0.h.CANCEL);
        this.B = gVar2;
        this.D = new android.graphics.Rect();
        this.E = new android.graphics.Rect();
        this.F = true;
        this.G = kx0.d.f313243d;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.djm, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lok);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f69473v = findViewById;
        findViewById.setLayerType(1, null);
        findViewById.setBackground(gVar);
        findViewById.setEnabled(false);
        gVar.d();
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.b5j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f69474w = findViewById2;
        findViewById2.setLayerType(1, null);
        findViewById2.setBackground(gVar2);
        findViewById2.setEnabled(false);
        gVar2.d();
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f487423ry);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f69475x = textView;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.bhh);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f69476y = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f487463aa3);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f69477z = (android.widget.TextView) findViewById5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/voice/MCVoiceInputLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/voice/MCVoiceInputLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        setOnTouchListener(new kx0.a(this));
        this.H = kx0.b.f313239d;
    }
}
