package s65;

/* loaded from: classes11.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f485001a;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f485003c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f485004d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f485005e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f485006f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f485007g;

    /* renamed from: h, reason: collision with root package name */
    public final int f485008h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f485009i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f485010j;

    /* renamed from: k, reason: collision with root package name */
    public final int f485011k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f485012l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f485013m;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f485002b = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f485014n = true;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f485015o = true;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f485016p = true;

    public i0(r45.j35 j35Var) {
        if (j35Var == null) {
            this.f485001a = 1;
            this.f485005e = "";
            this.f485006f = "";
            this.f485003c = -1;
            this.f485004d = -1;
            this.f485007g = "";
            this.f485008h = 0;
            this.f485009i = "";
            this.f485010j = "";
            this.f485011k = 0;
            this.f485012l = "";
            this.f485013m = "";
            return;
        }
        r45.bs5 bs5Var = j35Var.f459071i;
        if (bs5Var != null) {
            this.f485006f = bs5Var.f452558d;
            this.f485005e = bs5Var.f452560f;
            this.f485008h = bs5Var.f452565n;
        } else {
            this.f485006f = "";
            this.f485005e = "";
            this.f485008h = 0;
        }
        this.f485001a = java.lang.Integer.valueOf(j35Var.f459067e);
        this.f485004d = java.lang.Integer.valueOf(j35Var.f459070h);
        java.util.LinkedList linkedList = j35Var.f459068f;
        if (linkedList != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.i35 i35Var = (r45.i35) linkedList.get(i17);
                java.util.LinkedList linkedList2 = i35Var.f458235e;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    this.f485002b.put(java.lang.Integer.valueOf(i35Var.f458234d), i35Var.f458235e);
                }
            }
        }
        this.f485003c = java.lang.Integer.valueOf(j35Var.f459069g);
        this.f485007g = j35Var.f459066d;
        java.util.LinkedList linkedList3 = j35Var.f459073n;
        if (linkedList3 == null || linkedList3.isEmpty()) {
            this.f485009i = "";
            this.f485010j = "";
            this.f485011k = 0;
            this.f485012l = "";
            this.f485013m = "";
            return;
        }
        java.util.Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            r45.h35 h35Var = (r45.h35) it.next();
            if (h35Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h35Var.f457339d)) {
                if (h35Var.f457339d.equalsIgnoreCase("newApkMd5")) {
                    this.f485009i = h35Var.f457340e;
                } else if (h35Var.f457339d.equalsIgnoreCase("oldApkMd5")) {
                    this.f485010j = h35Var.f457340e;
                } else if (h35Var.f457339d.equalsIgnoreCase(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5)) {
                    this.f485011k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(h35Var.f457340e, 0);
                } else if (h35Var.f457339d.equalsIgnoreCase("clientVersion")) {
                    this.f485012l = h35Var.f457340e;
                } else if (h35Var.f457339d.equalsIgnoreCase("alphaTitle")) {
                    java.lang.String str = h35Var.f457340e;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        new java.lang.String(android.util.Base64.decode(str, 0));
                    }
                } else if (h35Var.f457339d.equalsIgnoreCase("alphaContent")) {
                    java.lang.String str2 = h35Var.f457340e;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        new java.lang.String(android.util.Base64.decode(str2, 0));
                    }
                } else if (h35Var.f457339d.equalsIgnoreCase("alphaUrl")) {
                    this.f485013m = h35Var.f457340e;
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m163945x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\nupdater, packageType:");
        sb6.append(this.f485003c);
        sb6.append("\nresponseState:");
        sb6.append(this.f485001a);
        sb6.append("\ncdnUrl:");
        sb6.append(this.f485005e);
        sb6.append("\nfileMd5:");
        sb6.append(this.f485006f);
        sb6.append("\nnetworkType:");
        sb6.append(this.f485004d);
        sb6.append("\npatchId:");
        sb6.append(this.f485007g);
        sb6.append("\nisShowNotification:");
        sb6.append(this.f485014n);
        sb6.append("\nisShowDialog:");
        sb6.append(this.f485016p);
        sb6.append("\nisShowRedot:");
        sb6.append(this.f485015o);
        sb6.append("\nnewApkMd5:");
        sb6.append(this.f485009i);
        sb6.append("\noldApkMd5:");
        sb6.append(this.f485010j);
        sb6.append("\nclientVersion:");
        java.lang.String str = this.f485012l;
        sb6.append(str);
        sb6.append("\ngetClientVersionCode:");
        java.lang.Object[] objArr = new java.lang.Object[2];
        int i17 = 0;
        objArr[0] = str == null ? "" : str;
        objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                i17 = java.lang.Integer.decode(str).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.TinkerSyncResponse", e17, "getClientVersionCode", new java.lang.Object[0]);
            }
        }
        sb6.append(i17);
        return sb6.toString();
    }
}
