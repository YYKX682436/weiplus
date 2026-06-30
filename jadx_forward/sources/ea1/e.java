package ea1;

/* loaded from: classes12.dex */
public class e extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ea1.g f332047q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ea1.g gVar, p13.u uVar) {
        super(uVar);
        this.f332047q = gVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchWeAppTask";
    }

    @Override // p13.c
    public int k() {
        return 21;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f432668n;
        vVar.f432692d = p13.r.b(uVar.f432674c, true);
        vVar.f432693e = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor H = this.f332047q.f332051f.H(vVar.f432692d, o13.d.f423751d, uVar.f432679h, null, true, true);
        while (H.moveToNext()) {
            try {
                p13.z zVar = new p13.z();
                zVar.c(H);
                if (!hashSet.contains(java.lang.Long.valueOf(zVar.f432719d)) && !uVar.f432681j.contains(zVar.f432720e)) {
                    zVar.a();
                    vVar.f432693e.add(zVar);
                    hashSet.add(java.lang.Long.valueOf(zVar.f432719d));
                }
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    H.close();
                    throw th7;
                }
            }
        }
        H.close();
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f432693e, comparator);
        }
    }
}
