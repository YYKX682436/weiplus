package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes8.dex */
public class zd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ae f146262d;

    public zd(com.p314xaae8f345.mm.p648x55baa833.ui.ae aeVar) {
        this.f146262d = aeVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f146262d.f145578d.mo43517x10010bd5();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectedMemberChattingRecordUI", "initView failed, exception : " + th6.getMessage());
        }
    }
}
