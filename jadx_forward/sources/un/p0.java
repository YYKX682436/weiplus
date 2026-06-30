package un;

/* loaded from: classes.dex */
public final class p0 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        wi5.n0 n0Var;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null || i17 != 5) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if (stringExtra != null) {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            if (!(!f07.isEmpty())) {
                f07 = null;
            }
            if (f07 != null) {
                linkedList.addAll(f07);
            }
        }
        java.lang.String stringExtra2 = intent.getStringExtra("Cancel_Select_Contact");
        if (stringExtra2 != null) {
            java.util.List f08 = r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null);
            java.util.List list = f08.isEmpty() ^ true ? f08 : null;
            if (list != null) {
                linkedList2.addAll(list);
            }
        }
        j75.f Q6 = Q6();
        if (Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null) {
            return;
        }
        if (n0Var.e()) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new wi5.k0(linkedList, linkedList2));
                return;
            }
            return;
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new wi5.c0(linkedList, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new un.o0(this));
        }
    }
}
