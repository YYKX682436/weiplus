package mh2;

/* loaded from: classes10.dex */
public final class i1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f407905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context context, android.view.ViewGroup root, ah2.f contentService) {
        super(context, root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentService, "contentService");
        this.f407905c = contentService;
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e_v;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        this.f407905c.b(new mh2.h1(this));
    }
}
