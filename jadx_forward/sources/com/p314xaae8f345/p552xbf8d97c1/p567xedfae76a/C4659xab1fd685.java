package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/matrix/lifecycle/AutoReleaseObserverWrapper;", "Lcom/tencent/matrix/lifecycle/r0;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "release", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "targetObservable", "Lcom/tencent/matrix/lifecycle/k;", "observer", "<init>", "(Landroidx/lifecycle/y;Lcom/tencent/matrix/lifecycle/StatefulOwner;Lcom/tencent/matrix/lifecycle/k;)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.AutoReleaseObserverWrapper */
/* loaded from: classes12.dex */
public final class C4659xab1fd685 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f134219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4659xab1fd685(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 targetObservable, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
        super(observer, targetObservable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetObservable, "targetObservable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.f134219f = lifecycleOwner;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = lifecycleOwner.mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "lifecycleOwner.lifecycle");
        if (mo273xed6858b4.b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            throw new java.lang.IllegalStateException("NOT allow to observe with DESTROYED lifecycle owner");
        }
        lifecycleOwner.mo273xed6858b4().a(this);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0
    public boolean a(p012xc85e97e9.p093xedfae76a.y yVar) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134219f, yVar);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: release */
    public final void m40959x41012807() {
        this.f134321e.mo40970xb5bdeb7a(this.f134320d);
    }
}
