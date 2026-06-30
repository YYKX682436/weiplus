package com.tencent.mm.kara.feature.feature.sns;

/* loaded from: classes11.dex */
public class ContactsThatLikedFeatureGroup extends pl0.e {

    @fl0.a
    public int containsPOI;

    @fl0.a
    public int count;

    @fl0.a
    public int numberOfChatAlert;

    @fl0.a
    public int numberOfChatOnlyPrivacy;

    @fl0.a
    public int numberOfFemales;

    @fl0.a
    public int numberOfHideItsPost;

    @fl0.a
    public int numberOfHideMyPost;

    @fl0.a
    public int numberOfMales;

    @fl0.a
    public int numberOfMuteNotifications;

    @fl0.a
    public int numberOfMyContacts;

    @fl0.a
    public int numberOfNormalPrivacy;

    @fl0.a
    public int numberOfSessionsStickyOnTop;

    @fl0.a
    public int numberOfStarred;

    @fl0.a
    public float proportionOfChatAlert;

    @fl0.a
    public float proportionOfChatOnlyPrivacy;

    @fl0.a
    public float proportionOfFemales;

    @fl0.a
    public float proportionOfHideItsPost;

    @fl0.a
    public float proportionOfHideMyPost;

    @fl0.a
    public float proportionOfMales;

    @fl0.a
    public float proportionOfMuteNotifications;

    @fl0.a
    public float proportionOfMyContacts;

    @fl0.a
    public float proportionOfMyMessages;

    @fl0.a
    public float proportionOfNormalPrivacy;

    @fl0.a
    public float proportionOfSessionsStickyOnTop;

    @fl0.a
    public float proportionOfStarred;
    private com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;

    @fl0.a
    public int sumOfMessages;

    @fl0.a
    public int sumOfMyMessages;

    public ContactsThatLikedFeatureGroup(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.snsInfo = snsInfo;
    }

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.snsInfo;
        if (snsInfo != null) {
            com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
            java.util.LinkedList<r45.e86> linkedList = e17.LikeUserList;
            int size = linkedList.size();
            java.util.Iterator<r45.e86> it = linkedList.iterator();
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            while (it.hasNext()) {
                java.util.Iterator<r45.e86> it6 = it;
                java.lang.String str = it.next().f373126d;
                gm0.j1.i();
                int i57 = size;
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                sl0.a0 a0Var = sl0.a0.f409049e;
                i17 += a0Var.b(str) ? 1 : 0;
                i38 += !a0Var.d(str) ? 1 : 0;
                i18 += n17.y2() ? 1 : 0;
                i37 += !n17.x2() ? 1 : 0;
                i39 += c01.e2.P(n17) ? 1 : 0;
                i29 += !n17.y2() ? 1 : 0;
                i28 += n17.t2() ? 1 : 0;
                i47 += a0Var.c(n17) ? 1 : 0;
                i48 += a0Var.e(str);
                i49 += a0Var.f(str);
                int i58 = n17.I;
                if (i58 == 1) {
                    i27++;
                } else if (i58 == 2) {
                    i19++;
                }
                it = it6;
                size = i57;
            }
            int i59 = size;
            this.count = e17.LikeCount;
            this.numberOfMyContacts = i59;
            this.numberOfChatAlert = i17;
            this.numberOfChatOnlyPrivacy = i18;
            this.numberOfFemales = i19;
            this.numberOfMales = i27;
            this.numberOfStarred = i28;
            this.numberOfNormalPrivacy = i29;
            this.numberOfHideMyPost = i37;
            this.numberOfHideItsPost = i38;
            this.numberOfMuteNotifications = i39;
            this.numberOfSessionsStickyOnTop = i47;
            this.sumOfMessages = i48;
            this.sumOfMyMessages = i49;
            if (i59 > 0) {
                float f17 = i59;
                this.proportionOfChatAlert = i17 / f17;
                this.proportionOfChatOnlyPrivacy = i18 / f17;
                this.proportionOfFemales = i19 / f17;
                this.proportionOfMales = i27 / f17;
                this.proportionOfHideMyPost = i37 / f17;
                this.proportionOfHideItsPost = i38 / f17;
                this.proportionOfMuteNotifications = i39 / f17;
                this.proportionOfMyContacts = f17 / f17;
                this.proportionOfNormalPrivacy = i29 / f17;
                this.proportionOfSessionsStickyOnTop = i47 / f17;
                this.proportionOfStarred = i28 / f17;
            }
            if (i48 > 0) {
                this.proportionOfMyMessages = i49 / i48;
            }
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "contactsThatLiked";
    }
}
