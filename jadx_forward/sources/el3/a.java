package el3;

/* loaded from: classes7.dex */
public abstract class a {
    public static int a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrIdKey, errCode:" + i17);
        switch (i17) {
            case 702:
                return 98;
            case 703:
                return 99;
            case 704:
                return 100;
            case 705:
                return 101;
            case 706:
                return 102;
            case 707:
                return 103;
            case 708:
                return 104;
            case 709:
                return 105;
            case 710:
                return 106;
            case 711:
                return 107;
            case 712:
                return 108;
            case 713:
                return 119;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b1.f34602x366c91de /* 714 */:
                return 120;
            case 715:
                return 109;
            case 716:
                return 110;
            default:
                return 115;
        }
    }

    public static void b(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = (com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", key:");
            sb6.append(c4582x424c344.m40328x7eed3b49());
            sb6.append(" value:");
            sb6.append(c4582x424c344.m40329x79249bdb());
        }
        int i17 = rl.b.f478676a;
    }
}
