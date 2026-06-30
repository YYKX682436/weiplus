package um5;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.w f510718d;

    public r(um5.w wVar) {
        this.f510718d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.w wVar = this.f510718d;
        java.lang.String c17 = wVar.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createEGLEnvironment, size:[");
        sb6.append(wVar.f510727c);
        sb6.append(", ");
        sb6.append(wVar.f510728d);
        sb6.append("], surface:");
        android.view.Surface surface = wVar.f510731g;
        sb6.append(surface != null ? surface.hashCode() : 0);
        xm5.b.c(c17, sb6.toString(), new java.lang.Object[0]);
        android.view.Surface surface2 = wVar.f510731g;
        if (surface2 != null) {
            wVar.f510730f = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719(wVar.f510727c, wVar.f510728d, surface2);
        } else {
            wVar.f510730f = new com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719(wVar.f510727c, wVar.f510728d, null);
        }
        um5.w wVar2 = this.f510718d;
        com.p314xaae8f345.mm.p2825x7e128009.C22965x6f780cba c22965x6f780cba = wVar2.f510725a;
        c22965x6f780cba.c();
        c22965x6f780cba.e(wVar2.f510726b);
        this.f510718d.f510732h = new um5.y();
        this.f510718d.f510734j = true;
        um5.x xVar = this.f510718d.f510742r;
        xVar.getClass();
        xVar.f510748d = java.lang.System.currentTimeMillis() - xVar.f510747c;
        um5.w wVar3 = this.f510718d;
        synchronized (wVar3.f510738n) {
            java.util.Iterator it = wVar3.f510738n.iterator();
            while (it.hasNext()) {
                ((yz5.a) it.next()).mo152xb9724478();
            }
            wVar3.f510738n.clear();
        }
        xm5.b.c(this.f510718d.c(), "initEGL finished", new java.lang.Object[0]);
    }
}
