package p012xc85e97e9.p093xedfae76a;

/* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter */
/* loaded from: classes13.dex */
class C1114x629e589e implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.h f93111d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.v f93112e;

    public C1114x629e589e(p012xc85e97e9.p093xedfae76a.h hVar, p012xc85e97e9.p093xedfae76a.v vVar) {
        this.f93111d = hVar;
        this.f93112e = vVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        int i17 = p012xc85e97e9.p093xedfae76a.i.f93164a[mVar.ordinal()];
        p012xc85e97e9.p093xedfae76a.h hVar = this.f93111d;
        switch (i17) {
            case 1:
                hVar.mo7794x3e5a77bb(yVar);
                break;
            case 2:
                hVar.mo7797xb05099c3(yVar);
                break;
            case 3:
                hVar.mo7055x57429eec(yVar);
                break;
            case 4:
                hVar.mo7796xb01dfb57(yVar);
                break;
            case 5:
                hVar.mo7798xc39f8281(yVar);
                break;
            case 6:
                hVar.mo7795xac79a11b(yVar);
                break;
            case 7:
                throw new java.lang.IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p012xc85e97e9.p093xedfae76a.v vVar = this.f93112e;
        if (vVar != null) {
            vVar.mo2520xaba1ac62(yVar, mVar);
        }
    }
}
