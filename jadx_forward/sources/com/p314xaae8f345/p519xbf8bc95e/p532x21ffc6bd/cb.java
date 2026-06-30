package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class cb extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "domain1")
    public java.lang.String f130644a;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "dirNew")
    public java.lang.String f130645b;

    /* renamed from: c, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "domain")
    public java.lang.String f130646c;

    /* renamed from: d, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "fileversion")
    public int f130647d;

    /* renamed from: e, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "updateData")
    public java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz> f130648e;

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz> list = this.f130648e;
        if (list != null) {
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz bzVar : list) {
                if (c4265xa1eefb76.m35501x2a31609f().equals(bzVar.f130610c)) {
                    bzVar.f130608a = "https://" + this.f130646c + this.f130645b;
                    return bzVar;
                }
            }
        }
        return null;
    }
}
