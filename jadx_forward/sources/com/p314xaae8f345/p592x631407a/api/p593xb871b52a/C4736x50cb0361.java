package com.p314xaae8f345.p592x631407a.api.p593xb871b52a;

/* renamed from: com.tencent.midas.api.ability.MidasActivityAbility */
/* loaded from: classes13.dex */
public class C4736x50cb0361 extends com.p314xaae8f345.p592x631407a.api.p593xb871b52a.AbstractC4737x67fca45f {

    /* renamed from: BUNDLE_PREFIX */
    private static final java.lang.String f20119x7f8dc8ef = "__midas_ability_activity__";

    /* renamed from: action */
    public java.lang.String f20120xab2f7e36;

    /* renamed from: area */
    public java.lang.String f20121x2dd08d;

    /* renamed from: partition */
    public java.lang.String f20122x94b912ea;

    /* renamed from: payItem */
    public java.lang.String f20123xd10c0bdb;

    /* renamed from: platId */
    public java.lang.String f20124xc53e84aa;

    /* renamed from: roleId */
    public java.lang.String f20125xc8d74431;

    /* renamed from: roleName */
    public java.lang.String f20126xf0194421;

    /* renamed from: sceneInfo */
    public java.lang.String f20127x670ecb5a;

    /* renamed from: shareInfo */
    public com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare f20128xa1af212d;

    /* renamed from: com.tencent.midas.api.ability.MidasActivityAbility$AbsQQShare */
    /* loaded from: classes13.dex */
    public static abstract class AbsQQShare extends com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare {

        /* renamed from: hideQzone */
        public boolean f20130x321faf7b = false;

        /* renamed from: arkJson */
        public java.lang.String f20129xd3cc1e62 = "";

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: fromBundle */
        public void mo41424x63aa4ccc(android.os.Bundle bundle) {
            super.mo41424x63aa4ccc(bundle);
            this.f20130x321faf7b = bundle.getBoolean(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare.class.getSimpleName() + "_hideQzone");
            this.f20129xd3cc1e62 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare.class.getSimpleName() + "_arkJson");
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: toBundle */
        public android.os.Bundle mo41425x792022dd() {
            android.os.Bundle mo41425x792022dd = super.mo41425x792022dd();
            mo41425x792022dd.putBoolean(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare.class.getSimpleName() + "_hideQzone", this.f20130x321faf7b);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare.class.getSimpleName() + "_arkJson", this.f20129xd3cc1e62);
            return mo41425x792022dd;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: toString */
        public java.lang.String mo41427x9616526c() {
            return super.mo41427x9616526c() + "|hideQzone=" + this.f20130x321faf7b + "|arkJson=" + this.f20129xd3cc1e62;
        }
    }

    /* renamed from: com.tencent.midas.api.ability.MidasActivityAbility$AbsShare */
    /* loaded from: classes13.dex */
    public static abstract class AbsShare implements com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39 {

        /* renamed from: TYPE_KEY */
        protected static final java.lang.String f20131x669abba = "shareType";

        /* renamed from: TYPE_QQ_MINIPROGRAM */
        protected static final int f20132x4c25d233 = 2;

        /* renamed from: TYPE_QQ_WEB */
        protected static final int f20133x4df1393a = 1;

        /* renamed from: TYPE_WX_MINIPROGRAM */
        protected static final int f20134x1cedb974 = 4;

        /* renamed from: TYPE_WX_WEB */
        protected static final int f20135x5890f17b = 3;

        /* renamed from: createChild */
        public static com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare m41428xe104a180(android.os.Bundle bundle) {
            int i17 = bundle.getInt("__midas_ability_activity__shareType");
            if (i17 == 1) {
                com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare qQWebShare = new com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare();
                qQWebShare.mo41424x63aa4ccc(bundle);
                return qQWebShare;
            }
            if (i17 == 2) {
                com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare qQMiniProgramShare = new com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare();
                qQMiniProgramShare.mo41424x63aa4ccc(bundle);
                return qQMiniProgramShare;
            }
            if (i17 == 3) {
                com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXWebShare wXWebShare = new com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXWebShare();
                wXWebShare.mo41424x63aa4ccc(bundle);
                return wXWebShare;
            }
            if (i17 != 4) {
                return null;
            }
            com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXMiniProgramShare wXMiniProgramShare = new com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXMiniProgramShare();
            wXMiniProgramShare.mo41424x63aa4ccc(bundle);
            return wXMiniProgramShare;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: fromBundle */
        public void mo41424x63aa4ccc(android.os.Bundle bundle) {
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: toBundle */
        public android.os.Bundle mo41425x792022dd() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("__midas_ability_activity__shareType", mo41429x368f3a());
            return bundle;
        }

        /* renamed from: toString */
        public java.lang.String mo41427x9616526c() {
            return "shareType=" + mo41429x368f3a();
        }

        /* renamed from: type */
        public abstract int mo41429x368f3a();
    }

    /* renamed from: com.tencent.midas.api.ability.MidasActivityAbility$AbsWXShare */
    /* loaded from: classes13.dex */
    public static abstract class AbsWXShare extends com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare {

        /* renamed from: title */
        public java.lang.String f20139x6942258 = "";

        /* renamed from: description */
        public java.lang.String f20136x993583fc = "";

        /* renamed from: thumbData */
        public byte[] f20138x4f3b3aa0 = null;

        /* renamed from: scene */
        public int f20137x683188c = 0;

        /* renamed from: transaction */
        public java.lang.String f20140x7fa0d2de = "";

        /* renamed from: userOpenId */
        public java.lang.String f20141x57d458b0 = "";

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: fromBundle */
        public void mo41424x63aa4ccc(android.os.Bundle bundle) {
            super.mo41424x63aa4ccc(bundle);
            this.f20139x6942258 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_title");
            this.f20136x993583fc = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_description");
            this.f20138x4f3b3aa0 = bundle.getByteArray(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_thumbData");
            this.f20137x683188c = bundle.getInt(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_scene");
            this.f20140x7fa0d2de = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_transaction");
            this.f20141x57d458b0 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_userOpenId");
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: toBundle */
        public android.os.Bundle mo41425x792022dd() {
            android.os.Bundle mo41425x792022dd = super.mo41425x792022dd();
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_title", this.f20139x6942258);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_description", this.f20136x993583fc);
            mo41425x792022dd.putByteArray(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_thumbData", this.f20138x4f3b3aa0);
            mo41425x792022dd.putInt(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_scene", this.f20137x683188c);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_transaction", this.f20140x7fa0d2de);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare.class.getSimpleName() + "_userOpenId", this.f20141x57d458b0);
            return mo41425x792022dd;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: toString */
        public java.lang.String mo41427x9616526c() {
            return super.mo41427x9616526c() + "|title=" + this.f20139x6942258 + "|description=" + this.f20136x993583fc + "|thumbData=" + this.f20138x4f3b3aa0 + "|scene=" + this.f20137x683188c + "|transaction=" + this.f20140x7fa0d2de + "|userOpenId=" + this.f20141x57d458b0;
        }
    }

    /* renamed from: com.tencent.midas.api.ability.MidasActivityAbility$QQMiniProgramShare */
    /* loaded from: classes13.dex */
    public static class QQMiniProgramShare extends com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare {

        /* renamed from: imageUrl */
        public java.lang.String f20142xccc36214;

        /* renamed from: miniProgramType */
        public java.lang.String f20143x2a337707;

        /* renamed from: summary */
        public java.lang.String f20144x9146a7a6;

        /* renamed from: title */
        public java.lang.String f20145x6942258;

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: fromBundle */
        public void mo41424x63aa4ccc(android.os.Bundle bundle) {
            super.mo41424x63aa4ccc(bundle);
            this.f20145x6942258 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_title");
            this.f20144x9146a7a6 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_summary");
            this.f20142xccc36214 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_imageUrl");
            this.f20143x2a337707 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_miniProgramType");
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: toBundle */
        public android.os.Bundle mo41425x792022dd() {
            android.os.Bundle mo41425x792022dd = super.mo41425x792022dd();
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_title", this.f20145x6942258);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_summary", this.f20144x9146a7a6);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_imageUrl", this.f20142xccc36214);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQMiniProgramShare.class.getSimpleName() + "_miniProgramType", this.f20143x2a337707);
            return mo41425x792022dd;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: toString */
        public java.lang.String mo41427x9616526c() {
            return super.mo41427x9616526c() + "|title=" + this.f20145x6942258 + "|summary=" + this.f20144x9146a7a6 + "|imageUrl=" + this.f20142xccc36214 + "|miniProgramType=" + this.f20143x2a337707;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: type */
        public int mo41429x368f3a() {
            return 2;
        }
    }

    /* renamed from: com.tencent.midas.api.ability.MidasActivityAbility$QQWebShare */
    /* loaded from: classes13.dex */
    public static class QQWebShare extends com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare {

        /* renamed from: appName */
        public java.lang.String f20146xd0aa704c;

        /* renamed from: imageUrl */
        public java.lang.String f20147xccc36214;

        /* renamed from: summary */
        public java.lang.String f20148x9146a7a6;

        /* renamed from: title */
        public java.lang.String f20149x6942258;

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: fromBundle */
        public void mo41424x63aa4ccc(android.os.Bundle bundle) {
            super.mo41424x63aa4ccc(bundle);
            this.f20149x6942258 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_title");
            this.f20148x9146a7a6 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_summary");
            this.f20147xccc36214 = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_imageUrl");
            this.f20146xd0aa704c = bundle.getString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_appName");
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: toBundle */
        public android.os.Bundle mo41425x792022dd() {
            android.os.Bundle mo41425x792022dd = super.mo41425x792022dd();
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_title", this.f20149x6942258);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_summary", this.f20148x9146a7a6);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_imageUrl", this.f20147xccc36214);
            mo41425x792022dd.putString(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.QQWebShare.class.getSimpleName() + "_appName", this.f20146xd0aa704c);
            return mo41425x792022dd;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsQQShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: toString */
        public java.lang.String mo41427x9616526c() {
            return super.mo41427x9616526c() + "|title=" + this.f20149x6942258 + "|summary=" + this.f20148x9146a7a6 + "|imageUrl=" + this.f20147xccc36214 + "|appName=" + this.f20146xd0aa704c;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: type */
        public int mo41429x368f3a() {
            return 1;
        }
    }

    /* renamed from: com.tencent.midas.api.ability.MidasActivityAbility$WXMiniProgramShare */
    /* loaded from: classes13.dex */
    public static class WXMiniProgramShare extends com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare {

        /* renamed from: miniprogramType */
        public int f20150xc6c9cf27;

        /* renamed from: withShareTicket */
        public boolean f20151x4d2e325;

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: fromBundle */
        public void mo41424x63aa4ccc(android.os.Bundle bundle) {
            super.mo41424x63aa4ccc(bundle);
            this.f20151x4d2e325 = bundle.getBoolean(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXMiniProgramShare.class.getSimpleName() + "_withShareTicket");
            this.f20150xc6c9cf27 = bundle.getInt(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXMiniProgramShare.class.getSimpleName() + "_miniprogramType");
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: toBundle */
        public android.os.Bundle mo41425x792022dd() {
            android.os.Bundle mo41425x792022dd = super.mo41425x792022dd();
            mo41425x792022dd.putBoolean(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXMiniProgramShare.class.getSimpleName() + "_withShareTicket", this.f20151x4d2e325);
            mo41425x792022dd.putInt(com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.f20119x7f8dc8ef + com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.WXMiniProgramShare.class.getSimpleName() + "_miniprogramType", this.f20150xc6c9cf27);
            return mo41425x792022dd;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: toString */
        public java.lang.String mo41427x9616526c() {
            return super.mo41427x9616526c() + "|withShareTicket=" + this.f20151x4d2e325 + "|miniprogramType=" + this.f20150xc6c9cf27;
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: type */
        public int mo41429x368f3a() {
            return 4;
        }
    }

    /* renamed from: com.tencent.midas.api.ability.MidasActivityAbility$WXWebShare */
    /* loaded from: classes13.dex */
    public static class WXWebShare extends com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare {
        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: fromBundle */
        public void mo41424x63aa4ccc(android.os.Bundle bundle) {
            super.mo41424x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
        /* renamed from: toBundle */
        public android.os.Bundle mo41425x792022dd() {
            return super.mo41425x792022dd();
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsWXShare, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: toString */
        public java.lang.String mo41427x9616526c() {
            return super.mo41427x9616526c();
        }

        @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare
        /* renamed from: type */
        public int mo41429x368f3a() {
            return 3;
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.AbstractC4737x67fca45f, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
    /* renamed from: fromBundle */
    public void mo41424x63aa4ccc(android.os.Bundle bundle) {
        super.mo41424x63aa4ccc(bundle);
        this.f20123xd10c0bdb = bundle.getString("__midas_ability_activity__payItem");
        this.f20121x2dd08d = bundle.getString("__midas_ability_activity__area");
        this.f20124xc53e84aa = bundle.getString("__midas_ability_activity__platId");
        this.f20122x94b912ea = bundle.getString("__midas_ability_activity__partition");
        this.f20125xc8d74431 = bundle.getString("__midas_ability_activity__roleId");
        this.f20126xf0194421 = bundle.getString("__midas_ability_activity__roleName");
        this.f20120xab2f7e36 = bundle.getString("__midas_ability_activity__action");
        this.f20127x670ecb5a = bundle.getString("__midas_ability_activity__sceneInfo");
        android.os.Bundle bundle2 = bundle.getBundle("__midas_ability_activity__shareInfo");
        if (bundle2 != null) {
            this.f20128xa1af212d = com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare.m41428xe104a180(bundle2);
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.AbstractC4737x67fca45f, com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39
    /* renamed from: toBundle */
    public android.os.Bundle mo41425x792022dd() {
        android.os.Bundle mo41425x792022dd = super.mo41425x792022dd();
        mo41425x792022dd.putString("__midas_ability_activity__payItem", this.f20123xd10c0bdb);
        mo41425x792022dd.putString("__midas_ability_activity__area", this.f20121x2dd08d);
        mo41425x792022dd.putString("__midas_ability_activity__platId", this.f20124xc53e84aa);
        mo41425x792022dd.putString("__midas_ability_activity__partition", this.f20122x94b912ea);
        mo41425x792022dd.putString("__midas_ability_activity__roleId", this.f20125xc8d74431);
        mo41425x792022dd.putString("__midas_ability_activity__roleName", this.f20126xf0194421);
        mo41425x792022dd.putString("__midas_ability_activity__action", this.f20120xab2f7e36);
        mo41425x792022dd.putString("__midas_ability_activity__sceneInfo", this.f20127x670ecb5a);
        com.p314xaae8f345.p592x631407a.api.p593xb871b52a.C4736x50cb0361.AbsShare absShare = this.f20128xa1af212d;
        if (absShare != null) {
            mo41425x792022dd.putBundle("__midas_ability_activity__shareInfo", absShare.mo41425x792022dd());
        }
        return mo41425x792022dd;
    }

    @Override // com.p314xaae8f345.p592x631407a.api.p593xb871b52a.AbstractC4737x67fca45f
    /* renamed from: toString */
    public java.lang.String mo41426x9616526c() {
        return super.mo41426x9616526c() + "|payItem=" + this.f20123xd10c0bdb + "|area=" + this.f20121x2dd08d + "|platId=" + this.f20124xc53e84aa + "|partition=" + this.f20122x94b912ea + "|roleId=" + this.f20125xc8d74431 + "|roleName=" + this.f20126xf0194421 + "|action=" + this.f20120xab2f7e36 + "|sceneInfo=" + this.f20127x670ecb5a + "|shareInfo=" + this.f20128xa1af212d;
    }
}
