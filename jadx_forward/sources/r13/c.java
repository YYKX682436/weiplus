package r13;

/* loaded from: classes12.dex */
public class c implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final r13.c f450136d = new r13.c();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        p13.y yVar = (p13.y) obj;
        p13.y yVar2 = (p13.y) obj2;
        int i17 = yVar.f432718c - yVar2.f432718c;
        if (i17 != 0) {
            return i17;
        }
        int i18 = yVar.f432725j - yVar2.f432725j;
        return i18 != 0 ? i18 : yVar.f432726k.compareTo(yVar2.f432726k);
    }
}
