package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public class lb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f280942e;

    public lb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar, java.lang.String str, c01.o8 o8Var) {
        this.f280941d = str;
        this.f280942e = o8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.p8 a17 = c01.n8.a();
        ((c01.k7) a17).b(this.f280941d, 30, this.f280942e);
    }

    /* renamed from: toString */
    public java.lang.String m79492x9616526c() {
        return super.toString() + "|getContactCallBack2";
    }
}
