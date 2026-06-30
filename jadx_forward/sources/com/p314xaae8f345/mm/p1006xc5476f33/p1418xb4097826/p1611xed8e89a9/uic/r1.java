package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f205700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f205701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.content.Intent intent, long j17, android.view.View view) {
        super(0);
        this.f205700d = intent;
        this.f205701e = j17;
        this.f205702f = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f205700d;
        intent.putExtra("CURRENT_FEED_ID", this.f205701e);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = this.f205702f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c61.zb.U7((c61.zb) c17, context, this.f205700d, false, 4, null);
        return jz5.f0.f384359a;
    }
}
