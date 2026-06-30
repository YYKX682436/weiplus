package l42;

/* loaded from: classes15.dex */
public class a implements java.util.Comparator {
    public a(l42.c cVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = ((s42.a) obj).f484461a;
        int i18 = ((s42.a) obj2).f484461a;
        if (i17 > i18) {
            return 1;
        }
        return i17 < i18 ? -1 : 0;
    }
}
