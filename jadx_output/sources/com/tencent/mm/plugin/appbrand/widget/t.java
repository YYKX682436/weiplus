package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.widget.y implements android.graphics.drawable.Animatable2 {

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f92113p;

    public t(android.content.Context context) {
        super(context);
        this.f92113p = null;
    }

    @Override // android.graphics.drawable.Animatable2
    public void clearAnimationCallbacks() {
        java.util.ArrayList arrayList = this.f92113p;
        if (arrayList != null) {
            arrayList.clear();
            this.f92113p = null;
        }
    }

    @Override // android.graphics.drawable.Animatable2
    public void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f92113p;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.f92113p = arrayList2;
            arrayList2.add(animationCallback);
        } else if (arrayList.contains(animationCallback)) {
            return;
        } else {
            this.f92113p.add(animationCallback);
        }
        if (a()) {
            animationCallback.onAnimationStart(this);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.y, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        java.util.ArrayList arrayList = this.f92113p;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.f92113p).iterator();
        while (it.hasNext()) {
            ((android.graphics.drawable.Animatable2.AnimationCallback) it.next()).onAnimationStart(this);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.y, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        java.util.ArrayList arrayList = this.f92113p;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.f92113p).iterator();
        while (it.hasNext()) {
            ((android.graphics.drawable.Animatable2.AnimationCallback) it.next()).onAnimationEnd(this);
        }
    }

    @Override // android.graphics.drawable.Animatable2
    public boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback animationCallback) {
        java.util.ArrayList arrayList;
        int indexOf;
        if (animationCallback == null || (arrayList = this.f92113p) == null || (indexOf = arrayList.indexOf(animationCallback)) < 0) {
            return false;
        }
        this.f92113p.remove(indexOf);
        return true;
    }
}
