package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class s0 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, android.os.Handler handler) {
        super(handler);
        this.f127754a = activityC3722x408816c7;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = this.f127754a;
        if (activityC3722x408816c7.f127640q == 1) {
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.Y6(activityC3722x408816c7);
        }
    }
}
