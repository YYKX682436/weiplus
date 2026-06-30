package c3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f119618a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Intent[] f119619b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f119620c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f119621d;

    public static java.util.List a(android.content.Context context, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            c3.b bVar = new c3.a(context, (android.content.pm.ShortcutInfo) it.next()).f119617a;
            if (android.text.TextUtils.isEmpty(bVar.f119620c)) {
                throw new java.lang.IllegalArgumentException("Shortcut must have a non-empty label");
            }
            android.content.Intent[] intentArr = bVar.f119619b;
            if (intentArr == null || intentArr.length == 0) {
                throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
