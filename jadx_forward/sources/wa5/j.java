package wa5;

/* loaded from: classes14.dex */
public final class j extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final wa5.g f525856d;

    /* renamed from: e, reason: collision with root package name */
    public final wa5.h f525857e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f525858f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f525859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f525856d = new wa5.g(activity, this);
        this.f525857e = new wa5.h(activity, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onBeforeFinishAfterTransition */
    public void mo72291x8d1ceba0() {
        super.mo72291x8d1ceba0();
        this.f525859g = true;
        java.util.Iterator it = wa5.d.f525848a.a(m158354x19263085()).f525846e.iterator();
        while (it.hasNext()) {
            ya5.a aVar = (ya5.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.q();
                aVar.k(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f525858f) {
            this.f525858f = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onStartActivityForResult */
    public void mo14640xb30cf874(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        this.f525858f = true;
        if (bundle != null && android.os.Build.VERSION.SDK_INT >= 29 && !m158354x19263085().isFinishing()) {
            new android.app.Instrumentation().callActivityOnSaveInstanceState(m158354x19263085(), new android.os.Bundle());
        }
        super.mo14640xb30cf874(intent, i17, bundle);
    }
}
