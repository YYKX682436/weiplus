package au4;

/* loaded from: classes9.dex */
public class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19198x5ada7678 f95674d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19198x5ada7678 activityC19198x5ada7678) {
        this.f95674d = activityC19198x5ada7678;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19198x5ada7678.f262811m;
        java.util.ArrayList parcelableArrayList = this.f95674d.m83105x7498fe14().getParcelableArrayList("key_security_question_list");
        if (parcelableArrayList != null) {
            for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                g4Var.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.p2386x633fb29.C19196xf4e4ba33) parcelableArrayList.get(i18)).f262806e);
            }
        }
    }
}
