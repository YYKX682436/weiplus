package c03;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f119194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f119195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f119196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119197h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, java.util.Map map, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, java.lang.String str) {
        super(0);
        this.f119193d = context;
        this.f119194e = map;
        this.f119195f = h0Var;
        this.f119196g = c14994x9b99c079;
        this.f119197h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n40.o oVar = (n40.o) i95.n0.c(n40.o.class);
        android.content.Context context = this.f119193d;
        java.util.Map map = this.f119194e;
        android.os.Bundle bundle = (android.os.Bundle) this.f119195f.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f119196g;
        ((a03.h0) oVar).ij(context, map, false, bundle, c14994x9b99c079 != null ? c14994x9b99c079.getFeedObject() : null, this.f119197h);
        return jz5.f0.f384359a;
    }
}
