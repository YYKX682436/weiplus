package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class ContactServiceImpl implements com.tencent.kinda.gen.KContactService {
    @Override // com.tencent.kinda.gen.KContactService
    public void attachAvatar(java.lang.String str, com.tencent.kinda.gen.KImageView kImageView) {
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(((com.tencent.kinda.framework.widget.base.MMKImageView) kImageView).getView(), str, null);
    }

    @Override // com.tencent.kinda.gen.KContactService
    public com.tencent.kinda.gen.KContact get(java.lang.String str) {
        return new com.tencent.kinda.framework.module.impl.ContactImpl(str);
    }

    @Override // com.tencent.kinda.gen.KContactService
    public long getCryptUin() {
        return new kk.v(gm0.j1.b().h()).longValue();
    }

    @Override // com.tencent.kinda.gen.KContactService
    public java.lang.String getUserName() {
        return com.tencent.mm.wallet_core.ui.r1.D();
    }

    @Override // com.tencent.kinda.gen.KContactService
    public boolean isEuropeRegUser() {
        return false;
    }
}
