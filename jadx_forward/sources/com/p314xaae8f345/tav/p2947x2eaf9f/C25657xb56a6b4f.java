package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AssetExtension */
/* loaded from: classes10.dex */
public class C25657xb56a6b4f {

    /* renamed from: SCENE_EXPORT */
    public static final java.lang.String f47245x96f5d2e7 = "export";

    /* renamed from: SCENE_PLAY */
    public static final java.lang.String f47246x9aae7f27 = "play";

    /* renamed from: SCENE_THUMBNAIL */
    public static final java.lang.String f47247x9eebe4b9 = "thumbnail";

    /* renamed from: extensionMap */
    private volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> f47248x243b349d = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: scene */
    private final java.lang.String f47249x683188c;

    public C25657xb56a6b4f(java.lang.String str) {
        this.f47249x683188c = str;
    }

    /* renamed from: addExtension */
    public void m96424xd344e89e(java.lang.String str, java.lang.Object obj) {
        this.f47248x243b349d.put(str, obj);
    }

    /* renamed from: containsKey */
    public boolean m96425xc6607c0(java.lang.String str) {
        return this.f47248x243b349d.containsKey(str);
    }

    /* renamed from: containsValue */
    public boolean m96426x8b9c2692(java.lang.String str) {
        return this.f47248x243b349d.containsValue(str);
    }

    /* renamed from: getScene */
    public java.lang.String m96427x7520bed6() {
        return this.f47249x683188c;
    }

    /* renamed from: remove */
    public java.lang.Object m96428xc84af884(java.lang.String str) {
        return this.f47248x243b349d.remove(str);
    }
}
