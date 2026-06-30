package a41;

@j95.b
/* loaded from: classes7.dex */
public final class k extends i95.w implements a41.i {

    /* renamed from: d, reason: collision with root package name */
    public y31.f f1189d;

    public void Ai(java.lang.String eventName, java.lang.String eventData) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(eventData, "eventData");
        y31.f fVar = this.f1189d;
        if (fVar != null) {
            if (fVar != null) {
                fVar.F0(eventName, eventData);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "sendEvent eventName:" + eventName + " biz nil, eventData: " + eventData);
        }
    }

    public void Bi(boolean z17) {
        com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "setMute isMute:" + z17);
        y31.f fVar = this.f1189d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "muteAudio mute:" + z17);
            jc3.j0 j0Var = fVar.f459163d;
            if (j0Var != null) {
                rc3.w0 w0Var = (rc3.w0) j0Var;
                w0Var.M(new rc3.s0(w0Var, z17));
            }
        }
    }

    public synchronized void Di(android.widget.FrameLayout frameLayout, x31.a aVar) {
        y31.f fVar;
        y31.f fVar2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startBiz view null:");
        boolean z17 = true;
        sb6.append(frameLayout == null);
        sb6.append(" callback null:");
        if (aVar != null) {
            z17 = false;
        }
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", sb6.toString());
        if (this.f1189d == null) {
            y31.f fVar3 = new y31.f();
            fVar3.f459171o = new a41.j(this);
            this.f1189d = fVar3;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "start");
            pm0.v.X(new y31.e(fVar3));
        }
        if (frameLayout != null && (fVar2 = this.f1189d) != null) {
            fVar2.G0(frameLayout);
        }
        if (aVar != null && (fVar = this.f1189d) != null) {
            fVar.f459166g = aVar;
        }
    }

    public synchronized void Ni() {
        com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "stopBiz");
        y31.f fVar = this.f1189d;
        if (fVar != null) {
            fVar.release();
        }
        this.f1189d = null;
    }

    public void wi() {
        jc3.j0 j0Var;
        com.tencent.mars.xlog.Log.i("MagicNewPlayableFeatureService", "pauseBiz");
        y31.f fVar = this.f1189d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "pause manualPause:" + fVar.f459167h);
            if (fVar.f459167h || (j0Var = fVar.f459163d) == null) {
                return;
            }
            ((rc3.w0) j0Var).pause();
        }
    }
}
