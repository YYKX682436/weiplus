package c4;

/* loaded from: classes15.dex */
public class w extends c4.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c4.x f119880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c4.x xVar, android.content.Context context) {
        super(xVar, context);
        this.f119880f = xVar;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result result, android.os.Bundle bundle) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        c4.x xVar = this.f119880f;
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = xVar.f119881f;
        c4.n nVar = abstractServiceC1134x1ae0da33.f93236e;
        abstractServiceC1134x1ae0da33.getClass();
        c4.a0 a0Var = new c4.a0(result);
        xVar.getClass();
        c4.v vVar = new c4.v(xVar, str, a0Var, bundle);
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da332 = xVar.f119881f;
        c4.n nVar2 = abstractServiceC1134x1ae0da332.f93236e;
        vVar.f119885d = 1;
        abstractServiceC1134x1ae0da332.c(str, vVar);
        xVar.f119881f.getClass();
    }
}
