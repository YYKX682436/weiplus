package x91;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f534166a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f534167b;

    /* renamed from: c, reason: collision with root package name */
    public int f534168c;

    /* renamed from: d, reason: collision with root package name */
    public int f534169d;

    /* renamed from: e, reason: collision with root package name */
    public int f534170e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f534171f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f534172g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f534173h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f534174i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f534175j = new java.util.ArrayList();

    public c() {
        new java.util.ArrayList();
    }

    /* renamed from: equals */
    public boolean m175196xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x91.c)) {
            return false;
        }
        x91.c cVar = (x91.c) obj;
        return this.f534167b.equals(cVar.f534167b) && this.f534168c == cVar.f534168c && this.f534174i.equals(cVar.f534174i);
    }

    /* renamed from: toString */
    public java.lang.String m175197x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = this.f534175j;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x91.l lVar = (x91.l) it.next();
            sb6.append("[");
            sb6.append(lVar.m175203x9616526c());
            sb6.append("]\n");
        }
        return "host=" + this.f534167b + "\nport=" + this.f534168c + "\nmajor=" + this.f534169d + "\nminor=" + this.f534170e + "\ndeviceType=" + this.f534171f + "\nfriendlyName=" + this.f534172g + "\nmanufacturer=" + this.f534173h + "\nmodeName=null\nserviceCount=" + arrayList.size() + "\nserviceList=\n" + sb6.toString();
    }
}
