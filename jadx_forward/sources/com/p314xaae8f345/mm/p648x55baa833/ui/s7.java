package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class s7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in.b f146039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.z7 f146040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f146041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146042g;

    public s7(in.b bVar, com.p314xaae8f345.mm.p648x55baa833.ui.z7 z7Var, android.content.Context context, java.lang.String str) {
        this.f146039d = bVar;
        this.f146040e = z7Var;
        this.f146041f = context;
        this.f146042g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        in.b bVar = this.f146039d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(bVar.f374251d.f374254d, true);
        java.lang.String P0 = n17.P0();
        java.lang.String g27 = n17.g2();
        com.p314xaae8f345.mm.p648x55baa833.ui.z7 z7Var = this.f146040e;
        android.content.Context context = this.f146041f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.lang.String str = this.f146042g;
        java.lang.String userName = bVar.f374251d.f374254d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
        java.lang.String ticket = ((in.a) bVar.f374253f.get(0)).f374248e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ticket, "ticket");
        com.p314xaae8f345.mm.p648x55baa833.ui.z7.i(z7Var, context, str, userName, P0, g27, false, ticket);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
