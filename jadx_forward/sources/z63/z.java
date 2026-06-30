package z63;

/* loaded from: classes5.dex */
public class z implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551985d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551985d = activityC16081x2d23fdab;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.util.ArrayList arrayList;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551985d;
        if (activityC16081x2d23fdab.G) {
            activityC16081x2d23fdab.f7(4);
            return;
        }
        activityC16081x2d23fdab.getClass();
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i17 = 1;
            while (true) {
                int size = activityC16081x2d23fdab.B.N.size();
                arrayList = activityC16081x2d23fdab.M;
                if (i17 > size) {
                    break;
                }
                y63.b bVar = (y63.b) activityC16081x2d23fdab.B.N.get(java.lang.Integer.valueOf(i17));
                if (bVar != null) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f541189e.trim()) && ((android.view.View) arrayList.get(i17 - 1)).getTag() == null) {
                        arrayList2.add(java.lang.Integer.valueOf(i17));
                    } else {
                        arrayList3.add(bVar);
                    }
                }
                i17++;
            }
            java.util.Collections.sort(arrayList2, new z63.v(activityC16081x2d23fdab));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                if (num.intValue() - 1 < arrayList.size() && (view = (android.view.View) arrayList.get(num.intValue() - 1)) != null) {
                    activityC16081x2d23fdab.f223758n.removeView(view);
                    arrayList.remove(num.intValue() - 1);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                i18++;
                ((android.widget.TextView) ((android.view.View) it6.next()).findViewById(com.p314xaae8f345.mm.R.id.gud)).setText(i18 + "");
            }
            activityC16081x2d23fdab.B.N.clear();
            java.util.Iterator it7 = arrayList3.iterator();
            int i19 = 0;
            while (it7.hasNext()) {
                i19++;
                activityC16081x2d23fdab.B.N.put(java.lang.Integer.valueOf(i19), (y63.b) it7.next());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "updateContent Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        if (activityC16081x2d23fdab.B.N.size() < x63.g.w()) {
            activityC16081x2d23fdab.f7(0);
        }
        activityC16081x2d23fdab.f223761q.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551985d;
        if (activityC16081x2d23fdab.G) {
            activityC16081x2d23fdab.f223761q.setVisibility(0);
        }
    }
}
