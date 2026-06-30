package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class hd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f86693d;

    public hd(com.tencent.mm.plugin.appbrand.page.ed edVar, java.util.LinkedList linkedList) {
        this.f86693d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f86693d.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}
