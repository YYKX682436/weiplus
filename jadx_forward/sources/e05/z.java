package e05;

/* loaded from: classes8.dex */
public class z implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19560xce083491 f327730a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19560xce083491 activityC19560xce083491) {
        this.f327730a = activityC19560xce083491;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        this.f327730a.f270087d.setEnabled(z17);
    }
}
