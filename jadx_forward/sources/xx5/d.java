package xx5;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public long f539563a;

    /* renamed from: b, reason: collision with root package name */
    public long f539564b;

    /* renamed from: c, reason: collision with root package name */
    public long f539565c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f539566d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f539567e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f539568f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f539569g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f539570h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f539571i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f539572j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f539573k = new java.util.ArrayList();

    public java.lang.String a(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return "{}";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xx5.c) it.next()).m176157x9616526c());
        }
        return "{" + android.text.TextUtils.join(";", arrayList) + "}";
    }
}
