package v72;

/* loaded from: classes12.dex */
public class g extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v72.i f515195q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v72.i iVar, p13.u uVar) {
        super(uVar);
        this.f515195q = iVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchFavoriteTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f432668n;
        vVar.f432692d = p13.r.b(uVar.f432674c, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor H = this.f515195q.f515200h.H(vVar.f432692d, o13.d.f423749b, null, null, false, false);
        while (H.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(H);
            p13.y yVar = (p13.y) hashMap.get(java.lang.Long.valueOf(zVar.f432719d));
            if (yVar == null || o13.n.b(o13.d.f423766s, zVar.f432718c, yVar.f432718c) < 0) {
                hashMap.put(java.lang.Long.valueOf(zVar.f432719d), zVar);
            }
            if (java.lang.Thread.interrupted() || this.f432599f) {
                H.close();
                throw new java.lang.InterruptedException();
            }
        }
        H.close();
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        vVar.f432693e = arrayList;
        arrayList.addAll(hashMap.values());
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f432693e, comparator);
        }
    }
}
