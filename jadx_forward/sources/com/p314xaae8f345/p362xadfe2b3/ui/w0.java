package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes5.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127769e;

    public w0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, boolean z17) {
        this.f127769e = activityC3722x408816c7;
        this.f127768d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f127768d;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = this.f127769e;
        if (z17) {
            activityC3722x408816c7.getWindow().clearFlags(8192);
        } else {
            activityC3722x408816c7.getWindow().addFlags(8192);
        }
    }
}
