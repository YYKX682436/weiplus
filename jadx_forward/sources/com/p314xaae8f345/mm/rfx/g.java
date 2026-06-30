package com.p314xaae8f345.mm.rfx;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 f273762d;

    public g(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17) {
        this.f273762d = textureViewSurfaceTextureListenerC20956x37a43b17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        synchronized (this.f273762d) {
            arrayList2 = this.f273762d.f39133xbc3c20e4;
            arrayList = new java.util.ArrayList(arrayList2);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ym5.c2) ((com.p314xaae8f345.mm.rfx.h) it.next())).f544763a.mo66152xaf961065();
        }
    }
}
