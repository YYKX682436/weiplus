package sb;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static sb.g f486930b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f486931a = new java.util.HashMap();

    public void a(java.lang.String str, sb.j jVar) {
        if (android.text.TextUtils.isEmpty(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41851xe17c3861())) {
            return;
        }
        tb.b bVar = new tb.b();
        bVar.f486923e = new tb.a(sb.d.a(), jVar, this.f486931a, "datareport");
        if (str.equals("") || android.text.TextUtils.isEmpty(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41851xe17c3861())) {
            return;
        }
        sb.b bVar2 = bVar.f486922d;
        bVar2.f486918g.clear();
        bVar2.f486918g.put(str, "");
        bVar.start();
    }

    public void b(com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4742x2925229b c4742x2925229b, java.lang.String str, sb.j jVar) {
        tb.d dVar = new tb.d(c4742x2925229b);
        dVar.f486923e = new tb.c(sb.d.a(), jVar, this.f486931a, "directdatareport");
        java.lang.String str2 = c4742x2925229b.f20183xa3aefc97;
        if (str.equals("") || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        sb.b bVar = dVar.f486922d;
        bVar.f486918g.clear();
        bVar.f486918g.put("offer_id", str2);
        bVar.f486918g.put(str, "");
        dVar.start();
    }
}
