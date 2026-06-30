package at0;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final at0.k f95121d = new at0.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        double parseDouble;
        java.util.Collection collection;
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String obj2 = r26.n0.u0(str).toString();
        try {
            if (r26.n0.D(obj2, "/", false, 2, null)) {
                java.util.List g17 = new r26.t("/").g(obj2, 0);
                if (!g17.isEmpty()) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = kz5.p0.f395529d;
                java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
                parseDouble = strArr.length == 2 ? java.lang.Double.parseDouble(strArr[0]) / java.lang.Double.parseDouble(strArr[1]) : java.lang.Double.parseDouble(obj2);
            } else {
                parseDouble = java.lang.Double.parseDouble(obj2);
            }
            return java.lang.Double.valueOf(parseDouble);
        } catch (java.lang.NumberFormatException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraPreviewContainer", "parseAperture error: ".concat(str));
            return null;
        }
    }
}
