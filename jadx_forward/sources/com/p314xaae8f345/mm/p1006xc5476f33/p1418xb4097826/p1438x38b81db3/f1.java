package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f184851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184854h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 f184855i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184856m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f184857n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f184858o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f184859p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(boolean z17, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var) {
        super(0);
        this.f184850d = z17;
        this.f184851e = viewGroup;
        this.f184852f = view;
        this.f184853g = view2;
        this.f184854h = view3;
        this.f184855i = x1Var;
        this.f184856m = s0Var;
        this.f184857n = j17;
        this.f184858o = j18;
        this.f184859p = j60Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f184850d;
        android.view.ViewGroup viewGroup = this.f184851e;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            android.view.View view = this.f184852f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f184853g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f184854h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e1(this.f184855i, this.f184856m, this.f184857n, this.f184858o, this.f184859p));
        }
        return jz5.f0.f384359a;
    }
}
