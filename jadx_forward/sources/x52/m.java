package x52;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final x52.l f533653a = new x52.l(null);

    public static final void a(java.lang.String str) {
        x52.l lVar = f533653a;
        if (str == null) {
            return;
        }
        r45.k16 a17 = lVar.a();
        if (a17 == null) {
            a17 = new r45.k16();
        }
        int size = a17.f459847d.size();
        java.util.LinkedList linkedList = a17.f459847d;
        if (size > 100) {
            linkedList.removeFirst();
            linkedList.addLast(str);
        } else {
            linkedList.addLast(str);
        }
        if (linkedList.isEmpty()) {
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = a17.mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 == null) {
                return;
            }
            c52.c.d("mmkv_sionId_table_hell", mo14344x5f01b1f6);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyMatchedBackup", e17, "SessionTable, _write: %s", e17.getMessage());
        }
    }

    public static final java.lang.String b() {
        r45.k16 a17 = f533653a.a();
        if (a17 == null) {
            return null;
        }
        java.util.LinkedList linkedList = a17.f459847d;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (java.lang.String) linkedList.getLast();
    }
}
