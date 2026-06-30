package com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/maas/base/MJID;", "getSelectedClipSegmentID", "getSelectedSegmentID$plugin_mj_template_release", "()Lcom/tencent/maas/base/MJID;", "getSelectedSegmentID", "Lrw0/b;", "callback", "Ljz5/f0;", "setDescClickCallback", "Landroid/widget/TextView;", "e", "Ljz5/g;", "getTvDesc", "()Landroid/widget/TextView;", "tvDesc", "Landroid/widget/ImageView;", "f", "getDeleteButton", "()Landroid/widget/ImageView;", "deleteButton", "Lpw0/i;", "g", "getSegmentAdapter", "()Lpw0/i;", "segmentAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "h", "getRvSegments", "()Landroidx/recyclerview/widget/RecyclerView;", "rvSegments", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SetContentDescView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public rw0.b f69332d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g tvDesc;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g deleteButton;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g segmentAdapter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g rvSegments;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetContentDescView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final android.widget.ImageView getDeleteButton() {
        java.lang.Object value = ((jz5.n) this.deleteButton).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final androidx.recyclerview.widget.RecyclerView getRvSegments() {
        java.lang.Object value = ((jz5.n) this.rvSegments).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pw0.i getSegmentAdapter() {
        return (pw0.i) ((jz5.n) this.segmentAdapter).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.maas.base.MJID getSelectedClipSegmentID() {
        java.lang.Object obj;
        java.util.Iterator it = getSegmentAdapter().f275970d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((vv0.n) obj).f440401d) {
                break;
            }
        }
        vv0.n nVar = (vv0.n) obj;
        if (nVar != null) {
            return nVar.f440398a;
        }
        return null;
    }

    private final android.widget.TextView getTvDesc() {
        java.lang.Object value = ((jz5.n) this.tvDesc).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void c(java.util.List list, int i17) {
        kotlin.jvm.internal.o.g(list, "list");
        getSegmentAdapter().y(list);
        e(i17);
    }

    public final void d(com.tencent.maas.base.MJID segmentID, java.lang.String desc) {
        int i17;
        float f17;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(desc, "desc");
        getTvDesc().setText(desc);
        boolean z17 = desc.length() > 0;
        getDeleteButton().setVisibility(desc.length() > 0 ? 0 : 8);
        java.util.ArrayList arrayList = getSegmentAdapter().f275970d;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (kotlin.jvm.internal.o.b(((vv0.n) it.next()).f440398a, segmentID)) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            vv0.n nVar = (vv0.n) kz5.n0.a0(arrayList, i17);
            if (nVar != null) {
                getSegmentAdapter().x(i17, vv0.n.a(nVar, null, null, 0, false, z17, 15, null));
            }
        }
        if (z17) {
            rv0.a7 a7Var = rv0.b7.f399942d;
            f17 = 1.0f;
        } else {
            rv0.a7 a7Var2 = rv0.b7.f399942d;
            f17 = 0.3f;
        }
        fv0.a aVar = fv0.a.f266950v;
        android.view.View findViewWithTag = findViewWithTag(aVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewWithTag, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView", "setContentDesc", "(Lcom/tencent/maas/base/MJID;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView", "setContentDesc", "(Lcom/tencent/maas/base/MJID;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag(aVar).setEnabled(z17);
    }

    public final void e(int i17) {
        pw0.i segmentAdapter = getSegmentAdapter();
        segmentAdapter.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = segmentAdapter.f275970d;
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            vv0.n nVar = (vv0.n) obj;
            if (nVar.f440401d) {
                linkedHashMap.put(java.lang.Integer.valueOf(i18), vv0.n.a(nVar, null, null, 0, false, false, 23, null));
            }
            i18 = i19;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            vv0.n nVar2 = (vv0.n) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (nVar2 != null) {
                arrayList.set(intValue, nVar2);
                segmentAdapter.notifyItemChanged(intValue);
            }
        }
        vv0.n nVar3 = (vv0.n) kz5.n0.a0(getSegmentAdapter().f275970d, i17);
        if (nVar3 != null) {
            getSegmentAdapter().x(i17, vv0.n.a(nVar3, null, null, 0, true, false, 23, null));
        }
    }

    public final void f(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        java.util.Iterator it = getSegmentAdapter().f275970d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((vv0.n) it.next()).f440398a, segmentID)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            e(i17);
        }
    }

    public final com.tencent.maas.base.MJID getSelectedSegmentID$plugin_mj_template_release() {
        java.lang.Object obj;
        java.util.Iterator it = getSegmentAdapter().f275970d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((vv0.n) obj).f440401d) {
                break;
            }
        }
        vv0.n nVar = (vv0.n) obj;
        if (nVar != null) {
            return nVar.f440398a;
        }
        return null;
    }

    public final void setDescClickCallback(rw0.b callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f69332d = callback;
    }

    public /* synthetic */ SetContentDescView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetContentDescView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.tvDesc = jz5.h.b(new vw0.r(this));
        this.deleteButton = jz5.h.b(new vw0.n(this));
        this.segmentAdapter = jz5.h.b(new vw0.q(this));
        this.rvSegments = jz5.h.b(new vw0.o(this));
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dgb, this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f484058o5);
        by0.v vVar = by0.v.f36351a;
        kotlin.jvm.internal.o.d(viewGroup);
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f266950v, com.tencent.mm.R.string.f492513iu, com.tencent.mm.R.drawable.f481033n3, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new vw0.k(this)));
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = vVar.b(this) + j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480554ag2);
            viewGroup.setLayoutParams(layoutParams2);
            androidx.recyclerview.widget.RecyclerView rvSegments = getRvSegments();
            rvSegments.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
            androidx.recyclerview.widget.n2 itemAnimator = rvSegments.getItemAnimator();
            androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
            if (o3Var != null) {
                o3Var.f12182g = false;
            }
            rvSegments.N(new lv0.c((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 4), (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 12), 0, 0, 0, null, 60, null));
            rvSegments.N(new pw0.c(context));
            rvSegments.setAdapter(getSegmentAdapter());
            getTvDesc().setOnClickListener(new vw0.l(this));
            getDeleteButton().setOnClickListener(new vw0.m(this));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
