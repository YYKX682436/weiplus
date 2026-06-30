package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class wj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217879d;

    public wj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f217879d = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f217879d;
        int color = blVar.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560780tz);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = blVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.Iterator it = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).getFragments().iterator();
        while (it.hasNext()) {
            android.view.View m7474xfb86a31b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) it.next()).m7474xfb86a31b();
            if (m7474xfb86a31b != null && (findViewById = m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.mcf)) != null) {
                findViewById.setBackgroundColor(color);
            }
        }
    }
}
