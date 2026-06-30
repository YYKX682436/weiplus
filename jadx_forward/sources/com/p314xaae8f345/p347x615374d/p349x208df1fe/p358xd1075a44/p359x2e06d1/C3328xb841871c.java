package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKAvatarImageView */
/* loaded from: classes9.dex */
public class C3328xb841871c extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3337xedd7f835 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3423x5548bd7c {

    /* renamed from: username */
    private java.lang.String f12972xf02988d6;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3423x5548bd7c
    /* renamed from: getPossibleNotFriend */
    public boolean mo26769xe4e5442a() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3423x5548bd7c
    /* renamed from: getUsername */
    public java.lang.String mo26770x6c03c64c() {
        return this.f12972xf02988d6;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3423x5548bd7c
    /* renamed from: setPossibleNotFriend */
    public void mo26771xc07b509e(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3423x5548bd7c
    /* renamed from: setUsername */
    public void mo26772x66bc2758(java.lang.String str) {
        this.f12972xf02988d6 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (mo26208x83bb89bd() != 0.0f) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(mo27110xfb86a31b(), this.f12972xf02988d6, mo26208x83bb89bd());
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(mo27110xfb86a31b(), this.f12972xf02988d6, null);
        }
        mo26970x380a4f2b();
    }
}
