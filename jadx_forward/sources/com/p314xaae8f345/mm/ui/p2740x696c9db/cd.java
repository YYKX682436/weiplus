package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class cd implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f291868d;

    public cd(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f291868d = activityC22543x95896a72;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f291868d;
        if (!activityC22543x95896a72.f291771z.e()) {
            activityC22543x95896a72.f291771z.mo69422xed060d07();
        } else {
            activityC22543x95896a72.f291771z.a(i17 * 1000, true);
            activityC22543x95896a72.f291771z.mo69320x87223eb7(new com.p314xaae8f345.mm.ui.p2740x696c9db.bd(this));
        }
    }

    @Override // m34.e
    public void b() {
    }

    @Override // m34.e
    public void d(int i17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f291868d;
        activityC22543x95896a72.f291771z.a(i17 * 1000, false);
        if (activityC22543x95896a72.f291771z.mo69311xc00617a4()) {
            activityC22543x95896a72.f291771z.mo69313x65825f6();
        }
    }
}
