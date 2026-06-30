package k75;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public k75.k f386348a;

    /* renamed from: b, reason: collision with root package name */
    public long f386349b = java.lang.System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    public int f386350c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386351d;

    /* renamed from: e, reason: collision with root package name */
    public k75.a f386352e;

    /* renamed from: f, reason: collision with root package name */
    public k75.a f386353f;

    /* renamed from: g, reason: collision with root package name */
    public k75.a f386354g;

    public e(k75.k kVar, android.os.Message message, java.lang.String str, k75.a aVar, k75.a aVar2, k75.a aVar3) {
        this.f386348a = kVar;
        this.f386350c = message != null ? message.what : 0;
        this.f386351d = str;
        this.f386352e = aVar;
        this.f386353f = aVar2;
        this.f386354g = aVar3;
    }

    /* renamed from: toString */
    public java.lang.String m142093x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("time=");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(this.f386349b);
        sb6.append(java.lang.String.format("%tm-%td %tH:%tM:%tS.%tL", calendar, calendar, calendar, calendar, calendar, calendar));
        sb6.append(" processed=");
        k75.a aVar = this.f386352e;
        sb6.append(aVar == null ? "<null>" : aVar.mo51017xfb82e301());
        sb6.append(" org=");
        k75.a aVar2 = this.f386353f;
        sb6.append(aVar2 == null ? "<null>" : aVar2.mo51017xfb82e301());
        sb6.append(" dest=");
        k75.a aVar3 = this.f386354g;
        sb6.append(aVar3 != null ? aVar3.mo51017xfb82e301() : "<null>");
        sb6.append(" what=");
        k75.k kVar = this.f386348a;
        if (kVar != null) {
            kVar.getClass();
            str = null;
        } else {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            sb6.append(this.f386350c);
            sb6.append("(0x");
            sb6.append(java.lang.Integer.toHexString(this.f386350c));
            sb6.append(")");
        } else {
            sb6.append(str);
        }
        if (!android.text.TextUtils.isEmpty(this.f386351d)) {
            sb6.append(" ");
            sb6.append(this.f386351d);
        }
        return sb6.toString();
    }
}
