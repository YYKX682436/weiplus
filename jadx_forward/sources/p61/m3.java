package p61;

/* loaded from: classes8.dex */
public class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.n3 f433848d;

    public m3(p61.n3 n3Var, p61.o3 o3Var) {
        this.f433848d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r61.s0 s0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/GoogleFriendAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p61.n3 n3Var = this.f433848d;
        p61.l3 l3Var = n3Var.f433861h.f433869q;
        if (l3Var != null) {
            int i17 = n3Var.f433854a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b activityC11369x8a612b2b = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b) l3Var;
            p61.o3 o3Var = activityC11369x8a612b2b.f154603f;
            if (o3Var != null && (s0Var = (r61.s0) o3Var.getItem(i17)) != null) {
                int i18 = s0Var.f65897x10a0fed7;
                if (i18 == 0) {
                    ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
                    p61.r3 r3Var = new p61.r3(activityC11369x8a612b2b);
                    ((ms.a) kVar).getClass();
                    r35.a aVar = new r35.a(activityC11369x8a612b2b, r3Var);
                    java.lang.String str = s0Var.f65889xb2c2ce0c;
                    aVar.f450554v = true;
                    aVar.f450557y = str;
                    aVar.f450555w = false;
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(58);
                    aVar.b(s0Var.f65898xdec927b, linkedList, true, "");
                    s0Var.f65886xba0f6d59 = 0;
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    m61.k.Di().J0(s0Var);
                    activityC11369x8a612b2b.f154603f.q();
                } else if (i18 == 1) {
                    java.lang.String str2 = s0Var.f65888x9c77cab9;
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    android.database.Cursor D0 = m61.k.Di().D0(str2);
                    if (D0 == null || D0.getCount() <= 1) {
                        activityC11369x8a612b2b.U6(s0Var, null);
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        D0.moveToFirst();
                        int count = D0.getCount();
                        for (int i19 = 0; i19 < count; i19++) {
                            r61.s0 s0Var2 = new r61.s0();
                            s0Var2.mo9015xbf5d97fd(D0);
                            arrayList2.add(s0Var2.f65887x58397040);
                            arrayList3.add(java.lang.Integer.valueOf(i19));
                            arrayList4.add(s0Var2);
                            D0.moveToNext();
                        }
                        arrayList3.add(-1);
                        db5.e1.c(activityC11369x8a612b2b.mo55332x76847179(), activityC11369x8a612b2b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqx), arrayList2, arrayList3, null, activityC11369x8a612b2b.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new p61.s3(activityC11369x8a612b2b, arrayList4, s0Var), null);
                    }
                    if (D0 != null) {
                        D0.close();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
