package com.tencent.mm.plugin.finder.feed.widget;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B#\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b(\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u0016R\u001b\u0010#\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\"¨\u0006-"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView;", "Landroid/widget/LinearLayout;", "Ljd2/m;", "d", "Ljd2/m;", "getListener", "()Ljd2/m;", "setListener", "(Ljd2/m;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/google/android/flexbox/FlexboxLayout;", "f", "Ljz5/g;", "getFirstLineContainer", "()Lcom/google/android/flexbox/FlexboxLayout;", "firstLineContainer", "g", "getSecondLineContainer", "secondLineContainer", "Landroid/widget/TextView;", "h", "getNicknameTV", "()Landroid/widget/TextView;", "nicknameTV", "Landroid/widget/ImageView;", "i", "getAuthIcon", "()Landroid/widget/ImageView;", "authIcon", "m", "getTimeTV", "timeTV", "n", "getFollowBtn", "()Landroid/widget/LinearLayout;", "followBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveMentionTitleView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public jd2.m listener;

    /* renamed from: e, reason: collision with root package name */
    public jd2.e f110980e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g firstLineContainer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g secondLineContainer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g nicknameTV;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g authIcon;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g timeTV;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g followBtn;

    /* renamed from: o, reason: collision with root package name */
    public final int f110987o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMentionTitleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.firstLineContainer = jz5.h.b(new jd2.g(this));
        this.secondLineContainer = jz5.h.b(new jd2.j(this));
        this.nicknameTV = jz5.h.b(new jd2.i(this));
        this.authIcon = jz5.h.b(new jd2.f(this));
        this.timeTV = jz5.h.b(new jd2.k(this));
        this.followBtn = jz5.h.b(new jd2.h(this));
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ead, (android.view.ViewGroup) this, true);
        int indexOfChild = getFirstLineContainer().indexOfChild(getTimeTV());
        if (indexOfChild > 0) {
            this.f110987o = indexOfChild;
        }
    }

    private final android.widget.ImageView getAuthIcon() {
        java.lang.Object value = this.authIcon.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final com.google.android.flexbox.FlexboxLayout getFirstLineContainer() {
        java.lang.Object value = this.firstLineContainer.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.google.android.flexbox.FlexboxLayout) value;
    }

    private final android.widget.LinearLayout getFollowBtn() {
        java.lang.Object value = this.followBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    private final android.widget.TextView getNicknameTV() {
        java.lang.Object value = this.nicknameTV.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final com.google.android.flexbox.FlexboxLayout getSecondLineContainer() {
        java.lang.Object value = this.secondLineContainer.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.google.android.flexbox.FlexboxLayout) value;
    }

    private final android.widget.TextView getTimeTV() {
        java.lang.Object value = this.timeTV.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void a(jd2.e newData) {
        kotlin.jvm.internal.o.g(newData, "newData");
        newData.toString();
        jd2.e eVar = this.f110980e;
        if (eVar != null && kotlin.jvm.internal.o.b(eVar, newData)) {
            com.tencent.mars.xlog.Log.i("FinderLiveMentionTitleView", "skip update data");
            return;
        }
        this.f110980e = newData;
        getFirstLineContainer().setVisibility(0);
        getSecondLineContainer().setVisibility(0);
        getNicknameTV().setText(newData.f299146a);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.tb.a(ya2.m1.f460511a, getAuthIcon(), newData.f299148c, 0, 4, null);
        getTimeTV().setText(newData.f299147b);
        android.widget.LinearLayout followBtn = getFollowBtn();
        int i17 = newData.f299150e ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(followBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView", "updateData", "(Lcom/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        followBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(followBtn, "com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView", "updateData", "(Lcom/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (getFollowBtn().getVisibility() == 0) {
            getFollowBtn().setOnClickListener(new jd2.l(this));
        }
        requestLayout();
    }

    public final void b(boolean z17) {
        jd2.e eVar = this.f110980e;
        if (eVar != null) {
            eVar.f299150e = z17;
        }
        if ((getFollowBtn().getVisibility() == 0) != z17) {
            android.widget.LinearLayout followBtn = getFollowBtn();
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(followBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView", "updateShowFollowBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            followBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(followBtn, "com/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionTitleView", "updateShowFollowBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            requestLayout();
        }
    }

    public final jd2.m getListener() {
        return this.listener;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!kotlin.jvm.internal.o.b(getTimeTV().getParent(), getFirstLineContainer())) {
            if (kotlin.jvm.internal.o.b(getTimeTV().getParent(), getSecondLineContainer())) {
                getSecondLineContainer().removeView(getTimeTV());
            }
            getFirstLineContainer().addView(getTimeTV(), this.f110987o);
        }
        super.onMeasure(i17, i18);
        int measureText = (int) getNicknameTV().getPaint().measureText(com.tencent.mm.plugin.finder.assist.b3.f102022a.j(getNicknameTV().getText().toString(), 4));
        boolean z17 = (getMeasuredWidthAndState() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        getMeasuredWidth();
        getNicknameTV().getMeasuredWidth();
        if (z17 || getNicknameTV().getMeasuredWidth() < measureText) {
            if (kotlin.jvm.internal.o.b(getTimeTV().getParent(), getFirstLineContainer())) {
                getFirstLineContainer().removeView(getTimeTV());
            }
            getSecondLineContainer().addView(getTimeTV());
            getSecondLineContainer().setVisibility(0);
            super.onMeasure(i17, i18);
        }
    }

    public final void setListener(jd2.m mVar) {
        this.listener = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveMentionTitleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.firstLineContainer = jz5.h.b(new jd2.g(this));
        this.secondLineContainer = jz5.h.b(new jd2.j(this));
        this.nicknameTV = jz5.h.b(new jd2.i(this));
        this.authIcon = jz5.h.b(new jd2.f(this));
        this.timeTV = jz5.h.b(new jd2.k(this));
        this.followBtn = jz5.h.b(new jd2.h(this));
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ead, (android.view.ViewGroup) this, true);
        int indexOfChild = getFirstLineContainer().indexOfChild(getTimeTV());
        if (indexOfChild > 0) {
            this.f110987o = indexOfChild;
        }
    }
}
