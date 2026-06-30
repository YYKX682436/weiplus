package o45;

/* loaded from: classes12.dex */
public abstract class qi {
    public static java.util.Map a(byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            return null;
        }
        try {
            r45.gj6 gj6Var = (r45.gj6) new r45.gj6().mo11468x92b714fd(bArr);
            if (gj6Var == null) {
                return null;
            }
            java.util.LinkedList linkedList = gj6Var.f456841e;
            if (linkedList.size() != gj6Var.f456840d) {
                return null;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i17 = 0; i17 < gj6Var.f456840d; i17++) {
                hashMap.put(java.lang.Integer.valueOf(((r45.o44) linkedList.get(i17)).f463437d), java.lang.Long.valueOf(((r45.o44) linkedList.get(i17)).f463438e & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
            }
            if (hashMap.size() != gj6Var.f456840d) {
                return null;
            }
            return hashMap;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        java.util.Map a17 = a(bArr);
        if (a17 == null) {
            return true;
        }
        java.util.Map a18 = a(bArr2);
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncKeyUtil", "dkpush svr sync key failed");
            return false;
        }
        java.util.HashMap hashMap = (java.util.HashMap) a18;
        for (java.lang.Integer num : hashMap.keySet()) {
            java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) a17).get(num);
            java.lang.Long l18 = (java.lang.Long) hashMap.get(num);
            if (l17 == null || l18.longValue() > l17.longValue()) {
                return true;
            }
        }
        return false;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncKeyUtil", "newKey is null");
            return null;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        try {
            if (com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75987x6c4d866c(bArr, bArr2, c19764x527bffc1)) {
                return c19764x527bffc1.f38861x6ac9171;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncKeyUtil", "merge key failed");
            return null;
        } catch (java.lang.IncompatibleClassChangeError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Crash", e17, "NoSuchMethod MMProtocalJni.mergeSyncKey", new java.lang.Object[0]);
            throw ((java.lang.IncompatibleClassChangeError) new java.lang.IncompatibleClassChangeError("NoSuchMethod MMProtocalJni.mergeSyncKey").initCause(e17));
        }
    }

    public static java.lang.String d(byte[] bArr) {
        java.util.Map a17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr) && (a17 = a(bArr)) != null) {
            java.util.HashMap hashMap = (java.util.HashMap) a17;
            if (hashMap.size() >= 1) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append(" MsgKey:" + hashMap.get(2));
                stringBuffer.append(" profile:" + hashMap.get(1));
                stringBuffer.append(" contact:" + hashMap.get(3));
                stringBuffer.append(" chatroom:" + hashMap.get(11));
                stringBuffer.append(" Bottle:" + hashMap.get(7));
                stringBuffer.append(" QContact:" + hashMap.get(5));
                return stringBuffer.toString();
            }
        }
        return "";
    }
}
