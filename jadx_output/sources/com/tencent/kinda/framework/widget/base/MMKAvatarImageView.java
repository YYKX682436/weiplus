package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKAvatarImageView extends com.tencent.kinda.framework.widget.base.MMKImageView implements com.tencent.kinda.gen.KAvatarImageView {
    private java.lang.String username;

    @Override // com.tencent.kinda.gen.KAvatarImageView
    public boolean getPossibleNotFriend() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KAvatarImageView
    public java.lang.String getUsername() {
        return this.username;
    }

    @Override // com.tencent.kinda.gen.KAvatarImageView
    public void setPossibleNotFriend(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KAvatarImageView
    public void setUsername(java.lang.String str) {
        this.username = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (getCornerRadius() != 0.0f) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(getView(), this.username, getCornerRadius());
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(getView(), this.username, null);
        }
        notifyChanged();
    }
}
