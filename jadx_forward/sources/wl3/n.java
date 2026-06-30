package wl3;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe f528608d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe c16641x95e58cfe) {
        this.f528608d = c16641x95e58cfe;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe c16641x95e58cfe = this.f528608d;
        if (c16641x95e58cfe.g() && c16641x95e58cfe.F) {
            c16641x95e58cfe.F = false;
            c16641x95e58cfe.j(c16641x95e58cfe.E, c16641x95e58cfe.f232368o);
        }
    }
}
