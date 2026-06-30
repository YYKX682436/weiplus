package com.p314xaae8f345.p3132xf2511bc7;

/* renamed from: com.tencent.websocket.WcWss */
/* loaded from: classes7.dex */
public class C27055x4f8528b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f297255a = new java.util.HashMap();

    /* renamed from: com.tencent.websocket.WcWss$BindAndDnsReturn */
    /* loaded from: classes7.dex */
    public static class BindAndDnsReturn {

        /* renamed from: hostIpStr */
        public java.lang.String f58656xd40736c2;

        /* renamed from: resultCode */
        public int f58657xdde293aa;
    }

    public static int a(com.p314xaae8f345.p3132xf2511bc7.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3, java.lang.Object obj, java.lang.Object[] objArr4) {
        int m108916xbbd9acfd = m108916xbbd9acfd(str, str2, objArr, objArr2, objArr3, obj, objArr4);
        if (m108916xbbd9acfd > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcWss", "connect wss pair(%s, %d)", str, java.lang.Integer.valueOf(m108916xbbd9acfd));
            android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(m108916xbbd9acfd));
            java.util.HashMap hashMap = f297255a;
            if (hashMap.containsKey(pair)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WcWss", "already exists pair(%s, %d)", str, java.lang.Integer.valueOf(m108916xbbd9acfd));
                return -1;
            }
            hashMap.put(pair, aVar);
        }
        return m108916xbbd9acfd;
    }

    /* renamed from: bindSocketToCellularAndDnsByCellular */
    public static com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.BindAndDnsReturn m108914x9a3b21a8(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784.BindAndDnsReturnKt m40040x9a3b21a8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784.INSTANCE.m40049x21169495().m40040x9a3b21a8(i17, str, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.BindAndDnsReturn bindAndDnsReturn = new com.p314xaae8f345.p3132xf2511bc7.C27055x4f8528b.BindAndDnsReturn();
        bindAndDnsReturn.f58656xd40736c2 = m40040x9a3b21a8.getHostIpStr();
        bindAndDnsReturn.f58657xdde293aa = m40040x9a3b21a8.getResultCode();
        return bindAndDnsReturn;
    }

    /* renamed from: closeSocket */
    public static native void m108915xa028f8b(java.lang.String str, int i17, int i18, java.lang.String str2);

    /* renamed from: connectSocket */
    private static native int m108916xbbd9acfd(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3, java.lang.Object obj, java.lang.Object[] objArr4);

    /* renamed from: doCertificateVerify */
    public static int m108917x2f1063a5(java.lang.String str, int i17, java.lang.String str2, byte[][] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcWss", "doCertificateVerify group:%s,wssId:%s,hostname:%s", str, java.lang.Integer.valueOf(i17), str2);
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f297255a;
        if (hashMap.containsKey(pair)) {
            return ((com.p314xaae8f345.p3132xf2511bc7.a) hashMap.get(pair)).mo108928x2f1063a5(str2, bArr);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WcWss", "onMessage callback is null");
        return -1;
    }

    /* renamed from: getNetworkType */
    public static int m108918x662add52() {
        try {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (m40067xab9ed241 == -1) {
                return -1;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return 3;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return 4;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return 5;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241)) {
                return 1;
            }
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40090x5fd3d5c(m40067xab9ed241) ? 2 : 6;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WcWss", e17, "getStatisticsNetType_", new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: init */
    public static native void m108919x316510();

    /* renamed from: onClose */
    public static void m108920xaf6bb359(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcWss", "onClose group:%s,id:%s, reason:%s, code:%s", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18));
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f297255a;
        if (!hashMap.containsKey(pair)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WcWss", "onClose callback is null");
        } else {
            ((com.p314xaae8f345.p3132xf2511bc7.a) hashMap.get(pair)).d(str, i17, i18, str2);
            hashMap.remove(pair);
        }
    }

    /* renamed from: onHandShake */
    public static void m108921x9dc8b8(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcWss", "onHandShake group:%s, wssId:%s", str, java.lang.Integer.valueOf(i17));
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f297255a;
        if (hashMap.containsKey(pair)) {
            ((com.p314xaae8f345.p3132xf2511bc7.a) hashMap.get(pair)).b(str, i17, strArr, strArr2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WcWss", "onHandShake callback is null");
        }
    }

    /* renamed from: onIdKeyStat */
    public static void m108922x94ceb499(int[] iArr, int[] iArr2, int[] iArr3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < iArr.length; i17++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(iArr[i17], iArr2[i17], iArr3[i17]));
        }
    }

    /* renamed from: onKvStat */
    public static void m108923x4c31b11e(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcWss", "onKvStat logId:%s", java.lang.Integer.valueOf(i17));
    }

    /* renamed from: onMessage */
    public static void m108924x88910128(java.lang.String str, int i17, byte[] bArr, boolean z17) {
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f297255a;
        if (hashMap.containsKey(pair)) {
            ((com.p314xaae8f345.p3132xf2511bc7.a) hashMap.get(pair)).a(str, i17, bArr, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WcWss", "onMessage callback is null");
        }
    }

    /* renamed from: onOpen */
    public static void m108925xc39da0c9(java.lang.String str, int i17, boolean z17, java.lang.String[] strArr, java.lang.String[] strArr2, int i18, java.lang.String str2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcWss", "onOpen group:%s,isSuc:%s, msg:%s, code:%s, wssId:%s", str, java.lang.Boolean.valueOf(z17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f297255a;
        if (!hashMap.containsKey(pair)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WcWss", "onOpen callback is null");
            return;
        }
        ((com.p314xaae8f345.p3132xf2511bc7.a) hashMap.get(pair)).c(str, i17, z17, strArr, strArr2, i18, str2, strArr3, strArr4);
        if (z17) {
            return;
        }
        hashMap.remove(pair);
    }

    /* renamed from: sendBuffer */
    public static native int m108926xffee89e8(java.lang.String str, int i17, byte[] bArr, boolean z17);

    /* renamed from: setDebugIp */
    public static native void m108927xd22e018(java.lang.String str, int i17);
}
