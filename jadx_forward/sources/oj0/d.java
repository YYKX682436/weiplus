package oj0;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj0.h f427263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f427264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f427266g;

    public d(oj0.h hVar, yz5.l lVar, java.lang.String str, float f17) {
        this.f427263d = hVar;
        this.f427264e = lVar;
        this.f427265f = str;
        this.f427266g = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj0.h hVar = this.f427263d;
        java.util.List list = hVar.f427281m;
        yz5.l lVar = this.f427264e;
        synchronized (list) {
            ((java.util.ArrayList) hVar.f427281m).add(lVar);
        }
        rs0.g gVar = rs0.i.f480829a;
        gVar.g();
        oj0.h hVar2 = this.f427263d;
        rh0.d0 d0Var = hVar2.f427278j;
        if (d0Var != null) {
            ((p05.l4) d0Var).g(this.f427265f, this.f427266g);
            rh0.d0.c(d0Var, hVar2.f427276h, hVar2.f427277i, 0L, 0, false, false, false, 124, null);
        }
        oj0.h hVar3 = this.f427263d;
        synchronized (hVar3.f427281m) {
            if (((java.util.ArrayList) hVar3.f427281m).size() > 0) {
                ((yz5.l) ((java.util.ArrayList) hVar3.f427281m).remove(0)).mo146xb9724478(gVar.v(hVar3.f427277i, hVar3.f427279k, hVar3.f427280l));
            }
        }
        rs0.h hVar4 = this.f427263d.f427274f;
        if (hVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEGLEnvironment");
            throw null;
        }
        android.opengl.EGLDisplay eGLDisplay = hVar4.f480825a;
        if (hVar4 != null) {
            gVar.x(eGLDisplay, hVar4.f480826b);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEGLEnvironment");
            throw null;
        }
    }
}
