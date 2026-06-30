package lo5;

/* loaded from: classes14.dex */
public final class m extends jq4.y {
    public final lo5.j B;
    public final lo5.i C;
    public int D;
    public int E;
    public com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196.TextureViewSurfaceTextureListenerC22892x75ece15d F;
    public java.util.ArrayList G;
    public er4.r H;
    public final java.util.Map I;

    public m(lo5.j userActionHandler, lo5.i renderViewOp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userActionHandler, "userActionHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderViewOp, "renderViewOp");
        this.B = userActionHandler;
        this.C = renderViewOp;
        this.D = -1;
        this.H = er4.r.MP_ROOM_TYPE_VIDEO;
        this.I = new java.util.LinkedHashMap();
    }

    @Override // jq4.y, jq4.z0
    public void b(boolean z17, boolean z18, boolean z19) {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPFloatCardManager", "dismissCard() called with: quickHide = " + z17 + ", releaseViewAndIntent = " + z18 + ", keepIncomingCard = " + z19 + ", mid: " + this.D + ", renderView: " + this.F);
        super.b(z17, z18, z19);
        if (this.f382758z) {
            com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196.TextureViewSurfaceTextureListenerC22892x75ece15d textureViewSurfaceTextureListenerC22892x75ece15d = this.F;
            if (textureViewSurfaceTextureListenerC22892x75ece15d != null) {
                int i17 = this.D;
                lo5.d dVar = (lo5.d) this.C;
                dVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPFloatCardController", "unbindRenderTarget() called with: mid = " + i17 + ", renderTarget = " + textureViewSurfaceTextureListenerC22892x75ece15d);
                lo5.a aVar = dVar.f401743a.f401747a;
                if (aVar != null) {
                    ((fo5.l0) aVar).b(i17, textureViewSurfaceTextureListenerC22892x75ece15d, false);
                }
                android.view.View view = this.f382781q;
                if (view != null && (frameLayout = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567704kg3)) != null) {
                    frameLayout.removeView(textureViewSurfaceTextureListenerC22892x75ece15d);
                }
            }
            this.F = null;
        }
        this.f382756x = false;
        this.A = false;
        ((java.util.LinkedHashMap) this.I).clear();
        this.G = null;
        this.E = 0;
    }

    @Override // jq4.z0
    public void h() {
        if (this.f382782r == 1) {
            ((jp5.o) i95.n0.c(jp5.o.class)).we(this.H);
        }
        super.h();
    }

    @Override // jq4.z0
    public void i(android.content.Intent intent, java.lang.String toUser) {
        android.view.View view;
        android.widget.FrameLayout frameLayout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        super.i(intent, toUser);
        intent.toString();
        java.util.Objects.toString(this.F);
        if (!this.f382758z || this.D < 0 || this.F != null || this.f382782r == 3) {
            if (!this.A || (view = this.f382769e) == null) {
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567702kg1);
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574121h22);
            android.widget.GridLayout gridLayout = (android.widget.GridLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567703kg2);
            gridLayout.setVisibility(0);
            gridLayout.setColumnCount(13);
            view.post(new lo5.l(this, gridLayout, toUser));
            return;
        }
        android.view.View view2 = this.f382769e;
        if (view2 == null || (frameLayout = (android.widget.FrameLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.f567704kg3)) == null) {
            return;
        }
        android.content.Context context = frameLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196.TextureViewSurfaceTextureListenerC22892x75ece15d textureViewSurfaceTextureListenerC22892x75ece15d = new com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196.TextureViewSurfaceTextureListenerC22892x75ece15d(context, null);
        int i17 = this.D;
        lo5.d dVar = (lo5.d) this.C;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPFloatCardController", "startVideoPreview() called with: mid = " + i17 + ", renderTarget = " + textureViewSurfaceTextureListenerC22892x75ece15d);
        lo5.a aVar = dVar.f401743a.f401747a;
        if (aVar != null) {
            fo5.r0 r0Var = ((fo5.l0) aVar).f346549a;
            textureViewSurfaceTextureListenerC22892x75ece15d.m82966x799007c5(new fo5.k0(r0Var, i17, textureViewSurfaceTextureListenerC22892x75ece15d));
            ro5.b bVar = r0Var.f346630p;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                throw null;
            }
            bVar.i(i17, textureViewSurfaceTextureListenerC22892x75ece15d);
        }
        this.F = textureViewSurfaceTextureListenerC22892x75ece15d;
        view2.post(new lo5.k(frameLayout, textureViewSurfaceTextureListenerC22892x75ece15d));
    }

    @Override // jq4.z0
    public boolean j() {
        return this.H == er4.r.MP_ROOM_TYPE_VIDEO;
    }

    @Override // jq4.y, jq4.z0
    public void k(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPFloatCardManager", "onAccept: ");
        super.k(intent);
        lo5.a aVar = ((lo5.c) this.B).f401742a.f401747a;
        if (aVar != null) {
            ((fo5.l0) aVar).a(lo5.b.f401738e);
        }
    }

    @Override // jq4.z0
    public boolean m() {
        lo5.a aVar = ((lo5.c) this.B).f401742a.f401747a;
        if (aVar == null) {
            return true;
        }
        ((fo5.l0) aVar).a(lo5.b.f401740g);
        return true;
    }

    @Override // jq4.z0
    public void r() {
        lo5.a aVar;
        if (this.f382758z) {
            rq4.s.f480631a.a(this.f382771g, 3, 2);
        } else {
            rq4.s.f480631a.a(this.f382771g, 3, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPFloatCardManager", "onReject: mid " + this.D);
        if (this.f382758z) {
            int i17 = this.D;
            com.p314xaae8f345.mm.p2793xcfa97743.v2.p2800xc84b4196.TextureViewSurfaceTextureListenerC22892x75ece15d textureViewSurfaceTextureListenerC22892x75ece15d = this.F;
            lo5.d dVar = (lo5.d) this.C;
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPFloatCardController", "stopVideoPreview() called with: mid = " + i17 + ", renderTarget = " + textureViewSurfaceTextureListenerC22892x75ece15d);
            if (textureViewSurfaceTextureListenerC22892x75ece15d != null && (aVar = dVar.f401743a.f401747a) != null) {
                ((fo5.l0) aVar).b(i17, textureViewSurfaceTextureListenerC22892x75ece15d, true);
            }
        }
        lo5.a aVar2 = ((lo5.c) this.B).f401742a.f401747a;
        if (aVar2 != null) {
            ((fo5.l0) aVar2).a(lo5.b.f401739f);
        }
    }

    @Override // jq4.z0
    public boolean t() {
        lo5.a aVar = ((lo5.c) this.B).f401742a.f401747a;
        if (aVar == null) {
            return true;
        }
        ((fo5.l0) aVar).a(lo5.b.f401737d);
        return true;
    }
}
