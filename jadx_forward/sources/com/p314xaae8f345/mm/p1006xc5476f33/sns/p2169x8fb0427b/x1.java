package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class x1 extends dm.na implements v94.h {
    public static final l75.e0 U = dm.na.m125346x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1.class);
    public java.lang.String S = "";
    public java.lang.String T;

    @Override // dm.na, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsCover");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return U;
    }

    /* renamed from: getFinderObject */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m70534x7c94657b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderObject", "com.tencent.mm.plugin.sns.storage.SnsCover");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        byte[] bArr = this.f67719x27cd822a;
        if (bArr != null) {
            try {
                c19792x256d2725.mo11468x92b714fd(bArr);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsCover", e17, "FinderObject parseFrom error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderObject", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return c19792x256d2725;
    }

    /* renamed from: getType */
    public int m70535xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.storage.SnsCover");
        int i17 = this.f67730x2262335f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return i17;
    }

    /* renamed from: getUserName */
    public java.lang.String m70536x6bf53a6c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserName", "com.tencent.mm.plugin.sns.storage.SnsCover");
        java.lang.String str = this.f67731xdde069b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserName", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str;
    }

    public java.lang.String t0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        int i17 = this.f67730x2262335f;
        if (i17 == 1 || i17 == 6 || i17 == 0) {
            if (com.p314xaae8f345.mm.vfs.w6.j(this.f67722x5a2f915)) {
                java.lang.String str = this.f67722x5a2f915;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
                return str;
            }
            if (!android.text.TextUtils.isEmpty(this.f67720x61895ab4)) {
                java.lang.String str2 = this.f67720x61895ab4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
                return str2;
            }
        }
        java.lang.String v07 = v0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return v07;
    }

    /* renamed from: toString */
    public java.lang.String m70537x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.storage.SnsCover");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        byte[] bArr = this.f67719x27cd822a;
        if (bArr != null) {
            try {
                c19792x256d2725.mo11468x92b714fd(bArr);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsCover", e17, "FinderObject parseFrom error", new java.lang.Object[0]);
            }
        }
        java.lang.String str = "SnsCover{field_userName='" + this.f67731xdde069b + "', field_type=" + this.f67730x2262335f + ", field_snsBgId=" + ca4.z0.t0(this.f67726xfa287b93) + ", field_thumbUrl='" + this.f67729x7b284d5e + "', field_imageBgUrl='" + this.f67720x61895ab4 + "', field_videoBgUrl='" + this.f67732x5719e394 + "', field_localThumb='" + this.f67723x63c0190 + "', field_localImage='" + this.f67722x5a2f915 + "', field_localVideo='" + this.f67724x6586435 + "', field_finderObject=" + ca4.z0.t0(c19792x256d2725.m76784x5db1b11()) + ", field_finderCheckTime=" + this.f67718x54cb1d2a + ", field_success=" + this.f67728x547edbe + ", systemRowid=" + this.f72763xa3c65b86 + ", reportExtraInfo=" + this.S + '}';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str;
    }

    public java.lang.Long u0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsObjId", "com.tencent.mm.plugin.sns.storage.SnsCover");
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f67726xfa287b93);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsObjId", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return valueOf;
    }

    public java.lang.String v0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f67723x63c0190)) {
            java.lang.String str = this.f67723x63c0190;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
            return str;
        }
        java.lang.String str2 = this.f67729x7b284d5e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str2;
    }

    public java.lang.String w0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f67724x6586435)) {
            java.lang.String str = this.f67724x6586435;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
            return str;
        }
        java.lang.String str2 = this.f67732x5719e394;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str2;
    }
}
