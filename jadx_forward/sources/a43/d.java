package a43;

/* loaded from: classes11.dex */
public class d implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a43.g f82745b;

    public d(a43.g gVar, java.lang.String str) {
        this.f82745b = gVar;
        this.f82744a = str;
    }

    @Override // u33.f
    public void a(java.util.Map map) {
        u33.h hVar = (u33.h) map.get(this.f82744a);
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GameChatRoom.ChatRoomAvatarInterceptor", "get contact failed");
            return;
        }
        wo0.c a17 = a43.h.f82751a.a(new a43.a(((y33.e) hVar).f66951x81118851));
        a43.g gVar = this.f82745b;
        gVar.getClass();
        a43.e eVar = new a43.e(gVar);
        a17.getClass();
        a17.f529406d = eVar;
        a17.a();
    }
}
