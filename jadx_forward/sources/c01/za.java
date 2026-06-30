package c01;

/* loaded from: classes5.dex */
public class za extends d21.c {
    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f307318a;
        if (map == null || !this.f307321d.equals("reportbizlocation")) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get(".sysmsg.reportbizlocation.text");
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.reportbizlocation.link.text");
        java.lang.String str3 = str + str2;
        this.f307324g.add(str2);
        this.f307325h.addFirst(java.lang.Integer.valueOf(str3.length() - str2.length()));
        this.f307326i.add(java.lang.Integer.valueOf(str3.length()));
        this.f307320c = str3;
        return false;
    }
}
