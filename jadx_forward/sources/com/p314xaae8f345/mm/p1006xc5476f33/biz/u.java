package com.p314xaae8f345.mm.p1006xc5476f33.biz;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f175423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.biz.w f175424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f175426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.biz.w wVar, java.lang.String str, android.content.Intent intent) {
        super(1);
        this.f175423d = context;
        this.f175424e = wVar;
        this.f175425f = str;
        this.f175426g = intent;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f175423d;
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            this.f175424e.c(context, this.f175425f, this.f175426g);
        }
        return jz5.f0.f384359a;
    }
}
