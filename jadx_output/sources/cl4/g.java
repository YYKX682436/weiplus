package cl4;

/* loaded from: classes4.dex */
public abstract class g {
    public static final java.lang.String a(r45.km6 km6Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (km6Var != null) {
            try {
                if (km6Var.f378838d > 0) {
                    sb6.append("<tingCategoryItem>");
                    sb6.append("<type>");
                    sb6.append(km6Var.f378838d);
                    sb6.append("</type>");
                    sb6.append("<categoryItem>");
                    java.lang.String str = km6Var.f378839e;
                    java.lang.String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    sb6.append(str);
                    sb6.append("</categoryItem>");
                    sb6.append("<categoryId>");
                    java.lang.String str3 = km6Var.f378840f;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    sb6.append(str2);
                    sb6.append("</categoryId>");
                    sb6.append("</tingCategoryItem>");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingAlbumShareParser", "make content error! %s", e17.getMessage());
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
