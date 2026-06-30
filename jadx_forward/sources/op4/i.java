package op4;

/* loaded from: classes.dex */
public final class i implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428821d;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f428818a = str;
        this.f428819b = str2;
        this.f428820c = str3;
        this.f428821d = str4;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("behaviour_session_id", this.f428818a), new jz5.l("finder_context_id", this.f428819b), new jz5.l("finder_tab_context_id", this.f428820c), new jz5.l("comment_scene", this.f428821d));
    }
}
