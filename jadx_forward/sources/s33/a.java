package s33;

/* loaded from: classes15.dex */
public class a implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u33.f f484001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s33.d f484002b;

    public a(s33.d dVar, u33.f fVar) {
        this.f484002b = dVar;
        this.f484001a = fVar;
    }

    @Override // u33.f
    public void a(java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        u33.f fVar = this.f484001a;
        if (fVar != null) {
            fVar.a(map);
        }
        java.util.Collection values = map.values();
        s33.d dVar = this.f484002b;
        dVar.getClass();
        if (values == null || values.size() == 0) {
            return;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            y33.e eVar = (y33.e) ((u33.h) it.next());
            if (c01.id.c() - eVar.f66966xa783a79b >= 86400000) {
                linkedHashSet.add(eVar.f66967xdde069b);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatRoomContactService", "contact need update, size: %d", java.lang.Integer.valueOf(linkedHashSet.size()));
        dVar.Di(new java.util.ArrayList(linkedHashSet), null);
    }
}
