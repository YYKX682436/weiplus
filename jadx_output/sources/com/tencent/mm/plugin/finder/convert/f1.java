package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f103317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f103318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103321h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.x1 f103322i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103323m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f103324n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f103325o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f103326p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(boolean z17, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, com.tencent.mm.plugin.finder.convert.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var) {
        super(0);
        this.f103317d = z17;
        this.f103318e = viewGroup;
        this.f103319f = view;
        this.f103320g = view2;
        this.f103321h = view3;
        this.f103322i = x1Var;
        this.f103323m = s0Var;
        this.f103324n = j17;
        this.f103325o = j18;
        this.f103326p = j60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f103317d;
        android.view.ViewGroup viewGroup = this.f103318e;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            android.view.View view = this.f103319f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f103320g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f103321h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.convert.e1(this.f103322i, this.f103323m, this.f103324n, this.f103325o, this.f103326p));
        }
        return jz5.f0.f302826a;
    }
}
