package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f289135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22365xcc043e69 f289137f;

    public c3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22365xcc043e69 c22365xcc043e69, java.lang.Runnable runnable) {
        this.f289137f = c22365xcc043e69;
        this.f289136e = runnable;
        this.f289135d = ((yf5.n) c22365xcc043e69.getTag()).f543461o;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((yf5.n) this.f289137f.getTag()).f543461o == this.f289135d) {
            this.f289136e.run();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ConversationFolderItemV", "Skip error match");
        }
    }
}
