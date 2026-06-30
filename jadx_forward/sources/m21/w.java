package m21;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f404535l = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f404538c;

    /* renamed from: d, reason: collision with root package name */
    public long f404539d;

    /* renamed from: e, reason: collision with root package name */
    public int f404540e;

    /* renamed from: f, reason: collision with root package name */
    public int f404541f;

    /* renamed from: g, reason: collision with root package name */
    public final int f404542g;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f404536a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f404537b = 1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.StringBuffer f404543h = new java.lang.StringBuffer();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.StringBuffer f404544i = new java.lang.StringBuffer();

    /* renamed from: j, reason: collision with root package name */
    public java.lang.StringBuffer f404545j = new java.lang.StringBuffer();

    /* renamed from: k, reason: collision with root package name */
    public java.lang.StringBuffer f404546k = new java.lang.StringBuffer();

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public w(int i17, int i18) {
        this.f404538c = 0;
        this.f404538c = i17;
        this.f404542g = i18;
    }

    public static m21.w b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        r45.qd6 qd6Var = new r45.qd6();
        try {
            qd6Var.mo11468x92b714fd(bArr);
            m21.w wVar = new m21.w(qd6Var.f465398d, qd6Var.f465399e);
            wVar.f404537b = qd6Var.f465400f;
            wVar.f404539d = qd6Var.f465401g;
            wVar.f404540e = qd6Var.f465402h;
            wVar.f404541f = qd6Var.f465403i;
            wVar.f404543h = new java.lang.StringBuffer(qd6Var.f465404m);
            wVar.f404546k = new java.lang.StringBuffer(qd6Var.f465405n);
            wVar.f404544i = new java.lang.StringBuffer(qd6Var.f465406o);
            wVar.f404545j = new java.lang.StringBuffer(qd6Var.f465407p);
            return wVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatisticsOplog", "putIntent " + e17.getMessage());
            return null;
        }
    }

    public static m21.w c(int i17) {
        return new m21.w(i17, 4);
    }

    public static m21.w d(int i17) {
        return new m21.w(i17, 1);
    }

    public static m21.w f(android.content.Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("intent_key_StatisticsOplog");
        if (byteArrayExtra == null) {
            return null;
        }
        return b(byteArrayExtra);
    }

    public boolean a(int i17) {
        this.f404536a = java.lang.Integer.valueOf(i17);
        return true;
    }

    public byte[] e() {
        r45.qd6 qd6Var = new r45.qd6();
        qd6Var.f465398d = this.f404538c;
        qd6Var.f465399e = this.f404542g;
        qd6Var.f465400f = this.f404537b;
        qd6Var.f465401g = this.f404539d;
        qd6Var.f465402h = this.f404540e;
        qd6Var.f465403i = this.f404541f;
        qd6Var.f465404m = this.f404543h.toString();
        qd6Var.f465405n = this.f404546k.toString();
        qd6Var.f465406o = this.f404544i.toString();
        qd6Var.f465407p = this.f404545j.toString();
        try {
            return qd6Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatisticsOplog", "putIntent " + e17.getMessage());
            return null;
        }
    }

    public void g(android.content.Intent intent) {
        byte[] e17 = e();
        if (e17 == null) {
            return;
        }
        intent.putExtra("intent_key_StatisticsOplog", e17);
    }
}
