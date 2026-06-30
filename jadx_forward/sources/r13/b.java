package r13;

/* loaded from: classes12.dex */
public class b implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final r13.b f450135d = new r13.b();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int intValue;
        p13.y yVar = (p13.y) obj;
        p13.y yVar2 = (p13.y) obj2;
        int i17 = yVar2.f432731p - yVar.f432731p;
        if (i17 != 0) {
            return i17;
        }
        java.util.Map map = o13.d.f423763p;
        int i18 = yVar.f432717b;
        int i19 = yVar2.f432717b;
        java.util.HashMap hashMap = o13.n.f423774a;
        if (i18 == i19) {
            intValue = 0;
        } else {
            java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(i18));
            int intValue2 = num == null ? Integer.MAX_VALUE : num.intValue();
            java.lang.Integer num2 = (java.lang.Integer) map.get(java.lang.Integer.valueOf(i19));
            intValue = intValue2 - (num2 != null ? num2.intValue() : Integer.MAX_VALUE);
        }
        if (intValue != 0) {
            return intValue;
        }
        int b17 = o13.n.b(o13.d.f423765r, yVar.f432718c, yVar2.f432718c);
        if (b17 != 0) {
            return b17;
        }
        int i27 = yVar.f432725j - yVar2.f432725j;
        if (i27 != 0) {
            return i27;
        }
        int i28 = yVar.f432718c;
        if (i28 != 11 && i28 != 17 && i28 != 18) {
            java.lang.String str = yVar.f432726k;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = yVar2.f432726k;
            return str.compareToIgnoreCase(str2 != null ? str2 : "");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yVar.f432735t)) {
            java.lang.String e17 = o13.n.e(yVar.f432720e);
            yVar.f432735t = e17;
            java.lang.String lowerCase = e17.toLowerCase();
            yVar.f432735t = lowerCase;
            if (!o13.s.b(lowerCase.charAt(0))) {
                yVar.f432735t = "~" + yVar.f432735t;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yVar2.f432735t)) {
            java.lang.String e18 = o13.n.e(yVar2.f432720e);
            yVar2.f432735t = e18;
            java.lang.String lowerCase2 = e18.toLowerCase();
            yVar2.f432735t = lowerCase2;
            if (!o13.s.b(lowerCase2.charAt(0))) {
                yVar2.f432735t = "~" + yVar2.f432735t;
            }
        }
        return yVar.f432735t.compareToIgnoreCase(yVar2.f432735t);
    }
}
