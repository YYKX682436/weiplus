package com.p314xaae8f345.mm.app;

/* loaded from: classes3.dex */
public final class y extends i75.a {
    public y() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
    }

    @Override // i75.a, p012xc85e97e9.p093xedfae76a.o
    public void a(p012xc85e97e9.p093xedfae76a.x observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        super.a(observer);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addObserver totalCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f371038d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        sb6.append(" observer:");
        sb6.append(observer);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.ApplicationLifecycleRegistry", sb6.toString());
    }

    @Override // i75.a, p012xc85e97e9.p093xedfae76a.o
    public void c(p012xc85e97e9.p093xedfae76a.x observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        super.c(observer);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeObserver totalCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f371038d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        sb6.append(" observer:");
        sb6.append(observer);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.ApplicationLifecycleRegistry", sb6.toString());
    }
}
