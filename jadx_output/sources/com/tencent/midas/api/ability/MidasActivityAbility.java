package com.tencent.midas.api.ability;

/* loaded from: classes13.dex */
public class MidasActivityAbility extends com.tencent.midas.api.ability.MidasBaseAbility {
    private static final java.lang.String BUNDLE_PREFIX = "__midas_ability_activity__";
    public java.lang.String action;
    public java.lang.String area;
    public java.lang.String partition;
    public java.lang.String payItem;
    public java.lang.String platId;
    public java.lang.String roleId;
    public java.lang.String roleName;
    public java.lang.String sceneInfo;
    public com.tencent.midas.api.ability.MidasActivityAbility.AbsShare shareInfo;

    /* loaded from: classes13.dex */
    public static abstract class AbsQQShare extends com.tencent.midas.api.ability.MidasActivityAbility.AbsShare {
        public boolean hideQzone = false;
        public java.lang.String arkJson = "";

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.hideQzone = bundle.getBoolean(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare.class.getSimpleName() + "_hideQzone");
            this.arkJson = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare.class.getSimpleName() + "_arkJson");
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putBoolean(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare.class.getSimpleName() + "_hideQzone", this.hideQzone);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare.class.getSimpleName() + "_arkJson", this.arkJson);
            return bundle;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public java.lang.String toString() {
            return super.toString() + "|hideQzone=" + this.hideQzone + "|arkJson=" + this.arkJson;
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class AbsShare implements com.tencent.midas.api.ability.IMidasAbility {
        protected static final java.lang.String TYPE_KEY = "shareType";
        protected static final int TYPE_QQ_MINIPROGRAM = 2;
        protected static final int TYPE_QQ_WEB = 1;
        protected static final int TYPE_WX_MINIPROGRAM = 4;
        protected static final int TYPE_WX_WEB = 3;

        public static com.tencent.midas.api.ability.MidasActivityAbility.AbsShare createChild(android.os.Bundle bundle) {
            int i17 = bundle.getInt("__midas_ability_activity__shareType");
            if (i17 == 1) {
                com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare qQWebShare = new com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare();
                qQWebShare.fromBundle(bundle);
                return qQWebShare;
            }
            if (i17 == 2) {
                com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare qQMiniProgramShare = new com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare();
                qQMiniProgramShare.fromBundle(bundle);
                return qQMiniProgramShare;
            }
            if (i17 == 3) {
                com.tencent.midas.api.ability.MidasActivityAbility.WXWebShare wXWebShare = new com.tencent.midas.api.ability.MidasActivityAbility.WXWebShare();
                wXWebShare.fromBundle(bundle);
                return wXWebShare;
            }
            if (i17 != 4) {
                return null;
            }
            com.tencent.midas.api.ability.MidasActivityAbility.WXMiniProgramShare wXMiniProgramShare = new com.tencent.midas.api.ability.MidasActivityAbility.WXMiniProgramShare();
            wXMiniProgramShare.fromBundle(bundle);
            return wXMiniProgramShare;
        }

        @Override // com.tencent.midas.api.ability.IMidasAbility
        public void fromBundle(android.os.Bundle bundle) {
        }

        @Override // com.tencent.midas.api.ability.IMidasAbility
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("__midas_ability_activity__shareType", type());
            return bundle;
        }

        public java.lang.String toString() {
            return "shareType=" + type();
        }

        public abstract int type();
    }

    /* loaded from: classes13.dex */
    public static abstract class AbsWXShare extends com.tencent.midas.api.ability.MidasActivityAbility.AbsShare {
        public java.lang.String title = "";
        public java.lang.String description = "";
        public byte[] thumbData = null;
        public int scene = 0;
        public java.lang.String transaction = "";
        public java.lang.String userOpenId = "";

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.title = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_title");
            this.description = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_description");
            this.thumbData = bundle.getByteArray(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_thumbData");
            this.scene = bundle.getInt(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_scene");
            this.transaction = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_transaction");
            this.userOpenId = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_userOpenId");
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_title", this.title);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_description", this.description);
            bundle.putByteArray(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_thumbData", this.thumbData);
            bundle.putInt(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_scene", this.scene);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_transaction", this.transaction);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare.class.getSimpleName() + "_userOpenId", this.userOpenId);
            return bundle;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public java.lang.String toString() {
            return super.toString() + "|title=" + this.title + "|description=" + this.description + "|thumbData=" + this.thumbData + "|scene=" + this.scene + "|transaction=" + this.transaction + "|userOpenId=" + this.userOpenId;
        }
    }

    /* loaded from: classes13.dex */
    public static class QQMiniProgramShare extends com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare {
        public java.lang.String imageUrl;
        public java.lang.String miniProgramType;
        public java.lang.String summary;
        public java.lang.String title;

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.title = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_title");
            this.summary = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_summary");
            this.imageUrl = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_imageUrl");
            this.miniProgramType = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_miniProgramType");
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_title", this.title);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_summary", this.summary);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_imageUrl", this.imageUrl);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQMiniProgramShare.class.getSimpleName() + "_miniProgramType", this.miniProgramType);
            return bundle;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public java.lang.String toString() {
            return super.toString() + "|title=" + this.title + "|summary=" + this.summary + "|imageUrl=" + this.imageUrl + "|miniProgramType=" + this.miniProgramType;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public int type() {
            return 2;
        }
    }

    /* loaded from: classes13.dex */
    public static class QQWebShare extends com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare {
        public java.lang.String appName;
        public java.lang.String imageUrl;
        public java.lang.String summary;
        public java.lang.String title;

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.title = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_title");
            this.summary = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_summary");
            this.imageUrl = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_imageUrl");
            this.appName = bundle.getString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_appName");
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_title", this.title);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_summary", this.summary);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_imageUrl", this.imageUrl);
            bundle.putString(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.QQWebShare.class.getSimpleName() + "_appName", this.appName);
            return bundle;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsQQShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public java.lang.String toString() {
            return super.toString() + "|title=" + this.title + "|summary=" + this.summary + "|imageUrl=" + this.imageUrl + "|appName=" + this.appName;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public int type() {
            return 1;
        }
    }

    /* loaded from: classes13.dex */
    public static class WXMiniProgramShare extends com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare {
        public int miniprogramType;
        public boolean withShareTicket;

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.withShareTicket = bundle.getBoolean(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.WXMiniProgramShare.class.getSimpleName() + "_withShareTicket");
            this.miniprogramType = bundle.getInt(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.WXMiniProgramShare.class.getSimpleName() + "_miniprogramType");
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putBoolean(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.WXMiniProgramShare.class.getSimpleName() + "_withShareTicket", this.withShareTicket);
            bundle.putInt(com.tencent.midas.api.ability.MidasActivityAbility.BUNDLE_PREFIX + com.tencent.midas.api.ability.MidasActivityAbility.WXMiniProgramShare.class.getSimpleName() + "_miniprogramType", this.miniprogramType);
            return bundle;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public java.lang.String toString() {
            return super.toString() + "|withShareTicket=" + this.withShareTicket + "|miniprogramType=" + this.miniprogramType;
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public int type() {
            return 4;
        }
    }

    /* loaded from: classes13.dex */
    public static class WXWebShare extends com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare {
        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare, com.tencent.midas.api.ability.IMidasAbility
        public android.os.Bundle toBundle() {
            return super.toBundle();
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsWXShare, com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public java.lang.String toString() {
            return super.toString();
        }

        @Override // com.tencent.midas.api.ability.MidasActivityAbility.AbsShare
        public int type() {
            return 3;
        }
    }

    @Override // com.tencent.midas.api.ability.MidasBaseAbility, com.tencent.midas.api.ability.IMidasAbility
    public void fromBundle(android.os.Bundle bundle) {
        super.fromBundle(bundle);
        this.payItem = bundle.getString("__midas_ability_activity__payItem");
        this.area = bundle.getString("__midas_ability_activity__area");
        this.platId = bundle.getString("__midas_ability_activity__platId");
        this.partition = bundle.getString("__midas_ability_activity__partition");
        this.roleId = bundle.getString("__midas_ability_activity__roleId");
        this.roleName = bundle.getString("__midas_ability_activity__roleName");
        this.action = bundle.getString("__midas_ability_activity__action");
        this.sceneInfo = bundle.getString("__midas_ability_activity__sceneInfo");
        android.os.Bundle bundle2 = bundle.getBundle("__midas_ability_activity__shareInfo");
        if (bundle2 != null) {
            this.shareInfo = com.tencent.midas.api.ability.MidasActivityAbility.AbsShare.createChild(bundle2);
        }
    }

    @Override // com.tencent.midas.api.ability.MidasBaseAbility, com.tencent.midas.api.ability.IMidasAbility
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = super.toBundle();
        bundle.putString("__midas_ability_activity__payItem", this.payItem);
        bundle.putString("__midas_ability_activity__area", this.area);
        bundle.putString("__midas_ability_activity__platId", this.platId);
        bundle.putString("__midas_ability_activity__partition", this.partition);
        bundle.putString("__midas_ability_activity__roleId", this.roleId);
        bundle.putString("__midas_ability_activity__roleName", this.roleName);
        bundle.putString("__midas_ability_activity__action", this.action);
        bundle.putString("__midas_ability_activity__sceneInfo", this.sceneInfo);
        com.tencent.midas.api.ability.MidasActivityAbility.AbsShare absShare = this.shareInfo;
        if (absShare != null) {
            bundle.putBundle("__midas_ability_activity__shareInfo", absShare.toBundle());
        }
        return bundle;
    }

    @Override // com.tencent.midas.api.ability.MidasBaseAbility
    public java.lang.String toString() {
        return super.toString() + "|payItem=" + this.payItem + "|area=" + this.area + "|platId=" + this.platId + "|partition=" + this.partition + "|roleId=" + this.roleId + "|roleName=" + this.roleName + "|action=" + this.action + "|sceneInfo=" + this.sceneInfo + "|shareInfo=" + this.shareInfo;
    }
}
