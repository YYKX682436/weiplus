package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes12.dex */
public class c implements kk.h {
    public c(com.p314xaae8f345.mm.p1006xc5476f33.gif.d dVar) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b bVar;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj2;
        if (weakReference == null || (bVar = (com.p314xaae8f345.mm.p1006xc5476f33.gif.b) weakReference.get()) == null || !(bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "recycle bitmap:%s", bVar.toString());
        bVar.b();
    }
}
