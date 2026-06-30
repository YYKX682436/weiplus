package ai5;

/* loaded from: classes12.dex */
public final class b extends ai5.c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.gp0 favData, long j17, java.lang.String str, hu.f fVar) {
        super(favData, j17, str, fVar);
        kotlin.jvm.internal.o.g(favData, "favData");
        this.f5206e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigRecordGalleryBigImageOpt()) == 1;
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        java.lang.String g17 = g();
        r45.gp0 gp0Var = this.f5207a;
        java.lang.String str = gp0Var.f375434s;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = gp0Var.f375438u;
        return new eg3.i(g17, str, str2 != null ? str2 : "");
    }

    @Override // ai5.c
    public tt.h d() {
        return b(zu.b.f475635e, g());
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407404f;
        linkedHashMap.put(mVar, g());
        linkedHashMap.put(sf3.m.f407406h, h());
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        if (this.f5206e) {
            a17.f407392f = new sf3.a();
        } else {
            a17.f407392f = new sf3.b();
        }
        return a17;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326123e;
    }

    @Override // ai5.c
    public tt.h i() {
        return null;
    }
}
