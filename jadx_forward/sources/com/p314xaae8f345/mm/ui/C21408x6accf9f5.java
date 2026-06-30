package com.p314xaae8f345.mm.ui;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/MMTransferLifecycleObserver;", "Landroidx/lifecycle/f;", "Landroid/os/ResultReceiver;", "receiver", "<init>", "(Landroid/os/ResultReceiver;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.MMTransferLifecycleObserver */
/* loaded from: classes7.dex */
public final class C21408x6accf9f5 implements p012xc85e97e9.p093xedfae76a.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.ResultReceiver f278451d;

    public C21408x6accf9f5(android.os.ResultReceiver receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        this.f278451d = receiver;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onCreate */
    public void mo7794x3e5a77bb(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f278451d.send(p012xc85e97e9.p093xedfae76a.m.ON_CREATE.ordinal(), null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onDestroy */
    public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f278451d.send(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY.ordinal(), null);
        owner.mo273xed6858b4().c(this);
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onPause */
    public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f278451d.send(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE.ordinal(), null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onResume */
    public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f278451d.send(p012xc85e97e9.p093xedfae76a.m.ON_RESUME.ordinal(), null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onStart */
    public void mo7797xb05099c3(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f278451d.send(p012xc85e97e9.p093xedfae76a.m.ON_START.ordinal(), null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onStop */
    public void mo7798xc39f8281(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f278451d.send(p012xc85e97e9.p093xedfae76a.m.ON_STOP.ordinal(), null);
    }
}
