package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class e1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 f219797d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 c15622xdd86a927) {
        this.f219797d = c15622xdd86a927;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.C15622xdd86a927 c15622xdd86a927 = this.f219797d;
        if (action != 0) {
            if (action == 1) {
                if (c15622xdd86a927.f219760u) {
                    c15622xdd86a927.f219760u = false;
                } else {
                    if (c15622xdd86a927.f219759t) {
                        c15622xdd86a927.l(true, false);
                        c15622xdd86a927.f219759t = false;
                        c15622xdd86a927.getClass();
                    } else {
                        c15622xdd86a927.l(false, true);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.c1(c15622xdd86a927), 100L);
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0 y0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.j1) c15622xdd86a927.f219764d);
                    y0Var.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var = y0Var.f219899c;
                    b1Var.f219786h = currentTimeMillis;
                    if (b1Var.f219781c && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f219897a)) {
                        b1Var.f219782d.setVisibility(8);
                    }
                }
            }
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(c15622xdd86a927.getContext())) {
            c15622xdd86a927.f219760u = false;
            c15622xdd86a927.f219759t = false;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            c15622xdd86a927.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0 y0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.j1) c15622xdd86a927.f219764d);
            y0Var2.getClass();
            y0Var2.f219899c.f219785g = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x0 x0Var = c15622xdd86a927.f219758s;
            x0Var.f219891n = 6;
            x0Var.invalidateSelf();
            c15622xdd86a927.l(false, false);
            c15622xdd86a927.f219757r.setVisibility(8);
        } else {
            c15622xdd86a927.f219760u = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) c15622xdd86a927.f219764d).a(12, 0, 0);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
