package b63;

/* loaded from: classes11.dex */
public class i implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b63.k f18151b;

    public i(b63.k kVar, java.lang.String str) {
        this.f18151b = kVar;
        this.f18150a = str;
    }

    @Override // u53.x
    public void a(java.util.Map map) {
        u53.u uVar = (u53.u) map.get(this.f18150a);
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w("GameLife.AvatarDrawableLoader", "get contact failed");
            return;
        }
        java.lang.String str = ((y53.m) uVar).field_avatarURL;
        vo0.d dVar = b63.o.f18162a;
        wo0.c a17 = b63.o.f18162a.a(new b63.e(str));
        b63.h hVar = new b63.h(this);
        a17.getClass();
        a17.f447873d = hVar;
        a17.a();
    }
}
