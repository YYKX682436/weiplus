package ro1;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f479528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f479529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f479530f;

    public n(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.List list, java.util.List list2) {
        this.f479528d = f0Var;
        this.f479529e = list;
        this.f479530f = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        android.content.Context n17 = com.p314xaae8f345.mm.app.w.INSTANCE.n();
        if (n17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f479528d;
            int i17 = f0Var.f391649d;
            f0Var.f391649d = i17 + 1;
            if (i17 < 3) {
                ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                t0Var.getClass();
                t0Var.z(this, 120L, false);
                return;
            }
        }
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackup.UsbDevicesDiscover", "Try " + this.f479528d.f391649d + " count, but all failed.");
            return;
        }
        if (!(!this.f479529e.isEmpty())) {
            ro1.t tVar = ro1.t.f479541d;
            po1.d dVar = (po1.d) kz5.n0.i0(this.f479530f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "showBindDeviceDialog, uuid=" + dVar.f438833f);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(n17);
            android.view.View inflate = android.view.LayoutInflater.from(n17).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570248dq4, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rir)).setText(dVar.b());
            ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.rim)).setOnClickListener(new ro1.r(n17, y1Var, dVar));
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.riq)).setOnClickListener(new ro1.s(y1Var));
            y1Var.k(inflate);
            y1Var.s();
            return;
        }
        ro1.t tVar2 = ro1.t.f479541d;
        java.util.List list = this.f479529e;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "showBoundDeviceDialog, device=" + ((po1.d) it.next()));
        }
        java.util.ArrayList h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.h(false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : h17) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
            if (!list.isEmpty()) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) it6.next()).f438828a, gVar.f297365g.f297522e)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar2, "<this>");
            if ((gVar2.f297368m & 1) != 0) {
                arrayList2.add(next);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        po1.d dVar2 = (po1.d) list.get(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Using device=" + dVar2 + " show dialog, gotoCreate=" + isEmpty + '.');
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(n17);
        android.view.View inflate2 = android.view.LayoutInflater.from(n17).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570249dq5, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.czu)).setText(n17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfa, dVar2.b()));
        ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.rik)).setOnClickListener(new ro1.p(n17, y1Var2, dVar2, isEmpty));
        ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.riv)).setOnClickListener(new ro1.q(y1Var2));
        y1Var2.k(inflate2);
        y1Var2.s();
    }
}
