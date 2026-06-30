package zy4;

/* loaded from: classes15.dex */
public class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 f559207a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19511xc9358824 activityC19511xc9358824) {
        this.f559207a = activityC19511xc9358824;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        yy4.a aVar = this.f559207a.f269616e;
        int i17 = aVar.f66637xda33d239;
        if (i17 == 2) {
            aVar.f66637xda33d239 = 1;
        } else if (i17 == 1) {
            aVar.f66637xda33d239 = 2;
        }
    }
}
