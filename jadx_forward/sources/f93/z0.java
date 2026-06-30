package f93;

/* loaded from: classes11.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 f342058d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84) {
        this.f342058d = activityC16167x7777ff84;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelCreateUI$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84.f224745o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84 = this.f342058d;
        activityC16167x7777ff84.mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = activityC16167x7777ff84.f224746e;
        if (c21486x59d05a04 != null) {
            android.text.Editable text = c21486x59d05a04.getText();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
            java.lang.String obj = r26.n0.u0(text).toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "checking " + obj);
            if (f93.q5.f341974a.a(activityC16167x7777ff84, obj)) {
                java.util.ArrayList d17 = kz5.c0.d(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactLabelCreateUI", "save new label: " + d17);
                c01.d9.e().g(new e93.a(d17));
                activityC16167x7777ff84.U6(activityC16167x7777ff84.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518214g, vg3.b.f518178e, vg3.c.f518201w, 0, kz5.b0.c(activityC16167x7777ff84.f224750i)));
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String str = activityC16167x7777ff84.f224749h;
                if (str == null) {
                    str = "";
                }
                hashMap.put("note_sid", str);
                java.lang.String str2 = activityC16167x7777ff84.f224750i;
                hashMap.put("add_username", str2 != null ? str2 : "");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("friends_create_tab", null, hashMap, 33926);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelCreateUI$initViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
