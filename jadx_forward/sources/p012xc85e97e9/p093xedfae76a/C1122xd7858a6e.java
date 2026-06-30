package p012xc85e97e9.p093xedfae76a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.lifecycle.SavedStateHandleController */
/* loaded from: classes13.dex */
public final class C1122xd7858a6e implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f93122d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93123e = false;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.v0 f93124f;

    public C1122xd7858a6e(java.lang.String str, p012xc85e97e9.p093xedfae76a.v0 v0Var) {
        this.f93122d = str;
        this.f93124f = v0Var;
    }

    public static void a(final o4.b bVar, final p012xc85e97e9.p093xedfae76a.o oVar) {
        p012xc85e97e9.p093xedfae76a.n b17 = oVar.b();
        if (b17 == p012xc85e97e9.p093xedfae76a.n.INITIALIZED || b17.a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
            bVar.c(p012xc85e97e9.p093xedfae76a.w0.class);
        } else {
            oVar.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // p012xc85e97e9.p093xedfae76a.v
                /* renamed from: onStateChanged */
                public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                    if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_START) {
                        p012xc85e97e9.p093xedfae76a.o.this.c(this);
                        bVar.c(p012xc85e97e9.p093xedfae76a.w0.class);
                    }
                }
            });
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            this.f93123e = false;
            yVar.mo273xed6858b4().c(this);
        }
    }
}
