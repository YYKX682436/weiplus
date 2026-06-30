package bt3;

/* loaded from: classes9.dex */
public abstract class z0 {
    public static o72.r2 a(long j17) {
        return ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
    }

    public static java.lang.String b(et3.b bVar) {
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 2;
        z9Var.f8533f = bVar.f256590a;
        favoriteOperationEvent.e();
        return favoriteOperationEvent.f54244h.f6136c;
    }
}
