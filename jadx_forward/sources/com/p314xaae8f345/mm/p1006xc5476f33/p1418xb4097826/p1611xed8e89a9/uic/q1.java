package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f205670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f205671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.content.Intent intent, long j17, android.view.View view) {
        super(2);
        this.f205670d = intent;
        this.f205671e = j17;
        this.f205672f = view;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        android.content.Intent intent2 = this.f205670d;
        intent2.putExtra("CURRENT_FEED_ID", this.f205671e);
        intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = this.f205672f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c61.zb.U7((c61.zb) c17, context, this.f205670d, false, 4, null);
        return jz5.f0.f384359a;
    }
}
