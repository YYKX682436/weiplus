package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269779d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269779d = activityC19519x7af4daf3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$19", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269779d;
        if (action == 0) {
            activityC19519x7af4daf3.S1 = motionEvent.getX();
            activityC19519x7af4daf3.T1 = motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 && activityC19519x7af4daf3.f269681n.k0(motionEvent.getX(), motionEvent.getY()) == null) {
            float abs = java.lang.Math.abs(activityC19519x7af4daf3.S1 - motionEvent.getX());
            float abs2 = java.lang.Math.abs(activityC19519x7af4daf3.T1 - motionEvent.getY());
            if (abs < 30.0f && abs2 < 30.0f) {
                if (activityC19519x7af4daf3.f269687r.getVisibility() != 8) {
                    mz4.a0 a0Var = activityC19519x7af4daf3.f269688s;
                    if (a0Var != null) {
                        a0Var.f414753a.dismiss();
                    }
                    activityC19519x7af4daf3.f269687r.setVisibility(8);
                } else {
                    mz4.d dVar = activityC19519x7af4daf3.J1;
                    int D = dVar.D() - 1;
                    iz4.c l17 = dVar.l(D);
                    if (l17 != null) {
                        boolean z17 = l17.f377637b;
                        dVar.h();
                        l17.f377637b = true;
                        l17.f377643h = false;
                        l17.f377638c = -1;
                        if (D < activityC19519x7af4daf3.f269682o.mo1894x7e414b06()) {
                            activityC19519x7af4daf3.f269682o.m8147xed6e4d18(D);
                        }
                        activityC19519x7af4daf3.z7(true, 50L);
                        activityC19519x7af4daf3.y7(1, 0L);
                        if (activityC19519x7af4daf3.C1 && z17) {
                            activityC19519x7af4daf3.f269674J.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.n(this), 100L);
                        }
                    }
                }
            }
        } else if (motionEvent.getAction() == 2) {
            float abs3 = java.lang.Math.abs(activityC19519x7af4daf3.S1 - motionEvent.getX());
            float abs4 = java.lang.Math.abs(activityC19519x7af4daf3.T1 - motionEvent.getY());
            if (abs3 > 120.0f || abs4 > 120.0f) {
                if (activityC19519x7af4daf3.C1) {
                    if (nz4.y.h().m() == 1) {
                        activityC19519x7af4daf3.b5();
                        nz4.y.h().c();
                    }
                } else if (!activityC19519x7af4daf3.L) {
                    activityC19519x7af4daf3.b5();
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$19", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
