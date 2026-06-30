package hr3;

/* loaded from: classes11.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f f365067d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f) {
        this.f365067d = activityC16833xebe5488f;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f = this.f365067d;
        activityC16833xebe5488f.f235174t.clear();
        activityC16833xebe5488f.f235174t.addAll(activityC16833xebe5488f.f235173s);
        activityC16833xebe5488f.Z6();
        activityC16833xebe5488f.finish();
    }
}
