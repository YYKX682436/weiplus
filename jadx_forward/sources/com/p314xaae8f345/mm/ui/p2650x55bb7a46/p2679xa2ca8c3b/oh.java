package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class oh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f286739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f286740h;

    public oh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, yb5.d dVar, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map) {
        this.f286740h = c21908xb66fd105;
        this.f286736d = dVar;
        this.f286737e = str;
        this.f286738f = f9Var;
        this.f286739g = map;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f286740h;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.y5 y5Var = c21908xb66fd105.f284760h;
        yb5.d dVar = this.f286736d;
        if (y5Var == null) {
            c21908xb66fd105.f284760h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.y5(dVar);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.y5 y5Var2 = c21908xb66fd105.f284760h;
        if (y5Var2 != null) {
            y5Var2.onClick(view);
        }
        c21908xb66fd105.s1(10, dVar.x(), this.f286737e);
        tb5.a.f498558a.a(5, c21908xb66fd105.X, dVar.x(), c21908xb66fd105.Y);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286738f;
        tb5.o0.c(dVar, f9Var, this.f286739g, 10);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 4, f9Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
