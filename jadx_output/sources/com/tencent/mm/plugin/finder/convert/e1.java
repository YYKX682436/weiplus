package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.x1 f103212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f103214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f103215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f103216h;

    public e1(com.tencent.mm.plugin.finder.convert.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var) {
        this.f103212d = x1Var;
        this.f103213e = s0Var;
        this.f103214f = j17;
        this.f103215g = j18;
        this.f103216h = j60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f103212d.t(this.f103213e, this.f103214f, this.f103215g, this.f103216h, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$handleImageLoadStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
