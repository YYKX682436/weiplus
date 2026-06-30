package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj4.c f254820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f254821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f254822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f254823g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mj4.h f254824h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f254825i;

    public i0(nj4.c cVar, android.view.ViewGroup viewGroup, java.lang.String str, android.widget.ImageView imageView, mj4.h hVar, java.lang.String str2) {
        this.f254820d = cVar;
        this.f254821e = viewGroup;
        this.f254822f = str;
        this.f254823g = imageView;
        this.f254824h = hVar;
        this.f254825i = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int size = this.f254820d.f419464f.f419469d.f86668b.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
        android.content.Context context = this.f254821e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4.b(h4Var, context, this.f254822f, 1002, null, null, this.f254823g, null, null, 216, null);
        qj4.s sVar = qj4.s.f445491a;
        mj4.h hVar = this.f254824h;
        qj4.s.n(sVar, 7L, this.f254825i, size, this.f254822f, null, null, 0, 0L, 0L, xe0.j0.a(hVar, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(hVar, false, 1, null).f436758s), null, null, null, 14832, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert$onBindItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
