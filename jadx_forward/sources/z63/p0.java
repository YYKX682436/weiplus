package z63;

/* loaded from: classes14.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551970d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551970d = activityC16081x2d23fdab;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d c22704xf0a3bc4d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551970d;
        activityC16081x2d23fdab.d7();
        android.view.View view2 = activityC16081x2d23fdab.f223766v;
        if ((view2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) && (view2.getParent() instanceof android.widget.RelativeLayout)) {
            ((android.widget.RelativeLayout) activityC16081x2d23fdab.f223766v.getParent()).setTag(1);
        }
        z63.m mVar = new z63.m(activityC16081x2d23fdab);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d c22704xf0a3bc4d2 = mVar.f551961h;
        int mo82052xfb87f0b3 = c22704xf0a3bc4d2 != null ? c22704xf0a3bc4d2.mo82052xfb87f0b3() : 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d c22704xf0a3bc4d3 = mVar.f551961h;
        int mo82051x74d1c8ca = c22704xf0a3bc4d3 != null ? c22704xf0a3bc4d3.mo82051x74d1c8ca() : 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d c22704xf0a3bc4d4 = mVar.f551961h;
        int mo82050xa7d8f7a3 = c22704xf0a3bc4d4 != null ? c22704xf0a3bc4d4.mo82050xa7d8f7a3() : 0;
        mVar.f551962i = new z63.o0(this);
        if (mo82052xfb87f0b3 >= 0 && mo82051x74d1c8ca >= 0 && mo82050xa7d8f7a3 >= 0 && (c22704xf0a3bc4d = mVar.f551961h) != null) {
            int max = java.lang.Math.max(mo82051x74d1c8ca - 1, 0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) c22704xf0a3bc4d.f293772d;
            x0Var.d(mo82052xfb87f0b3, max, mo82050xa7d8f7a3);
            x0Var.i();
            x0Var.h();
            c22704xf0a3bc4d.b();
        }
        java.util.Locale locale = java.util.Locale.US;
        java.util.Calendar calendar = java.util.Calendar.getInstance(locale);
        calendar.set(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654, 0, 1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d c22704xf0a3bc4d5 = mVar.f551961h;
        if (c22704xf0a3bc4d5 != null) {
            c22704xf0a3bc4d5.mo82054xf0a11a5e(calendar.getTimeInMillis());
        }
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale);
        calendar2.set(2029, 11, 31);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d c22704xf0a3bc4d6 = mVar.f551961h;
        if (c22704xf0a3bc4d6 != null) {
            c22704xf0a3bc4d6.mo82053xe3874070(calendar2.getTimeInMillis());
        }
        if (mVar.f551957d != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d c22704xf0a3bc4d7 = mVar.f551961h;
            if (c22704xf0a3bc4d7 != null) {
                c22704xf0a3bc4d7.b();
            }
            mVar.f551957d.show();
        }
        activityC16081x2d23fdab.Y6(0);
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
