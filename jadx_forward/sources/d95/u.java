package d95;

/* loaded from: classes12.dex */
public class u implements com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f309239a;

    public u(java.util.List list) {
        this.f309239a = list == null ? java.util.Collections.emptyList() : new java.util.ArrayList(list);
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification
    /* renamed from: onCorrupted */
    public void mo106519xb6f7e04d(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        jx3.f fVar = jx3.f.INSTANCE;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c26918x6e83759b.m106673xfb83cc9b());
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
        fVar.d(22323, str2, 0, "wcdb2", 0, 0, android.os.Build.FINGERPRINT);
        c26918x6e83759b.m106685xed1b8453();
        for (android.util.Pair pair : this.f309239a) {
            c26918x6e83759b.m106786xe1f0e832((java.lang.String) pair.first, (com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7) pair.second);
        }
    }
}
