package c4;

/* loaded from: classes15.dex */
public class t extends c4.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.u f119875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c4.u uVar, android.content.Context context) {
        super(uVar, context);
        this.f119875e = uVar;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(java.lang.String str, android.service.media.MediaBrowserService.Result result) {
        c4.a0 a0Var = new c4.a0(result);
        c4.n nVar = this.f119875e.f119876e.f93236e;
        a0Var.a(null);
    }
}
