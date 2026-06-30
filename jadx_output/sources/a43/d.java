package a43;

/* loaded from: classes11.dex */
public class d implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a43.g f1212b;

    public d(a43.g gVar, java.lang.String str) {
        this.f1212b = gVar;
        this.f1211a = str;
    }

    @Override // u33.f
    public void a(java.util.Map map) {
        u33.h hVar = (u33.h) map.get(this.f1211a);
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("GameChatRoom.ChatRoomAvatarInterceptor", "get contact failed");
            return;
        }
        wo0.c a17 = a43.h.f1218a.a(new a43.a(((y33.e) hVar).field_avatarURL));
        a43.g gVar = this.f1212b;
        gVar.getClass();
        a43.e eVar = new a43.e(gVar);
        a17.getClass();
        a17.f447873d = eVar;
        a17.a();
    }
}
