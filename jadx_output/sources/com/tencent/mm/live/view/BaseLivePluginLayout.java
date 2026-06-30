package com.tencent.mm.live.view;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/tencent/mm/live/view/BaseLivePluginLayout;", "Landroid/widget/RelativeLayout;", "Lto0/a;", "Lqo0/c;", "Lno0/g;", "", "getRelativeLayoutId", "Lqo0/a;", "plugin", "Ljz5/f0;", "registerPlugin", "", "isLandscape", "getCurrentOrientation", "getPluginSize", "Ljava/util/concurrent/CopyOnWriteArrayList;", "pluginList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPluginList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/ViewGroup;", "getParent", "()Landroid/view/ViewGroup;", "setParent", "(Landroid/view/ViewGroup;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class BaseLivePluginLayout extends android.widget.RelativeLayout implements to0.a, qo0.c, no0.g {
    private android.view.ViewGroup parent;
    private final java.util.concurrent.CopyOnWriteArrayList<qo0.a> pluginList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLivePluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.pluginList = new java.util.concurrent.CopyOnWriteArrayList<>();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(getRelativeLayoutId(), (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.parent = (android.view.ViewGroup) inflate;
    }

    public int getCurrentOrientation() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public abstract /* synthetic */ int getLiveRole();

    @Override // android.view.View, android.view.ViewParent
    public final android.view.ViewGroup getParent() {
        return this.parent;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<qo0.a> getPluginList() {
        return this.pluginList;
    }

    public int getPluginSize() {
        return this.pluginList.size();
    }

    public abstract int getRelativeLayoutId();

    public boolean isLandscape() {
        com.tencent.mars.xlog.Log.i("BaseLivePluginLayout", "isLandscape orientation: " + getContext().getResources().getConfiguration().orientation + " context: " + getContext() + "  hashCode: " + getContext().getResources().getConfiguration().hashCode() + " configuration: " + getContext().getResources().getConfiguration());
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    public void mount() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).z0();
        }
    }

    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).A0(i17, i18, intent);
        }
    }

    public boolean onBackPress() {
        for (qo0.a aVar : this.pluginList) {
            if (aVar.B0()) {
                com.tencent.mars.xlog.Log.i(name(), aVar.name() + " handle back-press");
                return true;
            }
        }
        return false;
    }

    public abstract void onCallStateChanged(int i17, java.lang.String str);

    public boolean onSwipeBack() {
        for (qo0.a aVar : this.pluginList) {
            if (aVar.H0()) {
                com.tencent.mars.xlog.Log.i(name(), aVar.name() + " handle onSwipeBack");
                return true;
            }
        }
        return false;
    }

    public void pause() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).I0();
        }
    }

    @Override // qo0.c
    public void registerPlugin(qo0.a aVar) {
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i(name(), "register plugin " + aVar.name());
            this.pluginList.add(aVar);
        }
    }

    public void resume() {
        setVisibility(0);
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).J0();
        }
    }

    public final void setParent(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.parent = viewGroup;
    }

    public void start() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).L0();
        }
    }

    @Override // qo0.c
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).M0(status, bundle);
        }
    }

    public void stop() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).N0();
        }
    }

    public void unMount() {
        java.util.Iterator<T> it = this.pluginList.iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).O0();
        }
    }
}
