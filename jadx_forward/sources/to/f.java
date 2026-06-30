package to;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static int f502424a;

    /* renamed from: b, reason: collision with root package name */
    public static int f502425b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f502426c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static int f502427d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f502428e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f502429f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f502430g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f502431h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f502432i = new java.util.HashMap();

    public static void a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5703x726b2593 c5703x726b2593 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5703x726b2593();
        int i17 = f502424a - f502425b;
        am.pj pjVar = c5703x726b2593.f136025g;
        if (i17 > 1) {
            pjVar.f89155a = true;
            pjVar.f89156b = f502426c.size();
        }
        if (f502430g - f502431h > 1) {
            pjVar.f89157c = true;
            pjVar.f89158d = f502432i.size();
        }
        if (f502427d - f502428e > 1) {
            pjVar.f89159e = true;
            pjVar.f89160f = f502429f.size();
        }
        if (pjVar.f89157c || pjVar.f89155a || pjVar.f89159e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioManager", "check media leak audio[%b %d] mediaplayer[%b %d] audioRecordLeak [%b %d]", java.lang.Boolean.valueOf(pjVar.f89155a), java.lang.Integer.valueOf(pjVar.f89156b), java.lang.Boolean.valueOf(pjVar.f89157c), java.lang.Integer.valueOf(pjVar.f89158d), java.lang.Boolean.valueOf(pjVar.f89159e), java.lang.Integer.valueOf(pjVar.f89160f));
            c5703x726b2593.e();
        }
    }

    public static java.lang.String b() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AudioTrack: \r\nleak: ");
        java.util.HashMap hashMap = f502426c;
        stringBuffer.append(hashMap.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f502424a);
        stringBuffer.append("release: ");
        stringBuffer.append(f502425b);
        stringBuffer.append("\r\n--------leak map-----------\r\n");
        if (!hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                stringBuffer.append((java.lang.String) it.next());
                stringBuffer.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            }
        }
        stringBuffer.append("MediaPlayer: \r\nleak: ");
        java.util.HashMap hashMap2 = f502432i;
        stringBuffer.append(hashMap2.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f502430g);
        stringBuffer.append("release: ");
        stringBuffer.append(f502431h);
        stringBuffer.append("\r\n--------leak map-----------\r\n");
        if (!hashMap2.isEmpty()) {
            java.util.Iterator it6 = hashMap2.values().iterator();
            while (it6.hasNext()) {
                stringBuffer.append((java.lang.String) it6.next());
                stringBuffer.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            }
        }
        stringBuffer.append("AudioRecord: \r\nleak: ");
        java.util.HashMap hashMap3 = f502429f;
        stringBuffer.append(hashMap3.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f502427d);
        stringBuffer.append("release: ");
        stringBuffer.append(f502427d);
        stringBuffer.append("\r\n--------leak map-----------\r\n");
        if (!hashMap3.isEmpty()) {
            java.util.Iterator it7 = hashMap3.values().iterator();
            while (it7.hasNext()) {
                stringBuffer.append((java.lang.String) it7.next());
                stringBuffer.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioManager", "leak? %s", stringBuffer2);
        return stringBuffer2;
    }
}
