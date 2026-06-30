package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class j6 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in.b f64251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(android.content.Context context, java.lang.String str, in.b bVar) {
        super(1, null);
        this.f64249e = context;
        this.f64250f = str;
        this.f64251g = bVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        un.q qVar = un.w.f429333f;
        android.content.Context context = this.f64249e;
        kotlin.jvm.internal.o.f(context, "$context");
        java.lang.String str = this.f64250f;
        in.b bVar = this.f64251g;
        java.lang.String userName = bVar.f292718d.f292721d;
        kotlin.jvm.internal.o.f(userName, "userName");
        java.lang.String ticket = ((in.a) bVar.f292720f.get(0)).f292715e;
        kotlin.jvm.internal.o.f(ticket, "ticket");
        qVar.a(context, str, userName, null, null, false, ticket);
    }
}
