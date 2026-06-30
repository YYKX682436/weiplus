package gk5;

/* loaded from: classes.dex */
public final class k1 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        j75.f Q6;
        wi5.n0 n0Var;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent != null) {
            if (i17 == 0) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                j75.f Q62 = Q6();
                if (Q62 != null) {
                    Q62.B3(new wi5.c0(kz5.b0.c(stringExtra), i17));
                    return;
                }
                return;
            }
            if (i17 == 4) {
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
                java.util.List f07 = r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null);
                list = f07.isEmpty() ^ true ? f07 : null;
                if (list == null || (Q6 = Q6()) == null) {
                    return;
                }
                Q6.B3(new wi5.r(list, i17));
                return;
            }
            if (i17 != 5) {
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            if (stringExtra3 != null) {
                java.util.List f08 = r26.n0.f0(stringExtra3, new java.lang.String[]{","}, false, 0, 6, null);
                if (!(!f08.isEmpty())) {
                    f08 = null;
                }
                if (f08 != null) {
                    linkedList.addAll(f08);
                }
            }
            java.lang.String stringExtra4 = intent.getStringExtra("Cancel_Select_Contact");
            if (stringExtra4 != null) {
                java.util.List f09 = r26.n0.f0(stringExtra4, new java.lang.String[]{","}, false, 0, 6, null);
                list = f09.isEmpty() ^ true ? f09 : null;
                if (list != null) {
                    linkedList2.addAll(list);
                }
            }
            j75.f Q63 = Q6();
            if (Q63 == null || (n0Var = (wi5.n0) Q63.mo140437x75286adb()) == null) {
                return;
            }
            if (n0Var.e()) {
                j75.f Q64 = Q6();
                if (Q64 != null) {
                    Q64.B3(new wi5.k0(linkedList, linkedList2));
                    return;
                }
                return;
            }
            j75.f Q65 = Q6();
            if (Q65 != null) {
                Q65.B3(new wi5.c0(linkedList, i17));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new gk5.j1(this));
        }
    }
}
