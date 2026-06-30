package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class d2 extends com.tencent.mm.plugin.appbrand.jsapi.audio.c2 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.c2
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        try {
            if (!(lVar.getFileSystem() instanceof com.tencent.mm.plugin.appbrand.appstorage.g2)) {
                return null;
            }
            com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing iWxaFileSystemWithModularizing = (com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing) ((com.tencent.mm.plugin.appbrand.appstorage.g2) lVar.getFileSystem()).b(com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing.class);
            java.util.Objects.requireNonNull(iWxaFileSystemWithModularizing);
            return iWxaFileSystemWithModularizing.openReadPartialInfo(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetAudioStateWxaApp", "getPkgPath with audioSrc(%s), e=%s", str, e17);
            return null;
        }
    }
}
