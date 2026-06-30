package com.tencent.kinda.framework.module.impl;

/* loaded from: classes.dex */
public class ContactImpl implements com.tencent.kinda.gen.KContact {
    private com.tencent.mm.storage.z3 contact;

    public ContactImpl(java.lang.String str) {
        gm0.j1.i();
        this.contact = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
    }

    @Override // com.tencent.kinda.gen.KContact
    public java.lang.String displayName() {
        return this.contact.g2();
    }

    @Override // com.tencent.kinda.gen.KContact
    public java.lang.String userName() {
        return this.contact.d1();
    }
}
