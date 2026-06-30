package b53;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15883x799c8e0c f99622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f99623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f99624f;

    public i(b53.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15883x799c8e0c c15883x799c8e0c, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, android.content.Context context) {
        this.f99622d = c15883x799c8e0c;
        this.f99623e = e0Var;
        this.f99624f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15883x799c8e0c c15883x799c8e0c = this.f99622d;
        c15883x799c8e0c.x();
        this.f99623e.f488188i.c(new b53.g(this));
        boolean z17 = c15883x799c8e0c.f221101h;
        android.content.Context context = this.f99624f;
        if (z17) {
            db5.e1.o(context, com.p314xaae8f345.mm.R.C30867xcad56011.la9, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, false, new b53.h(this));
        } else {
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.la8), 0).show();
        }
    }
}
