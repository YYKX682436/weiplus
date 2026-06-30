package c01;

/* loaded from: classes5.dex */
public class u0 extends d21.c {
    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f225785a;
        if (map == null || !this.f225788d.equals("biz_services_mute")) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get(".sysmsg.biz_services_mute.text");
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.biz_services_mute.link.text");
        java.lang.String str3 = str + str2;
        this.f225791g.add(str2);
        this.f225792h.addFirst(java.lang.Integer.valueOf(str3.length() - str2.length()));
        this.f225793i.add(java.lang.Integer.valueOf(str3.length()));
        this.f225787c = str3;
        return false;
    }
}
