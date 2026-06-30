package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class uh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f287223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287224g;

    public uh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map) {
        this.f287224g = c21908xb66fd105;
        this.f287221d = str;
        this.f287222e = f9Var;
        this.f287223f = map;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287224g;
        yb5.d dVar = c21908xb66fd105.f284708s;
        if (c21908xb66fd105.f284760h == null) {
            c21908xb66fd105.f284760h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.y5(dVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.y5 y5Var = c21908xb66fd105.f284760h;
        if (y5Var != null) {
            y5Var.onClick(view);
        }
        tb5.a.f498558a.a(5, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y);
        c21908xb66fd105.s1(10, c21908xb66fd105.f284708s.x(), this.f287221d);
        yb5.d dVar2 = c21908xb66fd105.f284708s;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287222e;
        java.util.Map map = this.f287223f;
        tb5.o0.c(dVar2, f9Var, map, 10);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag(), map);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
