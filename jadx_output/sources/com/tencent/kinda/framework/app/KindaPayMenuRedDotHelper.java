package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaPayMenuRedDotHelper implements com.tencent.kinda.gen.KPayMenuRedDotHelper {
    private static final java.lang.String TAG = "KindaPayMenuRedDotHelper";

    private void clearReddotConfigWithId(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "clear reddot: %s", str);
        org.json.JSONObject redDotConfig = getRedDotConfig();
        if (redDotConfig == null) {
            return;
        }
        redDotConfig.remove(str);
        redDotConfig.remove(java.lang.String.format("%s_expiretime", str));
        redDotConfig.remove(java.lang.String.format("%s_wording", str));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, redDotConfig.toString());
    }

    private org.json.JSONObject getRedDotConfig() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KPayMenuRedDotHelper
    public void clearPayMenuRedDot(java.lang.String str) {
        clearReddotConfigWithId(str);
    }

    @Override // com.tencent.kinda.gen.KPayMenuRedDotHelper
    public com.tencent.kinda.gen.KPayMenuRedDotItem getRedDotItemWithRedDotId(java.lang.String str) {
        org.json.JSONObject redDotConfig;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (redDotConfig = getRedDotConfig()) != null) {
            if (!(redDotConfig.optInt(str, 0) == 1)) {
                return new com.tencent.kinda.gen.KPayMenuRedDotItem();
            }
            com.tencent.kinda.gen.KPayMenuRedDotItem kPayMenuRedDotItem = new com.tencent.kinda.gen.KPayMenuRedDotItem();
            kPayMenuRedDotItem.mExpireTime = redDotConfig.optLong(java.lang.String.format("%s_expiretime", str), 0L) / 1000;
            kPayMenuRedDotItem.mWording = redDotConfig.optString(java.lang.String.format("%s_wording", str), "");
            kPayMenuRedDotItem.mItemName = str;
            return kPayMenuRedDotItem;
        }
        return new com.tencent.kinda.gen.KPayMenuRedDotItem();
    }
}
