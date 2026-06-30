package b63;

/* loaded from: classes11.dex */
public class i implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b63.k f99684b;

    public i(b63.k kVar, java.lang.String str) {
        this.f99684b = kVar;
        this.f99683a = str;
    }

    @Override // u53.x
    public void a(java.util.Map map) {
        u53.u uVar = (u53.u) map.get(this.f99683a);
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("GameLife.AvatarDrawableLoader", "get contact failed");
            return;
        }
        java.lang.String str = ((y53.m) uVar).f67427x81118851;
        vo0.d dVar = b63.o.f99695a;
        wo0.c a17 = b63.o.f99695a.a(new b63.e(str));
        b63.h hVar = new b63.h(this);
        a17.getClass();
        a17.f529406d = hVar;
        a17.a();
    }
}
