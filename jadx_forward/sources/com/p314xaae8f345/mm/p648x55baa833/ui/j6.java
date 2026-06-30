package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class j6 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f145782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in.b f145784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(android.content.Context context, java.lang.String str, in.b bVar) {
        super(1, null);
        this.f145782e = context;
        this.f145783f = str;
        this.f145784g = bVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        un.q qVar = un.w.f510866f;
        android.content.Context context = this.f145782e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.lang.String str = this.f145783f;
        in.b bVar = this.f145784g;
        java.lang.String userName = bVar.f374251d.f374254d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
        java.lang.String ticket = ((in.a) bVar.f374253f.get(0)).f374248e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ticket, "ticket");
        qVar.a(context, str, userName, null, null, false, ticket);
    }
}
