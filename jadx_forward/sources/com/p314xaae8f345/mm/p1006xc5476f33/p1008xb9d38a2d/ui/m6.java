package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class m6 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 f155570d;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98) {
        this.f155570d = activityC11419x78fe9e98;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(final java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            new android.os.Handler(this.f155570d.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.m6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m6.this.f155570d;
                    if (activityC11419x78fe9e98.A1) {
                        return;
                    }
                    activityC11419x78fe9e98.A1 = true;
                    boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    activityC11419x78fe9e98.f154902z1 = booleanValue;
                    if (booleanValue) {
                        if (!(activityC11419x78fe9e98.getIntent().getIntExtra("login_type", 0) == 0) || activityC11419x78fe9e98.T <= 6) {
                            return;
                        }
                        activityC11419x78fe9e98.r7(6);
                    }
                }
            });
        }
    }
}
