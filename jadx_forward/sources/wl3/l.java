package wl3;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f528605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe f528606e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe c16641x95e58cfe, long j17) {
        this.f528606e = c16641x95e58cfe;
        this.f528605d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe c16641x95e58cfe = this.f528606e;
        if (c16641x95e58cfe.g()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) c16641x95e58cfe.f232364h;
            int size = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 <= size) {
                int i19 = (i18 + size) / 2;
                long j17 = ((wl3.p) arrayList.get(i19)).f528610d;
                long j18 = this.f528605d;
                if (j18 < j17) {
                    size = i19 - 1;
                } else {
                    i18 = i19 + 1;
                    if (i18 >= arrayList.size() || j18 < ((wl3.p) arrayList.get(i18)).f528610d) {
                        i17 = i19;
                        break;
                    }
                }
            }
            if (i17 != c16641x95e58cfe.E) {
                c16641x95e58cfe.E = i17;
                if (c16641x95e58cfe.F) {
                    c16641x95e58cfe.invalidate();
                } else {
                    c16641x95e58cfe.j(i17, c16641x95e58cfe.f232368o);
                }
            }
        }
    }
}
