package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f232676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f232677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f232678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk4.u f232679g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var, android.widget.FrameLayout frameLayout, pk4.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f232677e = h6Var;
        this.f232678f = frameLayout;
        this.f232679g = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g6(this.f232677e, this.f232678f, this.f232679g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f232676d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var = this.f232677e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f6(h6Var, null);
            this.f232676d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, f6Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h6Var.f232712d, "init mediaInfoList:" + linkedList.size());
        boolean isEmpty = linkedList.isEmpty();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (isEmpty) {
            return f0Var;
        }
        android.widget.FrameLayout frameLayout = this.f232678f;
        frameLayout.setAlpha(0.0f);
        df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = h6Var.m158354x19263085();
        ((cf0.c0) tVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29 textureViewSurfaceTextureListenerC18694xeac4a29 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29(context);
        textureViewSurfaceTextureListenerC18694xeac4a29.setId(com.p314xaae8f345.mm.R.id.k0o);
        textureViewSurfaceTextureListenerC18694xeac4a29.mo72015xdc5ec5c6(this.f232679g);
        textureViewSurfaceTextureListenerC18694xeac4a29.mo72018xc6c93354(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c6());
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        frameLayout.removeAllViews();
        frameLayout.addView(textureViewSurfaceTextureListenerC18694xeac4a29, layoutParams);
        textureViewSurfaceTextureListenerC18694xeac4a29.mo72017x764d819b(true);
        textureViewSurfaceTextureListenerC18694xeac4a29.mo72014x764cf626(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((jk4.f) next).f316011o > 0) {
                arrayList.add(next);
            }
        }
        textureViewSurfaceTextureListenerC18694xeac4a29.mo72016xdb523460(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(textureViewSurfaceTextureListenerC18694xeac4a29.f256097d, "startIgnoreMusicPosition");
        textureViewSurfaceTextureListenerC18694xeac4a29.f256099f.k();
        textureViewSurfaceTextureListenerC18694xeac4a29.f256100g = -1L;
        boolean z17 = h6Var.f232720o;
        java.lang.String str = h6Var.f232712d;
        if (z17) {
            h6Var.f232720o = false;
            if (h6Var.m158359x1e885992().getBooleanExtra("key_seek_to_start", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "first time play and music seek to start");
            } else {
                int a17 = kl3.t.g().a().a();
                pk4.c cVar = h6Var.f232719n;
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).d(a17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "first time play and music seek to " + a17);
            }
        } else {
            int a18 = kl3.t.g().a().a();
            pk4.c cVar2 = h6Var.f232719n;
            if (cVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar2).d(a18);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "first time play and music seek to " + a18);
        }
        textureViewSurfaceTextureListenerC18694xeac4a29.mo72020x729b6193(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d6(h6Var));
        textureViewSurfaceTextureListenerC18694xeac4a29.mo72013x5c70347a(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e6(frameLayout));
        textureViewSurfaceTextureListenerC18694xeac4a29.setKeepScreenOn(true);
        h6Var.f232719n = textureViewSurfaceTextureListenerC18694xeac4a29;
        return f0Var;
    }
}
