package k14;

/* loaded from: classes12.dex */
public class n {

    /* renamed from: f, reason: collision with root package name */
    public static k14.m f384892f;

    /* renamed from: g, reason: collision with root package name */
    public static k14.n f384893g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f384895b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f384896c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384897d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f384894a = false;

    /* renamed from: e, reason: collision with root package name */
    public int f384898e = 0;

    public static k14.n a() {
        if (f384893g == null) {
            f384893g = new k14.n();
        }
        return f384893g;
    }

    public final int b(java.lang.String str, int i17) {
        java.lang.String[] split = str.split(":");
        if (split.length == 2 && split[0].length() == 2) {
            try {
                return java.lang.Integer.parseInt(split[0], 10);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixToolsUplogModel", "parse int %s failed", split[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixToolsUplogModel", "hour to int %s failed", str);
        }
        return i17;
    }

    public void c(k14.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        f384892f = mVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixToolsUplogModel", "startUplog, date:%s, isUploading:%b, beginHour: %s, endHour: %s", str, java.lang.Boolean.valueOf(this.f384894a), str2, str3);
        if (this.f384894a) {
            return;
        }
        this.f384894a = true;
        int h17 = gm0.j1.a() ? gm0.j1.b().h() : 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) + 57600000) - 1;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        stringBuffer.append("000000");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        try {
            currentTimeMillis2 = simpleDateFormat.parse(stringBuffer2).getTime();
        } catch (java.text.ParseException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FixToolsUplogModel", "dateToTimeStamp failed. date:%s, stack:%s", stringBuffer2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        int b17 = b(str2, 0);
        int b18 = b(str3, 24);
        int i17 = (int) ((currentTimeMillis - currentTimeMillis2) / 86400000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FixToolsUplogModel", "startNewUplog, chooseTime:%d, chooseBeginHour:%s, chooseEndHour:%s, time:%d", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.d().f152297d;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueue", "flushPushLog autoAuth  == null");
        } else {
            sVar.m0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        this.f384898e = com.p314xaae8f345.mm.app.i3.d(new int[]{i17}, gm0.j1.a(), h17, b17, b18, str4, str5, null, new k14.l(this));
        this.f384895b = str;
        this.f384896c = str2;
        this.f384897d = str3;
    }
}
