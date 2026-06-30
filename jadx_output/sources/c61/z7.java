package c61;

/* loaded from: classes3.dex */
public final class z7 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c61.c8 f39444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f39445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f39446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.nc f39447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ez2.a f39448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f39449f;

    public z7(c61.c8 c8Var, android.view.View view, androidx.appcompat.app.AppCompatActivity appCompatActivity, zy2.nc ncVar, ez2.a aVar, yz5.p pVar) {
        this.f39444a = c8Var;
        this.f39445b = view;
        this.f39446c = appCompatActivity;
        this.f39447d = ncVar;
        this.f39448e = aVar;
        this.f39449f = pVar;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c01.z1.j() & (-9007199254740993L)));
        int i17 = c61.dc.f38947a;
        c61.cc.f38928a = true;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 65;
        p53Var.f382762e = 1;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        this.f39444a.c(this.f39445b, this.f39446c, this.f39447d, this.f39448e, this.f39449f);
    }
}
