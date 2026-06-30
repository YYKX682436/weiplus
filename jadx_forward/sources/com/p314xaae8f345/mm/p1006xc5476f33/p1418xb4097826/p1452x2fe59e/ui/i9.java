package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class i9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 f191678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8) {
        super(1);
        this.f191678d = activityC13997x866e3aa8;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8 = this.f191678d;
        if (booleanValue) {
            android.widget.TextView textView = activityC13997x866e3aa8.f190896f;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = activityC13997x866e3aa8.f190896f;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
