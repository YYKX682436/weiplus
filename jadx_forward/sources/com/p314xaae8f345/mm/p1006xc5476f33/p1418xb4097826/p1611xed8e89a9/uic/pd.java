package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class pd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f205658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f205659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 f205660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(android.content.Intent intent, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14895xe517e819 c14895xe517e819) {
        super(0);
        this.f205658d = intent;
        this.f205659e = j17;
        this.f205660f = c14895xe517e819;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f205658d;
        intent.putExtra("CURRENT_FEED_ID", this.f205659e);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb.U7((c61.zb) c17, this.f205660f.m158354x19263085(), this.f205658d, false, 4, null);
        return jz5.f0.f384359a;
    }
}
