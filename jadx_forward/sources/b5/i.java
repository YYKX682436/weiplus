package b5;

/* loaded from: classes13.dex */
public class i implements p4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f99412a;

    public i(android.content.Context context) {
        this.f99412a = context;
    }

    @Override // p4.e
    public p4.f a(p4.d dVar) {
        java.lang.String str = dVar.f433280b;
        p4.c cVar = dVar.f433281c;
        if (cVar == null) {
            throw new java.lang.IllegalArgumentException("Must set a callback to create the configuration.");
        }
        android.content.Context context = this.f99412a;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        p4.d dVar2 = new p4.d(context, str, cVar, true);
        boolean z17 = dVar2.f433282d;
        return new q4.f(dVar2.f433279a, dVar2.f433280b, dVar2.f433281c, z17);
    }
}
