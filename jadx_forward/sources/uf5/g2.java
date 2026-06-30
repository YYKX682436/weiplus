package uf5;

/* loaded from: classes10.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22352x7cb33d67 f508765d;

    public g2(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22352x7cb33d67 activityC22352x7cb33d67) {
        this.f508765d = activityC22352x7cb33d67;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onRemoveContact, cancel.");
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22352x7cb33d67 activityC22352x7cb33d67 = this.f508765d;
        java.util.Iterator it = ((java.util.HashSet) activityC22352x7cb33d67.K).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            sm4.i iVar = (sm4.i) it.next();
            gm0.j1.i();
            gm0.j1.n().f354821b.g(iVar);
            boolean z17 = true;
            if (i17 != ((java.util.HashSet) activityC22352x7cb33d67.K).size() - 1) {
                z17 = false;
            }
            activityC22352x7cb33d67.j7(iVar, z17);
            i17++;
        }
    }
}
