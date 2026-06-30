package com.p314xaae8f345.mm.ui;

/* loaded from: classes10.dex */
public final class wg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f292768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(android.content.Context context) {
        super(0);
        this.f292768d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f292768d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.ref.WeakReference weakReference = ((uj4.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(uj4.e.class)).f509952f;
        if (weakReference != null) {
            return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a) weakReference.get();
        }
        return null;
    }
}
