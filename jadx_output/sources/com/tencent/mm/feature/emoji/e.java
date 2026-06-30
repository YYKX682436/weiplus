package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes10.dex */
public class e extends i95.w implements com.tencent.mm.feature.emoji.api.j5 {
    public com.tencent.mm.plugin.gif.b wi(java.lang.String str, java.io.InputStream inputStream) {
        com.tencent.mm.plugin.gif.d c17 = com.tencent.mm.plugin.gif.d.c();
        if (inputStream == null) {
            c17.getClass();
            return null;
        }
        lt0.f fVar = (lt0.f) c17.f142129b;
        com.tencent.mm.plugin.gif.b bVar = fVar.get(str) != null ? (com.tencent.mm.plugin.gif.b) ((java.lang.ref.WeakReference) fVar.get(str)).get() : null;
        if (bVar != null) {
            return bVar;
        }
        com.tencent.mm.plugin.gif.k kVar = new com.tencent.mm.plugin.gif.k(inputStream);
        fVar.put(str, new java.lang.ref.WeakReference(kVar));
        return kVar;
    }
}
