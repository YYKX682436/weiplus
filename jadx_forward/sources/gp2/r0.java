package gp2;

/* loaded from: classes10.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.v0 f355843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(gp2.v0 v0Var) {
        super(0);
        this.f355843d = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = this.f355843d.f355862e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) ((java.lang.ref.WeakReference) it.next()).get();
            if (c14522x8ffd8962 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePlayerViewRecycler", "checkStopAllView stop view:" + c14522x8ffd8962 + " isPlaying:" + c14522x8ffd8962.mo58387xc00617a4());
                if (c14522x8ffd8962.mo58387xc00617a4()) {
                    if (c14522x8ffd8962.isPauseToRemovePlayer) {
                        c14522x8ffd8962.mo58388x65825f6();
                    } else {
                        c14522x8ffd8962.mo58404x360802();
                        c14522x8ffd8962.mo58389x41012807();
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
