package com.tencent.mm.mj_publisher.finder.shoot_composing.beautify;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J1\u0010\b\u001a\u00020\u00052\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u0004\u0018\u00010\nJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fR\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/FilterView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function2;", "Lnx0/i2;", "Lkotlin/coroutines/Continuation;", "Ljz5/f0;", "", "onFilterSwitch", "setOnFilterSwitch", "(Lyz5/p;)V", "Lnx0/j2;", "filterModel", "setFilterModel", "getFilterModel", "getCurrentFilter", "Lkotlin/Function0;", "onDismiss", "setOnDismissListener", "Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/SeekBarWithValueView;", "d", "Ljz5/g;", "getSeekBar", "()Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/SeekBarWithValueView;", "seekBar", "Landroid/view/View;", "e", "getPanel", "()Landroid/view/View;", "panel", "Landroidx/recyclerview/widget/RecyclerView;", "f", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FilterView extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f69598n = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g seekBar;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g panel;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g recyclerView;

    /* renamed from: g, reason: collision with root package name */
    public nx0.i2 f69602g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f69603h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f69604i;

    /* renamed from: m, reason: collision with root package name */
    public nx0.j2 f69605m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterView(android.content.Context context, android.util.AttributeSet attributeSet) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView getSeekBar() {
        java.lang.Object value = this.seekBar.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView) value;
    }

    public final void b() {
        getPanel().animate().cancel();
        getPanel().animate().translationY(getPanel().getHeight()).setDuration(100L).withEndAction(new nx0.o2(this)).start();
    }

    public final void c() {
        setVisibility(0);
        getPanel().animate().cancel();
        getPanel().animate().translationY(0.0f).setDuration(100L).start();
    }

    /* renamed from: getCurrentFilter, reason: from getter */
    public final nx0.i2 getF69602g() {
        return this.f69602g;
    }

    /* renamed from: getFilterModel, reason: from getter */
    public final nx0.j2 getF69605m() {
        return this.f69605m;
    }

    public final void setFilterModel(nx0.j2 filterModel) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(filterModel, "filterModel");
        this.f69605m = filterModel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (nx0.h2 h2Var : filterModel.f341144a) {
            int size = arrayList.size();
            if (size != 0) {
                arrayList2.add(java.lang.Integer.valueOf(size));
            }
            java.util.Iterator it = h2Var.f341127b.iterator();
            while (it.hasNext()) {
                arrayList.add((nx0.i2) it.next());
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (it6.hasNext()) {
                obj = it6.next();
                if (((nx0.i2) obj).f341135d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        nx0.i2 i2Var = (nx0.i2) obj;
        this.f69602g = i2Var;
        if ((i2Var == null || i2Var.a()) ? false : true) {
            getSeekBar().setVisibility(0);
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.SeekBarWithValueView seekBar = getSeekBar();
            nx0.i2 i2Var2 = this.f69602g;
            kotlin.jvm.internal.o.d(i2Var2);
            seekBar.setProgress(a06.d.b(i2Var2.f341136e * 100));
        } else {
            getSeekBar().setVisibility(4);
        }
        nx0.g2 g2Var = new nx0.g2(arrayList);
        g2Var.f341120f = new nx0.u2(this, g2Var);
        getRecyclerView().setAdapter(g2Var);
        int itemDecorationCount = getRecyclerView().getItemDecorationCount();
        for (int i17 = 0; i17 < itemDecorationCount; i17++) {
            getRecyclerView().T0(i17);
        }
        getRecyclerView().N(new nx0.m1(arrayList2));
    }

    public final void setOnDismissListener(yz5.a onDismiss) {
        kotlin.jvm.internal.o.g(onDismiss, "onDismiss");
        this.f69604i = onDismiss;
    }

    public final void setOnFilterSwitch(yz5.p onFilterSwitch) {
        kotlin.jvm.internal.o.g(onFilterSwitch, "onFilterSwitch");
        this.f69603h = onFilterSwitch;
    }

    public /* synthetic */ FilterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.seekBar = jz5.h.a(iVar, new nx0.t2(this));
        this.panel = jz5.h.a(iVar, new nx0.r2(this));
        this.recyclerView = jz5.h.a(iVar, new nx0.s2(this));
        this.f69603h = new nx0.q2(null);
        this.f69604i = nx0.p2.f341199d;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dd_, this);
        getPanel().setTranslationY(getResources().getDimension(com.tencent.mm.R.dimen.ale));
        getSeekBar().setOnSeekBarChangeListener(new nx0.l2(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rkr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        findViewById.setOnClickListener(new nx0.m2(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rko);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        findViewById2.setOnClickListener(new nx0.n2(this));
        getPanel().requestFocus();
    }
}
