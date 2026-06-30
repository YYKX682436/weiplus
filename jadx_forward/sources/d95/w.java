package d95;

/* loaded from: classes12.dex */
public class w implements com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification {
    public w(java.util.List list) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification
    /* renamed from: onCorrupted */
    public void mo106519xb6f7e04d(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        final java.lang.String m106673xfb83cc9b = c26918x6e83759b.m106673xfb83cc9b();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(m106673xfb83cc9b);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str2 = a17.f294812f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewDB", "RepairCorruptionHandler: DB corrupted, path: ".concat(m106673xfb83cc9b));
        jx3.f.INSTANCE.d(22323, str2, 0, "wcdb2Repair", 0, 0, android.os.Build.FINGERPRINT);
        c26918x6e83759b.m106652xd8634cf5();
        c26918x6e83759b.m106657x5a5ddf8(new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CloseCallBack() { // from class: d95.w$$a
            @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CloseCallBack
            /* renamed from: onClose */
            public final void mo106716xaf6bb359() {
                java.lang.String str3 = m106673xfb83cc9b;
                d95.f.r(str3);
                if (str3.contains("EnMicroMsg.db")) {
                    d95.f.a();
                }
            }
        });
    }
}
