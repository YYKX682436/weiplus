package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class e7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.uc {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f171216a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f171217b;

    /* renamed from: c, reason: collision with root package name */
    public int f171218c = 0;

    public e7(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f171216a = c11510xdd90c2f2;
        this.f171217b = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.uc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc
    public void a(android.view.MotionEvent motionEvent) {
        ak3.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171216a;
        if (g(c11510xdd90c2f2) && (c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && (aVar = ((rh1.e) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).V2().f381644d).f477163r.f477161a.f87119h) != null) {
            aVar.a(motionEvent);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.uc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc
    public int b(boolean z17) {
        ak3.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171216a;
        if (g(c11510xdd90c2f2) && (c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && (aVar = ((rh1.e) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).V2().f381644d).f477163r.f477161a.f87119h) != null) {
            return aVar.h(z17);
        }
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.uc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc
    public void c(android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12751x125fa002 c12751x125fa002;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171216a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = c11510xdd90c2f2.x0();
        if (x07 == null || (w2Var = x07.m52169xfdaa7672()) == null || x07.r(w2Var) != null) {
            w2Var = null;
        }
        if (w2Var == null || (c12751x125fa002 = c11510xdd90c2f2.C1) == null) {
            return;
        }
        c12751x125fa002.setTranslationX(i17);
        c12751x125fa002.setTranslationY(i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc
    public void d(int i17, float f17) {
        dk3.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171216a;
        if (1 == i17 && this.f171218c != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeSwipeBackListener", "convertActivityToTranslucent onScrollStateChange");
            android.app.Activity a17 = q75.a.a(this.f171217b);
            if (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
                db5.f.c(a17, null);
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) a17).v7() && (x07 = c11510xdd90c2f2.x0()) != null && (m52169xfdaa7672 = x07.m52169xfdaa7672()) != null && x07.r(m52169xfdaa7672) == null) {
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() + 200;
                    m52169xfdaa7672.f407437z = uptimeMillis;
                    m52169xfdaa7672.h();
                    z26.d dVar = new z26.d(m52169xfdaa7672);
                    m52169xfdaa7672.B = dVar;
                    m52169xfdaa7672.A.mo50295x41bd0e60(dVar, uptimeMillis);
                }
            }
        }
        if (g(c11510xdd90c2f2) && (c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2;
            if (1 == i17 && 1 != this.f171218c && (fVar = o6Var.V2().f381648h) != null) {
                ((dk3.e) fVar).c();
            }
            ak3.a aVar = ((rh1.e) o6Var.V2().f381644d).f477163r.f477161a.f87119h;
            if (aVar != null) {
                aVar.f(f17);
            }
        }
        this.f171218c = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.uc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc
    public void e(int i17) {
        ak3.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171216a;
        if (g(c11510xdd90c2f2) && (c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && (aVar = ((rh1.e) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).V2().f381644d).f477163r.f477161a.f87119h) != null) {
            aVar.c(1, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.uc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f171216a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = c11510xdd90c2f2.x0().m52169xfdaa7672();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = c11510xdd90c2f2.x0();
        x07.getClass();
        x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l3(x07, m52169xfdaa7672, "scene_swipe_back", null));
        return true;
    }

    public final boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (!(c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2;
        return (o6Var.V2() == null || o6Var.V2().a()) ? false : true;
    }
}
