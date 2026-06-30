package ay3;

/* loaded from: classes10.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486 f96817d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486 activityC17230x7ab03486) {
        this.f96817d = activityC17230x7ab03486;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486 activity = this.f96817d;
        if (itemId == com.p314xaae8f345.mm.R.id.pyz) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486.U6(activity);
            return;
        }
        if (itemId == com.p314xaae8f345.mm.R.id.pyy) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f.class);
            java.util.ArrayList arrayList = ((sx3.b) zVar.a(activity).a(sx3.b.class)).f495083h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((ox3.g) next).f431282d.f497155n != null) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ox3.g gVar = (ox3.g) it6.next();
                gVar.f431286h = true;
                arrayList3.add(gVar);
            }
            final java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
            fVar.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7173x53cdb0a3 c7173x53cdb0a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7173x53cdb0a3();
            c7173x53cdb0a3.f144716g = 13L;
            c7173x53cdb0a3.f144731v = c7173x53cdb0a3.b("extrainfo", "", true);
            c7173x53cdb0a3.k();
            com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(fVar.m158354x19263085());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = fVar.m158354x19263085();
            int i18 = a17.f278669b;
            int i19 = i18 / 2;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(m158354x19263085, i19);
            android.view.View inflate = android.view.LayoutInflater.from(fVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570949dd4, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
            c1073x7e08a787.m7180x25bfb969((i18 * 3) / 4);
            c1073x7e08a787.m7182x53cacfd7(i19);
            y1Var.f293577z = true;
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.pur);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) inflate.findViewById(com.p314xaae8f345.mm.R.id.q1u);
            final android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ptn);
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a(y1Var));
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d(y1Var, arrayList4, fVar));
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(fVar.m158354x19263085(), 1, false));
            c22849x81a93d25.N(new cy3.s(fVar.m158354x19263085()));
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.ringtone.uic.RingtoneAddTingUIC$addRingtoneToTingList$3
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new ox3.s(new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.e(arrayList4, findViewById2));
                }
            }, arrayList4, false);
            android.view.View inflate2 = android.view.LayoutInflater.from(fVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
            android.view.View findViewById3 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.ili);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC", "addRingtoneToTingList", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -2));
            in5.n0.P(c22848x6ddd90cf, inflate2, inflate2.hashCode(), false, 4, null);
            c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
            if (arrayList4.isEmpty()) {
                findViewById2.setEnabled(false);
            } else {
                findViewById2.setEnabled(true);
            }
            y1Var.k(inflate);
            y1Var.d(true);
            y1Var.s();
        }
    }
}
