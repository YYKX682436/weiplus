package lo0;

/* loaded from: classes14.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401530a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401532c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401533d;

    /* renamed from: e, reason: collision with root package name */
    public final int f401534e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f401535f;

    /* renamed from: g, reason: collision with root package name */
    public final double f401536g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f401537h;

    /* renamed from: i, reason: collision with root package name */
    public final lo0.b f401538i;

    /* renamed from: j, reason: collision with root package name */
    public double f401539j;

    /* renamed from: k, reason: collision with root package name */
    public final int f401540k;

    public h0(org.json.JSONObject itemJson, java.lang.String parentItemResourcePath, java.util.Map badges, lo0.r0 functionalVersion) {
        java.lang.String optString;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemJson, "itemJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentItemResourcePath, "parentItemResourcePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badges, "badges");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionalVersion, "functionalVersion");
        java.lang.String optString2 = itemJson.optString(dm.i4.f66865x76d1ec5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (!(optString2.length() == 0)) {
            java.lang.String optString3 = itemJson.optString("displayName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            if (!(optString3.length() == 0)) {
                if (functionalVersion.f401605a != 1 || java.lang.Integer.compare(functionalVersion.f401606b ^ Integer.MIN_VALUE, -2147483645) >= 0) {
                    optString = itemJson.optString("uiBackgroundColor");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                    if (!(optString.length() == 0)) {
                        itemJson.optBoolean("applyBlurring");
                    } else {
                        throw new lo0.u("Makeup detail item background color is empty. ".concat(optString2));
                    }
                } else {
                    optString = "#80999999";
                }
                try {
                    int parseColor = android.graphics.Color.parseColor(optString);
                    int optInt = itemJson.optInt("order");
                    java.lang.String optString4 = itemJson.optString("badgeId");
                    java.lang.String optString5 = itemJson.optString("resourcePath");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                    if (!(optString5.length() == 0)) {
                        lo0.n nVar = lo0.o.f401588a;
                        java.lang.String a17 = nVar.a(optString5, parentItemResourcePath);
                        if (!(a17 == null || a17.length() == 0)) {
                            org.json.JSONObject optJSONObject = itemJson.optJSONObject("attributes");
                            if (!(optJSONObject == null)) {
                                int optInt2 = optJSONObject.optInt("objectType", -1);
                                if (optInt2 != -1) {
                                    double optDouble = optJSONObject.optDouble("defaultValue");
                                    java.lang.String a18 = nVar.a("icon.png", a17);
                                    if (!(a18 == null || a18.length() == 0)) {
                                        this.f401530a = optString2;
                                        this.f401531b = optString3;
                                        this.f401532c = parseColor;
                                        this.f401533d = a17;
                                        this.f401534e = optInt2;
                                        this.f401535f = optInt2 == 63;
                                        this.f401536g = optDouble;
                                        this.f401537h = a18;
                                        this.f401538i = (lo0.b) badges.get(optString4);
                                        this.f401539j = optDouble;
                                        this.f401540k = optInt;
                                        return;
                                    }
                                    throw new lo0.u("Failed normalizing makeup detail item icon path. ".concat(optString2));
                                }
                                throw new lo0.u("Makeup detail item object type invalid. " + optString2 + ", " + optInt2);
                            }
                            throw new lo0.u("Makeup detail item attributes not found. ".concat(optString2));
                        }
                        throw new lo0.u("Failed normalizing makeup detail item resource path. ".concat(optString2));
                    }
                    throw new lo0.u("Makeup detail item resource path empty. ".concat(optString2));
                } catch (java.lang.IllegalArgumentException unused) {
                    throw new lo0.u("Makeup detail item background color is invalid. " + optString2 + ", " + optString);
                }
            }
            throw new lo0.u("Makeup detail item display name is empty. ".concat(optString2));
        }
        throw new lo0.u("Makeup detail item ID is empty.");
    }

    public h0(lo0.h0 h0Var, java.util.Map map) {
        this.f401530a = h0Var.f401530a;
        this.f401531b = h0Var.f401531b;
        this.f401532c = h0Var.f401532c;
        this.f401533d = h0Var.f401533d;
        this.f401534e = h0Var.f401534e;
        this.f401535f = h0Var.f401535f;
        double d17 = h0Var.f401536g;
        this.f401536g = d17;
        this.f401537h = h0Var.f401537h;
        lo0.b bVar = h0Var.f401538i;
        this.f401538i = bVar != null ? (lo0.b) map.get(bVar.f401493a) : null;
        this.f401539j = d17;
        this.f401540k = h0Var.f401540k;
    }
}
