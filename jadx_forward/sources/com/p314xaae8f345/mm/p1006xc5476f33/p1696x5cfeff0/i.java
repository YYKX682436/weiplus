package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f f218754d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f) {
        this.f218754d = textureViewSurfaceTextureListenerC15528xde21bc5f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = this.f218754d;
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218570y = true;
        textureViewSurfaceTextureListenerC15528xde21bc5f.setOnClickListener(null);
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218559n.setVisibility(4);
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218558m.setVisibility(0);
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218565t.mo167283x6761d4f();
        tz2.i iVar = (tz2.i) textureViewSurfaceTextureListenerC15528xde21bc5f.f218565t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.h(this);
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumber", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b);
        e72.e eVar = iVar.F;
        tz2.g gVar = new tz2.g(iVar, hVar);
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "start record");
        s75.d.c(new e72.c(eVar, gVar, null), "FaceVoice_record", 10);
        textureViewSurfaceTextureListenerC15528xde21bc5f.f218558m.b();
        vz2.c.b().f137728t = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120763xed82fe04(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, null);
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
