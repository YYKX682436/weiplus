package org.p3343x72743996.net;

/* renamed from: org.chromium.net.RegistrationPolicyApplicationStatus */
/* loaded from: classes13.dex */
public class C29550x57912137 extends org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy implements org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener {

    /* renamed from: mDestroyed */
    private boolean f74268xf122e02c;

    @Override // org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy
    /* renamed from: destroy */
    public void mo153424x5cd39ffa() {
        if (this.f74268xf122e02c) {
            return;
        }
        org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152214x5593dd51(this);
        this.f74268xf122e02c = true;
    }

    @Override // org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy
    /* renamed from: init */
    public void mo153425x316510(org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76) {
        super.mo153425x316510(c29530x68a47f76);
        org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152205x535c72b8(this);
        mo152219xd854fcf0(0);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.ApplicationStateListener
    /* renamed from: onApplicationStateChange */
    public void mo152219xd854fcf0(int i17) {
        if (org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152196x30859685()) {
            m153426xd6dc2ea3();
        } else {
            m153427x31d4943c();
        }
    }
}
