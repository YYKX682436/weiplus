package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 f127771e;

    public x(com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063, boolean z17) {
        this.f127771e = c3719xb0aa2063;
        this.f127770d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f127770d;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f127771e;
        if (z17) {
            c3719xb0aa2063.mo7430x19263085().getWindow().clearFlags(8192);
        } else {
            c3719xb0aa2063.mo7430x19263085().getWindow().addFlags(8192);
        }
    }
}
