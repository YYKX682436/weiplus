package com.tencent.mm.mj_publisher.finder.shoot_composing.beautify;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J1\u0010\b\u001a\u00020\u00052\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u0004\u0018\u00010\nJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fR\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FaceEffectView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function2;", "Lnx0/r1;", "Lkotlin/coroutines/Continuation;", "Ljz5/f0;", "", "onFaceEffectSwitch", "setOnFaceEffectSwitch", "(Lyz5/p;)V", "Lnx0/s1;", "faceEffectModel", "setFaceEffectModel", "getFaceEffectModel", "getCurrentFaceEffect", "Lkotlin/Function0;", "onDismiss", "setOnDismissListener", "Landroid/view/View;", "d", "Ljz5/g;", "getPanel", "()Landroid/view/View;", "panel", "Landroidx/recyclerview/widget/RecyclerView;", "e", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FaceEffectView extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f69591m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g panel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g recyclerView;

    /* renamed from: f, reason: collision with root package name */
    public nx0.r1 f69594f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f69595g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f69596h;

    /* renamed from: i, reason: collision with root package name */
    public nx0.s1 f69597i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceEffectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final android.view.View getPanel() {
        java.lang.Object value = this.panel.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        java.lang.Object value = this.recyclerView.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final void a() {
        getPanel().animate().cancel();
        getPanel().animate().translationY(getPanel().getHeight()).setDuration(100L).withEndAction(new nx0.v1(this)).start();
    }

    public final void b() {
        setVisibility(0);
        getPanel().animate().cancel();
        getPanel().animate().translationY(0.0f).setDuration(100L).start();
    }

    /* renamed from: getCurrentFaceEffect, reason: from getter */
    public final nx0.r1 getF69594f() {
        return this.f69594f;
    }

    /* renamed from: getFaceEffectModel, reason: from getter */
    public final nx0.s1 getF69597i() {
        return this.f69597i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFaceEffectModel(nx0.s1 faceEffectModel) {
        java.util.List list;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        kotlin.jvm.internal.o.g(faceEffectModel, "faceEffectModel");
        this.f69597i = faceEffectModel;
        java.util.List list2 = faceEffectModel.f341223a;
        java.util.Iterator it = list2.iterator();
        while (true) {
            list = null;
            objArr = 0;
            if (it.hasNext()) {
                obj = it.next();
                if (((nx0.r1) obj).f341213d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f69594f = (nx0.r1) obj;
        nx0.q1 q1Var = new nx0.q1(list2);
        q1Var.f341204f = new nx0.b2(this, q1Var);
        getRecyclerView().setAdapter(q1Var);
        int itemDecorationCount = getRecyclerView().getItemDecorationCount();
        for (int i17 = 0; i17 < itemDecorationCount; i17++) {
            getRecyclerView().T0(i17);
        }
        getRecyclerView().N(new nx0.m1(list, 1, objArr == true ? 1 : 0));
    }

    public final void setOnDismissListener(yz5.a onDismiss) {
        kotlin.jvm.internal.o.g(onDismiss, "onDismiss");
        this.f69596h = onDismiss;
    }

    public final void setOnFaceEffectSwitch(yz5.p onFaceEffectSwitch) {
        kotlin.jvm.internal.o.g(onFaceEffectSwitch, "onFaceEffectSwitch");
        this.f69595g = onFaceEffectSwitch;
    }

    public /* synthetic */ FaceEffectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceEffectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.panel = jz5.h.a(iVar, new nx0.y1(this));
        this.recyclerView = jz5.h.a(iVar, new nx0.z1(this));
        this.f69595g = new nx0.x1(null);
        this.f69596h = nx0.w1.f341257d;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dwk, this);
        getPanel().setTranslationY(getResources().getDimension(com.tencent.mm.R.dimen.ald));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rkb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        findViewById.setOnClickListener(new nx0.t1(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rk6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        findViewById2.setOnClickListener(new nx0.u1(this));
        getPanel().requestFocus();
    }
}
