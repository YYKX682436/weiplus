package p61;

/* loaded from: classes5.dex */
public class w2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c f433933d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c) {
        this.f433933d = activityC11367x42f5894c;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c = this.f433933d;
        android.widget.TextView textView = activityC11367x42f5894c.f154587i;
        if (textView == null) {
            return true;
        }
        textView.post(new p61.x2(activityC11367x42f5894c));
        return true;
    }
}
