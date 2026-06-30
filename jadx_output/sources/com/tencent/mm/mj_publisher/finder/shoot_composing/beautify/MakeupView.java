package com.tencent.mm.mj_publisher.finder.shoot_composing.beautify;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J1\u0010\b\u001a\u00020\u00052\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u0004\u0018\u00010\nJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fR\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/MakeupView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function2;", "Lnx0/b3;", "Lkotlin/coroutines/Continuation;", "Ljz5/f0;", "", "onMakeupSwitch", "setOnMakeupSwitch", "(Lyz5/p;)V", "Lnx0/c3;", "makeupModel", "setMakeupModel", "getMakeupModel", "getCurrentMakeup", "Lkotlin/Function0;", "onDismiss", "setOnDismissListener", "Landroid/view/View;", "d", "Ljz5/g;", "getPanel", "()Landroid/view/View;", "panel", "Landroidx/recyclerview/widget/RecyclerView;", "e", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MakeupView extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f69607m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g panel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g recyclerView;

    /* renamed from: f, reason: collision with root package name */
    public nx0.b3 f69610f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f69611g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f69612h;

    /* renamed from: i, reason: collision with root package name */
    public nx0.c3 f69613i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MakeupView(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        getPanel().animate().translationY(getPanel().getHeight()).setDuration(100L).withEndAction(new nx0.f3(this)).start();
    }

    public final void b() {
        setVisibility(0);
        getPanel().animate().cancel();
        getPanel().animate().translationY(0.0f).setDuration(100L).start();
    }

    /* renamed from: getCurrentMakeup, reason: from getter */
    public final nx0.b3 getF69610f() {
        return this.f69610f;
    }

    /* renamed from: getMakeupModel, reason: from getter */
    public final nx0.c3 getF69613i() {
        return this.f69613i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMakeupModel(nx0.c3 makeupModel) {
        java.util.List list;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        kotlin.jvm.internal.o.g(makeupModel, "makeupModel");
        this.f69613i = makeupModel;
        java.util.List list2 = makeupModel.f341088a;
        java.util.Iterator it = list2.iterator();
        while (true) {
            list = null;
            objArr = 0;
            if (it.hasNext()) {
                obj = it.next();
                if (((nx0.b3) obj).f341078d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f69610f = (nx0.b3) obj;
        nx0.a3 a3Var = new nx0.a3(list2);
        a3Var.f341068f = new nx0.l3(this, a3Var);
        getRecyclerView().setAdapter(a3Var);
        int itemDecorationCount = getRecyclerView().getItemDecorationCount();
        for (int i17 = 0; i17 < itemDecorationCount; i17++) {
            getRecyclerView().T0(i17);
        }
        getRecyclerView().N(new nx0.m1(list, 1, objArr == true ? 1 : 0));
    }

    public final void setOnDismissListener(yz5.a onDismiss) {
        kotlin.jvm.internal.o.g(onDismiss, "onDismiss");
        this.f69612h = onDismiss;
    }

    public final void setOnMakeupSwitch(yz5.p onMakeupSwitch) {
        kotlin.jvm.internal.o.g(onMakeupSwitch, "onMakeupSwitch");
        this.f69611g = onMakeupSwitch;
    }

    public /* synthetic */ MakeupView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeupView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.panel = jz5.h.a(iVar, new nx0.i3(this));
        this.recyclerView = jz5.h.a(iVar, new nx0.j3(this));
        this.f69611g = new nx0.h3(null);
        this.f69612h = nx0.g3.f341121d;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dwo, this);
        getPanel().setTranslationY(getResources().getDimension(com.tencent.mm.R.dimen.alf));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rwd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        findViewById.setOnClickListener(new nx0.d3(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rw8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        findViewById2.setOnClickListener(new nx0.e3(this));
        getPanel().requestFocus();
    }
}
