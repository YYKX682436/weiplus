package com.tencent.mm.feature.ecs.product.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsLabelBoxView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "d", "Lyz5/a;", "getPreOnCLick", "()Lyz5/a;", "setPreOnCLick", "(Lyz5/a;)V", "preOnCLick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsLabelBoxView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a preOnCLick;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f65961e;

    /* renamed from: f, reason: collision with root package name */
    public int f65962f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsLabelBoxView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(bw5.o9 tagListModel) {
        kotlin.jvm.internal.o.g(tagListModel, "tagListModel");
        java.util.List list = this.f65961e;
        ((java.util.ArrayList) list).clear();
        removeAllViews();
        ((java.util.ArrayList) list).clear();
        java.util.LinkedList linkedList = tagListModel.f31018d;
        kotlin.jvm.internal.o.f(linkedList, "getTagItems(...)");
        ((java.util.ArrayList) list).addAll(linkedList);
        if (tagListModel.f31019e > 0) {
            this.f65962f = i65.a.b(getContext(), tagListModel.f31019e);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView ecsRichTextButtonView = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.p9 p9Var = (bw5.p9) next;
            if (p9Var.f31502d == 1) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ecsRichTextButtonView = new com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView(context, null, 0, 6, null);
                bw5.d9 d9Var = p9Var.f31506h[2] ? p9Var.f31503e : new bw5.d9();
                kotlin.jvm.internal.o.f(d9Var, "getText(...)");
                ecsRichTextButtonView.a(d9Var);
                ecsRichTextButtonView.setPreOnCLick(new r20.g(this));
            } else {
                com.tencent.mars.xlog.Log.e("EcsLabelBoxView", "unknown tag type: " + p9Var.f31502d);
            }
            if (ecsRichTextButtonView != null) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
                if (i17 != 0) {
                    marginLayoutParams.setMarginStart(this.f65962f);
                }
                addView(ecsRichTextButtonView, marginLayoutParams);
            }
            i17 = i18;
        }
    }

    public final yz5.a getPreOnCLick() {
        return this.preOnCLick;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        n3.t1 t1Var;
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int mode = android.view.View.MeasureSpec.getMode(i17);
        super.onMeasure(i17, i18);
        if (mode == 0 || size <= 0) {
            return;
        }
        n3.t1 t1Var2 = new n3.t1(this);
        int i19 = size;
        int i27 = 0;
        while (t1Var2.hasNext()) {
            java.lang.Object next = t1Var2.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) next;
            int i29 = i27 == 0 ? 0 : this.f65962f;
            if (view.getMeasuredWidth() + i29 < i19) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                t1Var = t1Var2;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/ecs/product/view/EcsLabelBoxView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/feature/ecs/product/view/EcsLabelBoxView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i19 -= view.getMeasuredWidth() + i29;
            } else {
                t1Var = t1Var2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/feature/ecs/product/view/EcsLabelBoxView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/feature/ecs/product/view/EcsLabelBoxView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            t1Var2 = t1Var;
            i27 = i28;
        }
        setMeasuredDimension(size - i19, getMeasuredHeight());
    }

    public final void setPreOnCLick(yz5.a aVar) {
        this.preOnCLick = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsLabelBoxView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f65961e = new java.util.ArrayList();
        this.f65962f = i65.a.b(context, com.tencent.mm.R.dimen.f479738dv);
        setOrientation(0);
        setGravity(80);
    }
}
