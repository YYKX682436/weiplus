package com.tencent.mm.kara.feature.feature.comm;

/* loaded from: classes11.dex */
public class SomeoneTagsFeatureGroup extends pl0.e {

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
    public float proportionOfStared;

    @fl0.a
    public int sumOfMessages;

    @fl0.a
    public int sumOfMyMessages;
    private java.lang.String userName;

    public SomeoneTagsFeatureGroup(java.lang.String str) {
        this.userName = str;
    }

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        if (android.text.TextUtils.isEmpty(this.userName)) {
            return;
        }
        gm0.j1.i();
        java.lang.Class<vg3.x3> cls = vg3.x3.class;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Bi().n(this.userName, true);
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(n17.D0().split(",")).iterator();
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
        int i57 = 0;
        int i58 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                java.util.Iterator it6 = it;
                java.util.Iterator it7 = ((b93.b) c93.a.a()).j(str).iterator();
                while (it7.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it7.next();
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        i17++;
                        gm0.j1.i();
                        java.lang.Class<vg3.x3> cls2 = cls;
                        java.util.Iterator it8 = it7;
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Bi().n(str2, true);
                        sl0.a0 a0Var = sl0.a0.f409049e;
                        i18 += a0Var.b(str2) ? 1 : 0;
                        i19 += n18.y2() ? 1 : 0;
                        i29 += !n18.x2() ? 1 : 0;
                        i37 += !a0Var.d(str2) ? 1 : 0;
                        i38 += c01.e2.P(n18) ? 1 : 0;
                        i48 += !n18.y2() ? 1 : 0;
                        i49 += n18.t2() ? 1 : 0;
                        i47 += a0Var.c(n18) ? 1 : 0;
                        i58 += a0Var.e(str2);
                        i57 += a0Var.f(str2);
                        i39 += n18.r2() ? 1 : 0;
                        int i59 = n17.I;
                        if (i59 == 1) {
                            i28++;
                        } else if (i59 == 2) {
                            i27++;
                        }
                        it7 = it8;
                        cls = cls2;
                    }
                }
                it = it6;
            }
        }
        this.count = i17;
        this.numberOfChatAlert = i18;
        this.numberOfChatOnlyPrivacy = i19;
        this.numberOfFemales = i27;
        this.numberOfMales = i28;
        this.numberOfHideMyPost = i29;
        this.numberOfHideItsPost = i37;
        this.numberOfMuteNotifications = i38;
        this.numberOfMyContacts = i39;
        this.numberOfSessionsStickyOnTop = i47;
        this.numberOfNormalPrivacy = i48;
        int i66 = i49;
        this.numberOfStarred = i66;
        int i67 = i57;
        this.sumOfMyMessages = i67;
        int i68 = i58;
        this.sumOfMessages = i68;
        if (i17 > 0) {
            float f17 = i17;
            this.proportionOfChatAlert = i18 / f17;
            this.proportionOfChatOnlyPrivacy = i19 / f17;
            this.proportionOfFemales = i27 / f17;
            this.proportionOfHideItsPost = i37 / f17;
            this.proportionOfHideMyPost = i29 / f17;
            this.proportionOfMales = i28 / f17;
            this.proportionOfMuteNotifications = i38 / f17;
            this.proportionOfMyContacts = i39 / f17;
            this.proportionOfNormalPrivacy = i48 / f17;
            this.proportionOfSessionsStickyOnTop = i47 / f17;
            this.proportionOfStared = i66 / f17;
        }
        if (i68 > 0) {
            this.proportionOfMyMessages = i67 / i68;
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "tag";
    }
}
