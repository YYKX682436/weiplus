package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class s7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in.b f64506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.z7 f64507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64509g;

    public s7(in.b bVar, com.tencent.mm.chatroom.ui.z7 z7Var, android.content.Context context, java.lang.String str) {
        this.f64506d = bVar;
        this.f64507e = z7Var;
        this.f64508f = context;
        this.f64509g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        in.b bVar = this.f64506d;
        com.tencent.mm.storage.z3 n17 = Bi.n(bVar.f292718d.f292721d, true);
        java.lang.String P0 = n17.P0();
        java.lang.String g27 = n17.g2();
        com.tencent.mm.chatroom.ui.z7 z7Var = this.f64507e;
        android.content.Context context = this.f64508f;
        kotlin.jvm.internal.o.f(context, "$context");
        java.lang.String str = this.f64509g;
        java.lang.String userName = bVar.f292718d.f292721d;
        kotlin.jvm.internal.o.f(userName, "userName");
        java.lang.String ticket = ((in.a) bVar.f292720f.get(0)).f292715e;
        kotlin.jvm.internal.o.f(ticket, "ticket");
        com.tencent.mm.chatroom.ui.z7.i(z7Var, context, str, userName, P0, g27, false, ticket);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
