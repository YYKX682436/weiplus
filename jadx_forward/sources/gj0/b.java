package gj0;

/* loaded from: classes5.dex */
public abstract class b {
    public final int a(com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 abstractC26587x7a37b8e7) {
        int b17 = b();
        if (b17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: normal.", c());
        } else if (b17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: skip startup.", c());
        } else {
            if (b17 != 2) {
                throw new java.lang.IllegalStateException("Fuse '" + c() + "' return unknown action: " + b17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbstractFuse", "Fuse '%s' was checked, result: suicide.", c());
        }
        return b17;
    }

    public abstract int b();

    public abstract java.lang.String c();
}
