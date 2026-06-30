package za3;

/* loaded from: classes15.dex */
public class c1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.i1 f552432d;

    public c1(za3.i1 i1Var) {
        this.f552432d = i1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        za3.i1 i1Var = this.f552432d;
        if (action != 0) {
            boolean z17 = true;
            if (action != 1) {
                if (action == 2 && (java.lang.Math.abs(motionEvent.getX() - i1Var.f552490o) > 10.0f || java.lang.Math.abs(motionEvent.getY() - i1Var.f552491p) > 10.0f)) {
                    i1Var.f552492q = true;
                }
            } else if (!i1Var.f552492q && java.lang.System.currentTimeMillis() - i1Var.f552493r < 200) {
                if (i1Var.f552484i) {
                    i1Var.d(false);
                }
                java.util.Collection mo1000x13f1d1cd = i1Var.f552487l.mo1000x13f1d1cd();
                java.util.Iterator it = mo1000x13f1d1cd.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) {
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) next).f226246e.getVisibility() == 0) {
                            break;
                        }
                    }
                }
                for (java.lang.Object obj : mo1000x13f1d1cd) {
                    if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) {
                        if (z17) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) obj).a();
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 c16298xbb1f6725 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) obj;
                            c16298xbb1f6725.f226246e.setVisibility(0);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128 = c16298xbb1f6725.f226254p;
                            if (c16319x94a0c128 != null) {
                                c16319x94a0c128.m66007x89c24a19(c16298xbb1f6725.f226246e);
                            }
                        }
                    }
                }
            }
        } else {
            i1Var.f552490o = motionEvent.getX();
            i1Var.f552491p = motionEvent.getY();
            i1Var.f552493r = java.lang.System.currentTimeMillis();
            i1Var.f552492q = false;
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
