package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class d1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178083d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1) {
        this.f178083d = abstractActivityC13156x6363e8e1;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorUI$22", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = this.f178083d;
        if (action == 0) {
            abstractActivityC13156x6363e8e1.B = motionEvent.getX();
            abstractActivityC13156x6363e8e1.C = motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 && abstractActivityC13156x6363e8e1.f178030d.k0(motionEvent.getX(), motionEvent.getY()) == null) {
            float abs = java.lang.Math.abs(abstractActivityC13156x6363e8e1.B - motionEvent.getX());
            float abs2 = java.lang.Math.abs(abstractActivityC13156x6363e8e1.C - motionEvent.getY());
            if (abs < 30.0f && abs2 < 30.0f) {
                if (abstractActivityC13156x6363e8e1.f178034h.getVisibility() != 8) {
                    nx1.j jVar = abstractActivityC13156x6363e8e1.f178035i;
                    if (jVar != null) {
                        jVar.f422825a.dismiss();
                    }
                    abstractActivityC13156x6363e8e1.f178034h.setVisibility(8);
                } else {
                    int B = nx1.d.q().B() - 1;
                    ix1.a l17 = nx1.d.q().l(B);
                    if (l17 != null) {
                        boolean z17 = l17.f376845b;
                        nx1.d.q().i();
                        l17.f376845b = true;
                        l17.f376850g = false;
                        l17.f376846c = -1;
                        abstractActivityC13156x6363e8e1.f178031e.m8147xed6e4d18(B);
                        abstractActivityC13156x6363e8e1.k7(true, 50L);
                        abstractActivityC13156x6363e8e1.j7(1, 0L);
                        if (abstractActivityC13156x6363e8e1.f178037n && z17) {
                            abstractActivityC13156x6363e8e1.f178040q.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c1(this), 100L);
                        }
                    }
                }
            }
        } else if (motionEvent.getAction() == 2) {
            float abs3 = java.lang.Math.abs(abstractActivityC13156x6363e8e1.B - motionEvent.getX());
            float abs4 = java.lang.Math.abs(abstractActivityC13156x6363e8e1.C - motionEvent.getY());
            if (abs3 > 120.0f || abs4 > 120.0f) {
                if (abstractActivityC13156x6363e8e1.f178037n) {
                    if (ox1.s.h().m() == 1) {
                        abstractActivityC13156x6363e8e1.b5();
                        ox1.s.h().c();
                    }
                } else if (!abstractActivityC13156x6363e8e1.f178041r) {
                    abstractActivityC13156x6363e8e1.b5();
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/component/editor/EditorUI$22", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
