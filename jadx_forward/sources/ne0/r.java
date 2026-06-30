package ne0;

@j95.b
/* loaded from: classes3.dex */
public final class r extends i95.w implements oe0.x, oe0.t {
    public void Ai(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicLiveCardOuterService", "register appId:".concat(appId));
        xg4.m mVar = xg4.m.f535979a;
        synchronized (mVar) {
            if (!mVar.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "register not open!");
                return;
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) xg4.m.f535981c).mo141623x754a37bb()).mo50300x3fa464aa(new xg4.l(xg4.m.f535983e));
            if (xg4.m.f535980b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "has registered");
                xg4.p pVar = xg4.m.f535980b;
                if (pVar != null) {
                    pVar.N1();
                }
                return;
            }
            xg4.p pVar2 = new xg4.p();
            pVar2.X0();
            xg4.k kVar = new xg4.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardService", "register AppId:".concat(appId));
            pVar2.D = kVar;
            pVar2.N1();
            xg4.m.f535980b = pVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "register AppId:".concat(appId));
        }
    }

    public void Bi(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        xg4.m mVar = xg4.m.f535979a;
        xg4.p pVar = xg4.m.f535980b;
        if (pVar != null) {
            pVar.F1(id6);
        }
    }

    public void Di(oe0.w wVar) {
        if (!xg4.m.f535979a.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "setFinderLiveCallback not open!");
            return;
        }
        xg4.p pVar = xg4.m.f535980b;
        if (pVar != null) {
            java.util.Objects.toString(wVar);
            oe0.w wVar2 = pVar.B;
            if (wVar2 != null) {
                wVar2.hashCode();
            }
            if (wVar != null) {
                wVar.hashCode();
            }
            pVar.B = wVar;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        xg4.m.f535979a.b();
    }

    public hq0.e0 wi(java.lang.Object target, android.content.Context context, oe0.u extData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        xg4.m mVar = xg4.m.f535979a;
        java.lang.String a17 = extData.a();
        xg4.p pVar = xg4.m.f535980b;
        if (pVar != null) {
            return hq0.i0.K0(pVar, target, context, "wxe208ce76dfa39515", "frames", a17, false, 32, null);
        }
        return null;
    }
}
