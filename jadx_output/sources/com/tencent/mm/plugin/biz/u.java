package com.tencent.mm.plugin.biz;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f93890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.biz.w f93891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f93892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f93893g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, com.tencent.mm.plugin.biz.w wVar, java.lang.String str, android.content.Intent intent) {
        super(1);
        this.f93890d = context;
        this.f93891e = wVar;
        this.f93892f = str;
        this.f93893g = intent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f93890d;
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            this.f93891e.c(context, this.f93892f, this.f93893g);
        }
        return jz5.f0.f302826a;
    }
}
