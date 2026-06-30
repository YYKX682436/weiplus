package com.tencent.mm.kara.feature.feature.comm;

/* loaded from: classes11.dex */
public class GroupWithSomeoneFeatureGroup extends pl0.e {

    @fl0.a
    public int count;

    @fl0.a
    public int numberOfMuteNotifications;

    @fl0.a
    public int numberOfSavedToContacts;

    @fl0.a
    public int numberOfSessionsStickyOnTop;

    @fl0.a
    public float proportionOfMuteNotifications;

    @fl0.a
    public float proportionOfMyContacts;

    @fl0.a
    public float proportionOfMyMessages;

    @fl0.a
    public float proportionOfSavedToContacts;

    @fl0.a
    public float proportionOfSessionsStickyOnTop;

    @fl0.a
    public int sumOfMembers;

    @fl0.a
    public int sumOfMessages;

    @fl0.a
    public int sumOfMyContacts;

    @fl0.a
    public int sumOfMyMessages;
    private java.lang.String userName;

    public GroupWithSomeoneFeatureGroup(java.lang.String str) {
        this.userName = str;
    }

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        if (android.text.TextUtils.isEmpty(this.userName)) {
            return;
        }
        sl0.a0 a0Var = sl0.a0.f409049e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.count = arrayList.size();
        this.numberOfMuteNotifications = 0;
        this.numberOfSavedToContacts = 0;
        this.numberOfSessionsStickyOnTop = 0;
        this.sumOfMembers = 0;
        this.sumOfMyContacts = 0;
        this.sumOfMessages = 0;
        this.sumOfMyMessages = 0;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (((java.lang.Boolean) a0Var.a("chatroomIsOpenMuteNotifications" + str, new sl0.p(a0Var, str))).booleanValue()) {
                this.numberOfMuteNotifications++;
            }
            if (((java.lang.Boolean) a0Var.a("chatroomIsSavedToContact" + str, new sl0.q(a0Var, str))).booleanValue()) {
                this.numberOfSavedToContacts++;
            }
            if (((java.lang.Boolean) a0Var.a("chatroomIsTop" + str, new sl0.r(a0Var, str))).booleanValue()) {
                this.numberOfSessionsStickyOnTop++;
            }
            java.util.List<java.lang.String> list = (java.util.List) a0Var.a("commonGroupAllMembersCnt" + str, new sl0.s(a0Var, str));
            this.sumOfMembers = this.sumOfMembers + list.size();
            for (java.lang.String str2 : list) {
                int i17 = this.sumOfMyContacts;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isContact");
                sb6.append(str2);
                this.sumOfMyContacts = i17 + (((java.lang.Boolean) a0Var.a(sb6.toString(), new sl0.x(a0Var, str2))).booleanValue() ? 1 : 0);
            }
            this.sumOfMessages = this.sumOfMessages + ((java.lang.Integer) a0Var.a("commonGroupAllMessagesCnt" + str, new sl0.t(a0Var, str))).intValue();
            this.sumOfMyMessages = this.sumOfMyMessages + ((java.lang.Integer) a0Var.a("commonGroupMyMessagesCnt" + str, new sl0.u(a0Var, str))).intValue();
        }
        int i18 = this.count;
        if (i18 > 0) {
            this.proportionOfMuteNotifications = this.numberOfMuteNotifications / i18;
            this.proportionOfSavedToContacts = this.numberOfSavedToContacts / i18;
            this.proportionOfSessionsStickyOnTop = this.numberOfSessionsStickyOnTop / i18;
        }
        int i19 = this.sumOfMembers;
        if (i19 > 0) {
            this.proportionOfMyContacts = this.sumOfMyContacts / i19;
        }
        int i27 = this.sumOfMessages;
        if (i27 > 0) {
            this.proportionOfMyMessages = this.sumOfMyMessages / i27;
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "commonGroupChats";
    }
}
