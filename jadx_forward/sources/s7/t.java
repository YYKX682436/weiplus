package s7;

/* loaded from: classes16.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f485366a = null;

    public void a(s7.r rVar) {
        if (this.f485366a == null) {
            this.f485366a = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < this.f485366a.size(); i17++) {
            if (((s7.r) this.f485366a.get(i17)).f485318a.f485374b > rVar.f485318a.f485374b) {
                this.f485366a.add(i17, rVar);
                return;
            }
        }
        this.f485366a.add(rVar);
    }

    public void b(s7.t tVar) {
        if (tVar.f485366a == null) {
            return;
        }
        if (this.f485366a == null) {
            this.f485366a = new java.util.ArrayList(tVar.f485366a.size());
        }
        java.util.Iterator it = tVar.f485366a.iterator();
        while (it.hasNext()) {
            a((s7.r) it.next());
        }
    }

    /* renamed from: toString */
    public java.lang.String m164026x9616526c() {
        if (this.f485366a == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f485366a.iterator();
        while (it.hasNext()) {
            sb6.append(((s7.r) it.next()).m164024x9616526c());
            sb6.append('\n');
        }
        return sb6.toString();
    }
}
