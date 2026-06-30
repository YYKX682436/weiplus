package o51;

/* loaded from: classes11.dex */
public class a implements p51.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f424616a;

    public a(java.util.List list) {
        this.f424616a = list;
    }

    @Override // p51.b
    public java.lang.String a(int i17) {
        java.lang.Object mo145523xfb80e389 = mo145523xfb80e389(i17);
        if (mo145523xfb80e389 == null) {
            mo145523xfb80e389 = "";
        } else if (!(mo145523xfb80e389 instanceof java.lang.String)) {
            mo145523xfb80e389 = mo145523xfb80e389.toString();
        }
        return (java.lang.String) mo145523xfb80e389;
    }

    @Override // p51.b
    /* renamed from: getItem */
    public java.lang.Object mo145523xfb80e389(int i17) {
        if (i17 < 0) {
            return "";
        }
        java.util.List list = this.f424616a;
        return i17 < list.size() ? list.get(i17) : "";
    }

    @Override // p51.b
    /* renamed from: getItemsCount */
    public int mo145524x99620925() {
        return this.f424616a.size();
    }
}
