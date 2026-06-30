package mz0;

/* loaded from: classes5.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(mz0.b2 b2Var) {
        super(0);
        this.f414604d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.b2 b2Var = this.f414604d;
        android.app.Activity context = b2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dz0.l lVar = (dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class);
        mz0.u1 u1Var = new mz0.u1(b2Var);
        dz0.v vVar = new dz0.v((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar);
        vVar.f326567f = u1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList parcelableArrayListExtra = b2Var.m158359x1e885992().getParcelableArrayListExtra("Template_Media_List");
        if (parcelableArrayListExtra != null) {
            arrayList.addAll(parcelableArrayListExtra);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) vVar.f326562a;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "setupMediaItemList: " + arrayList.size());
        return vVar;
    }
}
