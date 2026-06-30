package e45;

/* loaded from: classes.dex */
public final class x extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        android.content.Intent intent2 = m158354x19263085().getIntent();
        int intExtra = intent2 != null ? intent2.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) : 0;
        boolean z17 = intExtra == 0;
        boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20011x3d13a7e()) == 1;
        boolean z19 = z18 && z17;
        if (z19) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SystemFileSelectorUIC", "openFileManager, allowMultiple=" + z19 + ", multiSelectEnabled=" + z18 + ", scene=" + intExtra);
            m158354x19263085().startActivityForResult(intent, 14);
        } catch (android.content.ActivityNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SystemFileSelectorUIC", e17, "goToSystemFileSelector ActivityNotFound", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SystemFileSelectorUIC", e18, "goToSystemFileSelector", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.widget.TextView textView = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.qxm);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565028hr0);
        if (c22661xa3a2b3c0 != null) {
            c22661xa3a2b3c0.setOnClickListener(new e45.w(this));
        }
    }
}
