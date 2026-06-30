package j93;

/* loaded from: classes.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f379932d;

    public h0(j93.r0 r0Var) {
        this.f379932d = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j93.r0 r0Var = this.f379932d;
        r0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusMenuLabelUIC", "onImportContactFromChatRoomClick() called");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", r0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571458fo));
        intent.putExtra("list_attr", 64);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(c01.z1.r());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) r0Var.f380021d).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null && (arrayList = a17.f233598o) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((ri5.j) next).f477659w) {
                    arrayList3.add(next);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(((ri5.j) it6.next()).f477644f);
            }
            hashSet.addAll(arrayList4);
        }
        java.lang.String stringExtra = r0Var.m158354x19263085().getIntent().getStringExtra("block_contact");
        if (stringExtra != null) {
            hashSet.addAll(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusMenuLabelUIC", "getBlockUserNameList: size:" + hashSet.size());
        java.util.ArrayList arrayList5 = new java.util.ArrayList(hashSet);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList5)) {
            intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList5, ","));
        }
        intent.putExtra("showLabelWhenSearch", false);
        intent.putExtra("showContactScrollbar", false);
        intent.putExtra("Intent_KEY_SHOW_IV_MORE", true);
        pf5.j0.a(intent, j93.j1.class);
        pf5.j0.a(intent, ij5.d0.class);
        pf5.j0.a(intent, g93.j.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, ij5.c.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = r0Var.m80379x76847179();
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.i(new j93.o0(r0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/PlusMenuLabelUIC$onCreate$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
