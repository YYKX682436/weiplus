package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class lj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 f155555d;

    public lj(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871) {
        this.f155555d = activityC11475xf1a02871;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871.f155224h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871 = this.f155555d;
        activityC11475xf1a02871.getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k())};
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Map.Entry entry = entryArr[0];
        java.lang.Object key = entry.getKey();
        java.util.Objects.requireNonNull(key);
        java.lang.Object value = entry.getValue();
        java.util.Objects.requireNonNull(value);
        if (hashMap.put(key, value) != null) {
            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
        }
        ((cy1.a) rVar).Hj("login_account", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        if (com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f514974a;
            android.content.Intent intent = new android.content.Intent(activityC11475xf1a02871, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11432x3f57faf9.class);
            intent.putExtra("mobile_input_purpose", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a028712 = this.f155555d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC11475xf1a028712, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11475xf1a028712.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC11475xf1a028712, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent(activityC11475xf1a02871, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
            intent2.putExtra("mobile_input_purpose", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a028713 = this.f155555d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC11475xf1a028713, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11475xf1a028713.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC11475xf1a028713, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
