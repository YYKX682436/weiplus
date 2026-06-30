package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes10.dex */
public class e extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5 {
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.b wi(java.lang.String str, java.io.InputStream inputStream) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.d c17 = com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c();
        if (inputStream == null) {
            c17.getClass();
            return null;
        }
        lt0.f fVar = (lt0.f) c17.f223662b;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b bVar = fVar.get(str) != null ? (com.p314xaae8f345.mm.p1006xc5476f33.gif.b) ((java.lang.ref.WeakReference) fVar.get(str)).get() : null;
        if (bVar != null) {
            return bVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(inputStream);
        fVar.put(str, new java.lang.ref.WeakReference(kVar));
        return kVar;
    }
}
