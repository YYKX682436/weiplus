package e33;

/* loaded from: classes10.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f328963d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f328964e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f328965f;

    public p1(e33.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        java.lang.ref.WeakReference weakReference = this.f328964e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14) this.f328964e.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f328965f;
        int i17 = this.f328963d;
        c15655x4db85b14.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFolderMgrView", "checkFolderAlbumCount: count=%d", java.lang.Integer.valueOf(i17));
        e33.c2 c2Var = c15655x4db85b14.f220097i;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f328718f) || (linkedList = c2Var.f328717e) == null || linkedList.size() == 0) {
            java.util.Objects.toString(c2Var.f328717e);
            return;
        }
        for (int i18 = 0; i18 < c2Var.f328717e.size(); i18++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) c2Var.f328717e.get(i18);
            if (c15630x7d8d0183 != null && !c15630x7d8d0183.f219954m && !c15630x7d8d0183.f219955n && c2Var.f328718f.equals(c15630x7d8d0183.f219948d)) {
                if (i17 != c15630x7d8d0183.f219950f) {
                    c15630x7d8d0183.f219950f = i17;
                }
                c15630x7d8d0183.f219956o = false;
                if (abstractC15633xee433078 != null && c15630x7d8d0183.f219953i != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC15633xee433078.o()) && !c15630x7d8d0183.n().equals(abstractC15633xee433078.o())) {
                    c15630x7d8d0183.f219953i.f219966h = abstractC15633xee433078.o();
                }
                c2Var.notifyDataSetChanged();
                return;
            }
        }
    }
}
