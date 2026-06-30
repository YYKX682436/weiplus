package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog;", "Landroid/widget/RelativeLayout;", "Lcw1/r5;", "s", "Lcw1/r5;", "getOnFilterChangeListener", "()Lcw1/r5;", "setOnFilterChangeListener", "(Lcw1/r5;)V", "onFilterChangeListener", "", org.chromium.base.BaseSwitches.V, "isFiltersVisible", "()Z", "setFiltersVisible", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cw1/n5", "cw1/o5", "cw1/p5", "cw1/q5", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CleanFilterDialog extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f95760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95761e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f95762f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f95763g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f95764h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f95765i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f95766m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f95767n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f95768o;

    /* renamed from: p, reason: collision with root package name */
    public long[] f95769p;

    /* renamed from: q, reason: collision with root package name */
    public int f95770q;

    /* renamed from: r, reason: collision with root package name */
    public int f95771r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public cw1.r5 onFilterChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanFilterDialog(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        this.f95760d = context.getColor(com.tencent.mm.R.color.agk);
        this.f95761e = context.getColor(com.tencent.mm.R.color.agj);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.e2s, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.v9o);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q4y);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.aai);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f95762f = findViewById3;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477858dg);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.v9p);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f95763g = (android.widget.TextView) findViewById4;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a4f);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.tau);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f95764h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.taq);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f95766m = findViewById6;
        android.view.View view = this.f95762f;
        if (view != null) {
            view.setOnClickListener(new cw1.t5(findViewById, this, weImageView, findViewById2, loadAnimation));
            findViewById(com.tencent.mm.R.id.sux).setOnClickListener(new cw1.u5(this));
            android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.e4j);
            kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
            this.f95765i = (androidx.recyclerview.widget.RecyclerView) findViewById7;
            findViewById(com.tencent.mm.R.id.ssz).setOnClickListener(new cw1.v5(this));
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc);
            android.view.animation.Animation loadAnimation3 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477854dc);
            findViewById(com.tencent.mm.R.id.v9m).setOnClickListener(new cw1.w5(findViewById, this, loadAnimation2, loadAnimation3, weImageView));
            findViewById(com.tencent.mm.R.id.taq).setOnClickListener(new cw1.x5(findViewById2, this, loadAnimation2, loadAnimation3));
            this.f95768o = new int[0];
            this.f95770q = -1;
            this.f95771r = -1;
            return;
        }
        kotlin.jvm.internal.o.o("background");
        throw null;
    }

    public static final void a(com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, android.widget.TextView textView, boolean z17) {
        if (z17) {
            textView.setTextColor(cleanFilterDialog.f95760d);
            com.tencent.mm.ui.fk.a(textView);
        } else {
            textView.setTextColor(cleanFilterDialog.f95761e);
            com.tencent.mm.ui.fk.c(textView);
        }
    }

    public static final void b(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, java.util.List list) {
        recyclerView.setAdapter(new cw1.n5(cleanFilterDialog, list));
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.B = new cw1.q5(list);
        recyclerView.setLayoutManager(gridLayoutManager);
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView.N(new cw1.p5(context, list));
    }

    public static final void c(long[] jArr, android.widget.TextView[] textViewArr, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, android.widget.Button button, android.widget.TextView textView) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = 0;
        while (true) {
            if (i17 >= 2) {
                break;
            }
            long j17 = jArr[i17];
            android.widget.TextView textView2 = textViewArr[i17];
            calendar.setTimeInMillis(j17);
            textView2.setText(cleanFilterDialog.getContext().getString(com.tencent.mm.R.string.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
            textView2.setTextColor(cleanFilterDialog.getResources().getColor(com.tencent.mm.R.color.f478714f5));
            i17++;
        }
        long j18 = jArr[0];
        boolean z17 = j18 > 0 && jArr[1] > j18;
        button.setEnabled(z17);
        textView.setVisibility(z17 ? 8 : 0);
    }

    public final void d() {
        java.lang.String join;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f95765i;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("filterList");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        cw1.n5 n5Var = adapter instanceof cw1.n5 ? (cw1.n5) adapter : null;
        if (n5Var == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (cw1.o5 o5Var : n5Var.f223181d) {
            if (o5Var.f223203c != 0 && o5Var.f223204d != 0 && o5Var.f223205e) {
                arrayList.add(o5Var.f223201a);
            }
        }
        if (arrayList.isEmpty()) {
            join = "";
        } else {
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(getContext());
            kotlin.jvm.internal.o.d(f17);
            java.lang.String str = "、";
            if (!r26.i0.y(f17, "zh", true) && !r26.i0.y(f17, "ja", true)) {
                str = ", ";
            }
            join = android.text.TextUtils.join(str, arrayList);
        }
        android.widget.TextView textView = this.f95764h;
        if (textView == null) {
            kotlin.jvm.internal.o.o("filterText");
            throw null;
        }
        kotlin.jvm.internal.o.d(join);
        textView.setText(join.length() == 0 ? getContext().getString(com.tencent.mm.R.string.n9l) : getContext().getString(com.tencent.mm.R.string.n9k, join));
    }

    public final cw1.r5 getOnFilterChangeListener() {
        return this.onFilterChangeListener;
    }

    public final void setFiltersVisible(boolean z17) {
        android.view.View view = this.f95766m;
        if (view == null) {
            kotlin.jvm.internal.o.o("filterBtn");
            throw null;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog", "setFiltersVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog", "setFiltersVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setOnFilterChangeListener(cw1.r5 r5Var) {
        this.onFilterChangeListener = r5Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CleanFilterDialog(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CleanFilterDialog(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
