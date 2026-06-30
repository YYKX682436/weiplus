package com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/tencent/mm/live/view/BaseLivePluginLayout;", "Landroid/widget/RelativeLayout;", "Lto0/a;", "Lqo0/c;", "Lno0/g;", "", "getRelativeLayoutId", "Lqo0/a;", "plugin", "Ljz5/f0;", "registerPlugin", "", "isLandscape", "getCurrentOrientation", "getPluginSize", "Ljava/util/concurrent/CopyOnWriteArrayList;", "pluginList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPluginList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/ViewGroup;", "getParent", "()Landroid/view/ViewGroup;", "setParent", "(Landroid/view/ViewGroup;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.view.BaseLivePluginLayout */
/* loaded from: classes3.dex */
public abstract class AbstractC10852x30afa45a extends android.widget.RelativeLayout implements to0.a, qo0.c, no0.g {
    private android.view.ViewGroup parent;
    private final java.util.concurrent.CopyOnWriteArrayList<qo0.a> pluginList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10852x30afa45a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.pluginList = new java.util.concurrent.CopyOnWriteArrayList<>();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(mo46545x959e1c47(), (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.parent = (android.view.ViewGroup) inflate;
    }

    /* renamed from: getCurrentOrientation */
    public int m46542x8efc4c8d() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    /* renamed from: getLiveRole */
    public abstract /* synthetic */ int mo11219xd0598cf8();

    @Override // android.view.View, android.view.ViewParent
    public final android.view.ViewGroup getParent() {
        return this.parent;
    }

    /* renamed from: getPluginList */
    public final java.util.concurrent.CopyOnWriteArrayList<qo0.a> m46543xd72b7a67() {
        return this.pluginList;
    }

    /* renamed from: getPluginSize */
    public int m46544xd72ea9ca() {
        return this.pluginList.size();
    }

    /* renamed from: getRelativeLayoutId */
    public abstract int mo46545x959e1c47();

    /* renamed from: isLandscape */
    public boolean m46546x9b8334b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLivePluginLayout", "isLandscape orientation: " + getContext().getResources().getConfiguration().orientation + " context: " + getContext() + "  hashCode: " + getContext().getResources().getConfiguration().hashCode() + " configuration: " + getContext().getResources().getConfiguration());
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: mount */
    public void mo46547x6343c19() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).z0();
        }
    }

    /* renamed from: onActivityResult */
    public void mo46548x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).A0(i17, i18, intent);
        }
    }

    /* renamed from: onBackPress */
    public boolean mo46549x4ceae47d() {
        for (qo0.a aVar : this.pluginList) {
            if (aVar.B0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo57003x337a8b(), aVar.mo57003x337a8b() + " handle back-press");
                return true;
            }
        }
        return false;
    }

    /* renamed from: onCallStateChanged */
    public abstract void mo46550x22910660(int i17, java.lang.String str);

    /* renamed from: onSwipeBack */
    public boolean mo46551x59cfc822() {
        for (qo0.a aVar : this.pluginList) {
            if (aVar.H0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo57003x337a8b(), aVar.mo57003x337a8b() + " handle onSwipeBack");
                return true;
            }
        }
        return false;
    }

    /* renamed from: pause */
    public void mo46552x65825f6() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).I0();
        }
    }

    @Override // qo0.c
    /* renamed from: registerPlugin */
    public void mo46553xddc5c3b6(qo0.a aVar) {
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo57003x337a8b(), "register plugin " + aVar.mo57003x337a8b());
            this.pluginList.add(aVar);
        }
    }

    /* renamed from: resume */
    public void mo46554xc84dc82d() {
        setVisibility(0);
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).J0();
        }
    }

    /* renamed from: setParent */
    public final void m46555x1cf75fac(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.parent = viewGroup;
    }

    /* renamed from: start */
    public void mo46556x68ac462() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).L0();
        }
    }

    @Override // qo0.c
    /* renamed from: statusChange */
    public void mo46557x60d69242(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).M0(status, bundle);
        }
    }

    /* renamed from: stop */
    public void mo46558x360802() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).N0();
        }
    }

    /* renamed from: unMount */
    public void mo46559xed5f7500() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).O0();
        }
    }
}
