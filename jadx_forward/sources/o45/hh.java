package o45;

/* loaded from: classes11.dex */
public final class hh {

    /* renamed from: a, reason: collision with root package name */
    public int f424476a;

    /* renamed from: b, reason: collision with root package name */
    public int f424477b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f424478c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f424479d;

    public hh() {
        this.f424476a = 0;
        this.f424477b = 80;
        this.f424478c = "";
        this.f424479d = "";
    }

    public static o45.hh a(java.lang.String str) {
        java.lang.String[] split = str.split(",");
        if (split.length < 4) {
            return null;
        }
        o45.hh hhVar = new o45.hh();
        try {
            hhVar.f424476a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0);
            java.lang.String str2 = split[1];
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            hhVar.f424478c = str2;
            hhVar.f424477b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0);
            java.lang.String str4 = split[3];
            if (str4 != null) {
                str3 = str4;
            }
            hhVar.f424479d = str3;
            return hhVar;
        } catch (java.lang.NumberFormatException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMBuiltInIP", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    public static o45.gh b(java.lang.String str) {
        int[] iArr;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            iArr = null;
        } else {
            java.lang.String[] split = str.split(":");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : split) {
                if (str2 != null && str2.length() > 0) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.valueOf(str2).intValue()));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "invalid port num, ignore");
                    }
                }
            }
            int size = arrayList.size();
            iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
            }
        }
        return new o45.gh(null, iArr);
    }

    public static java.lang.String c(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((o45.hh) it.next()).m150594x9616526c() + "|";
        }
        return str;
    }

    public static java.util.List d(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return linkedList;
        }
        try {
            for (java.lang.String str2 : str.split("\\|")) {
                o45.hh a17 = a(str2);
                if (a17 != null) {
                    linkedList.add(a17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMBuiltInIP", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        return linkedList;
    }

    /* renamed from: toString */
    public java.lang.String m150594x9616526c() {
        return this.f424476a + "," + this.f424478c + "," + this.f424477b + "," + this.f424479d;
    }

    public hh(int i17, java.lang.String str, int i18, java.lang.String str2) {
        this.f424476a = i17;
        this.f424478c = str;
        this.f424477b = i18;
        this.f424479d = str2;
    }
}
