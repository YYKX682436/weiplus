package p02;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f431936a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f431937b;

    /* renamed from: c, reason: collision with root package name */
    public int f431938c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f431939d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f431940e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f431941f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f431942g;

    /* renamed from: h, reason: collision with root package name */
    public long f431943h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f431944i;

    /* renamed from: j, reason: collision with root package name */
    public int f431945j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f431946k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f431947l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f431948m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f431949n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f431950o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f431951p;

    /* renamed from: q, reason: collision with root package name */
    public int f431952q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f431953r;

    public static void a(android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("search_history_href", 0);
        sharedPreferences.edit().putString("search_history_list", sharedPreferences.getString("search_history_list", "").replace(android.util.Base64.encodeToString(str.getBytes(), 0) + ";", "")).commit();
    }

    public static java.util.List b(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = context.getSharedPreferences("search_history_href", 0).getString("search_history_list", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return arrayList;
        }
        int i17 = 0;
        for (java.lang.String str : string.split(";")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                p02.l lVar = new p02.l();
                lVar.f431936a = 2;
                lVar.f431937b = new java.lang.String(android.util.Base64.decode(str, 0));
                i17++;
                lVar.f431945j = i17;
                arrayList.add(lVar);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            p02.l lVar2 = new p02.l();
            lVar2.f431936a = 1;
            arrayList.add(0, lVar2);
        }
        return arrayList;
    }

    /* renamed from: equals */
    public boolean m157531xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        return (!(obj instanceof p02.l) || (str = ((p02.l) obj).f431937b) == null) ? super.equals(obj) : str.equals(this.f431937b);
    }
}
