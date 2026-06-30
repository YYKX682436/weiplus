package com.tencent.mm.kara.feature.feature.comm;

/* loaded from: classes11.dex */
public class SomeoneRelationshipFeatureGroup extends pl0.e {

    @fl0.a
    public int chatAlert;

    @fl0.a
    public int hideItsPost;

    @fl0.a
    public int hideMyPost;

    @fl0.a
    public int isMyContact;

    @fl0.a
    public int isSessionStickyOnTop;

    @fl0.a
    public int isStared;

    @fl0.a
    public int muteNotifications;

    @fl0.a
    public int numberOfMessages;

    @fl0.a
    public int numberOfMyMessages;

    @fl0.a
    public int[] privacy;

    @fl0.a
    public float proportionOfMyMessages;

    @fl0.a
    public int[] sex;
    private java.lang.String userName;

    public SomeoneRelationshipFeatureGroup(java.lang.String str) {
        this.userName = str;
    }

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        if (android.text.TextUtils.isEmpty(this.userName)) {
            return;
        }
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.userName, true);
        if (n17 == null) {
            return;
        }
        sl0.a0 a0Var = sl0.a0.f409049e;
        this.chatAlert = a0Var.b(this.userName) ? 1 : 0;
        this.hideItsPost = !a0Var.d(this.userName) ? 1 : 0;
        this.hideMyPost = 1 ^ (n17.x2() ? 1 : 0);
        this.isMyContact = n17.r2() ? 1 : 0;
        this.isSessionStickyOnTop = a0Var.c(n17) ? 1 : 0;
        this.muteNotifications = c01.e2.P(n17) ? 1 : 0;
        this.numberOfMyMessages = a0Var.f(this.userName);
        int e17 = a0Var.e(this.userName);
        this.numberOfMessages = e17;
        if (e17 > 0) {
            this.proportionOfMyMessages = this.numberOfMyMessages / e17;
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "sender";
    }
}
