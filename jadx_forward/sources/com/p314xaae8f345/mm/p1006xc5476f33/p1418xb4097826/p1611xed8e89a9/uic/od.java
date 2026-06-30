package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class od extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f205622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f205623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 f205624f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(android.content.Intent intent, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819) {
        super(2);
        this.f205622d = intent;
        this.f205623e = j17;
        this.f205624f = c14895xe517e819;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        android.content.Intent intent2 = this.f205622d;
        intent2.putExtra("CURRENT_FEED_ID", this.f205623e);
        intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb.U7((c61.zb) c17, this.f205624f.m158354x19263085(), this.f205622d, false, 4, null);
        return jz5.f0.f384359a;
    }
}
