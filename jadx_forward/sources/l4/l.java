package l4;

/* loaded from: classes13.dex */
public class l extends l4.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p105x3580db.ServiceC1166x25ea1c9 f397262d;

    public l(p012xc85e97e9.p105x3580db.ServiceC1166x25ea1c9 serviceC1166x25ea1c9) {
        this.f397262d = serviceC1166x25ea1c9;
    }

    public void d(int i17, java.lang.String[] strArr) {
        synchronized (this.f397262d.f93853f) {
            java.lang.String str = (java.lang.String) this.f397262d.f93852e.get(java.lang.Integer.valueOf(i17));
            if (str == null) {
                return;
            }
            int beginBroadcast = this.f397262d.f93853f.beginBroadcast();
            for (int i18 = 0; i18 < beginBroadcast; i18++) {
                try {
                    int intValue = ((java.lang.Integer) this.f397262d.f93853f.getBroadcastCookie(i18)).intValue();
                    java.lang.String str2 = (java.lang.String) this.f397262d.f93852e.get(java.lang.Integer.valueOf(intValue));
                    if (i17 != intValue && str.equals(str2)) {
                        try {
                            ((l4.d) this.f397262d.f93853f.getBroadcastItem(i18)).h2(strArr);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                } finally {
                    this.f397262d.f93853f.finishBroadcast();
                }
            }
        }
    }

    public int e(l4.d dVar, java.lang.String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f397262d.f93853f) {
            p012xc85e97e9.p105x3580db.ServiceC1166x25ea1c9 serviceC1166x25ea1c9 = this.f397262d;
            int i17 = serviceC1166x25ea1c9.f93851d + 1;
            serviceC1166x25ea1c9.f93851d = i17;
            if (serviceC1166x25ea1c9.f93853f.register(dVar, java.lang.Integer.valueOf(i17))) {
                this.f397262d.f93852e.put(java.lang.Integer.valueOf(i17), str);
                return i17;
            }
            p012xc85e97e9.p105x3580db.ServiceC1166x25ea1c9 serviceC1166x25ea1c92 = this.f397262d;
            serviceC1166x25ea1c92.f93851d--;
            return 0;
        }
    }
}
