package ns2;

/* loaded from: classes3.dex */
public final class c implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns2.b f420904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ns2.j f420905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f420906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f420907d;

    public c(ns2.b bVar, ns2.j jVar, boolean z17, boolean z18) {
        this.f420904a = bVar;
        this.f420905b = jVar;
        this.f420906c = z17;
        this.f420907d = z18;
    }

    @Override // i50.n
    public void a(boolean z17) {
        ns2.b bVar = this.f420904a;
        if (zl2.t.a(bVar.f420890c) != null) {
            return;
        }
        android.content.Context context = bVar.f420888a;
        this.f420905b.getClass();
        if (this.f420906c) {
            db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0o));
            return;
        }
        java.lang.String string = this.f420907d ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0k) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.m(context, string);
    }
}
